package org.rain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.rain.entity.EmployeeEntity;
import org.rain.entity.OrderEntity;
import org.rain.param.res.EmployeeVO;

import java.util.List;

/**
 * @author ZhangYu
 * @date 2022/7/12
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {

    @Select("select detail from t_order where id =#{id}")
    String selectJson(@Param("id") Long id);

}
