package com.hgcode.wtboot.web.rest;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.hgcode.wtboot.domain.UserDO;
import com.hgcode.wtboot.repository.UserDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/excel")
public class ExcelResource {

    @GetMapping("/export")
    public void export() {
        // 通过工具类创建writer
        ExcelWriter writer = ExcelUtil.getWriter("/Users/wentao/Downloads/123.xlsx");
        // 合并单元格后的标题行，使用默认标题样式
        writer.addHeaderAlias("a","姓名");
        writer.setOnlyAlias(true);

        Map<String, Object> row = new LinkedHashMap<>();
        row.put("a","lili");
        writer.write(CollUtil.newArrayList(row), true);
        writer.close();
    }


}
