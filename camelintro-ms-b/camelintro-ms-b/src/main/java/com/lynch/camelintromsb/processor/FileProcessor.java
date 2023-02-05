package com.lynch.camelintromsb.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class FileProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println("####################### PROCESSING ###################################");
        String originalFileContent = exchange.getIn().getBody(String.class);
        String upperCaseFileContent = originalFileContent.toLowerCase();
        exchange.getIn().setBody(upperCaseFileContent);
    }
}
