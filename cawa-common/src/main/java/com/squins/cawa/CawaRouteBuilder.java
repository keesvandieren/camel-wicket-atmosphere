package com.squins.cawa;

import org.apache.camel.builder.RouteBuilder;

public class CawaRouteBuilder extends RouteBuilder {

    public void configure() {
        String vmEndpoint = "vm:sampleVmQueue?concurrentConsumers=2&multipleConsumers=true";
        from("direct:start").multicast().to(vmEndpoint);

        from(vmEndpoint).beanRef("sampleConsumer");
    }

}
