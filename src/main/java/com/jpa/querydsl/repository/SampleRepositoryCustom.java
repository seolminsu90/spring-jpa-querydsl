package com.jpa.querydsl.repository;

import java.util.List;

import com.jpa.querydsl.entity.Sample;

public interface SampleRepositoryCustom {
    Sample findByName(String name);
    List<Sample> findAllUser();
}
