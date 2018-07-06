public class Mammal {
    int energyLevel;

    public Mammal(){
        energyLevel = 100;
    }
    public int getEnergyLevel(){
        return energyLevel;
    }
    public void setEnergyLevel(){
        this.energyLevel = energyLevel;
    }
    public int displayEnergy(){
        System.out.println("Energy level: " + energyLevel);
        return energyLevel;
    }
}