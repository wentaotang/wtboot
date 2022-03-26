package com.hgcode.wtboot.web.rest;

import com.hgcode.wtboot.domain.UserDO;
import com.hgcode.wtboot.repository.UserDOMapper;
import com.hgcode.wtboot.service.dto.ValidDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/valid")
public class ValidResource {

    @PostMapping("/test")
    public void lambdaPagination(@RequestBody @Validated ValidDTO validDTO) {

    }

}
