
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fabri
 */
public class Principal {
    public static void main(String[] args) {
        int x;
        int y;
        x = 4;
        y = 6;
        System.out.println("la suma de las variables es: "+ (x+y));
        
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(x);
        lista.add(2*x);
        lista.add(9);
        lista.add(2);
        
        
        for(int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i));
        }
        
        for(Integer num : lista){
            if (num < 5){
                System.out.println(num);
            }
        }
        
    }
}
