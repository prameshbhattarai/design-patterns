package org.design.pattern.structural.abstract_pattern;

import org.design.pattern.structural.abstract_pattern.implementations.SwedishTranslator;
import org.design.pattern.structural.abstract_pattern.implementations.SwedishTranslatorAdaptor;

/**
 * Adapter is a structural design pattern, which allows incompatible objects to collaborate.
 */
public class Client {

    public static void main(String... args) {
        var adaptor = new SwedishTranslatorAdaptor(new SwedishTranslator());

        String responseFromTranslator = adaptor.translate("This request is in english... ");
        System.out.printf("Client :: Response from adaptor \"%s\" %n", responseFromTranslator);
    }
}
