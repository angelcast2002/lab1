import java.util.ArrayList;

public class Funciones{

    private static ArrayList<Integer> num = new ArrayList<Integer>();

    public ArrayList<Integer> getNum() {
        return this.num;
    }

    private static ArrayList<Integer> a1 = new ArrayList<Integer>();
    
    

    public static String magnitudSigno() {

        String Magsig = "";
        String mensaje = "";
        
        int prueba = num.get(0);

        for (int i = 1; i < num.size(); i++) {
            mensaje = mensaje + Integer.toString(num.get(i));
        }
        
        if (prueba == 1) {

            Magsig = "-";
            
        }

        else {

            Magsig = "+";

        }
        

        Magsig = Magsig + mensaje;

        return Magsig;
    }

    public static String ceroauno(){
        String n1 = "";

        if (num.get(0) == 1) {
            

            for (int i = 0; i < num.size(); i++) {

                if (num.get(i) == 1) {

                    a1.add(0);
                    
                } else {

                    a1.add(1);
                    
                }
                
            }

            for (int i = 0; i < a1.size(); i++) {
                
                n1 = n1 + Integer.toString(a1.get(i));
            }
        }

        else {
            // n1 = "0";
            for (int i = 0; i < num.size(); i++) {
                
                n1 = n1 + Integer.toString(num.get(i));
            }
        
        }

        return n1;
        
    }


    public static String C2(String n1){

        String resultado = "";

        // String n1 = "11";
        if (num.get(0) == 1) {

            String n2 = "1";
            int a1 = Integer.parseInt(n1,2);
            int a2 = Integer.parseInt(n2,2);
            int suma = a1 + a2;
            resultado = "0" + Integer.toString(suma,2);
            
        }
        
        if (num.get(0) == 0) {

            resultado = n1;
            
        }
        return resultado;
    }

    // public static String bin2(String n1){

    //     String resultado = "";

    //     // String n1 = "11";
    //     if (num.get(0) == 1) {

    //         String n3 = "1";
    //         String n2 = "1";
    //         int a1 = Integer.parseInt(n1,2);
    //         int a2 = Integer.parseInt(n2,2);
    //         int a3 = Integer.parseInt(n3,2);
    //         int suma = a1 + a2;
    //         int resta = suma - a3;
    //         resultado = "-" +Integer.toString(resta);
            
    //     }
        
    //     if (num.get(0) == 0) {
    //         String n3 = "1";
    //         String n2 = "1";
    //         int a1 = Integer.parseInt(n1,2);
    //         int a2 = Integer.parseInt(n2,2);
    //         int a3 = Integer.parseInt(n3,2);
    //         int suma = a1 + a2;
    //         int resta = suma - a3;
    //         resultado = Integer.toString(resta);
            
    //     }

    //     return resultado;
    // }

    // no c pudo


}
