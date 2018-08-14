/* Josef Chlachula (c) 2018 MIT license */

package example.stream;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.stream.Stream;

/**
 * Let's say there is a comma delimited file with the first line describing column names.
 * In this example a person name and state.
 * Here is how to skip the first line using Java8 stream
 */
public class CSV_SkipFirstLine {
    private static void skipFirstAndPrintRestOfLinesFromStream(Stream<String> stream){
        stream
                .skip(1L)
                .forEach(System.out::println);
    }
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new StringReader(
                "Name,State\n" +
                        "John,MN\n" +
                        "Zita,CA\n" +
                        "Adam,CA\n" +
                        "Dough,CA\n" +
                        "Richard,MN\n" +
                        "Robert,CT"));
        skipFirstAndPrintRestOfLinesFromStream(reader.lines());
    }
}
