
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class InvertedTrianglePattern {
    public static void main(String[] args) {
        
        int rows = 4;                 
     
        
        for( int i = rows ; i >0 ; i--){
            
            
            for (int j = i ; j> 0 ; j--){
                
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
    }

}

