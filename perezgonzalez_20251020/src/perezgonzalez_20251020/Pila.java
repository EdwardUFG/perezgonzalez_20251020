/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perezgonzalez_20251020;

/**
 *
 * @author UFG
 */
public class Pila {
    
    private int[] elementos;
    private int cima;
    private int capacidad;
    
    /*
    METODO CONSTRUCTOR DE LA CLASE PILA
    AL INSTANCIAR UNA NUEVA VARIABLE DE TIPO PILA, ENTONCES 
    SE CREARA EN MEMORIA UN OBJETO CON ATRITUBUTOS QUE 
    ESTAN ADENTRO DE ESTE CONSTRUCTOR 
    */
    
    public Pila(int tamano){
    
        this.capacidad = tamano;//CANTIDAD DE ELEMENTOS QUE SE VAN A ALMACENAR 
        this.elementos = new int[this.capacidad];//SE CREA UN NUEVO ARREGLO DE ESTE TIPO ENTERO
        this.cima = -1;//EL VALOR POR DEFECTO DE LA CIMA -1 (VACIA)
    }
    
    
    
    public boolean estaVacia(){
    
    
    if(this.cima ==-1){
    return true;
    }else{
    return false;
    }
    
  }
    /*
    DEVUELVE 
    */
     public boolean estaLlena(){
     
     if(this.cima == (this.capacidad -1) ){
         //EL VALOR DE LA CIMA ES IGUAL A LA CANTIDAD DE ELEMENTOS
     return true;
     }else{
         //EL VALOR DE LA CIMA ES DIFERENTE A LA CANTIDAD DE ELEMENTOS
     return false;
     }    
    }        
     
    /*
     DEVUELVE EL VALOR DE LA CIMA, ES DECIR EL VALOR EL ULTIMO ELEMENTO
     QUE FUE INSERTADO AL ARREGLO
     */ 
     
    public int tamano(){
    return this.cima +1;
    }     
    
    /*
    METODO PARA AGREGAR ELEMENTOS A AL ARREGLO, ES DECIR A LA PILA
    PRIMERO SE DEBE REALIZAR LA VERIFICACION DE TAMAÑO DE LA PILA 
    UNA VEZ VERIFICADA SE PUEDE AGREGAR EL ELEMENTO AL ARREGLO
    */
    
    
   public void push(int elemento){
       //PRIMERO SE VERIFICA SI LA PILA ESTA LLENA
       if(estaLlena() ){
           System.out.println("La pila esta llena, no se puede agregar el valor: " +elemento);
                   //return;
       }else{
       this.cima++; //se incementa el valor de la cima 
       this.elementos[this.cima] = elemento; //se agrega el nuevo arreglo (a la pila)
       System.out.println("El valor: "+elemento+ " fue agregado a la pila ");
       }
   } 
    
   public int pop(){
   
       if(estaVacia() ){
        System.out.println("La pila esta vacia, no se puede hacer la extraccion del elemento.");
        return-1;
       }else{
       /*
           SI HAY ELEMENTOS QUE EXTRAER, POR LO TANTO, SE CREA UNA VARIABLE 
           QUE ALMACENARA EL VALOR EXTRAIDO
           */
           int elementoExtraido = this.elementos[this.cima];//LA NUEVA VARIABLE POSEE EL VALOR DEL ULTIMO ELEMENTO INSERTADO AL ARREGLO
           this.cima--; //SE REDUCE EL VALOR DE LA CIMA A QUE YA SE EXTRAJO UN ELEMENTO
           return elementoExtraido;//SE DEVUELVE AL USUARIO EL VALOR QUE FUE EXTRAIDO
       }
   
   }
   
   
   public int peek(){
       
   
       if(estaVacia() ){
       System.out.println("La pila esta vacia");
       return-1;
       }else{
       return this.elementos[this.cima];
       
       }
       
   
   }
   
   public void mostrar(){
       
       if(estaVacia() ){
       System.out.print("La pila esta vacia");
       }else{
       System.out.print("Contenido de la pila (desde la cima, hasta la base de la pila)");
       System.out.print("[");
       /*
       SE DEBE RECORRER EL ARREGLO DE LA PILA PARA PODER IMPRIMIR CADA VALOR
       EN LA ESTRUCUTRA ITERATIVA DE INICIA DESDE EL VALOR DE LA CIMA, ES DECIRDESDE LA ULTIMA 
       POSICION AGREGADA AL ARREGLO, MIENTRAS EL VALOR DE "I" SEA MAYOR QUE CERO (es decir que aun no ha llegado al abse de la pila)
       el valor de "i" estara en decremento hasta llegar a cero
       */
       for(int i= this.cima; i>= 0; i--){
           //se imprime si el valor en su posicion corrspondiente de manera continua 
           System.out.println(this.elementos[i]);
           
           if(i>0){
           System.out.print(",");
           }
       }
       System.out.println("]");
       }
   
   
   
   
   }
   
   
   
}
