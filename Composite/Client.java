package Composite;

public class Client {
    public static void main(String[] args) {
        FileSystem file1=new File("File1");
        FileSystem file2=new File("File2");
        FileSystem file3=new File("File3");
        Directory direcory1=new Directory("Direcory1");
        Directory direcory2=new Directory("Direcory2");
        Directory direcory3=new Directory("Direcory3");
        
        direcory1.add(file1);
        direcory1.add(direcory2);

        direcory2.add(file2);
        direcory2.add(direcory3);
        
        direcory3.add(file3);


        System.out.println(direcory1.ls());
       
        
    }
}
