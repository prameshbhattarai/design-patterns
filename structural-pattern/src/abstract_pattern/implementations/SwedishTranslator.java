package abstract_pattern.implementations;

import abstract_pattern.interfaces.Translator;

public class SwedishTranslator implements Translator {

    @Override
    public String translate(String request) {
        System.out.println("SwedishTranslator:: I only translate swedish text");
        System.out.printf("SwedishTranslator:: translating :: %s %n", request);
        return "hejdå hejdå";
    }
}
