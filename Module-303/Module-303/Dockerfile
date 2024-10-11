FROM openjdk:17.0.1

RUN mkdir /app

WORKDIR /app

COPY src /app/src

RUN javac /app/src/Main.java -d /app

ENTRYPOINT ["java", "Main"]