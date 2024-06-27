package Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    String directoryName;
    List<FileSystem> children;

    public Directory(String directoryName){
        this.directoryName=directoryName;
        children=new ArrayList<>();
    }
    
    public void add(FileSystem child){
        children.add(child);
    }

    

    @Override
    public String ls() {
        String output=directoryName+"\n";
        for(FileSystem child:children){
            output+=" "+child.ls()+"\n";
        }
        return output;
    }

}
