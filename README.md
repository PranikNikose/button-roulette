# 🎰 Button Roulette – Complete Java + DevOps Lifecycle Project

## 📖 Project Overview

Button Roulette is a Full Stack Java application built to demonstrate an end-to-end DevOps lifecycle.

The project starts with a simple Spring Boot backend and React frontend and gradually evolves through modern DevOps practices including:

* Git & GitHub
* Branching Strategy
* Maven Build Automation
* Docker
* Docker Compose
* Jenkins CI Pipeline
* Docker Hub Registry
* Automated Deployment (Upcoming)
* Kubernetes (Upcoming)
* Monitoring & Logging (Upcoming)

This repository is designed for:

* Java Developers
* DevOps Engineers
* Students
* Freshers
* Interview Preparation
* CI/CD Learning
* Docker & Kubernetes Practice

---

# 🎯 Project Objective

The primary objective of this project is to learn and implement the complete DevOps lifecycle from source code management to container orchestration.

Instead of learning tools individually, this project demonstrates how each tool fits into a real-world software delivery pipeline.

---

# 🏗 Application Architecture

```text
User
 │
 ▼
React Frontend
 │
 ▼
Spring Boot REST API
 │
 ▼
Spell Engine
 │
 ▼
Java Reflection
 │
 ▼
Random Spell Generator
```

---

# 🔄 Complete DevOps Lifecycle

```text
Developer
    │
    ▼
GitHub Repository
    │
    ▼
Feature Branch
    │
    ▼
Pull Request
    │
    ▼
Development Branch
    │
    ▼
Jenkins Pipeline
    │
    ├── Build Backend
    │
    ├── Build Frontend
    │
    ├── Create Docker Images
    │
    └── Push Images
    │
    ▼
Docker Hub
    │
    ▼
Deployment
    │
    ▼
Kubernetes (Future)
```

---

# 🚀 Features

## Backend Features

* Spring Boot REST API
* Java Reflection Based Processing
* Random Spell Generator
* Environment Variable Support
* Configurable Port
* Configurable CORS
* No Database Dependency
* Lightweight Architecture

## Frontend Features

* React Single Page Application
* API Integration
* Spell History Tracking
* Responsive UI
* Environment Variable Configuration

## DevOps Features

* Git Source Control
* GitHub Repository Management
* Branching Strategy
* Dockerized Applications
* Docker Compose
* Jenkins CI Pipeline
* Docker Hub Integration

---

# 🛠 Technology Stack

## Backend

* Java 21
* Spring Boot
* Maven

## Frontend

* React
* JavaScript
* HTML
* CSS

## DevOps

* Git
* GitHub
* Jenkins
* Docker
* Docker Compose
* Docker Hub

---

# 📂 Repository Structure

```text
button-roulette/
│
├── roulette-backend/
│   ├── src/
│   ├── pom.xml
│   ├── Dockerfile
│   └── application.properties
│
├── roulette-frontend/
│   ├── src/
│   ├── public/
│   ├── package.json
│   ├── Dockerfile
│   └── .env.example
│
├── docker-compose.yml
├── Jenkinsfile
├── README.md
│
└── docs/
```

---

# 📋 Prerequisites

Install the following software before starting.

## Java 21

Verify installation:

```bash
java -version
```

Expected:

```text
Java 21
```

---

## Maven

Verify installation:

```bash
mvn -version
```

Expected:

```text
Apache Maven 3.x
```

---

## Node.js

Verify installation:

```bash
node -v
```

Expected:

```text
v20+
```

---

## npm

Verify installation:

```bash
npm -v
```

---

## Docker

Verify installation:

```bash
docker --version
```

---

## Git

Verify installation:

```bash
git --version
```

---

# 🌿 Branching Strategy

This project follows a simplified enterprise branching model.

```text
main (Production)
│
├── stqa (QA / UAT)
│
├── dev (Development)
│
└── feature/*
```

## Branch Purpose

| Branch    | Purpose                  |
| --------- | ------------------------ |
| feature/* | Developer Working Branch |
| dev       | Integration Branch       |
| stqa      | QA / Testing Branch      |
| main      | Production Branch        |

---

## Current Development Branch

```text
button-roulette-Pranik
```

---

## Create Feature Branch

```bash
git checkout -b feature/YourName
```

Example:

```bash
git checkout -b feature/Raju
```

Push:

```bash
git push -u origin feature/Raju
```

---

# 📥 Clone Repository

```bash
git clone https://github.com/PranikNikose/button-roulette.git

cd button-roulette
```

---

# ⚙ Backend Configuration

File:

```text
roulette-backend/src/main/resources/application.properties
```

```properties
spring.application.name=roulette-backend

server.port=${SERVER_PORT:8888}

frontend.url=${FRONTEND_URL:http://localhost:3000}
```

Default Backend URL:

```text
http://localhost:8888
```

---

# ⚙ Frontend Configuration

Create:

```text
roulette-frontend/.env
```

Contents:

```env
REACT_APP_API_URL=http://localhost:8888
```

---

# ▶ Running Backend

```bash
cd roulette-backend

mvn clean install

mvn spring-boot:run
```

Verify:

```text
http://localhost:8888/api/cast
```

---

# ▶ Running Frontend

```bash
cd roulette-frontend

npm install

npm start
```

Verify:

```text
http://localhost:3000
```

---

# 🔁 Application Flow

```text
User Clicks Button
       │
       ▼
React Frontend
       │
       ▼
REST API Call
       │
       ▼
Spring Boot Backend
       │
       ▼
Spell Engine
       │
       ▼
Java Reflection
       │
       ▼
Random Spell
       │
       ▼
JSON Response
       │
       ▼
UI Updated
```

# 📦 Phase 1 – Source Code Management (Git & GitHub)

## Objective

Manage application source code using Git and GitHub.

## Activities Performed

* Created GitHub Repository
* Cloned Repository
* Created Development Branch
* Created Feature Branches
* Committed Source Code
* Pushed Changes to GitHub
* Managed Code Promotion

## Repository

```text
button-roulette
```

## Git Workflow

```text
Developer
   │
   ▼
feature/username
   │
   ▼
Pull Request
   │
   ▼
dev
   │
   ▼
stqa
   │
   ▼
main
```

## Common Commands

Clone Repository

```bash
git clone https://github.com/PranikNikose/button-roulette.git
```

Check Branch

```bash
git branch
```

Create Branch

```bash
git checkout -b feature/YourName
```

Stage Changes

```bash
git add .
```

Commit Changes

```bash
git commit -m "Added new feature"
```

Push Changes

```bash
git push origin feature/YourName
```

## Outcome

```text
Source Code Successfully Version Controlled
```

---

# 🔨 Phase 2 – Build Automation

## Objective

Automate Backend and Frontend Builds.

## Backend Build

Navigate to backend:

```bash
cd roulette-backend
```

Build Project:

```bash
mvn clean package
```

Generated Artifact:

```text
target/*.jar
```

Run Application:

```bash
mvn spring-boot:run
```

---

## Frontend Build

Navigate to frontend:

```bash
cd roulette-frontend
```

Install Dependencies:

```bash
npm install
```

Create Production Build:

```bash
npm run build
```

Generated Artifact:

```text
build/
```

## Outcome

```text
Application Build Process Automated
```

---

# 🐳 Phase 3 – Dockerization

## Objective

Containerize Backend and Frontend Applications.

---

## Backend Dockerfile

```dockerfile
FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 8888

ENTRYPOINT ["java","-jar","app.jar"]
```

---

## Frontend Dockerfile

Frontend uses:

* Node.js Build Stage
* Nginx Runtime Stage

Benefits:

* Smaller Image Size
* Faster Startup
* Production Ready

---

## Build Backend Image

```bash
docker build -t roulette-backend .
```

---

## Build Frontend Image

```bash
docker build -t roulette-frontend .
```

---

## Verify Images

```bash
docker images
```

Expected:

```text
roulette-backend
roulette-frontend
```

## Outcome

```text
Application Successfully Containerized
```

---

# 🐳 Phase 4 – Docker Compose

## Objective

Run Entire Application Stack Using Single Command.

---

## Docker Compose Components

```text
Frontend Container
Backend Container
Docker Network
```

---

## Build Containers

```bash
docker compose build
```

---

## Start Containers

```bash
docker compose up
```

Detached Mode

```bash
docker compose up -d
```

---

## Verify Containers

```bash
docker ps
```

---

## Stop Containers

```bash
docker compose down
```

---

## Outcome

```text
Multi Container Application Running Successfully
```

---

# ⚙️ Phase 5 – Jenkins Continuous Integration

## Objective

Automate Build Process Whenever Code Changes.

---

## Jenkins Setup

Completed:

```text
Jenkins Installation
Pipeline Creation
GitHub Integration
Maven Configuration
Java Configuration
Docker Integration
```

---

## Jenkins Pipeline Flow

```text
Checkout Source Code
        │
        ▼
Build Backend
        │
        ▼
Build Frontend
        │
        ▼
Create Backend Docker Image
        │
        ▼
Create Frontend Docker Image
        │
        ▼
Push Images to Docker Hub
```

---

## Pipeline Stages

```text
Stage 1 : Checkout

Stage 2 : Build Backend

Stage 3 : Build Frontend

Stage 4 : Build Backend Docker Image

Stage 5 : Build Frontend Docker Image

Stage 6 : Push Backend Docker Image

Stage 7 : Push Frontend Docker Image
```

---

## Outcome

```text
CI Pipeline Successfully Implemented
```

---

# ☁️ Phase 6 – Docker Hub Registry

## Objective

Store Docker Images Centrally.

---

## Workflow

```text
Jenkins
   │
   ▼
Docker Build
   │
   ▼
Docker Push
   │
   ▼
Docker Hub
```

---

## Verify Image Availability

```bash
docker pull <dockerhub-username>/<image-name>
```

Example:

```bash
docker pull praniknikose/roulette-backend
```

---

## Outcome

```text
Images Available For Deployment Anywhere
```

---

# 🚧 Real Issues Faced During Development

## Issue 1 – Java Version Error

Error:

```text
release version 21 not supported
```

Root Cause:

```text
Jenkins was using older JDK.
```

Solution:

```text
Installed Java 21.
Configured Java 21 in Jenkins Global Tools.
Updated JAVA_HOME.
```

---

## Issue 2 – Maven Not Found

Error:

```text
'mvn' is not recognized
```

Root Cause:

```text
Maven not configured in Jenkins.
```

Solution:

```text
Installed Maven.
Configured Maven in Jenkins Global Tool Configuration.
Updated PATH Variable.
```

---

## Issue 3 – Docker Build Failure

Error:

```text
COPY target/*.jar app.jar

lstat /target: no such file or directory
```

Root Cause:

```text
target folder excluded in .dockerignore
```

Incorrect:

```text
target
.git
```

Correct:

```text
.git
```

Solution:

```text
Removed target entry from .dockerignore.
```

---

## Issue 4 – React API Error

Error:

```text
Unexpected token '<'
```

Root Cause:

```text
Incorrect API URL.
```

Solution:

```env
REACT_APP_API_URL=http://localhost:8888
```

---

## Issue 5 – Docker Hub Authentication Error

Error:

```text
push access denied

insufficient_scope
```

Root Cause:

```text
Docker Hub authentication failure.
```

Solution:

```bash
docker login
```

Also verified:

```text
Repository Name
Image Tag
Docker Credentials
```

---

# 📈 Project Journey

## Day 1

✅ Spring Boot Backend Created

## Day 2

✅ React Frontend Created

✅ Backend API Integration Completed

## Day 3

✅ Backend Dockerized

## Day 4

✅ Frontend Dockerized

## Day 5

✅ Docker Compose Setup

## Day 6

✅ Jenkins Installation

✅ Jenkins Pipeline Creation

## Day 7

✅ Docker Build Automation

## Day 8

✅ Docker Hub Integration

---

# ✅ Branch Completion Summary

Branch:

```text
button-roulette-Pranik
```

Completed:

```text
✅ Spring Boot Backend
✅ React Frontend
✅ API Integration
✅ Environment Variables
✅ Backend Dockerfile
✅ Frontend Dockerfile
✅ Docker Compose
✅ Jenkins Pipeline
✅ Docker Build Automation
✅ Docker Hub Push Automation
```

Verified:

```text
✅ Backend Running
✅ Frontend Running
✅ Docker Containers Running
✅ Jenkins Build Successful
✅ Images Available In Docker Hub
```

---

# 📊 Current Project Status

```text
GitHub Repository              ✅
Branching Strategy             ✅
Backend Development            ✅
Frontend Development           ✅
Docker Backend                 ✅
Docker Frontend                ✅
Docker Compose                 ✅
Jenkins CI                     ✅
Docker Hub                     ✅

Automated Deployment           ⏳
AWS Deployment                 ⏳
Kubernetes                     ⏳
Monitoring                     ⏳
```

---

# 🗺 Future Roadmap

## Phase 7 – Automated Deployment

Planned:

* Jenkins Deployment Pipeline
* Docker Compose Deployment
* EC2 Deployment

---

## Phase 8 – Kubernetes

Planned Components:

* Deployment
* Service
* ConfigMap
* Secret
* Ingress

---

## Phase 9 – Monitoring & Logging

Planned Tools:

* Prometheus
* Grafana
* ELK Stack
* Loki

---

# 🎓 Learning Outcomes

By completing this project, you will learn:

* Java Development
* Spring Boot
* REST APIs
* React
* Git & GitHub
* Branching Strategy
* Maven
* Docker
* Docker Compose
* Jenkins
* Docker Hub
* CI/CD Fundamentals
* DevOps Lifecycle
* Containerization Concepts
* Deployment Fundamentals

---

# 👨‍💻 Author

Pranik Nikose

Java Developer | DevOps Engineer

---

# ⭐ Support

If this project helped you understand Java, Docker, Jenkins, or DevOps concepts, consider giving the repository a star and using it as a reference for your own DevOps learning journey.
