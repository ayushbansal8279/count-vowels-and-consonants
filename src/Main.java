public class Main {
    public static void main(String[] args) {
        int vowels=0;
        int cons=0;
        String str="Hello We all are Working for Single Objective";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U'){
                vowels++;
            }
            else {
                if(ch!=' ')
                cons++;
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+cons);
    }
}
