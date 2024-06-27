package Composite;

//leaf
public class File implements FileSystem{

    String fileName;

    public File(String fileName){
        this.fileName=fileName;
    }

    
    @Override
    public String ls() {    
        String output=fileName;
        return output;
    }

    
    
}
