package com.squins.cawa;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ServletContextAware;

public class SampleConsumer1 implements ServletContextAware {

    private static final Logger LOG = LoggerFactory.getLogger(SampleConsumer1.class);

    private String name;

    public void consume(String message) {
        LOG.warn("Sample consumer 1 " + name + " just received:" + message);
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        name = servletContext.getContextPath();
        LOG.info("Set name to:{}", name);
    }
}
