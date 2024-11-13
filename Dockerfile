FROM openjdk:17
WORKDIR /opt/app
COPY ./src/OnLesson/* .
RUN javac Main.java
CMD [ "java", "Main.class" ]