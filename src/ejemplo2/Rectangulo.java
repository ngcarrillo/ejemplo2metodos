/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2;

/**
 *
 * @author ngarciacarrillo
 */
public class Rectangulo {
    //para crear esta clase se pone encima del principal, new java class
    //los atributos son private los metodos public
    private float base;
    private float altura;
    private float area;
    
    //constructores
    //el primer constructor que se crea es el de por defecto que va inicializar
    //el nombre de los constructores es siempre el nombre de la clase
    public Rectangulo(){
    }
    public Rectangulo(float ba,float alt){
    base = ba;
    altura = alt;
    }
    //metodos de acceso set
    public void setBase(float ba){ //metodo set sirve para dar valores
        base = ba;
    }
    public void setAltura (float alt){
        altura = alt;   
    }
    
    //metodos acceso get
    public float getBase(){ 
        return base;
    }
    public float getAltura(){
        return altura;
    }
    public float calcularArea(float ba, float alt){
      /* float area=ba * alt;
       return area;*/
        return ba * alt;
        
    }           
   public float calcularPerimetro(){
        float perimetro = (base * 2) + (altura * 2);
        return perimetro;
   }     
}
