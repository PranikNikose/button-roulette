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

# Install Docker Compose Plugin (v2)
mkdir -p /usr/local/lib/docker/cli-plugins

curl -SL \
https://github.com/docker/compose/releases/latest/download/docker-compose-linux-x86_64 \
-o /usr/local/lib/docker/cli-plugins/docker-compose

chmod +x /usr/local/lib/docker/cli-plugins/docker-compose

# Verify
docker --version
docker compose version

echo "Docker and Docker Compose Plugin installed successfully"

