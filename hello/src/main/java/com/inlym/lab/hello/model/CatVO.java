package com.inlym.lab.hello.model;

import lombok.Builder;
import lombok.Data;

/**
 * 用于前端展示的“猫”视图对象
 *
 * <h2>说明
 * <p>传递给前端，用于界面展示的响应数据，统一以 {@code VO} 结尾。
 *
 * @author <a href="https://www.inlym.com">inlym</a>
 * @since 1.0.0
 **/
@Data
@Builder
public class CatVO {
    /** ID */
    private Long id;

    /** 姓名 */
    private String name;

    /** 年龄（周岁） */
    private Integer age;

    /** 体重（克） */
    private Integer weight;

    /** 是否可爱 */
    private Boolean cute;
}
