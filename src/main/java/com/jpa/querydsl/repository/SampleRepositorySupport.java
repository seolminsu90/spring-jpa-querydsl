package com.jpa.querydsl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.jpa.querydsl.entity.QSample;
import com.jpa.querydsl.entity.Sample;
import com.querydsl.jpa.impl.JPAQueryFactory;

//@Repository
public class SampleRepositorySupport /*extends QuerydslRepositorySupport*/{
    /*
     * private final JPAQueryFactory queryFactory; public
     * SampleRepositorySupport(JPAQueryFactory queryFactory) { super(Sample.class);
     * this.queryFactory = queryFactory; }
     * 
     * public List<Sample> findByName(String name) { QSample sample =
     * QSample.sample; return queryFactory .selectFrom(sample)
     * .where(sample.name.eq(name)) .fetch(); }
     * 
     * public List<Sample> findAllUser() { QSample sample = QSample.sample; return
     * queryFactory .selectFrom(sample) .fetch(); }
     */
}
