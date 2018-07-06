public class Bat extends Mammal {
    
    public Bat(){
        energyLevel = 300;
    }
    public void fly(){
        this.energyLevel -= 50;
        System.out.println("The bat flew up in the sky and lost -50 energy");
    }
    public void eatHumans(){
        this.energyLevel += 50;
        System.out.println("The bat ate a human and gain +25 energy");
    }
    public void attackTown(){
        this.energyLevel -= 100;
        System.out.println("The bat is burning the town down!! and lost -100 energy");
    }
}