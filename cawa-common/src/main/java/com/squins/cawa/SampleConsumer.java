package com.squins.cawa;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ServletContextAware;

/**
 * Created with IntelliJ IDEA.
 * User: kees
 * Date: 7/29/13
 * Time: 10:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class SampleConsumer implements ServletContextAware {

    private static final Logger LOG = LoggerFactory.getLogger(SampleConsumer.class);

    private String name;

    public void consume(String message) {
        LOG.warn(name + " just received:" + message);
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        name = servletContext.getContextPath();
        LOG.info("Set name to:{}", name);
    }
}
