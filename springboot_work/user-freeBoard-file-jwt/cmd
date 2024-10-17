docker run -p 10000:10000 \
-e SPRING_DATASOURCE_URL=jdbc:mysql://mysql-container:3306/pmh \
-e SPRING_DATASOURCE_PASSWORD=1234 \
-d --network javamysql \
--name java-container \
parkmyounghoi/spring




# 마리아디비 컨테이너 실행활때 -e
# docker run -d -e MARIADB_ROOT_PASSWORD=1234 -p 3306:3306 mariadb

# maria_container network 연결
docker network connect nginx-spring-maria maria_container

# -d 옵션이 백그라운드 실행...
docker run -d -p 10000:10000 \
--network nginx-spring-maria \
--name freeboard_container \
parkmyounghoi/freeboard

docker run -p 10000:10000 \
-e SPRING_DATASOURCE_URL=jdbc:mariadb://maria_container:3306/pmh?serverTimezone=Asia/Seoul \
-e SPRING_DATASOURCE_PASSWORD=1234 \
-d --network nginx-spring-maria \
--name freeboard-container \
parkmyounghoi/freeboard