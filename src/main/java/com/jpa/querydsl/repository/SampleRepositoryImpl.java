package com.jpa.querydsl.repository;

import java.util.List;

import com.jpa.querydsl.entity.QSample;
import com.jpa.querydsl.entity.Sample;
import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SampleRepositoryImpl implements SampleRepositoryCustom {
    private final JPAQueryFactory queryFactory;

    @Override
    public Sample findByName(String name) {
        QSample sample = QSample.sample;
        return queryFactory.selectFrom(sample)
                    .where(sample.name.eq(name))
                    .fetchOne();
    }
    
    @Override
    public List<Sample> findAllUser() { 
        QSample sample = QSample.sample; 
        return queryFactory.selectFrom(sample) 
                    .fetch(); 
    }
}
