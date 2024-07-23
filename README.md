
2048 Game Docker Setup
This repository contains a Docker setup for running the 2048 game in an Nginx server on an Ubuntu 22.04 base image.

Dockerfile Overview
The Dockerfile sets up an Ubuntu 22.04 container with the following steps:

Base Image: Uses ubuntu:22.04 as the base image.
Install Dependencies:
Updates the package list.
Installs nginx, zip, and curl.
Configure Nginx:
Sets daemon off; in the Nginx configuration to run Nginx in the foreground.
Download and Setup 2048 Game:
Downloads the latest version of the 2048 game from GitHub.
Extracts and sets up the game files in the Nginx web root directory.
Expose Port: Exposes port 80 for HTTP traffic.
Start Nginx: Configures the container to start Nginx using the specified configuration file.
Build the Docker Image
To build the Docker image, run the following command in the directory containing the Dockerfile:

bash
Copy code
docker build -t 2048-game .
Run the Docker Container
After building the image, you can run a container from it with the following command:

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
