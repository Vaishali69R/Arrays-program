 class CyclicRarray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int temp=0;
        int num;
        for(int i=0;i<a.length;i++){
         temp=a[i];
         a[i]=a[a.length-1];
         a[a.length-1]=temp;
         num=a[i];
        }
        for(int j=0;j<a.length;j++);
        {
            System.out.println(a[]+ " ");
        }
    }
    
}
