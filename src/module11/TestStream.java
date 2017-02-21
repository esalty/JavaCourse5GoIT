package module11;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by GodMod on 2/3/2017.
 */
public class TestStream {



        public static void main(String[] args) {
            Map<String, String> wordsToReplace = new HashMap<>();
            wordsToReplace.put("initial", "resulting");
            wordsToReplace.put("line", "string");
            try {
                TextFileOperations fileWithSampleText = TextFileOperations.getInstance();
                System.out.println("Initial file contents:\n" + fileWithSampleText.readFileContentsToString());
                System.out.println("\nString with replaced words:");
                System.out.println(fileWithSampleText.replacer(wordsToReplace));
                System.out.print("\nRewriting file with the new string... ");
                fileWithSampleText.fileContentsReplacer(wordsToReplace);
                System.out.println("Done!");
                System.out.print("Appending new string to file... ");
                fileWithSampleText.fileContentsMerge(wordsToReplace);
                System.out.println("Done!");
                System.out.println("\nResulting file contents:\n" + fileWithSampleText.readFileContentsToString());
                System.out.println("\nNumber of occurrences of word \"This\": " + fileWithSampleText.checkWord("This"));
                System.out.println("Number of occurrences of word \"Denys\": " + fileWithSampleText.checkWord("Denys"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
