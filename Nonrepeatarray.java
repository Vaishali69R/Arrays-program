class Nonrepeatarray2 {
    public static void main(String[] args) {
        int a[]={-1,2,-1,3,2};
        int count=0;
    
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){

            
            if(a[i]!=a[j]){
            
                count++;
            }
        }if(count==1){
            System.out.println("  " + count);
        }
    }
}
}