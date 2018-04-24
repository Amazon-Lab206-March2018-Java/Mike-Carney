import java.util.*;

public class PuzzleJava{

    public void ArrayList<Integer> sum(int[] arr){
        int sum = 0;
        if(int i=0;i<arr.length;i++){
            sum+=arr[i];
            System.out.println(sum);            
            }
        ArrayList<Integer> greater = new ArrayList<Integer>();
        if(arr[i]>10){
            greater.add(arr[i]);
            }
            return greater;
        }

    }

    public void ArrayList<String> names(String[] arr){
       ArrayList<String> a = new ArrayList<String>();
       Collections.shuffle(a);
       System.out.println(a);
       for(int i=0;i<arr.length;i++){
           a.add(arr[i]);
           if(a[i].length >5){
               System.out.println(a[i]);

           }
       }
    }

    public void ArrayList<String> letters(String[] arr){
        ArrayList<String> a = new ArrayList<String>();
        Collections.shuffle(a);
        System.out.println(arr[arr.length-1]);
        for(int i=0;i<arr.length;i++){
            if(arr[0] == "a" || arr[0] == "e" || arr[0] == "i"|| arr[0] == "o" || arr[0] == "u"){
                System.out.println("The first letter is a vowel")
            }
        }        
    }  

    public void ArrayList<Integer> random55To100(){
        Random arr = new Random();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            int num = arr.nextInt(55) + 45;
            a.add(num);
        }
        System.out.println(a);
    }

    public void ArrayList<Integer> sortRandom55To100 (){
        Random arr = new Random();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            int num = arr.nextInt(55) + 45;
            a.add(num);
            System.out.println(a);
        }
        Arrays.sort(a);
        int min = a[0];
        int max = a[a.length-1];
        System.out.println(min);
        System.out.println(max);
    }

    public void String randomString(String [] arr) {
        String new = "";
        Random str = new Random();
        for(int i=0;i<5;i++){
            int a = str.nextInt(26);
            new+=arr[a];
        }
        System.out.println(a);
    }

    public void randomWordString (String [] arr){
        ArrayList<String> a = new ArrayList<String>();
        RandomStringGenerator generator = new RandomStringGenerator.Builder().withinRange('a', 'z').build();
        String randomLetters = generator.generate(5);
        for (int i=0;i<10;i++){
            a.add(randomLetters);
            System.out.println(a);
        }
}   

    public static String generateRandomChars(String candidateChars, int 10) {
        ArrayList<String> a = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            sb.append(candidateChars.charAt(random.nextInt(candidateChars
                    .length())));
        }
        a.add(sb.toString());
        System.out.println(a);
    }

}