package angrybird.util.processor.impl;

import angrybird.util.processor.Processor;
import java.util.Arrays;

public class Splitter extends Processor {
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
