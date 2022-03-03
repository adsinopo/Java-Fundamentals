package labs_examples.objects_classes_methods.labs.objects;

class JetEngine{
    private double horsePower;

    public JetEngine(double horsePower){

        this.horsePower = horsePower;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "JetEngine{" +
                "horsePower=" + horsePower +
                '}';
    }
}

class Name{
    private String airline;

    public Name(String airline){

        this.airline = airline;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    @Override
    public String toString() {
        return "Name{" +
                "airline='" + airline + '\'' +
                '}';
    }
}

class Crew{
    private int pilots;

    public Crew(int pilots){

        this.pilots = pilots;
    }

    public int getPilots() {
        return pilots;
    }

    public void setPilots(int pilots) {
        this.pilots = pilots;
    }

    @Override
    public String toString() {
        return "Crew{" +
                "pilots=" + pilots +
                '}';
    }
}

class Cargo{
    private int numOfBags;

    public Cargo(int numOfBags){

        this.numOfBags = numOfBags;
    }

    public int getNumOfBags() {
        return numOfBags;
    }

    public void setNumOfBags(int numOfBags) {
        this.numOfBags = numOfBags;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "numOfBags=" + numOfBags +
                '}';
    }
}

public class Airplane {

    Name name;

    JetEngine jetEngine;

    Crew crew;

    Cargo cargo;

    double fuelCapacity;

    double currentFuelLevel;

    public Airplane(){}

    public Airplane(Name name, JetEngine jetEngine, Crew crew, Cargo cargo){
        this.name = name;
        this.jetEngine = jetEngine;
        this.crew = crew;
        this.cargo = cargo;
    }

    public Airplane(Name name, JetEngine jetEngine, Crew crew, Cargo cargo, double fuelCapacity, double currentFuelLevel){

        this.name = name;
        this.jetEngine = jetEngine;
        this.crew = crew;
        this.cargo = cargo;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;

    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public JetEngine getJetEngine() {
        return jetEngine;
    }

    public void setJetEngine(JetEngine jetEngine) {
        this.jetEngine = jetEngine;
    }

    public Crew getCrew() {
        return crew;
    }

    public void setCrew(Crew crew) {
        this.crew = crew;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "name=" + name +
                ", jetEngine=" + jetEngine +
                ", crew=" + crew +
                ", cargo=" + cargo +
                ", fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                '}';
    }
}

