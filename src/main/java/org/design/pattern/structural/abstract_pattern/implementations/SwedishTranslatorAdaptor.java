package org.design.pattern.structural.abstract_pattern.implementations;

import org.design.pattern.structural.abstract_pattern.interfaces.TranslatorAdaptor;

/**
 * This is the Adaptor class, which can accept english language and pass it to Swedish translator.
 */
public class SwedishTranslatorAdaptor implements TranslatorAdaptor {

    private final SwedishTranslator translator;

    public SwedishTranslatorAdaptor(SwedishTranslator translator) {
        this.translator = translator;
    }

    @Override
    public String translate(String request) {
        System.out.println("SwedishTranslatorAdaptor:: translate using Translator Adaptor.");
        String swedishTranslation = convertToSwedish(request);
        return this.translator.translate(swedishTranslation);
    }

    private String convertToSwedish(String request) {
        // using some language translator we translate our english request to swedish
        System.out.printf("SwedishTranslatorAdaptor:: converting :: \" %s \" to swedish %n", request);
        return "Hej Hej";
    }
}
