package Git05.Task1;

public class File  extends  Directory{
    String fileName;
    StringBuilder fileConsist;
    protected boolean isCreate = false;
    public File(String directoryName, String fileName) {
        super(directoryName);
        this.fileName = fileName;
        fileConsist = new StringBuilder();
    }


    public void createFile(){
        if(isCreate) {
            System.out.println("Файл с таким именем уже существует");
            return;
        }
        isCreate = true;
        System.out.println("Файл был создан");
    }

    public void renameFile(String name){
        if(!isCreate){
            System.out.println("Файл не был создан");
        }
        System.out.print("Файл успешно переименован из " + this.getFileName());
        this.fileName = name;
        System.out.println(" в " + this.getFileName());
    }

    protected String getFileName(){

        return directoryName + fileName;
    }

}
