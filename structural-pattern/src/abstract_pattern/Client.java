package abstract_pattern;


import abstract_pattern.implementations.SwedishTranslator;
import abstract_pattern.implementations.SwedishTranslatorAdaptor;
import abstract_pattern.interfaces.TranslatorAdaptor;

/**
 * Adapter is a structural design pattern, which allows incompatible objects to collaborate.
 */
public class Client {

    public static void main(String... args) {
        SwedishTranslator translator = new SwedishTranslator();
        TranslatorAdaptor adaptor = new SwedishTranslatorAdaptor(translator);
        
        String responseFromTranslator = adaptor.translate("This request is in english... ");
        System.out.printf("Client :: Response from adaptor \"%s\" %n", responseFromTranslator);
    }
}
