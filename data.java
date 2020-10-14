import java.util.Scanner;

public class data{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String nama,alamat,umur;
		
		System.out.print("Nama : ");
		nama=input.nextLine();
		System.out.println();
		
		System.out.print("Alamat : ");
		alamat=input.nextLine();
		System.out.println();
		
		System.out.print("Umur : ");
		umur=input.nextLine();
		System.out.println();
		
		System.out.println("Nama anda   = "+nama);
		System.out.println("Alamat anda = "+alamat);
		System.out.println("Umur anda   = "+umur);
	}
}