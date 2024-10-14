public class FileReader {
    public static void main(String[] args) {
        TextFileReader txtReader = new TextFileReader();

        String filePath = "exemple.txt";

        System.out.println("Lecture du fichier à l'endroit :");
        txtReader.readFile(filePath);

        System.out.println("\nLecture du fichier à l'envers :");
        txtReader.readFileReverse(filePath);

        System.out.println("\nLecture du fichier en mode palindromique :");
        txtReader.readFilePalindrome(filePath);

        String filePath2 = "exemple2.txt";
        boolean areFilesEqual = txtReader.compareFiles(filePath, filePath2);
        System.out.println("\nLes fichiers sont-ils identiques ? " + areFilesEqual);
    }
}