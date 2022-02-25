FROM openjdk:15
COPY ./target/classes/ /tmp
COPY prospects.txt /tmp
WORKDIR /tmp
ENTRYPOINT ["java","Main"]
