package paq;
import java.util.Scanner; //Se importa la clase Scanner para la lectura de datos

public class lecturaDatos                                       //Clase lecturaDatos
{
    public static void main(String args[])                    //Funcion Principal
    {
        System.out.println("Nombre: ");
        String nombre = esNombre();    //Llamamos a los metodos para capturar datos
                
        System.out.println("Edad: ");
        float edad = esEdad();
        
        System.out.println("Estatura(metros): ");
        float estatura = esEstatura();        
        
        System.out.println("Peso(Kilogramos): ");
        float peso = esPeso();
        
        System.out.println("Genero(hombre/mujer): ");
        String genero = esGenero();
        
        System.out.print("\n\n"); //Saltos de linea
        
        float imc = peso / (estatura*estatura);
        //System.out.println(imc);
                
        genero = genero.toLowerCase();      // convertir el genero a minusculas
        
        String estado1 = "bajo peso", recomendacion1 = "aumentar la ingesta diaria de calorias de calidad nutricional";
        
        String estado2 = "peso normal", recomendacion2 = "mantener la ingesta de calorias igual y realices ejercicio de forma constante";
        
        String estado3 = "sobrepeso", recomendacion3 = "reducir la ingesta de calorias en 10% para reducir el imc(" + imc + ") y hacer ejercicio";

        String estado4 = "obesidad tipo I", recomendacion4 = "reducir la ingesta de calorias en 30% y seguir un plan de ejercicio";

        String estado5 = "Obesidad tipo II", recomendacion5= "dar seguimiento manejado por medicos especialistas";
        
        String estado6 = "Obesidad tipo III";  //recomendacion6 es la misma que recomendacion5
        
        float tmb;
        
        // Condicionales para comparar si es hombre o mujer, solo comparamos con minusculas porque en la linea 28 se convierte todo a minusculas
        
        if (genero.equals("hombre") == true)
        {
            tmb = (float) ((10*peso)+(6.25*estatura*100)-(5*edad)+5);  // Estatura *100 porque es en centimetros
            // el float en parentesis fue sugerencia del IDE (alt + enter), ya que desconozco porque me lo cambio 

            //Condicionales para comparar el estado de salud de cada individuo          
            if(imc < 18.5)     // if para peso bajo
            {
                System.out.println("Estimado " + nombre + ", tu indice de masa corporar es de " + imc + ", "); 
                System.out.println("por lo tanto tu estado de salud nutricional es " + estado1 + ".");
                System.out.println("Considerando que tu tasa metabolica basal es de " + tmb + ", ");
                System.out.println("te recomiendo " + recomendacion1 + ".");
            }
            else if(imc >= 18.5 && imc <= 24.9 ) // if para peso normal
            {
                System.out.println("Estimado " + nombre + ", tu indice de masa corporar es de " + imc + ", "); 
                System.out.println("por lo tanto tu estado de salud nutricional es " + estado2 + ". ");
                System.out.println("Considerando que tu tasa metabolica basal es de " + tmb + ", ");
                System.out.println("te recomiendo " + recomendacion2 + ".");
            }
            else if(imc >= 25 && imc <= 29.9)   // if para sobrepeso
            {
                System.out.println("Estimado " + nombre + ", tu indice de masa corporar es de " + imc + ", "); 
                System.out.println("por lo tanto tu estado de salud nutricional es " + estado3 + ". ");
                System.out.println("Considerando que tu tasa metabolica basal es de " + tmb + ", ");
                System.out.println("te recomiendo " + recomendacion3 + ".");
            }
            else if(imc >= 30 && imc <= 34.9)   // if para obesidad tipo I
            {
                System.out.println("Estimado " + nombre + ", tu indice de masa corporar es de " + imc + ", "); 
                System.out.println("por lo tanto tu estado de salud nutricional es " + estado4 + ". ");
                System.out.println("Considerando que tu tasa metabolica basal es de " + tmb + ", ");
                System.out.println("te recomiendo " + recomendacion4 + ".");
            }
            else if(imc >= 35 && imc <= 39.9)  // if para obesidad tipo II
            {
                System.out.println("Estimado " + nombre + ", tu indice de masa corporar es de " + imc + ", "); 
                System.out.println("por lo tanto tu estado de salud nutricional es " + estado5 + ". ");
                System.out.println("Considerando que tu tasa metabolica basal es de " + tmb + ", ");
                System.out.println("te recomiendo " + recomendacion5 + ".");
            }
            else if(imc >= 40)   // if para obesidad tipo III
            {
                System.out.println("Estimado " + nombre + ", tu indice de masa corporar es de " + imc + ", "); 
                System.out.println("por lo tanto tu estado de salud nutricional es " + estado6 + ". ");
                System.out.println("Considerando que tu tasa metabolica basal es de " + tmb + ", ");
                System.out.println("te recomiendo " + recomendacion5 + ".");
            }
            
        }   
        else if(genero.equals("mujer") == true)
        {
            tmb = (float) ((10*peso)+(6.25*estatura*100)-(5*edad)+5);     //Estatura *100 porque es en centimetros
            
            if(imc < 18.5)  // if para peso bajo
            {
                System.out.println("Estimada " + nombre + ", tu indice de masa corporar es de " + imc + ", "); 
                System.out.println("por lo tanto tu estado de salud nutricional es " + estado1 + ".");
                System.out.println("Considerando que tu tasa metabolica basal es de " + tmb + ", ");
                System.out.println("te recomiendo " + recomendacion1 + ".");
            }
            else if(imc >= 18.5 && imc <= 24.9 )    // if para peso normal
            {
                System.out.println("Estimada " + nombre + ", tu indice de masa corporar es de " + imc + ", "); 
                System.out.println("por lo tanto tu estado de salud nutricional es " + estado2 + ". ");
                System.out.println("Considerando que tu tasa metabolica basal es de " + tmb + ", ");
                System.out.println("te recomiendo " + recomendacion2 + ".");
            }
            else if(imc >= 25 && imc <= 29.9) // if para sobrepeso
            {
                System.out.println("Estimada " + nombre + ", tu indice de masa corporar es de " + imc + ", "); 
                System.out.println("por lo tanto tu estado de salud nutricional es " + estado3 + ". ");
                System.out.println("Considerando que tu tasa metabolica basal es de " + tmb + ", ");
                System.out.println("te recomiendo " + recomendacion3 + ".");
            }
            else if(imc >= 30 && imc <= 34.9)   // if para obesidad tipo I
            {
                System.out.println("Estimada " + nombre + ", tu indice de masa corporar es de " + imc + ", "); 
                System.out.println("por lo tanto tu estado de salud nutricional es " + estado4 + ". ");
                System.out.println("Considerando que tu tasa metabolica basal es de " + tmb + ", ");
                System.out.println("te recomiendo " + recomendacion4 + ".");
            }
            else if(imc >= 35 && imc <= 39.9)   // if para obesidad tipo II
            {
                System.out.println("Estimada " + nombre + ", tu indice de masa corporar es de " + imc + ", "); 
                System.out.println("por lo tanto tu estado de salud nutricional es " + estado5 + ". ");
                System.out.println("Considerando que tu tasa metabolica basal es de " + tmb + ", ");
                System.out.println("te recomiendo " + recomendacion5 + ".");
            }
            else if(imc >= 40)  // if para obesidad tipo III
            {
                System.out.println("Estimada " + nombre + ", tu indice de masa corporar es de " + imc + ", "); 
                System.out.println("por lo tanto tu estado de salud nutricional es " + estado6 + ". ");
                System.out.println("Considerando que tu tasa metabolica basal es de " + tmb + ", ");
                System.out.println("te recomiendo " + recomendacion5 + ".");
            }   
        }     
        else
        {
            System.out.println("ERROR"); //Manda a error si no se elige correctamente hombre o mujer; es indistinto a mayusculas y minusculas 
        }
      
        
        
    }
    
    ////////Metodos para la lectura de datos
    // Se crea la clase Scanner, usando una variable llamanda teclado para la lectura de datos
    //Cada metodo tiene su tipo de dato que devuelve y nombre del mismo
    
    public static String esNombre()
    {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }
    
    public static float esEdad()
    {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextFloat();
    }
    
    public static float esEstatura()
    {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextFloat();
    }
    
    public static float esPeso()
    {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextFloat();
    }
    
    public static String esGenero()
    {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }
    
}//Fin clase