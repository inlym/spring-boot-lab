package com.inlym.lab.hello.model;

import lombok.Data;

import java.time.LocalDate;

/**
 * 操作“猫”的请求数据。
 *
 * <h2>说明
 * <p>由前端传递的请求数据，统一以 {@code DTO} 结尾。
 *
 * @author <a href="https://www.inlym.com">inlym</a>
 * @since 1.0.0
 **/
@Data
public class CatDTO {
    /** 姓名 */
    private String name;

    /** 出生日期 */
    private LocalDate birthday;

    /** 体重（克） */
    private Integer weight;

    /** 是否可爱 */
    private Boolean cute;
}
