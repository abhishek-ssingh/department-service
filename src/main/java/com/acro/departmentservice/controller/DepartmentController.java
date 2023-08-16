package com.acro.departmentservice.controller;

import com.acro.departmentservice.dto.DepartmentDto;
import com.acro.departmentservice.entity.Department;
import com.acro.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    //save department api
    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto){
        DepartmentDto savedDepartment = departmentService.saveDepartment(departmentDto);
        return new ResponseEntity<DepartmentDto>(savedDepartment, HttpStatus.OK);
    }

    //get department by departmentcode
    @GetMapping("{departmentcode}")
    public ResponseEntity<DepartmentDto> getDepartmentByCode(@PathVariable String departmentcode){
        DepartmentDto department = departmentService.getDepartmentByCode(departmentcode);
        return new ResponseEntity<DepartmentDto>(department, HttpStatus.OK);
    }
}
