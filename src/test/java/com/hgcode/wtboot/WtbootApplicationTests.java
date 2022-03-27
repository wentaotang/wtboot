package com.hgcode.wtboot;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hgcode.wtboot.domain.MemberDO;
import com.hgcode.wtboot.service.MemberService;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @desc：测试基类
 * @author：wentao_tang
 * @date：2022/3/26 22:55
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class WtbootApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(WtbootApplicationTests.class);

    @Resource
    private MemberService memberService;

    @Test
    public void testMemberAdd() {
        MemberDO memberDO = MemberDO.builder()
                .code("80000001")
                .phone("13466329314")
                .sex(1)
                .name("文涛")
                .status(1).build();
        memberService.save(memberDO);
    }

    @Test
    public void testMemberUpdate() {
        MemberDO entity = MemberDO.builder()
                .name("wentao" + RandomStringUtils.randomAlphabetic(3))
                .build();
        LambdaUpdateWrapper<MemberDO> updateWrapper = Wrappers.lambdaUpdate(MemberDO.class)
                .eq(MemberDO::getId, 1508093544961679362L);
        /**
         * 如果entity为空，则自动填充功能无效，所以在使用update的方法时一定要注意， 你是否需要用到自动填充的功能。
         */
        memberService.update(entity, updateWrapper);
    }

    @Test
    public void testMemberSearch() {
        LambdaQueryWrapper queryWrapper = Wrappers.lambdaQuery(MemberDO.class).orderByDesc(MemberDO::getId);
        Page page = new Page(1, 10, true);
        IPage<MemberDO> memberDOIPage = memberService.page(page, queryWrapper);
        log.info("total:{},pages:{}", memberDOIPage.getTotal(), memberDOIPage.getPages());
    }
}
