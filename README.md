# spring-jpa-querydsl
querydsl sample project


### JPA 동적 쿼리 유연함을 위한 querydsl 적용 Sample

### 이클립스 설정 필요 

#### Q Class를 자동 컴파일 하기 위함

1. Project 선택 -> Properties -> Java Compiler -> Annotation Processing 항목

1-1. Enable annotation processing 체크

1-2. Generated source directory에 apt 플러그인 경로와 동일하게 설정

2. Project 선택 -> Properties -> Java Compiler -> Annotation Processing -> Factory Path 항목

2-1. Enable project specific settings 체크

2-2. .m2 폴더로부터 querydsl-apt jar 파일 Add
