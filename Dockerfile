from openjdk
COPY ./src/main/java/*.java /
RUN javac -source 1.8 -target 1.8 /Main.java /Calculator.java
ENTRYPOINT ["java", "Main"]
