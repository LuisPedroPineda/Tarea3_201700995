package ipc1.tarea3_201700995;
import java.util.Scanner;//Indica que se utilizará la clase Scanner
public class IPC1Tarea3_201700995 {
  public static String usuarios[]=new String[5];
  
  public static int num, num1, num2, num3;// Son variables globales
  public static void main(String[] args) {
        //Se llama al método menu()
    menu();    
    }
    public static void menu()//Método del menu
    {
        //Declaramos las variables a utilizar
     Scanner leer = new Scanner(System.in);
     int opcion;
     int m=0; //m sirve para repetir el ciclo si en caso el número ingresado es incorrecto.
     //Escribimos el menú principal
     System.out.println("MENÚ PRINCIPAL"
             + "\nSeleccione una opción");
     System.out.println("1.Usuarios"
             + "\n2.Contador de dígitos"
             + "\n3.Tres números de mayor a menor"
             + "\n4.Calcular promedio"
             + "\n5.Salir");
     System.out.println("Ingrese un número");
     do{
         m=0;         
     opcion = leer.nextInt();//Se lee el número a evaluar en el switch
     switch(opcion){
             case 1:
                 Usuarios();//Se llama el método Usuarios()
                 break;
             case 2:
                 Contador();//Se llama el método Contador()
                 break;
             case 3:
                 mayoramenor();//Se llama el método mayoramenor()
                 break;
             case 4:
                
                 break;
             case 5:
                 System.exit(0);//Se termina la ejecución del programa
                 break;
             default:
                 m=1;// Si en caso el número ingresado fuera incorrecto m sera igual a 1 y el ciclo se repetirá.
                 System.out.println("Intente de nuevo");
         }
     }
     while(m==1);        
    }
    
    public static void Usuarios()//Método de usuarios
    {
        //Declaramos las variables a utilizar
     Scanner leer = new Scanner(System.in);
     String nombre;
     int opcionusuarios,llave,m2;
     int m=0; //m sirve para repetir el ciclo si en caso el número ingresado es incorrecto.
     //Escribimos el menú de USUARIOS
     System.out.println("Bienvenido a 'USUARIOS'"
             + "\nSeleccione una opción");
     System.out.println("1.Ingresar Usuarios"
             + "\n2.Mostrar Usuarios Ascendente"
             + "\n3.Mostrar Usuarios Descendentes"
             + "\n4.Menú Principal");
     System.out.println("Ingrese un número");
     do{
         m=0;
         
     opcionusuarios = leer.nextInt();//Se lee el número a evaluar en el switch
     switch(opcionusuarios){
             case 1:
                 usuarios[0]="null";
                 usuarios[1]="null";
                 usuarios[2]="null";
                 usuarios[3]="null";
                 usuarios[4]="null";
                 m2=0;
                 System.out.println("BIENVENIO A INGRESO DE USUARIOS");
                 for(int i=0;i<usuarios.length;i++)
                 {
                 System.out.println("Ingrese el "+(i+1)+" usuario");
                                      nombre=leer.next();
                 do{
                 
                 for(int j=0;j<5;j++)
                 {
                    
                    if(usuarios[j].equals(nombre)){
                        System.out.println("Usuario repetido ingrese otro");
                        j=0;
                        nombre=leer.next();
                         m2=5;
                        
                        }else
                              {
                                 m2=0;  
                              }
                 
                 }
                 
                 
                 }while(m2==5);
                
                 usuarios[i]=nombre; 
                 }
                 System.out.println("Gracias");
                  System.out.println("");
                 System.out.println("1. Regresar");
                 llave=leer.nextInt();//Se lee la variable llave
                 System.out.println("");
                 if(llave==1)//La variable llave sirve para leer el numero si el usuario desea regresar al menú anterior
                 {                    
                 Usuarios(); //Se llama método del Usuarios()
                 }
                 
                 
                 break;
                 
             case 2:
                 System.out.println("BIENVENIDO A MOSTRAR LOS USUARIOS ASCENDENTE");
                 for(int i=4;i>=0;i--)
                 {
                 System.out.println(usuarios[i]); 
                 }
                 System.out.println("");
                 System.out.println("1. Regresar");
                 llave=leer.nextInt();//Se lee la variable llave
                 System.out.println("");
                 if(llave==1)//La variable llave sirve para leer el numero si el usuario desea regresar al menú anterior
                 {                    
                 Usuarios(); //Se llama método del Usuarios()
                 }
                 break;
             case 3:
                 System.out.println("BIENVENIDO A MOSTRAR LOS USUARIOS DESCENDENTE");
                 for(int i=0;i<usuarios.length;i++)
                 {
                 System.out.println(usuarios[i]); 
                 }
                 System.out.println("");
                 System.out.println("1. Regresar");
                 llave=leer.nextInt();//Se lee la variable llave
                 System.out.println("");
                 if(llave==1)//La variable llave sirve para leer el numero si el usuario desea regresar al menú anterior
                 {                    
                 Usuarios(); //Se llama método del Usuarios()
                 }
                 break;
             case 4:
                menu();//Se llama al método menu()
                 break;
             default:
                m=1;// Si en caso el número ingresado fuera incorrecto m sera igual a 1 y el ciclo se repetirá.
                System.out.println("Intente de nuevo");
         }
     }
     while(m==1);
        
    }
    
    
    public static void Contador()//Método del contador
    {
        //Declaramos las variables a utilizar
     Scanner leer = new Scanner(System.in);
     int opcioncont,contador,digitos,llave;
     digitos=1;//Será quién determine las decenas, centeas...
     contador=0;//Dirá la cantidad de dígitos que tiene el número
     int m=0;//m sirve para repetir el ciclo si en caso el número ingresado es incorrecto.
     //Escribimos el menú de CONTADOR DE NÚMEROS
     System.out.println("Bienvenido a 'CONTADOR DE NÚMEROS'"
             + "\nSeleccione una opción");
     System.out.println("1.Ingresar Número"
             + "\n2.Mostrar número de dígitos"
             + "\n3.Menú principal");
     System.out.println("Ingrese un número");
     do{
         m=0;         
     opcioncont = leer.nextInt();//Se lee el número a evaluar en el switch
     switch(opcioncont){
             case 1:
                 System.out.println("BIENVENIDO A INGRESO DE UN NÚMERO");
                 System.out.println("Ingrese el número debe de estar entre 0 y 100000");
                      
                 num=leer.nextInt();//Se lee la varible global que almacenará el número
                 System.out.println("Gracias");
                  System.out.println("");
                 System.out.println("1. Regresar");
                 llave=leer.nextInt();//Se lee la variable llave
                 System.out.println("");
                 if(llave==1)//La variable llave sirve para leer el numero si el usuario desea regresar al menú anterior
                 {                    
                 Contador(); //Se llama método del Contador()
                 }  
                 break;
             case 2:
                 System.out.println("BIENVENIDO A MOSTRAR NÚMERO DE DÍGITOS");
                 //Conteo de dígitos
                 while(digitos<=num)
                 {
                     contador=contador+1;//Aumenta según se cumpla la condición
                     digitos=digitos*10;//Aumenta hasta llegas a ser igual que el numero ingresado en la opcion 1                     
                 }
                 System.out.println("El número de dígitos de: "+num+" es de: "+contador);
                 num=0;
                 System.out.println("");
                 System.out.println("1. Regresar");
                 llave=leer.nextInt();//Se lee la variable llave
                 System.out.println("");
                 if(llave==1)//La variable llave sirve para leer el numero si el usuario desea regresar al menú anterior
                 {                    
                 Contador(); //Se llama método del Contador()
                 }                 
                 break;
             case 3:
                 System.out.println("");
                menu();//Se llama al método menu()
                 break;
             default:
                m=1;// Si en caso el número ingresado fuera incorrecto m sera igual a 1 y el ciclo se repetirá.
                System.out.println("Intente de nuevo");
         }
     }
     while(m==1);
        
    }
    
    public static void mayoramenor()//Método de mayor a menor
    {
       Scanner leer = new Scanner(System.in);
     int opcionmayoramenor,llave;
     int m=0;
     System.out.println("Bienvenido a 'TRES NÚMEROS DE MAYOR A MENOR'"
             + "\nSeleccione una opción");
     System.out.println("1.Ingresar tres numeros"
             + "\n2.Mostrar ordenados"
             + "\n3.Menú principal");
     System.out.println("Ingrese un número");
     do{
         m=0;         
     opcionmayoramenor = leer.nextInt();
     switch(opcionmayoramenor){
             case 1:
                 System.out.println("BIENVENIDO A INGRESAR TRES NÚMEROS");
                 System.out.println("Ingrese el primero");
                 num1=leer.nextInt();
                 System.out.println("Ingrese el segundo");
                 num2=leer.nextInt();
                 System.out.println("Ingrese el tercero");
                 num3=leer.nextInt();
                  System.out.println("Gracias");
                  System.out.println("");
                 System.out.println("1. Regresar");
                 llave=leer.nextInt();
                 System.out.println("");
                 if(llave==1)
                 {                    
               mayoramenor(); 
                 }
                 break;
             case 2:
                 System.out.println("BIENVENIDO A MOSTRAR ORDENADOS");
                 System.out.println("Los números "+num1+" "+num2+" "+num3+" de mayor a menor son:");
                 if(num1==num2 || num1==num3 || num2==num3 )
                 {
                     System.out.println("Más de algún número esta repetido");
                 }else if(num1>num2 & num2>num3)
                         {
                             System.out.println(num1+""
                                     + "\n"+num2
                                     + "\n"+num3);
                             
                         }else if(num2>num1 & num1 >num3)
                         {
                             System.out.println(num2+""
                                     + "\n"+num1
                                     + "\n"+num3);
                             
                         }else if(num3>num2 & num2 >num1)
                         {
                             System.out.println(num3+""
                                     + "\n"+num2
                                     + "\n"+num1);
                             
                         }
                 else if(num2>num3 & num3 >num1)
                         {
                             System.out.println(num2+""
                                     + "\n"+num3
                                     + "\n"+num1);
                             
                         }else if(num1>num3 & num3 >num2)
                         {
                             System.out.println(num1+""
                                     + "\n"+num3
                                     + "\n"+num2);
                             
                         }else if(num3>num1 & num1 >num2)
                         {
                             System.out.println(num3+""
                                     + "\n"+num1
                                     + "\n"+num2);
                             
                         }
                 System.out.println("");
                 System.out.println("1. Regresar");
                 llave=leer.nextInt();
                 System.out.println("");
                 if(llave==1)
                 {                    
               mayoramenor(); 
                 }
                 break;
             case 3:
                 System.out.println("");
                    menu();
                 break;
             default:
                m=1;
                System.out.println("Intente de nuevo");
         }
     }
     while(m==1); 
    }
}
