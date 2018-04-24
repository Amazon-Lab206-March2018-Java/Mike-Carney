import java.util.ArrayList;
public class Basics {

    public void print1to255(){
        for(int i=1;i<=255;i++){
            System.out.ptintln(i);
        }
    }

    public void printOdds1to255(){
        for(int i=1;i<=255;i+2){
            System.out.println(i);
        }
    }

    public void printSum1to255(){
        int sum = 0
        for(int i=1;i<=255;i++){
            sum+=i;
            System.out.println(i + sum);
        }    
    }

    public void iterateArr(int[] arr){
        for(i=0;i<arr.length;i++){
            System.out.println(i);
        }
    }
    
    public void findMax(int[] arr){
        int max = arr[0];
        for(i=0;i<arr.length;i++){
            if(arr[i]<max){
                max=arr[i];
                System.out.println(max);
            }
        }

    public void average(int[] arr){
        int sum = 0;
        for(i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        sum=sum/arr.length;
        System.out.println(sum);
    }     

    public void arrOdd(int[] arr){
        int odd = [];
        for(int i=1;i<arr.length;i+2){
            odd.add(i);
            System.out.println(odd);
        }
    }

    public void greaterThanY(int[] arr, int x){
        int y = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > x){
                y++;
            }
        }
        System.out.println(y);
    }
    
    public void square(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]*=arr[i];
        }
        System.out.println(arr[i]);
    }

    public void zeroNeg(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i] < 0){
                arr[i]=0;
            }
        }
        System.out.println(arr[i]);
    }

    public void maxMinAvg(int[] arr){
        int Max = 0;
        int Min = 0;
        int Avg = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[0]<min){
                min=arr[i];
            }
            avg+=arr[i];
            avg = avg/arr.length;
        }
        System.out.println(max, min, avg);
    }

    public void shiftArr(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
            arr[arr.length-1] = 0;
            System.out.println(arr[i]);
        }
    }


}

public class HelloWorld {
    public String greet(String name){
        return "Hello " + name;
    }
    public String greet(){
        return "Hello World";
    }
}

public class HelloWorldTest {
    public static void main(String[] args){
        HelloWorld hW = new HelloWorld();
        String greeting = hW.greet();
        String greetingWithName = hW.greet("Eduardo");
        if (greeting.equals("Hello World") || greetingWithName.equals("Hello Eduardo")){
            System.out.println("Test successful");
        } else{
            System.out.println("Test Fail");
        }
    }
}
