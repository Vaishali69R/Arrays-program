public class Deletearray {
    public static void main(String[] args) {
        int arr[]={40,17,28,39,24,66};
        int l=arr.length;
        int delete=28;
        for(int i=0;i<l;i++)
        
        { if(delete==arr[i]){
            for(int j=i;j<l-1;j++){
              arr[j]=arr[j+1];
            }
            break;
        }
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i] + " ");
        }
    }
    
}
