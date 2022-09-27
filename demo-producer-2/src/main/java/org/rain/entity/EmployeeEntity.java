package org.rain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import lombok.Data;

import java.util.Map;

/**
 * @author ZhangYu
 * @date 2022/7/12
 */
@Data
@TableName("t_employee")
public class EmployeeEntity {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer gender;

    private Integer age;

    @TableField(typeHandler = JacksonTypeHandler.class)
    private Map<String, Object> information;
}
