FROM bellsoft/liberica-openjdk-alpine:11.0.16.1-1

COPY ./src ./src

RUN mkdir ./out

RUN javac -sourcepath ./src -d /out ./src/Project/main/*.java

RUN javadoc -d docs -sourcepath ./src -cp ./out -subpackages Project

CMD java -classpath ./out Project/main/Main