package com.acro.departmentservice.controller;

import com.acro.departmentservice.dto.DepartmentDto;
import com.acro.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto){
        return new ResponseEntity<DepartmentDto>(departmentService.saveDepartment(departmentDto), HttpStatus.OK);
    }
}
