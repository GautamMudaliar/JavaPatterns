// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HollowRectangleBoxPattern {
    public static void main(String[] args) {
        
        int rows = 4;                 
        int columns = 5;  
        
        for (int i =0 ; i< rows ; i++){
            for (int j = 0 ; j< columns ;j ++){
                
                if( i>0 && i <rows-1 && j > 0 && j<columns-1  ){
                    System.out.print(" ");
                }else{    
                        System.out.print("*");
                    }
            }
        System.out.println("");
        }
        
        
        
        
    }

}
