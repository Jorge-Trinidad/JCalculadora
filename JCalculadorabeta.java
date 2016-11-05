
import java.util.Scanner;
public class JCalculadorabeta {
 public static void main(String[] args)  {
	System.out.println();
	System.out.println("Bienvenido a JCalculadora");
	System.out.println();
int a=0;
int b=0;
int c=0;
int d=0;
int e=0;
int f=0;
int g=0;
int h=0;
int i=0;
int j=0;
		String [] Indice= new String[30];
		String n1;
		String n2;
		String n3;
		String registro;
		int contador=0;

	do{

System.out.println("Menu:");
System.out.println("1. Suma de 2 numeros");
System.out.println("2. Resta de 2 numeros");
System.out.println("3. Multiplicación de 2 numeros");
System.out.println("4. División de 2 numeros");
System.out.println("5. Salir");

	Scanner opcion1= new Scanner(System.in);
	a= opcion1.nextInt();

for(int o=0;o<=5;o++){
System.out.println();
}


switch(a) {

		case 1:

	System.out.println("Ingrese primer digito a operar");

	Scanner dato1suma= new Scanner(System.in);
		b= dato1suma.nextInt();

	System.out.println("Ingrese Segundo digito a operar");

	Scanner dato2suma= new Scanner(System.in);
		c= dato2suma.nextInt();

	j=b+c;

		System.out.println(b+" + "+c+" = "+j);


	n1=String.valueOf(b);
	n2=String.valueOf(c);
	n3=String.valueOf(j);
	registro=n1+"+"+n2+"="+j;
	Indice[contador]=registro;
	contador++;
		System.out.println("+++++++++++++++++++++++++++++");

	break;

		case 2:

System.out.println("Ingrese primer digito a operar");

Scanner dato1resta= new Scanner(System.in);
d= dato1resta.nextInt();

System.out.println("Ingrese Segundo digito a operar");

Scanner dato2resta= new Scanner(System.in);
e= dato2resta.nextInt();

j=d-e;

System.out.println(d+" - "+e+" = "+j);

n1=String.valueOf(d);
n2=String.valueOf(e);
n3=String.valueOf(j);
registro=n1+"+"+n2+"="+j;
Indice[contador]=registro;
contador++;
System.out.println("+++++++++++++++++++++++++++++");
	break;

		case 3:

System.out.println("Ingrese primer digito a operar");

Scanner dato1multiplicacion= new Scanner(System.in);
f= dato1multiplicacion.nextInt();

System.out.println("Ingrese Segundo digito a operar");

Scanner dato2multiplicacion= new Scanner(System.in);
g= dato2multiplicacion.nextInt();

j=f*g;

System.out.println(f+" * "+g+" = "+j);


n1=String.valueOf(f);
n2=String.valueOf(g);
n3=String.valueOf(j);
registro=n1+"+"+n2+"="+j;
Indice[contador]=registro;
contador++;
System.out.println("+++++++++++++++++++++++++++++");
	break;

		case 4:

System.out.println("Ingrese primer digito a operar");

Scanner dato1division= new Scanner(System.in);
h= dato1division.nextInt();

System.out.println("Ingrese Segundo digito a operar");

Scanner dato2division= new Scanner(System.in);
i= dato2division.nextInt();

	if(i!=0){

j=h/i;

System.out.println(h+" / "+i+" = "+j);

n1=String.valueOf(h);
n2=String.valueOf(i);
n3=String.valueOf(j);
registro=n1+"+"+n2+"="+j;
Indice[contador]=registro;
contador++;
System.out.println("+++++++++++++++++++++++++++++");

	}else{
System.out.println("Division entre 0 no es permitida");}

	break;


		case 5:

System.exit(0);

	break;

		default:

System.out.println("POR FAVOR INGRESE UNA OPCION VALIDA");

}

System.out.println("PRECIONE CUALQUIER TECLA PARA CONTINUAR");
opcion1.next();

for(int z=0;z<=5;z++){
System.out.println();
}


}	
while(a!=5);



}
               
}


