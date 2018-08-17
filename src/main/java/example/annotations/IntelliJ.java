package example.annotations;

import org.intellij.lang.annotations.Language;
import org.intellij.lang.annotations.Pattern;

/**
 * @org.intellij.lang.annotations.Language is responsible for the Language injection feature
 * @org.intellij.lang.annotations.Pattern is used to validate Strings against a certain regular expression pattern
 * @org.intellij.lang.annotations.Subst is used to substitute non-compile time constant expressions with a fixed value.
 * This allows to validate patterns and build the prefix/suffix of an injected language
 * even for non-constant expressions that are known to contain certain kinds of values during runtime.
 */
public class IntelliJ {

    @Language("GenericSQL")
    final String query = "SELECT * FROM atable";

    @Language("HTML")
    final String div = "<div><p>Paragraph<br/>next line</p></div>";

    @Language("CSS")
    final String css = ".c1{color:red}";

    @Language("RegExp")
    final String re = "\\d (.*)";

    @Pattern("ABC|KLM|XYZ")
    String a;

}
