package com.hgcode.wtboot;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hgcode.wtboot.domain.MemberDO;
import com.hgcode.wtboot.service.MemberService;
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
        MemberDO memberDO = new MemberDO();
        memberDO.setCode("80000001");
        memberDO.setPhone("13466329314");
        memberDO.setSex(1);
        memberDO.setName("唐文韬");
        memberDO.setStatus(0);
        memberService.save(memberDO);
    }

    @Test
    public void testMemberUpdate() {
        UpdateWrapper<MemberDO> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id",1507975125541068802L).set("name","文涛-new");
        memberService.update(updateWrapper);
    }

    @Test
    public void testMemberSearch() {
        LambdaQueryWrapper queryWrapper = Wrappers.lambdaQuery(MemberDO.class).eq(MemberDO::getId,21L).orderByDesc(MemberDO::getId);
        Page page =new Page(1,10,true);
        IPage<MemberDO> memberDOIPage = memberService.page(page,queryWrapper);
        log.info("total:{},pages:{}",memberDOIPage.getTotal(),memberDOIPage.getPages());
    }
}
