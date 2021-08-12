# solacedemo-kafkasummitapac2021

**Setting Up on Local Environment**

1. Register with Solace Cloud at https://console.solace.cloud/
2. Run a local Kafka server. Please refer to https://kafka.apache.org/quickstart and follow step 1 & 2.
3. Run the Kafka connector framework with Solace Kafka Connectors. Please refer to the links below:
https://github.com/SolaceProducts/pubsubplus-connector-kafka-sink
https://github.com/SolaceProducts/pubsubplus-connector-kafka-source


**Setting Up With Docker**

1. Register with Solace Cloud at https://console.solace.cloud/
2. Build the Solace Kafka Connectors container
```
$ cd my-solace-kafka-connectors
$ docker build --tag solkcon:1.0 .
```
3. Run the demo containers
```
$ docker compose up
```


**Start the Solace Event Discovery Agent**
1. Go to https://console.solace.cloud/event-discovery and follow the instructions on the link "How do I run a Discovery Scan".
If you're using the Docker setup, run the command below to pull the required container images:
```
echo 'cMopz4m+GV60hBb8DysZna8uMP4tM84P' | docker login --username discovery-preview --password cMopz4m+GV60hBb8DysZna8uMP4tM84P solaceclouddev.azurecr.io
docker pull solaceclouddev.azurecr.io/maas-event-discovery-agent:latest
```


**Start the Demo!**
1. Run the sample applications
```
[new terminal/shell]
$ cd DataProcessingApp
$ mvn spring-boot:run
[new terminal/shell]
$ cd PatientMobileApp
$ mvn spring-boot:run
[new terminal/shell]
$ cd DoctorMobileApp
$ mvn spring-boot:run
```
2. Go to https://console.solace.cloud