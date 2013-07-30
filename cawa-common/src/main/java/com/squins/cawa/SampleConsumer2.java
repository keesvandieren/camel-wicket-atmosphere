package com.squins.cawa;

import javax.servlet.ServletContext;

import org.apache.camel.Consume;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ServletContextAware;

public class SampleConsumer2 implements ServletContextAware {

    private static final Logger LOG = LoggerFactory.getLogger(SampleConsumer2.class);

    private String name;

    @Consume(uri = "vm:sampleVmQueue?concurrentConsumers=4&multipleConsumers=true")
    public void consume(String message) {
        LOG.warn("Sample consumer 2 " + name + " just received:" + message);
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        name = servletContext.getContextPath();
        LOG.info("Set name to:{}", name);
    }
}
