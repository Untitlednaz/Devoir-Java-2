import java.io.IOException;

public class TextFileReader extends AbstractFileReader {

    @Override
    public void readFile(String filePath) {
        try {
            String content = readFileContent(filePath);
            System.out.println("Contenu du fichier :\n" + content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Lecture du fichier à l'envers (ligne par ligne)
    public void readFileReverse(String filePath) {
        try {
            String content = readFileContent(filePath);
            String[] lines = content.split("\n");
            for (int i = lines.length - 1; i >= 0; i--) {
                System.out.println(lines[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void readFilePalindrome(String filePath) {
        try {
            String content = readFileContent(filePath);
            String[] lines = content.split("\n");

            System.out.println("Contenu palindromique du fichier :");
            for (String line : lines) {
                String reversedLine = new StringBuilder(line).reverse().toString();
                System.out.println(reversedLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}