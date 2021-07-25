# solacedemo-kafkasummitapac2021

**Setting Up**

1. Register with Solace Cloud at https://console.solace.cloud/
2. Build the Solace Kafka Connectors container
```
$ cd my-solace-kafka-connectors
$ docker build --tag solkcon:1.0 .
```
3. Get Solace Discovery Agent image
```
echo 'cMopz4m+GV60hBb8DysZna8uMP4tM84P' | docker login --username discovery-preview --password cMopz4m+GV60hBb8DysZna8uMP4tM84P solaceclouddev.azurecr.io
docker pull solaceclouddev.azurecr.io/maas-event-discovery-agent:latest
```
4. Run the demo containers
```
$ docker compose up
```