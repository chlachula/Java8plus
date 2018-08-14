/* Josef Chlachula (c) 2018 MIT license */

package example.stream;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Let's say there is a comma delimited file with the first line describing column names:
 * Name, State, Years of experience
 * Here is how to sort lines from the most experienced people, then by state and name
 */

public class CSV_SortByThreeColumns {
    private static void printSortedByExperienceAndStateAndNameFromStreamedLines(Stream<String> stream){
        Comparator<String> byExperience = Comparator.comparing(
                line -> Integer.parseInt(line.split(",")[2]), Comparator.reverseOrder()
        );// by Years of experience - reversed
        Comparator<String> byExperienceAndState = byExperience.thenComparing(
                line -> line.split(",")[1]
        );// by State
        Comparator<String> comparator = byExperienceAndState.thenComparing(
                line -> line.split(",")[0]
        );// by Name
        stream
                .skip(1)
                .filter(line -> line.split(",").length > 2 )
                .sorted(comparator)
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        //BufferedReader reader = Files.newBufferedReader(Paths.get("a.csv"));
        BufferedReader reader = new BufferedReader(new StringReader(
                "Name,State,Years of experience\n" +
                        "John,MN,1\n" +
                        "Zita,CA,2\n" +
                        "Adam,CA,5\n" +
                        "Dough,CA,20\n" +
                        "Richard,MN,6\n" +
                        "Roman,MN6\n" +
                        "Robert,CT,6"));
        printSortedByExperienceAndStateAndNameFromStreamedLines(reader.lines());
    }
}
