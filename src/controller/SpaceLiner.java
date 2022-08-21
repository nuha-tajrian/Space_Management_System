
package controller;

public class SpaceLiner {
    
    private String name;
    private String spaceLineCode;
    private int numOfSpaceFlights;
    private int planetsOperated;
    private String originSpace;

    public int getPlanetsOperated() {
        return planetsOperated;
    }

    public void setPlanetsOperated(int planetsOperated) {
        this.planetsOperated = planetsOperated;
    }

    public String getOriginSpace() {
        return originSpace;
    }

    public void setOriginSpace(String originSpace) {
        this.originSpace = originSpace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpaceLineCode() {
        return spaceLineCode;
    }

    public void setSpaceLineCode(String spaceLineCode) {
        this.spaceLineCode = spaceLineCode;
    }

    public int getNumOfSpaceFlights() {
        return numOfSpaceFlights;
    }

    public void setNumOfSpaceFlights(int numOfSpaceFlights) {
        this.numOfSpaceFlights = numOfSpaceFlights;
    }
    
    @Override
    public String toString(){
        return this.getName();
    }
}
