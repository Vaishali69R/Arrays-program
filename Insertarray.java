public class Insertarray {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,7};
        int add=3;
        int element=8;
        int l=arr.length;
        for(int i=l-1;i>add-1;i--){
            arr[i]=arr[i-1];
           
        }
        arr[add-1]=element;
        for(int i=0;i<l;i++){
            System.out.println(" " +arr[i]);
        }
    }
}
