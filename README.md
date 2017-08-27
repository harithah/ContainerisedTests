# ContainerisedTests

Build the image of tests using the command:
docker build -t mvn/tests .

The image is used inside the docker-compose yml file

Run docker-compose up -d to bring up the selenium hub, chrome node, friefox node, phantomejs node and the tests

After execution the test results will be available in the host machine under the /temp folder in your current directory

To run command inside a container
docker exec -it <container_id> /bin/bash


Connect & disconenct a container to and from a network respectively:
docker network connect <networkname> <containername>
docker network disconnect <networkname> <containername