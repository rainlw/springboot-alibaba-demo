package org.rain.service.impl;

import org.rain.entity.EmployeeEntity;
import org.rain.mapper.EmployeeMapper;
import org.rain.param.req.EmployeeDTO;
import org.rain.param.res.EmployeeVO;
import org.rain.service.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ZhangYu
 * @date 2022/7/12
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    private EmployeeMapper mapper;

    @Override
    public void saveEmployee(EmployeeDTO employeeDTO) {
        if(employeeDTO == null){
            return;
        }
        EmployeeEntity entity = new EmployeeEntity();
        BeanUtils.copyProperties(employeeDTO, entity);
        mapper.insert(entity);
    }

    @Override
    public List<EmployeeVO> getList() {
         List<EmployeeVO> employeeEntities = mapper.selectEmpList();
         return employeeEntities;
    }

    @Override
    public String getJson(Long id){
        String str = mapper.selectJson(id);
        return str;
    }
}
