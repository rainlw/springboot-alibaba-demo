package org.rain.service;

import org.rain.param.req.EmployeeDTO;
import org.rain.param.res.EmployeeVO;

import java.util.List;

/**
 * @author ZhangYu
 * @date 2022/7/12
 */
public interface EmployeeService {

    void saveEmployee(EmployeeDTO employeeDTO);

    List<EmployeeVO> getList();

    String getJson(Long id);
}
