package angrybird.util.string;

/*! Here's a block of text to use as input to
    the regular expression matcher. Note that we'll
    first extract the block of text by looking for
    the special delimiters, then process the
    extracted block. !*/

import angrybird.util.file.TextFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheReplacements {
    public void theReplacements() {
        String s = TextFile.read("TheReplacements.java");
        Matcher matcher = Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL).matcher(s);
        if (matcher.find()) {
            s = matcher.group(1);
        }
        s = s.replaceAll(" {2,}", " ");
        s = s.replaceAll("(?m)^ +", " ");
        System.out.println(s);
    }

}
