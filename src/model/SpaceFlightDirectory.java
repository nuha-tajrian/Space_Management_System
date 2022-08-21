
package model;

import controller.SpaceFlight;
import model.Seats;
import controller.SpaceLinerDirectory;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;


public class SpaceFlightDirectory {
    private List<SpaceFlight> spaceFlightDir;
    private SpaceFlight spaceFlights;
    private SpaceLinerDirectory spaceDir;
    public SpaceFlightDirectory(){
        spaceFlightDir = new ArrayList<SpaceFlight>();
        mockSpaceFlightSchedules();
    }
    public void mockSpaceFlightSchedules(){
        String[][] arr = {  {"NASA","na01","Earth","Mars","01:30","4:30","100.0","Morning","3"},
                            {"NASA","na02","Earth","Mars","01:30","4:30","100.0","Afternoon","3"},
                            {"SpaceX","xa01","Earth","Jupiter","01:30","4:30","100.0","Morning","4"},
                            {"SpaceX","xa02","Earth","Jupiter","01:30","4:30","100.0","Afternoon","4"},
                            {"Boeing","ba01","Earth","Mars","01:30","4:30","100.0","Morning","4"},
                            {"Boeing","ba02","Earth","Mars","01:30","4:30","100.0","Afternoon","4"},
                            {"Virgin Galactic","va01","Earth","Saturn","01:30","4:30","100.0","Morning","4"},
                            {"Virgin Galactic","va02","Earth","Saturn","01:30","4:30","100.0","Evening","4"},
                            {"Sierra Nevada Corporation","sa01","Earth","Jupiter","01:30","4:30","100.0","Night","4"},
                            {"Sierra Nevada Corporation","sa02","Earth","Jupiter","01:30","4:30","100.0","Night","4"},
                            {"Airbus Defence & Space","aa01","Earth","Mars","01:30","4:30","100.0","Morning","4"},
                            {"Airbus Defence & Space","aa02","Earth","Mars","01:30","4:30","100.0","Morning","4"}
                         };

        for(int i=0;i<arr.length;i++) {
            SpaceFlight temp = new SpaceFlight();

            temp.setOwner(arr[i][0]);
            temp.setSpaceFlightNumber(arr[i][1]);
            temp.setSource(arr[i][2]);
            temp.setDestination(arr[i][3]);
            temp.setDepTime(arr[i][4]);
            temp.setArrTime(arr[i][5]);
            temp.setPrice(Double.parseDouble(arr[i][6]));
            temp.setOtod(arr[i][7]);
            temp.setDuration((int)Double.parseDouble(arr[i][8]));
            
            Seats seats = new Seats();
            temp.setSeats(seats);
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String dateInString = "16-10-2019";

            try {

                Date date = formatter.parse(dateInString);
                temp.setDate(date);
            } catch (ParseException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Please enter date in dd-MM-yyyy format");
                return;
            }
            spaceFlightDir.add(temp);
        }

    }


    public List<SpaceFlight> getSpaceFlightDir() {
        return spaceFlightDir;
    }

    public void setSpaceFlightDir(List<SpaceFlight> spaceFlightDir) {
        this.spaceFlightDir = spaceFlightDir;
    }

    public void addSpaceFlight(SpaceFlight newSpaceFlight){
        spaceFlightDir.add(newSpaceFlight);
    }


    public SpaceFlight getSpaceFlights() {
        return spaceFlights;
    }

    public void setSpaceFlights(SpaceFlight spaceFlights) {
        this.spaceFlights = spaceFlights;
    }

    public SpaceLinerDirectory getSpaceDir() {
        return spaceDir;
    }

    public void setSpaceDir(SpaceLinerDirectory spaceDir) {
        this.spaceDir = spaceDir;
    }

    public ArrayList<SpaceFlight> searchMaster(String destination, String source, String otod, String date) {
        ArrayList<SpaceFlight> spaceFlightDirFiltered = new ArrayList<>();
        for (SpaceFlight f:spaceFlightDir)
        {
            String strDate = "";
            try {
                DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                strDate = dateFormat.format(f.getDate());
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (f.getDestination().equals(destination) && f.getSource().equals(source) && f.getOtod().equals(otod) && strDate.equals(date))
            {
                spaceFlightDirFiltered.add(f);
            }
        }

        return spaceFlightDirFiltered;
    }
}
