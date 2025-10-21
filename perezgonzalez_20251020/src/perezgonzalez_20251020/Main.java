/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perezgonzalez_20251020;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pila miPila = new Pila(5);
        
        System.out.println("LA pila esta vacia? " +miPila.estaVacia() );
        System.out.println();//SALTO DE LINEA 
        
        System.out.print("AGREGANDO VALORES CON METODO PUSH()");
        miPila.push(10); //AGREGANDO EL VALOR ENTERO 10  
        miPila.push(20); //AGREGANDO EL VALOR ENTERO 20
        miPila.push(30); //AGREGANDO EL VALOR ENTERO 30
        miPila.push(40); //AGREGANDO EL VALOR ENTERO 40
        miPila.push(50); //AGREGANDO EL VALOR ENTERO 40
        
        System.out.println(); //salto de linea 
        
        miPila.mostrar();
        System.out.println("Tmaño actual de la pila "+ miPila.tamano()+ "elementos");
        System.out.println("Agregar elemento nuevo con la pila llena");
        miPila.push(60);
        System.out.println();// salto de linea
        
        System.out.println("El elemento de la cima es: "+ miPila.peek() );
        
        System.out.println("Extraer valores de la pila");
        System.out.println("Se ha extraido el valor de: "+ miPila.pop() );//se extrae un ultimo elemento de la pila
        System.out.println("Se ha extraido el valor de: "+ miPila.pop() );//se extrae nuevamente el ultimo elemento
        
        System.out.println("MOSTRANDO VALORES DE LA PILA");
        miPila.mostrar();
        System.out.println("Tamaño actual de la pila" +miPila.tamano()+ " elementos" );
        System.out.println();//salto de linea
        
        System.out.println("SE EXTRAEN TODOS LOS ELEMENTOS DE LA PILA");
        
       while(!miPila.estaVacia()){
       System.out.println("Se ha extraido el valor de " +miPila.pop());
       } 
       System.out.println();
       
       miPila.pop();
       System.out.println();
       
       System.out.println("VERIFICACION DE ULTIMO VALOR AGREGADO");
       System.out.println("El elemento de la cima es: "+ miPila.pop());
       System.out.println();

    }
    
}
