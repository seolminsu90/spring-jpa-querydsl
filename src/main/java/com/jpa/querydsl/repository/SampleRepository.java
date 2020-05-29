package com.jpa.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.querydsl.entity.Sample;

public interface SampleRepository extends JpaRepository<Sample, Integer>, SampleRepositoryCustom{

}
