public class Gorilla extends Mammal{
    public Gorilla(){
        this.displayEnergy();
    }
    public void throwSomething(){
        this.setEnergy(-5);
        System.out.println("What did he just throw at you?!");
    }
    public void eatBananas(){
        this.setEnergy(+10);
        System.out.println("He doesn't even like bananas!");
    }
    public void climb(){
        this.setEnergy(-10);
        System.out.println("Climbing buidings is hard!");
    }

}