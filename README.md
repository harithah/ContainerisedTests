# ContainerisedTests

Build the image of tests using the command:
docker build -t mvn/tests .

The image is used inside the docker-compose yml file

Run docker-compose up -d to bring up the selenium hub, chrome node, friefox node, phantomejs node and the tests
