package Metodos;
/*4..*/
import java.util.Scanner;

public class Ex4 {
	
	public static void LePositivo(int v1){
	
		if( v1>=0){
			System.out.println(v1);System.out.println(" ");
		}
		
	}
	public static void EhTriangulo(int v1, int v2,int v3){
		
		if(v1<=(v2+v3)  && v2<=(v3+v1) && v3<=(v2+v1)){
			System.out.println(1);
		}else{
	
			System.out.println(0);
		
		}
	}
	
public static void TipoTriangulo(double l1,double l2,double l3){
	
	if(l1==l2 && l1==l3){
		
		System.out.println(1);;
	}else{
	if((l1==l2)&& l1!=l3){
		System.out.println(2);
		
	}else{
	if(l1!=l2 && l1!=l3){
		System.out.println(3);
	}
	}
	}
}

	public static void main(String[] args) {
		Scanner t = new Scanner (System.in);
int l1,l2,l3;

	
	do{
	System.out.println("VAlores");
	l1=t.nextInt();
	LePositivo(l1);
	l2=t.nextInt();
	LePositivo(l2);
	l3=t.nextInt();
	LePositivo(l3);
	
}while(l1<=0 || l2<=0 || l3<=0);
	System.out.println("Código EhTriangulo");
	EhTriangulo(l1,l2,l3);
	System.out.println("Código TipoTriangulo");
TipoTriangulo(l1,l2,l3);
t.close();

}
}