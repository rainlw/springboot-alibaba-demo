package org.rain.param.req;

import lombok.Data;

import java.util.Map;

/**
 * @author ZhangYu
 * @date 2022/7/12
 */
@Data
public class EmployeeDTO {

    private Long id;

    private String name;

    private Integer gender;

    private Integer age;

    private Map<String, Object> information;
}
