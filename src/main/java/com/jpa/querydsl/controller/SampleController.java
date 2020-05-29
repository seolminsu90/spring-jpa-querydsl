package com.jpa.querydsl.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.querydsl.entity.Sample;
import com.jpa.querydsl.repository.SampleRepository;

@RestController
public class SampleController {
    @Autowired
    SampleRepository sampleRepository;

    @PostMapping("/samples")
    public Sample insertSample() {
        Random r = new Random();
        return sampleRepository.save(new Sample("sampleUser" + r.nextInt(50000)));
    }

    @GetMapping("/samples/{sampleUserNo}")
    public Sample getSample(@PathVariable int sampleUserNo) {
        return sampleRepository.findByName("sampleUser" + sampleUserNo);
    }

    @GetMapping("/samples")
    public List<Sample> getSample() {

        return sampleRepository.findAllUser();
    }
}
