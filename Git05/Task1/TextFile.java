package Git05.Task1;

public class TextFile extends File{
    final String textType=".txt";

    public TextFile(String directoryName, String fileName) {
        super(directoryName, fileName);
    }

    @Override
    public String getFileName() {
        return super.getFileName()+textType;
    }

    public void addTextToFile(String str){
        this.fileConsist.append(str);
    }

    public void showFileConsist(){
        System.out.println("Содержимое файла:");
        if(this.fileConsist.toString().length() == 0)
            System.out.println("\tФайл пустой");
        System.out.println(this.fileConsist);
    }

    public void deleteFileConsist(){
        this.fileConsist=new StringBuilder();
    }
}
