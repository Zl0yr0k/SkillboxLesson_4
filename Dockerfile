FROM openjdk:22
WORKDIR /opt/app
COPY . .
CMD [ "java -classpath ./src OnLesson.Main " ]