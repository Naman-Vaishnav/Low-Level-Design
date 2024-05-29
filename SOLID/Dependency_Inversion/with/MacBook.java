package Dependency_Inversion.with;

import Dependency_Inversion.with.Devices.MouseInterface;
import Dependency_Inversion.without.Devices.WiredMouse;

public class MacBook {
   //class should depend to interface Rather than concreate class
   private  MouseInterface mouse;
   
   MacBook(MouseInterface mouse){
    this.mouse=mouse;
   }

}
