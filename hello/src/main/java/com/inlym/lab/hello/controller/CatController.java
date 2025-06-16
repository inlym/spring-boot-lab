package com.inlym.lab.hello.controller;

import com.inlym.lab.hello.model.CatDTO;
import com.inlym.lab.hello.model.CatVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;

/**
 * “猫”控制器
 *
 * @author <a href="https://www.inlym.com">inlym</a>
 * @since 1.0.0
 **/
@RestController
public class CatController {
    @PostMapping("/cats")
    public CatVO create(@RequestBody CatDTO dto) {
        CatVO vo = CatVO.builder().id(1234L).name(dto.getName()).weight(dto.getWeight()).cute(dto.getCute()).build();

        if (dto.getBirthday() != null) {
            vo.setAge(Period.between(dto.getBirthday(), LocalDate.now()).getYears());
        }

        return vo;
    }
}
