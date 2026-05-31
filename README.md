# 🎰 Button Roulette

Button Roulette is a simple full-stack application built using Spring Boot and React.

When the user clicks the **🎰 CLICK ME** button, the frontend calls a Spring Boot REST API. The backend randomly selects a spell using Java Reflection and returns a fun response.

---

# Features

* Spring Boot REST API
* React Frontend
* Java Reflection (`Class.forName`)
* Random Spell Engine
* Environment-based configuration
* CORS Support
* No Database
* No JPA
* No Lombok
* Pure In-Memory Application

---

# Project Structure

```text
roulette/
├── roulette-backend/
└── roulette-frontend/
```

Backend:

```text
roulette-backend/
├── src/
├── pom.xml
└── application.properties
```

Frontend:

```text
roulette-frontend/
├── src/
├── public/
├── package.json
├── .env
└── .env.example
```

---

# Technology Stack

## Backend

* Java 21
* Spring Boot
* Maven

## Frontend

* React
* JavaScript
* HTML
* CSS

---

# Prerequisites

Install the following software before running the application.

## 1. Java 21

Verify installation:

```bash
java -version
```

Expected output:

```text
openjdk version "21"
```

---

## 2. Maven

Verify installation:

```bash
mvn -version
```

Expected output:

```text
Apache Maven 3.x
```

---

## 3. Node.js

Verify installation:

```bash
node -v
```

Expected output:

```text
v20.x.x
```

---

## 4. npm

Verify installation:

```bash
npm -v
```

Expected output:

```text
10.x.x
```

---

# Clone Repository

```bash
git clone <repository-url>
cd roulette
```

Example:

```bash
git clone https://github.com/PranikNikose/button-roulette.git
cd button-roulette
```

---

# Backend Configuration

File:

```text
roulette-backend/src/main/resources/application.properties
```

Current configuration:

```properties
spring.application.name=roulette-backend

server.port=${SERVER_PORT:8888}

frontend.url=${FRONTEND_URL:http://localhost:3000}
```

Default backend URL:

```text
http://localhost:8888
```

---

# Frontend Configuration

Create a local environment file.

File:

```text
roulette-frontend/.env
```

Contents:

```env
REACT_APP_API_URL=http://localhost:8888
```

A sample file is already provided:

```text
roulette-frontend/.env.example
```

Copy:

```bash
cp .env.example .env
```

Windows:

```cmd
copy .env.example .env
```

---

# Running the Backend

Open a terminal.

Navigate to backend folder:

```bash
cd roulette-backend
```

Build:

```bash
mvn clean install
```

Start application:

```bash
mvn spring-boot:run
```

Expected log:

```text
Tomcat started on port(s): 8888
```

Verify:

Open browser:

```text
http://localhost:8888/api/cast
```

Sample response:

```json
{
  "spellName": "Thunder",
  "emoji": "⚡",
  "result": "Done beats perfect."
}
```

---

# Running the Frontend

Open another terminal.

Navigate to frontend folder:

```bash
cd roulette-frontend
```

Install dependencies:

```bash
npm install
```

Start React application:

```bash
npm start
```

Application opens at:

```text
http://localhost:3000
```

---

# Application Flow

```text
User Clicks Button
        ↓
React Frontend
        ↓
Fetch API Call
        ↓
Spring Boot REST API
        ↓
Spell Engine
        ↓
Java Reflection
        ↓
Random Spell
        ↓
JSON Response
        ↓
React UI Update
```

---

# Environment Variables

## Backend

| Variable     | Default Value         | Description             |
| ------------ | --------------------- | ----------------------- |
| SERVER_PORT  | 8888                  | Spring Boot server port |
| FRONTEND_URL | http://localhost:3000 | Allowed CORS origin     |

Example:

```bash
export SERVER_PORT=9090
export FRONTEND_URL=http://localhost:3001
```

Windows CMD:

```cmd
set SERVER_PORT=9090
set FRONTEND_URL=http://localhost:3001
```

---

## Frontend

| Variable          | Description          |
| ----------------- | -------------------- |
| REACT_APP_API_URL | Backend API Base URL |

Example:

```env
REACT_APP_API_URL=http://localhost:8888
```

---

# Available Spells

| Spell      | Description               |
| ---------- | ------------------------- |
| FireBall   | Funny developer roast     |
| FreezeTime | Current server timestamp  |
| Confuse    | Reversed random sentence  |
| Thunder    | Random motivational quote |
| Potion     | Random fun fact           |

---

# Development Commands

## Backend

Build:

```bash
mvn clean install
```

Run:

```bash
mvn spring-boot:run
```

Package:

```bash
mvn clean package
```

---

## Frontend

Install:

```bash
npm install
```

Run:

```bash
npm start
```

Build:

```bash
npm run build
```

---

# Git Ignore

The following files should not be committed:

```text
roulette-backend/target/
roulette-frontend/node_modules/
roulette-frontend/build/
roulette-frontend/.env
.idea/
.vscode/
```

---

# Future Enhancements

* Docker Support
* Docker Compose
* GitHub Actions CI/CD
* Automated Testing
* AWS Deployment
* Kubernetes Deployment

---

# Author

Pranik Nikose

Java Developer | DevOps Engineer
