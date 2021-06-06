package ds;

public abstract class FileReader {
    public abstract void fileRead(String name);

    public void readFile(String name){
        System.out.println("Processing before reading a file");
        fileRead(name);
        System.out.println("Processing after reading a file");
    }
}
