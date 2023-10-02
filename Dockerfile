FROM eclipse-temurin:17-jdk
LABEL org.opencontainers.image.source=https://github.com/alsomeb/devops-final
LABEL org.opencontainers.image.description="DevOps Final Image"
WORKDIR /app
COPY ./build/libs/devops-final-1.0.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]