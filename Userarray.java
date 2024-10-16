import java.util.Scanner;
class Userarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of array");
        int size= sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){ 
            System.out.println("Enter a number");
            a[i]=sc.nextInt();
            System.out.println("Array at index " + i + " is " + a[i]);
       
    }
    
}
}