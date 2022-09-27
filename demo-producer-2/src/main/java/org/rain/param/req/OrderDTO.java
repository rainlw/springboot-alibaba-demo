package org.rain.param.req;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author ZhangYu
 * @date 2022/7/12
 */
@Data
public class OrderDTO {

    private Long id;

    private String orderNo;

    private String phone;

    private BigDecimal amount;

    private String detail;
}
