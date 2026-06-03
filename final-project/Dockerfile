# ==========================================
# Stage 1: Build (Збірка застосунку)
# ==========================================
# Використовуємо образ з Maven та Java 21 
FROM maven:3.9.6-eclipse-temurin-21 AS builder
WORKDIR /build

# Крокуємо розумно: спочатку копіюємо pom.xml і завантажуємо залежності.
# Це дозволить Docker закешувати бібліотеки і не качати їх заново при кожній зміні коду.
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Тепер копіюємо весь вихідний код і збираємо JAR-файл, пропускаючи тести
COPY src ./src
RUN mvn clean package -DskipTests

# ==========================================
# Stage 2: Runtime (Запуск застосунку)
# ==========================================
# Використовуємо легкий і чистий JRE (тільки для запуску, без зайвих інструментів)
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Копіюємо готовий JAR-файл з першого етапу (builder) у наш фінальний контейнер
COPY --from=builder /build/target/*.jar app.jar

# Відкриваємо порт
EXPOSE 8080

# Команда для запуску Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]
