package angrybird.util.processor.impl;

import angrybird.util.processor.Processor;

public class Downcase extends Processor {
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}
