import java.util.Collection;
import java.util.Scanner;

public class Aplicacion {
	
	public static int contar(Collection<String> lista,String dato){
		int c=0;
		for(String a:lista){
			if(a.equals(dato)){
				c++;
			}
		}
		return c;
	}
	
	public static void main(String args[])throws ExcepcionIndiceIncorrecto{
		Scanner sc = new Scanner(System.in);
		
		ListaCircular<String>lista= new ListaCircular<String>();
		
		Collection<String> lista2 = new ListaCircular<>();
		
		lista.add(sc.nextLine());
		lista.add(sc.nextLine());
		lista.add(sc.nextLine());
		lista.add(sc.nextLine());
		lista.add(sc.nextLine());
		lista.add(sc.nextLine());
		
		
		System.out.println(contar(lista,sc.nextLine()));
		
		for(String a:lista){
			System.out.print(a+" ");
		}
		System.out.println();
		
		lista.remove(sc.nextLine());
		lista.remove(sc.nextLine());
		
		for(String a:lista){
			System.out.print(a+" ");
		}
		System.out.println();
		
		System.out.println(lista.contains(sc.nextLine()));
		System.out.println(lista.contains(sc.nextLine()));
		System.out.println(lista.contains(sc.nextLine()));
		System.out.println(lista.contains(sc.nextLine()));
		
		for (int i = 0; i < 5; i++) {
			System.out.println(lista.get(sc.nextInt()));
		}
		
//		lista.remove("Tatiana");
//		
//		Nodo<String> nuevo=lista.getPrimero();
//		
//		while(nuevo!=null){
//			System.out.println(nuevo.getDato());
//			nuevo=nuevo.getSiguiente();
//			
//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//			
//		}
		
		
	}
}
