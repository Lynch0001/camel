package com.lynch.camelintromsa.processor;

import org.springframework.stereotype.Service;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

@Service
public class FileProcessor implements Processor{

    @Override
    public void process(Exchange exchange) throws Exception {

        String originalFileContent = exchange.getIn().getBody(String.class);
        String upperCaseFileContent = originalFileContent.toUpperCase();
        exchange.getIn().setBody(upperCaseFileContent);
    }
}
