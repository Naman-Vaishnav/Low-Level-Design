package Dependency_Inversion.without;

import Dependency_Inversion.without.Devices.WiredMouse;

public class MacBook {
   private  WiredMouse mouse;

   MacBook(){
    mouse=new WiredMouse();
   }

}
