# 2048 Game Docker Setup

This repository provides a Docker setup to run the [2048 game](https://github.com/gabrielecirulli/2048) using Nginx on an Ubuntu 22.04 base image.

## Dockerfile Overview

The `Dockerfile` includes the following steps:

1. **Base Image**
   - `ubuntu:22.04`

2. **Install Dependencies**
   ```dockerfile
   RUN apt-get update
   RUN apt-get install -y nginx zip curl
Configure Nginx

Ensures Nginx runs in the foreground:
dockerfile
Copy code
RUN echo "daemon off;" >> /etc/nginx/nginx.conf
Download and Setup 2048 Game

Fetches the game from GitHub and sets it up in the Nginx web root:
dockerfile
Copy code
RUN curl -o /var/www/html/master.zip -L https://github.com/gabrielecirulli/2048/archive/refs/heads/master.zip
RUN cd /var/www/html/ && unzip master.zip && mv 2048-master/* . && rm -rf 2048-master master.zip
Expose Port

Exposes port 80 for HTTP traffic:
dockerfile
Copy code
EXPOSE 80
Start Nginx

Configures the container to start Nginx:
dockerfile
Copy code
CMD ["/usr/sbin/nginx", "-c", "/etc/nginx/nginx.conf"]
Build the Docker Image
To build the Docker image, run the following command in the directory containing the Dockerfile:

bash
Copy code
docker build -t 2048-game .
Run the Docker Container
Once the image is built, you can run a container with:

bash
Copy code
docker run -d -p 80:80 --name 2048-game 2048-game
This command will:

Run the container in detached mode (-d).
Map port 80 on your host to port 80 in the container (-p 80:80).
Name the container 2048-game.
Access the Game
Open a web browser and navigate to http://localhost to play the 2048 game.

License
This project is licensed under the MIT License - see the LICENSE file for details.
