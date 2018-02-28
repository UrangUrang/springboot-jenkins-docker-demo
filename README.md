# Java web application deployment & Continous Integration

### 1. Deployment by hands


### 2. Using Jenkins


### 3. Add Docker

#### install docker-compose
sudo apt install docker.io
sudo apt-get install \
    apt-transport-https \
    ca-certificates \
    curl \
    software-properties-common
sudo curl -L https://github.com/docker/compose/releases/download/1.19.0/docker-compose-`uname -s`-`uname -m` -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose
sudo docker-compose up -d --build
https://askubuntu.com/questions/477551/how-can-i-use-docker-without-sudo

#### clone repository
git clone https://github.com/UrangUrang/springboot-jenkins-docker-demo.git
cd springboot-jenkins-docker-demo
mkdir jenkins_home
chmod 777 jenkins_home

sudo groupadd docker
sudo gpasswd -a $USER docker
newgrp docker



