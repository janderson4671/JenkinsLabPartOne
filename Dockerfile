from openjdk
COPY ./src/main/java/*.java /main/java/
RUN javac /main/java/Main.java /main/java/Calculator.java
ENTRYPOINT ["java", "main/java/Main"]