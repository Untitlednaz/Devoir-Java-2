import java.io.FileInputStream;
import java.io.IOException;

public abstract class AbstractFileReader implements FileReaderInterface {

    protected String readFileContent(String filePath) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        StringBuilder content = new StringBuilder();
        int ch;

        while ((ch = fis.read()) != -1) {
            content.append((char) ch);
        }
        fis.close();
        return content.toString();
    }

    @Override
    public boolean compareFiles(String filePath1, String filePath2) {
        try {
            String file1Content = readFileContent(filePath1);
            String file2Content = readFileContent(filePath2);
            return file1Content.equals(file2Content);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
