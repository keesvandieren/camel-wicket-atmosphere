package com.squins.cawa;

import org.apache.camel.EndpointInject;
import org.apache.camel.ProducerTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleProducer {

    private static final Logger LOG = LoggerFactory.getLogger(SampleProducer.class);

    @EndpointInject(uri="direct:start")
    private ProducerTemplate producer;

    public void produce(String message) {
        LOG.info("Producing: {}", message);
        producer.sendBody("direct:start", message);
    }

    public void setProducer(ProducerTemplate producer) {
        this.producer = producer;
    }
}
