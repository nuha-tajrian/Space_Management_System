
package controller;

import controller.SpaceLiner;
import java.util.ArrayList;
import java.util.HashMap;


public class SpaceLinerDirectory {
    
    private ArrayList<SpaceLiner> spaceLinerDir;

    public SpaceLinerDirectory() {
        spaceLinerDir = new ArrayList();
        mockSpaceLiners();
    }

    public ArrayList<SpaceLiner> getSpaceLinerDir() {
        return spaceLinerDir;
    }

    public void setSpaceLinerDir(ArrayList<SpaceLiner> spaceLinerDir) {
        this.spaceLinerDir = spaceLinerDir;
    }
    
    public void addSpaceLiner(SpaceLiner a){
        spaceLinerDir.add(a);
    }
    
    public void removeSpaceLiner(SpaceLiner a){
        spaceLinerDir.remove(a);
    }
    
    public void mockSpaceLiners(){
        String[][] arr = {  {"NASA","NA","1000000","500","Mars"},
                            {"SpaceX","XA","1000000","600","Jupiter"},
                            {"Boeing","BA","1000000","300","Mars"},
                            {"Virgin Galactic","VA","1000000","400","Saturn"},
                            {"Sierra Nevada Corporation","SA","1000000","700","Jupiter"},
                            {"Airbus Defence & Space","AA","1000000","200","Mars"}
                         };
        
        for(int i=0;i<arr.length;i++) {
            SpaceLiner temp = new SpaceLiner();
            
            temp.setName(arr[i][0]);
            temp.setSpaceLineCode(arr[i][1]);
            temp.setNumOfSpaceFlights((int)Double.parseDouble(arr[i][2]));
            temp.setPlanetsOperated((int)Double.parseDouble(arr[i][3]));
            temp.setOriginSpace(arr[i][4]);
            
            spaceLinerDir.add(temp);
        }
        
    }
    
}
