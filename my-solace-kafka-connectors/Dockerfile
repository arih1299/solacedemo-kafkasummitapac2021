FROM adoptopenjdk/openjdk8:x86_64-ubuntu-jre8u292-b10

ADD https://solaceproducts.github.io/pubsubplus-connector-kafka-sink/downloads/pubsubplus-connector-kafka-sink-2.0.2.tar ./sink.tar
ADD https://solaceproducts.github.io/pubsubplus-connector-kafka-source/downloads/pubsubplus-connector-kafka-source-2.0.2.tar ./source.tar
ADD https://downloads.apache.org/kafka/2.8.0/kafka_2.13-2.8.0.tgz .
RUN tar xzf *.tgz \
    && ln -s kafka_2.13-2.8.0 kafka \
    && mkdir kafka/connectors \
    && tar xf source.tar -C kafka/connectors \
    && tar xf sink.tar -C kafka/connectors 
COPY connect-distributed.properties /kafka/config/connect-distributed.properties
CMD [ "/kafka/bin/connect-distributed.sh", "/kafka/config/connect-distributed.properties" ]