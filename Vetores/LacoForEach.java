package Vetores;

public class LacoForEach {
    public static void main(String[] args) {
        
        String[] vect = new String[]{"Maria" , "João" , "Paulo"};

        for(int i=0; i<vect.length;i++){
            //System.out.println(vect[i]);
        }

        // System.out.println("-----------------");

        for(String obj: vect){
            System.out.println(obj);

            System.out.println("Stack"); 
        }
    }
}


