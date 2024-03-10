package com.example.demo.controller;

import com.example.demo.entity.DemoEntity;
import com.example.demo.repository.DemoRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    private DemoRepository demoRepository;

    public DemoController(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    @GetMapping("/demo")
    public Iterable<DemoEntity> findAllEmployees() {
        return this.demoRepository.findAll();
    }

    //新增
    @PostMapping("/demo")
    @ResponseBody
    public DemoEntity addDemo(@RequestBody DemoEntity demo) {
        return this.demoRepository.save(demo);
    }

    //刪除
    @PostMapping("/demoDelete")
    public void deleteAll() {
        this.demoRepository.deleteAll();
    }
}
