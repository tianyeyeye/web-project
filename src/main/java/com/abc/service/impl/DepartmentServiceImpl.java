package com.abc.service.impl;

import com.abc.pojo.Department;
import com.abc.mapper.DepartmentMapper;
import com.abc.service.DepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tianye
 * @since 2020-03-19
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {

}
