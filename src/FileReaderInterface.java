public interface FileReaderInterface {
    void readFile(String filePath);
    boolean compareFiles(String filePath1, String filePath2);
}