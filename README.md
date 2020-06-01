### spring-jpa-querydsl
querydsl sample project


##### JPA 동적 쿼리 유연함을 위한 querydsl 적용 Sample

##### 이클립스 Q Class를 자동 컴파일 설정

```bash
1. Project 선택 -> Properties -> Java Compiler -> Annotation Processing 항목

2. Enable annotation processing 체크

3. Generated source directory에 apt 플러그인 경로와 동일하게 설정

4. Project 선택 -> Properties -> Java Compiler -> Annotation Processing -> Factory Path 항목

5. Enable project specific settings 체크

6. .m2 폴더로부터 querydsl-apt jar 파일 Add
```

##### Repository, RepositoryCustom, RepositoryImpl 조합

* JpaRepository와 Custom으로 생성한 RepositoryCustom을 상속받는 Repository

* RepositoryCustom을 implements 하여 구현한 RepositoryImpl 세트가 중요

* Custom, Impl 네이밍을 맞추어 주어야 기능이 지원된다.

__Repository(i) extends JpaRepository(i)
Repository(i) extends RepositoryCustom(i)
RepositoryImpl(c) implements RepositoryCustom(i)__

##### 참고 
https://docs.spring.io/spring-data/jpa/docs/2.1.3.RELEASE/reference/html/#repositories.custom-implementations
