# 🎯 Button Roulette - End-to-End DevOps Project

## 📌 Project Overview

Button Roulette is a full-stack application built to learn and implement a complete DevOps lifecycle using modern tools and cloud technologies.

The objective of this project is not only to develop an application but also to understand how software moves from a developer's machine to a production environment through an automated CI/CD pipeline.

The project covers:

* Source Code Management
* Branching Strategy
* Continuous Integration
* Containerization
* Docker Image Management
* Continuous Deployment
* AWS Cloud Deployment
* Configuration Management

---

# 🏗️ Application Overview

The application consists of:

## Backend

Technology Stack:

```text
Java 21
Spring Boot
Maven
REST APIs
```

Purpose:

```text
Generate random spell responses
Expose REST API endpoints
```

Example API:

```http
GET /api/cast
```

Sample Response:

```json
{
  "spellName": "FireBall",
  "emoji": "🔥",
  "result": "Code Fails. Developer Needed."
}
```

---

## Frontend

Technology Stack:

```text
React
JavaScript
HTML
CSS
Nginx (Container Runtime)
```

Purpose:

```text
Call backend API
Display spell results
Provide user interface
```

---

# 🎯 Project Goals

The primary goal of this project is to implement a complete DevOps lifecycle.

The project follows the flow:

```text
Developer
    ↓
Git
    ↓
GitHub
    ↓
Jenkins
    ↓
Build
    ↓
Docker
    ↓
Docker Hub
    ↓
AWS EC2
    ↓
Deployment
```

---

# 🛠 Technologies Used

## Development

```text
Java 21
Spring Boot
React
Maven
Node.js
NPM
```

---

## Source Control

```text
Git
GitHub
```

---

## CI/CD

```text
Jenkins
```

---

## Containerization

```text
Docker
Docker Compose
```

---

## Container Registry

```text
Docker Hub
```

---

## Cloud Platform

```text
AWS EC2
```

---

# 📂 Repository Structure

```text
button-roulette
│
├── roulette-backend
│   ├── src
│   ├── pom.xml
│   └── Dockerfile
│
├── roulette-frontend
│   ├── src
│   ├── package.json
│   └── Dockerfile
│
├── deployment
│   └── docker-compose.yml
│
├── Jenkinsfile
│
└── README.md
```

---

# 🌿 Git Branching Strategy

The project follows a feature branch workflow.

## Main Branch

```text
main
```

Purpose:

```text
Stable code
Production-ready code
```

---

## Feature Branch

Example:

```text
button-roulette-Pranik
```

Purpose:

```text
Development work
New features
Bug fixes
```

---

# 🔄 Development Workflow

Developer Workflow:

```text
Create Feature Branch
        ↓
Develop Changes
        ↓
Commit Changes
        ↓
Push To GitHub
        ↓
Create Pull Request
        ↓
Merge To Main
```

---

# 📥 Clone Repository

Clone Repository:

```bash
git clone https://github.com/PranikNikose/button-roulette.git
```

Navigate:

```bash
cd button-roulette
```

---

# 💻 Development Prerequisites

Install the following software before starting.

## Java

Version:

```text
Java 21
```

Verify:

```bash
java -version
```

---

## Maven

Verify:

```bash
mvn -version
```

---

## Node.js

Verify:

```bash
node -v
```

---

## NPM

Verify:

```bash
npm -v
```

---

## Git

Verify:

```bash
git --version
```

---

## Docker

Verify:

```bash
docker --version
```

---

## Docker Compose

Verify:

```bash
docker compose version
```

---

# 🚀 Phase 1 - Source Code Management

## Objective

Implement source control using Git and GitHub.

---

## Git Configuration

Configure Git:

```bash
git config --global user.name "Your Name"

git config --global user.email "your-email@example.com"
```

Verify:

```bash
git config --list
```

---

## Initialize Repository

```bash
git init
```

---

## Add Files

```bash
git add .
```

---

## Commit Changes

```bash
git commit -m "Initial Commit"
```

---

## Connect To GitHub

```bash
git remote add origin https://github.com/PranikNikose/button-roulette.git
```

---

## Push Code

```bash
git push origin main
```

---

# ✅ Phase 1 Outcome

Successfully implemented:

```text
Git Repository

GitHub Repository

Branching Strategy

Commit Workflow

Source Code Versioning
```

---

# 🐳 Phase 2 - Dockerization

## Objective

Containerize both backend and frontend applications so they can run consistently across different environments.

Before Dockerization:

```text
Developer Machine
    ↓
Java Installed
Node Installed
Maven Installed
NPM Installed
    ↓
Application Runs
```

Problem:

```text
Works On My Machine

Environment Dependency

Version Conflicts

Manual Setup Required
```

---

# Why Docker?

Docker solves environment-related issues by packaging the application along with its dependencies.

Benefits:

```text
Consistent Runtime

Portable Deployments

Environment Isolation

Easy Distribution

Cloud Ready
```

---

# Docker Architecture

```text
Source Code
    ↓
Dockerfile
    ↓
Docker Image
    ↓
Docker Container
```

---

# Backend Dockerization

## Backend Technology

```text
Java 21
Spring Boot
Maven
```

---

## Backend Dockerfile

Location:

```text
roulette-backend/Dockerfile
```

Example:

```dockerfile
FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 8888

ENTRYPOINT ["java","-jar","app.jar"]
```

---

# Understanding Backend Dockerfile

## Base Image

```dockerfile
FROM eclipse-temurin:21-jdk
```

Provides:

```text
Java Runtime
Java Development Kit
```

---

## Working Directory

```dockerfile
WORKDIR /app
```

Creates:

```text
/app
```

inside container.

---

## Copy Application

```dockerfile
COPY target/*.jar app.jar
```

Copies generated Spring Boot JAR.

---

## Expose Port

```dockerfile
EXPOSE 8888
```

Application Port:

```text
8888
```

---

## Start Application

```dockerfile
ENTRYPOINT ["java","-jar","app.jar"]
```

Starts Spring Boot application.

---

# Build Backend Application

Navigate:

```bash
cd roulette-backend
```

Build:

```bash
mvn clean package -DskipTests
```

Expected:

```text
target/*.jar
```

generated successfully.

---

# Build Backend Docker Image

```bash
docker build -t roulette-backend:latest .
```

Verify:

```bash
docker images
```

Expected:

```text
roulette-backend
```

---

# Run Backend Container

```bash
docker run -d -p 8888:8888 roulette-backend:latest
```

Verify:

```bash
docker ps
```

---

# Test Backend

Open:

```text
http://localhost:8888/api/cast
```

Expected Response:

```json
{
  "spellName":"Confuse",
  "emoji":"🌀",
  "result":"Java developers need coffee"
}
```

---

# Frontend Dockerization

## Frontend Technology

```text
React
Node.js
NPM
Nginx
```

---

# Why Multi-Stage Build?

React applications require Node.js only during build time.

Production deployment requires only static files.

Multi-stage builds:

```text
Reduce Image Size

Improve Security

Improve Performance
```

---

# Frontend Dockerfile

Location:

```text
roulette-frontend/Dockerfile
```

```dockerfile
# Build Stage

FROM node:20-alpine AS build

WORKDIR /app

COPY package*.json ./

RUN npm install

COPY . .

ARG REACT_APP_API_URL

ENV REACT_APP_API_URL=$REACT_APP_API_URL

RUN npm run build

# Runtime Stage

FROM nginx:alpine

COPY --from=build /app/build /usr/share/nginx/html

EXPOSE 80

CMD ["nginx","-g","daemon off;"]
```

---

# Understanding Frontend Dockerfile

## Build Stage

Uses:

```text
Node.js
```

for:

```text
npm install
npm run build
```

---

## Runtime Stage

Uses:

```text
Nginx
```

to serve React static files.

---

# Build Frontend Docker Image

Navigate:

```bash
cd roulette-frontend
```

Build:

```bash
docker build \
--build-arg REACT_APP_API_URL=http://localhost:8888 \
-t roulette-frontend:latest .
```

---

# Verify Frontend Image

```bash
docker images
```

Expected:

```text
roulette-frontend
```

---

# Run Frontend Container

```bash
docker run -d -p 3000:80 roulette-frontend:latest
```

Verify:

```bash
docker ps
```

---

# Test Frontend

Open:

```text
http://localhost:3000
```

Expected:

```text
Button Roulette UI Loads Successfully
```

---

# Docker Compose

Managing multiple containers manually becomes difficult.

Docker Compose allows multiple services to be managed together.

---

# Docker Compose Architecture

```text
Frontend Container
        ↓
Backend Container
```

Managed using a single file:

```text
docker-compose.yml
```

---

# Docker Compose File

```yaml
services:

  backend:
    image: roulette-backend:latest
    ports:
      - "8888:8888"

  frontend:
    image: roulette-frontend:latest
    ports:
      - "3000:80"
```

---

# Start Entire Application

```bash
docker compose up -d
```

---

# Verify Containers

```bash
docker ps
```

Expected:

```text
roulette-backend

roulette-frontend
```

---

# Stop Application

```bash
docker compose down
```

---

# Application Verification

Frontend:

```text
http://localhost:3000
```

Backend:

```text
http://localhost:8888/api/cast
```

---

# Benefits Achieved

```text
Backend Containerized

Frontend Containerized

Docker Images Created

Docker Compose Implemented

Local Deployment Automated

Portable Deployment Achieved
```

---

# ✅ Phase 2 Outcome

Successfully implemented:

```text
Backend Dockerfile

Frontend Dockerfile

Docker Images

Docker Containers

Docker Compose

Local Container Deployment
```

---

# 🔄 Phase 3 - Continuous Integration (CI)

## Objective

Automate application builds using Jenkins so that every code change can be validated consistently.

Before this phase:

```text
Developer
    ↓
Manual Maven Build
    ↓
Manual NPM Build
```

Problems:

```text
Manual Process

Human Errors

No Standard Build Process

No Build History
```

---

# Why Jenkins?

Jenkins is an open-source automation server used to:

```text
Build Applications

Run Tests

Create Artifacts

Deploy Applications

Implement CI/CD
```

---

# CI Workflow

```text
GitHub
    ↓
Jenkins
    ↓
Build Backend
    ↓
Build Frontend
```

---

# Jenkins Installation

Download Jenkins:

```text
https://www.jenkins.io/download/
```

---

# Verify Jenkins

Open:

```text
http://localhost:8080
```

Expected:

```text
Jenkins Dashboard
```

---

# Required Jenkins Plugins

Install:

```text
Pipeline

Git

Docker Pipeline

Credentials Binding

SSH Agent

Publish Over SSH
```

---

# Configure JDK

Navigate:

```text
Manage Jenkins
    ↓
Tools
```

Add:

```text
JDK21
```

Example:

```text
Name:
JDK21
```

---

# Configure Maven

Navigate:

```text
Manage Jenkins
    ↓
Tools
```

Add:

```text
Maven-3.9.11
```

---

# Verify Tool Configuration

Jenkins should now provide:

```text
Java

Javac

Maven
```

for pipeline execution.

---

# Create Jenkins Pipeline Job

Navigate:

```text
New Item
    ↓
Pipeline
```

Example:

```text
button-roulette-pranik-pipeline
```

---

# Initial Jenkinsfile

```groovy
pipeline {
    agent any

    tools {
        jdk 'JDK21'
        maven 'Maven-3.9.11'
    }

    stages {

        stage('Environment Check') {
            steps {
                bat 'java -version'
                bat 'javac -version'
                bat 'mvn -version'
            }
        }

        stage('Checkout') {
            steps {
                git branch: 'button-roulette-Pranik',
                    url: 'https://github.com/PranikNikose/button-roulette.git'
            }
        }

        stage('Build Backend') {
            steps {
                dir('roulette-backend') {
                    bat 'mvn clean package -DskipTests'
                }
            }
        }

        stage('Build Frontend') {
            steps {
                dir('roulette-frontend') {
                    bat 'npm ci'
                    bat 'npm run build'
                }
            }
        }
    }
}
```

---

# Build Process

Backend:

```text
Maven Build
```

Frontend:

```text
NPM Build
```

---

# Verify Build

Pipeline should show:

```text
SUCCESS
```

Expected Artifacts:

Backend:

```text
target/*.jar
```

Frontend:

```text
build/
```

---

# Benefits Achieved

```text
Automated Build Process

Repeatable Builds

Build History

Build Validation
```

---

# ✅ Phase 3 Outcome

Successfully implemented:

```text
Jenkins

Pipeline Job

GitHub Integration

Backend Build Automation

Frontend Build Automation

Continuous Integration
```

---

# 🐳 Phase 4 - Docker Build Automation

## Objective

Automate Docker image creation directly from Jenkins.

Before this phase:

```text
Build Application
    ↓
Manual Docker Build
```

Problems:

```text
Manual Process

Inconsistent Image Creation

Human Errors
```

---

# Target Flow

```text
GitHub
    ↓
Jenkins
    ↓
Build Backend
    ↓
Build Frontend
    ↓
Build Docker Images
```

---

# Jenkins Docker Integration

Verify Docker:

```bash
docker --version
```

Pipeline verification:

```groovy
stage('Environment Check') {
    steps {
        bat 'docker --version'
    }
}
```

---

# Docker Build Stage

Added:

```groovy
stage('Build Docker Images') {

    parallel {

        stage('Build Backend Docker') {
            steps {
                dir('roulette-backend') {
                    bat 'docker build -t roulette-backend:latest .'
                }
            }
        }

        stage('Build Frontend Docker') {
            steps {
                dir('roulette-frontend') {
                    bat '''
                    docker build ^
                    --build-arg REACT_APP_API_URL=http://localhost:8888 ^
                    -t roulette-frontend:latest .
                    '''
                }
            }
        }
    }
}
```

---

# Why Parallel Builds?

Benefits:

```text
Faster Pipeline Execution

Independent Builds

Reduced Build Time
```

---

# Verify Images

Add:

```groovy
stage('List Docker Images') {
    steps {
        bat 'docker images'
    }
}
```

Expected:

```text
roulette-backend

roulette-frontend
```

---

# Benefits Achieved

```text
Automated Docker Build

Consistent Images

Faster Delivery Process
```

---

# ✅ Phase 4 Outcome

Successfully implemented:

```text
Docker Build Automation

Backend Docker Build

Frontend Docker Build

Parallel Image Creation
```

---

# 📦 Phase 5 - Docker Image Registry

## Objective

Store Docker images in Docker Hub so they can be deployed from any server.

Before this phase:

```text
Images Available Only On Jenkins Machine
```

Problem:

```text
Cannot Deploy From Other Servers

No Central Image Repository
```

---

# Why Docker Hub?

Docker Hub provides:

```text
Centralized Image Storage

Version Management

Image Distribution

Deployment Flexibility
```

---

# Docker Hub Repositories

Backend:

```text
praniknikose/button-roulette-backend
```

Frontend:

```text
praniknikose/button-roulette-frontend
```

---

# Configure Jenkins Credentials

Navigate:

```text
Manage Jenkins
    ↓
Credentials
```

Add:

```text
Kind:
Username with Password
```

Example:

```text
ID:
dockerhub-creds
```

---

# Docker Login Stage

```groovy
stage('Docker Login') {

    steps {

        withCredentials([
            usernamePassword(
                credentialsId: 'dockerhub-creds',
                usernameVariable: 'DOCKER_USER',
                passwordVariable: 'DOCKER_PASS'
            )
        ]) {

            bat 'echo %DOCKER_PASS% | docker login -u %DOCKER_USER% --password-stdin'

        }
    }
}
```

---

# Tag Images

Backend:

```groovy
docker tag roulette-backend:latest praniknikose/button-roulette-backend:${BUILD_NUMBER}
docker tag roulette-backend:latest praniknikose/button-roulette-backend:latest
```

Frontend:

```groovy
docker tag roulette-frontend:latest praniknikose/button-roulette-frontend:${BUILD_NUMBER}
docker tag roulette-frontend:latest praniknikose/button-roulette-frontend:latest
```

---

# Push Images

Backend:

```groovy
docker push praniknikose/button-roulette-backend:${BUILD_NUMBER}
docker push praniknikose/button-roulette-backend:latest
```

Frontend:

```groovy
docker push praniknikose/button-roulette-frontend:${BUILD_NUMBER}
docker push praniknikose/button-roulette-frontend:latest
```

---

# Docker Registry Flow

```text
GitHub
    ↓
Jenkins
    ↓
Build Docker Images
    ↓
Tag Images
    ↓
Push To Docker Hub
```

---

# Benefits Achieved

```text
Centralized Image Storage

Versioned Images

Cloud Ready Deployment

Reusable Images
```

---

# ✅ Phase 5 Outcome

Successfully implemented:

```text
Docker Hub Integration

Image Versioning

Image Tagging

Automated Image Push

Centralized Registry
```

---

# ☁️ Phase 6 - AWS EC2 Deployment

## Objective

Deploy the application to AWS EC2 and make it accessible over the internet.

Until now, the application was running only:

```text
Developer Machine
    ↓
Docker Compose
    ↓
Application Running
```

The goal of this phase is to host the application on AWS cloud infrastructure.

---

# Why AWS EC2?

AWS EC2 provides:

```text
Cloud Hosting

Public Accessibility

Remote Deployment

Production-Like Environment

Scalable Infrastructure
```

---

# AWS Resources Used

## EC2 Instance

Operating System:

```text
Amazon Linux 2023
```

Instance Type:

```text
t2.micro
```

---

# Security Group Configuration

Allow the following inbound ports:

| Port | Purpose    |
| ---- | ---------- |
| 22   | SSH Access |
| 3000 | Frontend   |
| 8888 | Backend    |

---

# Connect To EC2

Using PEM key:

```bash
ssh -i button-roulette-key.pem ec2-user@<EC2-PUBLIC-IP>
```

Verify:

```bash
hostname
```

---

# Install Docker

Update Packages:

```bash
sudo dnf update -y
```

Install Docker:

```bash
sudo dnf install docker -y
```

Enable Docker:

```bash
sudo systemctl enable docker
```

Start Docker:

```bash
sudo systemctl start docker
```

Verify:

```bash
docker --version
```

---

# Install Docker Compose Plugin

Create Plugin Directory:

```bash
sudo mkdir -p /usr/local/lib/docker/cli-plugins
```

Download Plugin:

```bash
sudo curl -SL \
https://github.com/docker/compose/releases/latest/download/docker-compose-linux-x86_64 \
-o /usr/local/lib/docker/cli-plugins/docker-compose
```

Grant Permissions:

```bash
sudo chmod +x /usr/local/lib/docker/cli-plugins/docker-compose
```

Verify:

```bash
docker compose version
```

---

# Create Deployment Directory

```bash
mkdir -p ~/button-roulette
```

Navigate:

```bash
cd ~/button-roulette
```

---

# Create Deployment Compose File

Create:

```text
docker-compose.yml
```

Example:

```yaml
services:

  backend:
    image: praniknikose/button-roulette-backend:latest
    ports:
      - "8888:8888"
    environment:
      SERVER_PORT: 8888
      FRONTEND_URL: http://<EC2-PUBLIC-IP>:3000

  frontend:
    image: praniknikose/button-roulette-frontend:latest
    ports:
      - "3000:80"
```

---

# Deploy Application

Pull Images:

```bash
docker compose pull
```

Start Containers:

```bash
docker compose up -d
```

Verify:

```bash
docker ps
```

Expected:

```text
button-roulette-backend

button-roulette-frontend
```

---

# Verify Backend

Open:

```text
http://<EC2-PUBLIC-IP>:8888/api/cast
```

Expected:

```json
{
  "spellName":"Confuse",
  "emoji":"🌀",
  "result":"Java developers need coffee"
}
```

---

# Verify Frontend

Open:

```text
http://<EC2-PUBLIC-IP>:3000
```

Expected:

```text
Button Roulette UI Loads Successfully
```

---

# First Real Production Issue - CORS

Frontend loaded successfully but API calls failed.

Browser Error:

```text
No 'Access-Control-Allow-Origin' header is present
```

---

# Root Cause

Backend container was started with:

```text
FRONTEND_URL=http://PUBLIC_IP:3000
```

instead of:

```text
FRONTEND_URL=http://<EC2-PUBLIC-IP>:3000
```

Verify:

```bash
docker exec -it button-roulette-backend-1 env | grep FRONTEND_URL
```

---

# Solution

Update compose file:

```yaml
environment:
  SERVER_PORT: 8888
  FRONTEND_URL: http://<EC2-PUBLIC-IP>:3000
```

Redeploy:

```bash
docker compose down

docker compose up -d
```

Verify:

```bash
docker exec -it button-roulette-backend-1 env | grep FRONTEND_URL
```

Expected:

```text
FRONTEND_URL=http://<EC2-PUBLIC-IP>:3000
```

---

# Architecture After AWS Deployment

```text
Internet
    │
    ▼
AWS EC2
    │
    ├── Frontend Container
    │      Port 3000
    │
    └── Backend Container
           Port 8888
```

---

# Benefits Achieved

```text
Cloud Deployment

Public Access

Production-Like Environment

AWS Experience

Docker Deployment On Cloud
```

---

# ✅ Phase 6 Outcome

Successfully implemented:

```text
AWS EC2

Docker On EC2

Docker Compose On EC2

Public Application Access

Cloud Deployment
```

---

# 🚀 Phase 7 - Automated Deployment To EC2

## Objective

Remove manual deployment steps and allow Jenkins to deploy directly to EC2 after a successful build.

Before this phase:

```text
GitHub
    ↓
Jenkins
    ↓
Build
    ↓
Docker Hub

STOP

Manual SSH To EC2
    ↓
docker compose pull
    ↓
docker compose up -d
```

Manual deployment was still required.

---

# Target Flow

```text
GitHub
    ↓
Jenkins
    ↓
Build
    ↓
Docker Hub
    ↓
EC2 Deployment
```

---

# Install Jenkins Plugin

Navigate:

```text
Manage Jenkins
    ↓
Plugins
```

Install:

```text
Publish Over SSH
```

---

# Configure Publish Over SSH

Navigate:

```text
Manage Jenkins
    ↓
System
    ↓
Publish Over SSH
```

Add Configuration:

```text
Name:
button-roulette-ec2

Hostname:
<EC2-PUBLIC-IP>

Username:
ec2-user

Private Key:
Paste PEM Content
```

Test:

```text
Test Configuration
```

Expected:

```text
Success
```

---

# Deployment Stage

Added Jenkins deployment stage:

```groovy
stage('Deploy to EC2') {

    steps {

        sshPublisher(
            publishers: [
                sshPublisherDesc(
                    configName: 'button-roulette-ec2',
                    transfers: [
                        sshTransfer(
                            execCommand: '''
                            cd /home/ec2-user/button-roulette

                            docker compose pull

                            docker compose up -d
                            '''
                        )
                    ]
                )
            ]
        )
    }
}
```

---

# Deployment Flow

```text
GitHub
    ↓
Jenkins
    ↓
Build Application
    ↓
Build Docker Images
    ↓
Push Docker Images
    ↓
SSH To EC2
    ↓
docker compose pull
    ↓
docker compose up -d
```

---

# Validation

Updated backend response:

Before:

```java
return "Your code compiles only because Java feels sorry for you.";
```

After:

```java
return "Code Fails. Developer Needed.";
```

Commit:

```bash
git add .

git commit -m "Updated FireBall Message"

git push
```

Run Jenkins Pipeline.

Verify:

```text
http://<EC2-PUBLIC-IP>:8888/api/cast
```

Expected:

```json
{
  "spellName":"FireBall",
  "emoji":"🔥",
  "result":"Code Fails. Developer Needed."
}
```

This confirms deployment is fully automated.

---

# Benefits Achieved

```text
Automated Deployment

No Manual SSH

No Manual Docker Pull

No Manual Restart

Continuous Deployment
```

---

# ✅ Phase 7 Outcome

Successfully implemented:

```text
Publish Over SSH

Remote Command Execution

Automated Deployment

Continuous Deployment To EC2
```

---

# ⚙️ Phase 8 - EC2 Bootstrap Using User Data

## Objective

Reduce manual server setup effort by automatically installing required software during EC2 creation.

Before this phase, every new EC2 required:

```text
Create EC2
    ↓
SSH To EC2
    ↓
Install Docker
    ↓
Install Docker Compose
    ↓
Configure Docker
    ↓
Create Deployment Directory
```

This process was repetitive and error-prone.

---

# What Is User Data?

User Data is a startup script executed automatically when an EC2 instance boots for the first time.

It allows automatic:

```text
Package Installation

Server Configuration

Software Setup

Initial Provisioning
```

---

# User Data Script

The following script was configured during EC2 creation:

```bash
#!/bin/bash

# Log User Data execution
exec > >(tee /var/log/user-data.log)
exec 2>&1

# Update packages
dnf update -y

# Install Docker
dnf install -y docker

# Start and enable Docker
systemctl enable docker
systemctl start docker

# Add ec2-user to docker group
usermod -aG docker ec2-user

# Install Docker Compose Plugin
mkdir -p /usr/local/lib/docker/cli-plugins

curl -SL \
https://github.com/docker/compose/releases/latest/download/docker-compose-linux-x86_64 \
-o /usr/local/lib/docker/cli-plugins/docker-compose

chmod +x /usr/local/lib/docker/cli-plugins/docker-compose

# Create Deployment Directory
mkdir -p /home/ec2-user/button-roulette

chown -R ec2-user:ec2-user /home/ec2-user/button-roulette

# Verification
docker --version
docker compose version

echo "Docker and Docker Compose installed successfully"
```

---

# Benefits

```text
Automatic Docker Installation

Automatic Docker Compose Installation

Automatic Server Preparation

Reduced Manual Setup

Faster Recovery Process
```

---

# Fresh EC2 Recovery Test

A new EC2 instance was created.

Steps performed:

```text
Create New EC2
    ↓
User Data Executes
    ↓
Update Jenkins Hostname
    ↓
Run Jenkins Pipeline
```

Result:

```text
Frontend Deployed Successfully

Backend Deployed Successfully

Application Running
```

This validated that deployment can be repeated on a brand-new server.

---

# ✅ Phase 8 Outcome

Successfully implemented:

```text
Server Bootstrap Automation

Docker Auto Installation

Docker Compose Auto Installation

EC2 Recovery Validation
```

---

# 📂 Phase 9 - Configuration Management From GitHub

## Objective

Store deployment configuration inside GitHub instead of maintaining it manually on EC2.

Before this phase:

```text
docker-compose.yml
```

existed only on EC2.

Changes required:

```text
SSH To EC2
    ↓
Edit File
    ↓
Save
    ↓
Redeploy
```

This created configuration drift.

---

# What Is Configuration Drift?

Configuration drift occurs when:

```text
GitHub Configuration
```

and

```text
Server Configuration
```

become different over time.

This creates deployment inconsistencies.

---

# Solution

Store deployment configuration inside GitHub.

Repository Structure:

```text
button-roulette
│
├── deployment
│   └── docker-compose.yml
│
├── roulette-backend
├── roulette-frontend
├── Jenkinsfile
└── README.md
```

---

# Deployment Compose File

Location:

```text
deployment/docker-compose.yml
```

Example:

```yaml
version: '3.9'

services:

  backend:
    image: 'praniknikose/button-roulette-backend:latest'
    container_name: roulette-backend
    ports:
      - '8888:8888'
    environment:
      SERVER_PORT: 8888
      FRONTEND_URL: 'http://<EC2-PUBLIC-IP>:3000'
    restart: unless-stopped

  frontend:
    image: 'praniknikose/button-roulette-frontend:latest'
    container_name: roulette-frontend
    ports:
      - '3000:80'
    depends_on:
      - backend
    restart: unless-stopped
```

---

# Upload Compose File Using Jenkins

Added pipeline stage:

```groovy
stage('Upload Compose File To EC2') {

    steps {

        sshPublisher(
            publishers: [
                sshPublisherDesc(
                    configName: 'button-roulette-ec2',
                    transfers: [
                        sshTransfer(
                            sourceFiles: 'deployment/docker-compose.yml',
                            removePrefix: 'deployment',
                            remoteDirectory: 'button-roulette'
                        )
                    ]
                )
            ]
        )
    }
}
```

---

# Deployment Flow

```text
GitHub
    ↓
Checkout
    ↓
Upload Compose File
    ↓
Deploy Application
```

---

# Verification

Verify EC2 file:

```bash
cat /home/ec2-user/button-roulette/docker-compose.yml
```

Expected:

```text
Same Content As GitHub
```

---

# Benefits

```text
Version Controlled Configuration

Single Source Of Truth

No Manual Editing On EC2

Consistent Deployments
```

---

# Real Issue Faced - File Upload Path

Initially Jenkins uploaded:

```text
/home/ec2-user/button-roulette/deployment/docker-compose.yml
```

instead of:

```text
/home/ec2-user/button-roulette/docker-compose.yml
```

Root Cause:

```text
Jenkins Preserved Folder Structure
```

Solution:

```groovy
removePrefix: 'deployment'
```

Result:

```text
Correct File Placement
```

---

# ✅ Phase 9 Outcome

Successfully implemented:

```text
Configuration Management

Git-Based Configuration

Automatic Compose Synchronization

Single Source Of Truth
```

---
# 🌐 Phase 10 - Nginx Reverse Proxy

## Objective

Introduce Nginx as a reverse proxy and create a single entry point for the application.

Before this phase:

```text
Frontend
http://<EC2-PUBLIC-IP>:3000

Backend
http://<EC2-PUBLIC-IP>:8888/api/cast
```

Problems:

```text
Multiple Public Ports

Backend Directly Exposed

Hardcoded API URLs

Frontend Dependent On Backend Address

Not Production Friendly
```

---

# Why Nginx?

Nginx acts as a reverse proxy between users and application containers.

Benefits:

```text
Single Entry Point

Request Routing

Backend Isolation

Production-Ready Architecture

Foundation For Kubernetes Ingress
```

---

# Architecture Before Nginx

```text
Internet
    │
    ├── http://SERVER-IP:3000
    │
    └── http://SERVER-IP:8888
```

Frontend and backend were accessed independently using different ports.

---

# Architecture After Nginx

```text
Internet
    │
    ▼
Nginx Reverse Proxy
    │
    ├── /
    │    ▼
    │ Frontend Container
    │
    └── /api/*
         ▼
      Backend Container
```

Users now access only:

```text
http://SERVER-IP
```

Nginx decides where requests should be routed.

---

# Repository Structure Update

A dedicated Nginx folder was introduced.

```text
button-roulette
│
├── deployment
│   │
│   ├── docker-compose.yml
│   │
│   └── nginx
│       ├── Dockerfile
│       └── nginx.conf
│
├── roulette-backend
├── roulette-frontend
├── Jenkinsfile
└── README.md
```

---

# Nginx Configuration

Location:

```text
deployment/nginx/nginx.conf
```

Configuration:

```nginx
events {
}

http {

    server {

        listen 80;

        location / {
            proxy_pass http://frontend;
        }

        location /api/ {
            proxy_pass http://backend:8888;
        }

    }

}
```

---

# Understanding Request Routing

Frontend Requests:

```text
http://SERVER-IP/
```

Nginx Routes To:

```text
frontend container
```

Backend Requests:

```text
http://SERVER-IP/api/cast
```

Nginx Routes To:

```text
backend:8888
```

This removes the need for users to know internal container ports.

---

# Nginx Dockerfile

Location:

```text
deployment/nginx/Dockerfile
```

Configuration:

```dockerfile
FROM nginx:alpine

COPY nginx.conf /etc/nginx/nginx.conf

EXPOSE 80

CMD ["nginx","-g","daemon off;"]
```

---

# Why Containerize Nginx?

Benefits:

```text
Version Controlled Configuration

Portable Deployment

Consistent Runtime

CI/CD Friendly

Docker Hub Distribution
```

Nginx now follows the same lifecycle as:

```text
Backend Image

Frontend Image
```

and is deployed using Docker images instead of manual server configuration.

# Frontend Refactoring For Reverse Proxy

## Problem With Previous Approach

Initially the frontend called the backend using a build-time environment variable.

Example:

```javascript
await fetch(`${process.env.REACT_APP_API_URL}/api/cast`);
```

The frontend image was built using:

```text
REACT_APP_API_URL=http://<EC2-PUBLIC-IP>:8888
```

Problems:

```text
Frontend Depended On Backend Address

Frontend Needed Rebuild When Server Changed

Hardcoded Infrastructure Details

Not Suitable For Reverse Proxy Architecture
```

---

# Solution - Relative API Paths

The frontend was updated to use relative URLs.

Before:

```javascript
await fetch(`${process.env.REACT_APP_API_URL}/api/cast`);
```

After:

```javascript
await fetch('/api/cast');
```

---

# Why Relative URLs?

Benefits:

```text
Frontend No Longer Knows Backend Address

No Hardcoded Server IP

No Backend Port Dependency

Works Behind Reverse Proxy

Compatible With Kubernetes Ingress
```

Request Flow:

```text
Browser
    ↓
/api/cast
    ↓
Nginx
    ↓
Backend Container
```

The React application no longer needs to know where the backend is hosted.

---

# Local Development Support

## Challenge

After switching to:

```javascript
fetch('/api/cast')
```

local development stopped working.

Reason:

```text
React Running On:
http://localhost:3000

Backend Running On:
http://localhost:8888
```

The browser would attempt:

```text
http://localhost:3000/api/cast
```

instead of:

```text
http://localhost:8888/api/cast
```

---

# React Proxy Configuration

To solve this issue, a development proxy was added.

Location:

```text
roulette-frontend/package.json
```

Added:

```json
{
  "proxy": "http://localhost:8888"
}
```

---

# How React Proxy Works

Development Flow:

```text
Browser
    ↓
localhost:3000/api/cast
    ↓
React Development Server
    ↓
localhost:8888/api/cast
```

Benefits:

```text
No CORS Issues

No Hardcoded URLs

Same Code For Development And Production
```

---

# Validation

Backend Started:

```bash
cd roulette-backend

mvn spring-boot:run
```

Frontend Started:

```bash
cd roulette-frontend

npm start
```

Verification:

```text
http://localhost:3000
```

Result:

```text
Frontend Loaded Successfully

API Calls Successful

Spell Responses Displayed Correctly
```

This validated that:

```javascript
fetch('/api/cast')
```

works correctly in the development environment.

---

# Frontend Dockerfile Simplification

Because the frontend no longer depends on:

```text
REACT_APP_API_URL
```

the Dockerfile was simplified.

Removed:

```dockerfile
ARG REACT_APP_API_URL

ENV REACT_APP_API_URL=$REACT_APP_API_URL
```

---

# Updated Frontend Dockerfile

```dockerfile
# Build Stage

FROM node:20-alpine AS build

WORKDIR /app

COPY package*.json ./

RUN npm install

COPY . .

RUN npm run build

# Runtime Stage

FROM nginx:alpine

COPY --from=build /app/build /usr/share/nginx/html

EXPOSE 80

CMD ["nginx","-g","daemon off;"]
```

---

# Benefits Achieved

```text
Cleaner Dockerfile

Environment Agnostic Frontend

No Build-Time Backend Configuration

Simplified CI/CD Pipeline

Improved Portability
```

---

# Jenkins Pipeline Simplification

Because the frontend no longer required:

```text
REACT_APP_API_URL
```

the Jenkins build command was simplified.

Before:

```groovy
docker build --build-arg REACT_APP_API_URL=http://SERVER-IP:8888 -t roulette-frontend:latest .
```

After:

```groovy
docker build -t roulette-frontend:latest .
```

---

# Benefits

```text
No Hardcoded Server IP

No Environment-Specific Build

Reusable Frontend Image

Simpler Deployment Process
```

At this point the frontend became completely independent from the backend address and could operate behind Nginx using relative API paths.

# Docker Compose Architecture Update

## Objective

Integrate Nginx into the deployment architecture and establish a single entry point for all incoming requests.

Before Nginx:

```text
Frontend
http://SERVER-IP:3000

Backend
http://SERVER-IP:8888
```

Users had to know multiple ports.

---

# Updated Docker Compose Configuration

Location:

```text
deployment/docker-compose.yml
```

Configuration:

```yaml
version: '3.9'

services:

  nginx:
    image: 'praniknikose/button-roulette-nginx:latest'
    container_name: roulette-nginx
    ports:
      - '80:80'
    depends_on:
      - frontend
      - backend
    restart: unless-stopped

  backend:
    image: 'praniknikose/button-roulette-backend:latest'
    container_name: roulette-backend
    environment:
      SERVER_PORT: 8888
      FRONTEND_URL: 'http://SERVER-IP'
    restart: unless-stopped

  frontend:
    image: 'praniknikose/button-roulette-frontend:latest'
    container_name: roulette-frontend
    depends_on:
      - backend
    restart: unless-stopped
```

---

# Why Remove Port Exposure?

Before:

```text
Frontend
3000

Backend
8888
```

After:

```text
Nginx
80
```

Only Nginx is exposed publicly.

Benefits:

```text
Cleaner Architecture

Improved Security

Production-Like Deployment

Single Entry Point
```

---

# Nginx Docker Image Build Automation

A dedicated Docker image was created for Nginx.

Repository:

```text
praniknikose/button-roulette-nginx
```

---

# Jenkins Build Stage Update

Added:

```groovy
stage('Build Nginx Docker') {
    steps {
        dir('deployment/nginx') {
            bat 'docker build -t roulette-nginx:latest .'
        }
    }
}
```

---

# Jenkins Push Stage Update

Added:

```groovy
stage('Push Nginx Image') {
    steps {

        bat "docker tag roulette-nginx:latest praniknikose/button-roulette-nginx:${BUILD_NUMBER}"
        bat "docker tag roulette-nginx:latest praniknikose/button-roulette-nginx:latest"

        bat "docker push praniknikose/button-roulette-nginx:${BUILD_NUMBER}"
        bat "docker push praniknikose/button-roulette-nginx:latest"
    }
}
```

---

# Why Build Nginx In Jenkins?

Alternative approach:

```text
Upload Nginx Files To EC2
Build On EC2
```

Problems:

```text
Server Requires Source Code

Build Logic On Server

Inconsistent Deployment Process
```

Selected approach:

```text
Build In Jenkins
    ↓
Push To Docker Hub
    ↓
Pull On EC2
```

Benefits:

```text
Consistent Build Process

Immutable Images

Production Standard Workflow

Centralized Image Management
```

---

# Deployment Pipeline Update

Final Deployment Flow:

```text
Developer
    ↓
Git Push
    ↓
GitHub
    ↓
Jenkins

Build Backend
Build Frontend
Build Nginx

    ↓

Docker Images

    ↓

Docker Hub

    ↓

Upload docker-compose.yml

    ↓

SSH To EC2

    ↓

docker compose pull

    ↓

docker compose down

    ↓

docker compose up -d

    ↓

Application Live
```

---

# Deployment Verification

Verify running containers:

```bash
docker ps
```

Expected:

```text
roulette-nginx

roulette-backend

roulette-frontend
```

---

# Browser Verification

Open:

```text
http://SERVER-IP
```

Expected:

```text
Button Roulette UI Loads Successfully
```

Click:

```text
🎰 CLICK ME
```

Expected:

```text
Spell Response Displayed Successfully
```

---

# Request Flow Verification

Frontend Request:

```text
http://SERVER-IP
```

Flow:

```text
Browser
    ↓
Nginx
    ↓
Frontend Container
```

API Request:

```text
http://SERVER-IP/api/cast
```

Flow:

```text
Browser
    ↓
Nginx
    ↓
Backend Container
```

---

# Benefits Achieved

```text
Reverse Proxy Architecture

Single Entry Point

Backend Isolation

Nginx Containerization

Automated Nginx Deployment

Production-Like Networking

Simplified Frontend Configuration
```

---

# ✅ Phase 10 Outcome

Successfully implemented:

```text
Nginx Reverse Proxy

Single Public Endpoint

Relative API Routing

React Development Proxy

Frontend Decoupling

Nginx Docker Image

Docker Hub Integration

Jenkins Nginx Build Automation

Jenkins Nginx Deployment

Production-Style Request Routing
```
---
# 🔗 Phase 10.5 - GitHub Webhook Integration

## Objective

Automate Jenkins pipeline execution whenever code is pushed to GitHub.

Before this phase, every code change required a manual Jenkins build trigger.

Workflow Before:

```text
Developer
    ↓
Git Push
    ↓
GitHub
    ↓
Manual Click
"Build Now"
    ↓
Jenkins Pipeline
```

Problems:

```text
Manual Intervention Required

Not Fully Automated

Risk Of Forgetting Deployments

Not Production Friendly
```

---

# Goal

Automatically trigger Jenkins whenever code is pushed to GitHub.

Workflow After:

```text
Developer
    ↓
Git Push
    ↓
GitHub Webhook
    ↓
Jenkins Pipeline
    ↓
Docker Hub
    ↓
AWS EC2
    ↓
Application Updated
```

This completed the Continuous Integration portion of the project.

---

# Challenge

Jenkins was running locally on:

```text
http://localhost:8080
```

GitHub Webhooks require a publicly accessible URL.

GitHub cannot access:

```text
localhost
```

because localhost exists only on the developer machine.

---

# Solution - ngrok

ngrok was used to expose Jenkins temporarily to the internet.

Command:

```bash
ngrok http 8080
```

Example Output:

```text
Forwarding

https://xxxxxxxx.ngrok-free.dev
    ↓
http://localhost:8080
```

Architecture:

```text
GitHub
    ↓
Webhook
    ↓
ngrok Public URL
    ↓
Jenkins (localhost:8080)
```

---

# Jenkins Configuration

Navigate:

```text
Jenkins
    ↓
Pipeline Job
    ↓
Configure
    ↓
Build Triggers
```

Enable:

```text
GitHub hook trigger for GITScm polling
```

Save the job.

---

# GitHub Webhook Configuration

Navigate:

```text
GitHub Repository
    ↓
Settings
    ↓
Webhooks
    ↓
Add Webhook
```

Configuration:

```text
Payload URL:
https://<ngrok-url>/github-webhook/

Content Type:
application/json

Secret:
None

Events:
Just the push event

Active:
Enabled
```

---

# Verification

Create a test commit:

```bash
git add .

git commit -m "Webhook Test"

git push origin button-roulette-Pranik
```

Expected Result:

```text
GitHub Receives Push

Webhook Sent

Jenkins Build Starts Automatically

Pipeline Executes

Deployment Completed
```

No manual interaction required.

---

# End-To-End CI/CD Flow

```text
Developer
    ↓
Git Push
    ↓
GitHub
    ↓
Webhook
    ↓
Jenkins

Build Backend
Build Frontend
Build Nginx

    ↓

Docker Hub

    ↓

Upload Compose File

    ↓

SSH To EC2

    ↓

Docker Compose Deployment

    ↓

Nginx Reverse Proxy

    ↓

Frontend + Backend
```

---

# Benefits Achieved

```text
Automatic Build Triggering

Reduced Manual Steps

Faster Feedback Loop

Production-Like CI/CD Workflow

GitHub And Jenkins Integration

Improved Developer Experience
```

---

# Lessons Learned

```text
GitHub Webhooks Require Public Accessibility

Local Jenkins Cannot Receive Internet Traffic Directly

ngrok Can Be Used For Development And Learning

Jenkins Can Automatically React To Source Code Changes

Webhook-Based Automation Is A Core CI/CD Concept
```

---

# ✅ Phase 10.5 Outcome

Successfully implemented:

```text
ngrok Integration

Public Jenkins Endpoint

GitHub Webhook

Automatic Jenkins Trigger

Push-Based CI/CD Workflow

End-To-End Deployment Automation
```

The project now supports fully automated deployments from GitHub commits without requiring manual Jenkins execution.

---
---
# 🏗️ Phase 11 - Infrastructure as Code (Terraform)

## Objective

Automate AWS infrastructure provisioning using Terraform.

Before this phase:

```text
AWS Console
    ↓
Create EC2
    ↓
Create Security Group
    ↓
Download PEM Key
    ↓
Install Docker
    ↓
Deploy Application
```

Problems:

```text
Manual Infrastructure Creation

Difficult To Reproduce

Error Prone

No Version Control

No Infrastructure History
```

---

# Why Terraform?

Terraform allows infrastructure to be managed as code.

Benefits:

```text
Infrastructure Version Control

Repeatable Environments

Automation

Disaster Recovery

Production Standard Workflow
```

---

# Infrastructure As Code Flow

```text
Terraform Code
        ↓
Terraform Apply
        ↓
AWS Infrastructure
        ↓
EC2
Security Groups
Elastic IP
```

---

# Terraform Repository Structure

```text
terraform
│
├── main.tf
├── variables.tf
├── terraform.tfvars
├── outputs.tf
└── userdata.sh

terraform-backend
│
├── main.tf
├── variables.tf
├── terraform.tfvars
└── outputs.tf
```

# Terraform Backend

## Objective

Store Terraform state remotely in AWS.

Without remote state:

```text
terraform.tfstate
```

exists only on the local machine.

Problems:

```text
State Loss Risk

No Team Collaboration

No State Locking

No Backup
```

---

# Backend Architecture

```text
Terraform
    ↓
S3 Bucket
    ↓
terraform.tfstate

DynamoDB
    ↓
State Locking
```

---

# Resources Created

## S3 Bucket

Purpose:

```text
Store Terraform State File
```

Example:

```text
pranik-terraform-state
```

---

## DynamoDB Table

Purpose:

```text
Terraform State Locking
```

Example:

```text
pranik-terraform-state-lock
```

---

# Backend Deployment

Commands:

```bash
cd terraform-backend

terraform init

terraform validate

terraform plan

terraform apply
```

---

# Validation

Verify S3 Bucket:

```bash
aws s3 ls
```

Verify DynamoDB Table:

```bash
aws dynamodb list-tables --region ap-south-1
```

Expected:

```text
pranik-terraform-state

pranik-terraform-state-lock
```

# Remote State Migration

After backend creation, Terraform state was migrated from local storage to S3.

Backend Configuration:

```hcl
backend "s3" {
  bucket         = "pranik-terraform-state"
  key            = "button-roulette/terraform.tfstate"
  region         = "ap-south-1"
  dynamodb_table = "pranik-terraform-state-lock"
}
```

---

# State Migration

Command:

```bash
terraform init -reconfigure
```

Terraform Prompt:

```text
Do you want to copy existing state to the new backend?
```

Selected:

```text
yes
```

---

# Validation

Verify state location:

```bash
terraform state list
```

Expected:

```text
data.aws_ami.amazon_linux
aws_instance.terraform_ec2
aws_security_group.terraform_sg
```

This confirmed Terraform was reading state from the remote backend.

# EC2 Provisioning Using Terraform

Terraform automatically creates:

```text
EC2 Instance

Security Group

User Data Configuration
```

---

# Security Group Rules

Allowed Ports:

| Port | Purpose |
|--------|----------|
| 22 | SSH |
| 80 | HTTP |
| 443 | HTTPS |
| 8080 | Spring Boot |

---

# User Data Automation

The EC2 instance automatically installs:

```text
Docker

Docker Compose

Docker Service Configuration
```

during first boot.

---

# Provisioning Workflow

```text
Terraform Apply
        ↓
Create Security Group
        ↓
Create EC2
        ↓
Execute User Data
        ↓
Install Docker
        ↓
Install Docker Compose
        ↓
Server Ready
```

---

# Validation

Verify User Data Execution:

```bash
cat /var/log/user-data.log
```

Expected:

```text
Docker installed

Docker Compose installed

User Data completed successfully
```

# Elastic IP Integration

## Problem

Each time EC2 was recreated, AWS assigned a new public IP.

This required updating:

```text
Jenkins Publish Over SSH

Domain DNS Records

Deployment Configuration
```

---

# Solution

Terraform now provisions and attaches an Elastic IP.

Resources:

```hcl
resource "aws_eip" "terraform_eip"

resource "aws_eip_association" "terraform_eip_assoc"
```

---

# Benefits

```text
Static Public IP

Stable Jenkins Configuration

Stable DNS Configuration

Production Friendly Infrastructure
```

---

# Validation

Command:

```bash
terraform output
```

Expected:

```text
ec2_eip_public_ip
```

The Elastic IP remains constant even if the EC2 instance is recreated.

---
# ✅ Phase 11 Outcome

Successfully implemented:

```text
Terraform

Infrastructure As Code

AWS EC2 Provisioning

Security Group Automation

User Data Automation

Remote Terraform State

S3 Backend

DynamoDB State Locking

Elastic IP Management

Infrastructure Recovery Automation
```

Terraform can now recreate the complete infrastructure consistently using code.
---
# 📚 Important Lessons Learned

## Lesson 1

Application Deployment and Infrastructure Provisioning are different.

```text
Deploying Containers
```

is not the same as:

```text
Creating Servers
```

---

## Lesson 2

Hardcoded IP Addresses Create Problems

The following locations required updates after EC2 recreation:

```text
Frontend API URL

Backend CORS Configuration

Jenkins SSH Host
```

---

## Lesson 3

Configuration Should Be Version Controlled

Anything manually maintained on servers eventually becomes difficult to track.

GitHub should be the source of truth whenever possible.

---

## Lesson 4

Cloud Deployments Require Planning

Changing servers affects:

```text
Application URLs

CORS Settings

Deployment Targets

Network Configuration
```

---

# 🛠 Troubleshooting Guide

## Docker Not Found

Error:

```text
Status [127]
```

Cause:

```text
Docker Not Installed
```

Solution:

```bash
sudo dnf install docker -y
```

---

## SSH Connection Failed

Cause:

```text
Incorrect Hostname

Invalid Key

Incorrect Username
```

Verify:

```text
Publish Over SSH Configuration
```

---

## CORS Error

Error:

```text
No 'Access-Control-Allow-Origin' header
```

Verify:

```bash
docker exec -it roulette-backend env | grep FRONTEND_URL
```

Ensure:

```text
FRONTEND_URL
```

matches frontend URL.

---

## Frontend Calling Old Server

Error:

```text
ERR_CONNECTION_TIMED_OUT
```

Cause:

```text
REACT_APP_API_URL
```

still points to old server.

Update:

```groovy
--build-arg REACT_APP_API_URL=http://<NEW-IP>:8888
```

Rebuild and redeploy.

---

# 🏗 Current Architecture

```text
Developer
    ↓
Git Push
    ↓
GitHub
    ↓
Jenkins

    ├── Build Backend
    ├── Build Frontend
    └── Build Nginx

            ↓

      Docker Images

            ↓

       Docker Hub

            ↓

Upload docker-compose.yml

            ↓

      SSH To EC2

            ↓

 docker compose pull

            ↓

 docker compose down

            ↓

 docker compose up -d

            ↓

         AWS EC2

            ↓

     Nginx Reverse Proxy

        ├── /
        │
        ▼
   Frontend Container

        └── /api/*
             │
             ▼
      Backend Container
```


---
# 🌐 Application Endpoints

After successful Nginx deployment:

## Application

```text
http://<EC2-PUBLIC-IP>
```

Example:

```text
http://13.61.4.145
```

---

## API Endpoint

```text
http://<EC2-PUBLIC-IP>/api/cast
```

Example:

```text
http://13.61.4.145/api/cast
```

---

## Request Flow

Frontend Request:

```text
http://SERVER-IP/
```

API Request:

```text
http://SERVER-IP/api/cast
```

Both requests are routed through:

```text
Nginx Reverse Proxy
```

before reaching application containers.

---

## Legacy Endpoints

The following ports were used before Nginx:

```text
http://SERVER-IP:3000

http://SERVER-IP:8888
```

These are no longer required for normal application access.


---
# 📊 Current Project Status

| Phase                       | Status |
| --------------------------- | ------ |
| Source Code Management      | ✅      |
| Dockerization               | ✅      |
| Continuous Integration      | ✅      |
| Docker Build Automation     | ✅      |
| Docker Hub Registry         | ✅      |
| AWS EC2 Deployment          | ✅      |
| Automated Deployment To EC2 | ✅      |
| EC2 Bootstrap Automation    | ✅      |
| Configuration Management    | ✅      |
| Nginx Reverse Proxy         | ✅      |
| GitHub Webhooks             | ✅      |
| Terraform Backend           | ✅      |
| Remote State Management     | ✅      |
| Infrastructure as Code      | ✅      |
| Elastic IP                  | ✅      |

---
# 📖 Key DevOps Learnings

## Learning 1 - Deployment vs Infrastructure

Application deployment and infrastructure provisioning are different concerns.

Deploying Docker containers does not automatically create servers.

```text
Deployment
    ≠
Infrastructure
```

---

## Learning 2 - Hardcoded IP Addresses Create Problems

During EC2 replacement, the following configurations required updates:

```text
React API URL

Backend CORS URL

Jenkins Publish Over SSH Host
```

This demonstrated why production systems use:

```text
Elastic IP

DNS

Domain Names

Load Balancers
```

instead of hardcoded server IP addresses.

---

## Learning 3 - Configuration Should Be Version Controlled

Initially:

```text
docker-compose.yml
```

existed only on EC2.

This created configuration drift.

Moving configuration into GitHub established:

```text
Single Source Of Truth
```

for deployments.

---

## Learning 4 - Automated Deployment Is Not Infrastructure Automation

Current State:

```text
Application Deployment
    ✅ Automated

Server Creation
    ❌ Manual
```

Future phases will automate infrastructure using:

```text
Terraform

Ansible
```

---

## Learning 5 - Recovery Testing Is Important

A brand-new EC2 instance was created and the application was successfully redeployed using:

```text
User Data Script

Jenkins Pipeline

Docker Hub Images
```

This validated that the deployment process is repeatable and reliable.

---

# 🚀 Future Roadmap

## Phase 12 - Configuration Management

Topics:

```text
Ansible

Server Provisioning

Package Installation

Environment Standardization

Application Configuration
```

---

## Phase 13 - Kubernetes

Topics:

```text
Pods

Deployments

ReplicaSets

Services

Ingress

ConfigMaps

Secrets

Persistent Volumes
```

---

## Phase 14 - Kubernetes On AWS

Topics:

```text
Amazon EKS

Worker Nodes

Load Balancers

Ingress Controllers

Cluster Management
```

---

## Phase 15 - GitOps & Observability

Topics:

```text
ArgoCD

Prometheus

Grafana

Centralized Monitoring

Alerting

Production Operations
```


# 🎉 Final Outcome

Successfully implemented:

```text
Git & GitHub

Branching Strategy

Jenkins CI

Docker

Docker Compose

Docker Hub

AWS EC2

Automated Deployment

Configuration Management

EC2 Bootstrap Automation

Nginx Reverse Proxy

Single Public Endpoint

Production-Style Request Routing

Cloud-Based CI/CD Pipeline
```

The project now demonstrates a complete DevOps workflow:

```text
Developer
    ↓
GitHub
    ↓
Jenkins
    ↓
Docker Build
    ↓
Docker Hub
    ↓
AWS EC2
    ↓
Nginx Reverse Proxy
    ↓
Frontend + Backend
```

This architecture closely resembles modern production deployments and provides a strong foundation for upcoming Terraform, Ansible, and Kubernetes phases.

