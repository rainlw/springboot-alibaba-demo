package org.rain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.rain.entity.EmployeeEntity;
import org.rain.param.res.EmployeeVO;

import java.util.List;

/**
 * @author ZhangYu
 * @date 2022/7/12
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<EmployeeEntity> {

    @Select("select * from t_employee")
    List<EmployeeVO> selectEmpList();

    @Select("select information from t_employee where id =#{id}")
    String selectJson(@Param("id") Long id);
}
