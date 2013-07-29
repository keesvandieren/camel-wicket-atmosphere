package com.squins.cawa.war.one;

import javax.inject.Inject;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.squins.cawa.SampleProducer;

public class HomePage extends WebPage {

    @Inject
    SampleProducer producer;

    public HomePage(final PageParameters parameters) {
        super(parameters);


    }

    @Override
    protected void onInitialize() {
        super.onInitialize();

        add(new Label("version", getApplication().getFrameworkSettings().getVersion()));

        producer.produce("Hoi van Wicket one");
    }
}
