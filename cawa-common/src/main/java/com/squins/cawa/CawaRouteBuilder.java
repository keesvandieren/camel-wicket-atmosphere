package com.squins.cawa;

import org.apache.camel.builder.RouteBuilder;

public class CawaRouteBuilder extends RouteBuilder {

    public void configure() {
        String vmEndpoint = "vm:sampleVmQueue?multipleConsumers=true";
        from("direct:start").to(vmEndpoint);

        from("vm:sampleVmQueue?multipleConsumers=true").beanRef("sampleConsumer");
    }

}
