package com.hgcode.wtboot.repository;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hgcode.wtboot.domain.UserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@DS("master")
public interface UserDOMapper extends BaseMapper<UserDO> {
}
