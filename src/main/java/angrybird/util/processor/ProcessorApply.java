package angrybird.util.processor;

public class ProcessorApply {
    public void apply(Processor p, Object s) {
        System.out.println("Using processor " + p.name());
        System.out.println(p.process(s));
    }
}
