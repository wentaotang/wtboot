package com.hgcode.wtboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hgcode.wtboot.domain.MemberDO;
import com.hgcode.wtboot.repository.MemberMapper;
import com.hgcode.wtboot.service.MemberService;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, MemberDO> implements MemberService {

}
