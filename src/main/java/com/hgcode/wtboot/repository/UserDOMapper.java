package com.hgcode.wtboot.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hgcode.wtboot.domain.UserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDOMapper extends BaseMapper<UserDO> {
}
