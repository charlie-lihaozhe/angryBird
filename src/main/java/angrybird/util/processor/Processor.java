/**
 * 解耦
 */
package angrybird.util.processor;

public class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    public Object process(Object input) {
        return input;
    }
}
