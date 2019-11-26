package com.hgcode.wtboot.web.rest;

import com.hgcode.wtboot.domain.UserDO;
import com.hgcode.wtboot.domain.XxlJobInfoDO;
import com.hgcode.wtboot.repository.UserDOMapper;
import com.hgcode.wtboot.repository.XxlJobInfoDOMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/dynamic")
public class DynamicDatasourceResource {


    @Resource
    private XxlJobInfoDOMapper xxlJobInfoDOMapper;

    @Resource
    private UserDOMapper userDOMapper;

    @RequestMapping("/list")
    public void list(){
        List<XxlJobInfoDO> list = xxlJobInfoDOMapper.selectList(null);
        System.out.println(list.size());
    }

    @RequestMapping("/user/list")
    public void userList(){
        List<UserDO> list = userDOMapper.selectList(null);
        System.out.println(list.size());
    }


}
