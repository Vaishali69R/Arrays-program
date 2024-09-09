 class Average2array {
    public static void main(String[] args) {
        int a[]={8,3,2,9,3,5};
        int sum=0;
        int l=a.length;
        int averge;
        for(int i=0;i<l;i++){
            sum=sum+a[i];
        }
        averge=sum/l;
        System.out.println(sum);
        
    }
    
}
