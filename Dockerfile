from openjdk
COPY ./src/main/java/*.java /main/java/
RUN javac -source 1.8 -target 1.8 /main/java/Main.java /main/java/Calculator.java
ENTRYPOINT ["java"]