package Git05.Task1;

public class Solution {

    public static void main(String[] args) {
        TextFile file = new TextFile("C://", "test");
        file.createFile();
        file.renameFile("Test");
        file.addTextToFile("Hello!");
        file.addTextToFile("It's me!");
        file.showFileConsist();
        file.deleteFileConsist();
        file.showFileConsist();
    }
}
