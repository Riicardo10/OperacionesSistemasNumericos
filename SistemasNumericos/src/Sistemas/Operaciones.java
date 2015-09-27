package Sistemas;
import javax.swing.JOptionPane;
public class Operaciones {
    public int convertirNumeroDecimal(int numero, int base){
        String n = numero + "";
        int acumulador = 0;
        int longitudNumero = n.length();
        char[] num = n.toCharArray();
        int a;
        String b;
        int m;
        for (int i = 0; i < longitudNumero; i++) {
            if(i == 0){
                b = num[i] + "";
                a = Integer.parseInt(b);
                m = a;
                acumulador = m;
                //n += acumulador;
            }
            else{
                b = num[i] + "";
                a = Integer.parseInt(b);
                int nmm = base * acumulador + a;
                m = base * acumulador + a;
                acumulador = m;
                //n += acumulador;
            }
        }
        int decimal = Integer.parseInt(n);
        return acumulador;
    }
    public boolean validar(int numero, int base){
        boolean bandera = true;
        String num = numero + "";
        int n;
        String m;
        int longitud = num.length();
        char caracteres[] = num.toCharArray();
        int arr[] = new int[longitud];    
        for (int i = 0; i < longitud; i++) {
            m = caracteres[i] + "";
            n = Integer.parseInt(m);
            if(base > n){
                bandera = true;
            }
            else{
                bandera = false;
            }
            if(bandera == false){
                break;
            }
        }
        return bandera;    
    }
    public String convertidor(int decimal, int base){
        String conversion = "";
        while(decimal != 0){
            conversion = decimal % base + conversion;
            decimal = decimal / base;
        }
        return conversion;
    }
    
    public int suma(int dato1, int dato2){
        int suma = dato1 + dato2;
        return suma;
    }
    public int resta(int dato1, int dato2){
        int resta = dato1 - dato2;
        return resta;
    }
    public int multiplicacion(int dato1, int dato2){
        int multiplicacion = dato1 * dato2;
        return multiplicacion;
    }
    public int divisionSistema(int dato1, int dato2){
        int division = 0;
        if(dato2 == 0){
            JOptionPane.showMessageDialog(null, "ERROR. INDETERMINACION");
        }
        else{
            division = dato1 / dato2;
        }
        return division;
    }   
}