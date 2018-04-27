public class Dragon extends Mammal{ 
    public Dragon(){
        this.setEnergy(300);
    }
    public void fly(){
        this.setEnergy(-50);
        System.out.println("Whoosh");
    }
    public void eatHumans(){
        this.setEnergy(+25);
        System.out.println("nom nom nom");
    }
    public void attackTown(){
        this.setEnergy(-100);
        System.out.println("REEEEEEEEEEEEEEEEEE!!!");
    }
}