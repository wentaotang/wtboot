package com.hgcode.wtboot.rest;

import com.hgcode.wtboot.domain.UserDO;
import com.hgcode.wtboot.repository.UserDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageResource {

    @GetMapping("/list")
    public void lambdaPagination() {
       /* Page<User> page = new Page<>(1, 3);
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.lambda().ge(User::getAge, 1).orderByAsc(User::getAge);
        IPage<User> result = mapper.selectPage(page, wrapper);
        System.out.println(result.getTotal());*/
    }

    @Autowired
    private UserDOMapper userDOMapper;

    @GetMapping("/add")
    public void add() {
        UserDO userDO = new UserDO();
        userDO.setName("twtwt");
        userDO.setUserpwd("adfadfdsf");
        userDOMapper.insert(userDO);
    }

}
