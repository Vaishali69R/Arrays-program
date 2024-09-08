class Anamlousarray {
    //for(int i=0;i<a.length;i++)
    
    static void setData(int a[],int b[]){
        for(int i=0;i<a.length&&i<b.length;i++){ 
        System.out.print(" " + a[i]);
       System.out.print( " " + b[i]);
    }
    System.out.println();
}
    public static void main(String[] args) {
        setData(new int[]{2,4,6,8} ,new int[]{3,5,7,9,1} );
    
    }
    
}
