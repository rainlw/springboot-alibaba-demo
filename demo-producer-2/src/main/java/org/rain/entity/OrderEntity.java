package org.rain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author ZhangYu
 * @date 2022/7/12
 */
@Data
@TableName("t_order")
public class OrderEntity {

    @TableId(type = IdType.AUTO)
    private Long id;

    @TableField(value = "order_no")
    private String orderNo;

    private String phone;

    private BigDecimal amount;

    private String detail;
}
