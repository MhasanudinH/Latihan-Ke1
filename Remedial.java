import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Remed2{
	private String getTanggal() {
		DateFormat dateFormat= new SimpleDateFormat("HH:mm:ss");
		Date date= new Date();
		return dateFormat.format(date);
		}
	private String getTanggal0() {
		DateFormat dateFormat= new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
		Date date= new Date();
		return dateFormat.format(date);
		}
		public static void main (String args[]){
	Scanner sc=new Scanner(System.in);
	Scanner scan=new Scanner(System.in);
	Scanner son=new Scanner(System.in);
		int n,depan,tengah,belakang,search, jam_belakang, jam_depan;
		String mobil;
		int menu;
		int k=1;
		int j=0;
		int total=0;
		int pembayaran=0;
		int z=0;
		Remed2 tgl= new Remed2();
		boolean parkir=true;
		do{		
		System.out.print("\nMasukan Jumlah Maximal mobil pada parkiran : ");
		n=son.nextInt();
		
		if(n>0){
		String A[]=new String[n];
		String B[]=new String[n];
		String C[]=new String[n];
		String D[]=new String[n];
		jam_depan=0;
		jam_belakang=-1;
		belakang=-1;
		depan=0;
		boolean ulang=true;
		do{
			System.out.println("\n\t####################\n");
			System.out.println("\t      = PARKIR =\n");
			System.out.println("\t######################\n");
			System.out.println("1. Masuk Parkiran");
			System.out.println("2. Keluar Parkiran");
			System.out.println("3. Lihat Parkiran");
			System.out.println("4. Keluar");
			System.out.print("\nMasukan Pilihan : ");
			menu = son.nextInt();
			
		switch(menu){
case 1:{
		System.out.println("NO Urut :"+" "+k+"");
		System.out.println("Tanggal dan waktu sekarang : "+tgl.getTanggal()+" ");
		System.out.print("Masukan Nomor Plat Mobil : ");
		mobil=scan.nextLine();
						
		boolean masuk=true;
		for(int i=depan;i<=belakang;i++)
		if(mobil.equals(A[i]))
		masuk=false;														
		if(masuk==true){							
		belakang++;
		k++;
		A[belakang]=mobil;
		D[belakang]=" "+tgl.getTanggal();
		System.out.println("\nNomor Plat Mobil " + mobil + " Masuk");
				}	
		else
		System.out.println("\nNomor Plat Mobil Sudah Ada");				
				}n--;
		break;
							
case 2:{
		if(depan <= belakang){
		System.out.print("Masukan Nomor Plat Mobil : ");
		mobil=scan.nextLine();
		if(mobil.equals(A[depan])){										
		System.out.println("\nNomor Plat Mobil "+mobil+" Keluar");
		A[depan]= " ";
		D[depan]=" "+tgl.getTanggal();
		depan++;
		for(int i=depan;i<=belakang;i++){
		A[i-1]=A[i];
		System.out.println("Nomor Plat Mobil "+A[i]+" Bergeser Ke Depan");
	}
		A[belakang]= " ";
		D[belakang]=" "+tgl.getTanggal();
		System.out.println("selisih jam");
		j=son.nextInt();
		total=j*2000;
		System.out.println("total bayar : "+total);
		System.out.println("Uang Cash : ");
		z=son.nextInt();
		pembayaran=z-total;
		System.out.println("Uang Kembalian : "+pembayaran);
		depan--;
		belakang--;
		n++;
		}															
		else{
		tengah=0;
		for(search=depan+1;search<=belakang;search++)										
		if(mobil.equals(A[search])){
			tengah=search;
			}
				if(tengah>0){
		for(int i=depan;i<tengah;i++){												
			B[i] = A[i];
			D[i]=" "+tgl.getTanggal();
		System.out.println("Nomor Plat Mobil "+A[i]+" Keluar Sementara");
				}					
				System.out.println("\nNomor Plat Mobil "+mobil+" Keluar");
	A[tengah]= " ";
	D[tengah]=" "+tgl.getTanggal();
	for(int i=tengah-1;i>=depan;i--){
		A[i]=B[i];
	D[i]=" "+tgl.getTanggal();										
	System.out.println("Nomor Plat Mobil "+B[i]+" Masuk Kembali");
	}
	for(int i=tengah+1;i<=belakang;i++){
	A[i-1]=A[i];
    D[i-1]=" "+tgl.getTanggal();
	System.out.println("Nomor Plat Mobil "+A[i]+" Bergeser Ke Depan");				
	System.out.println("selisih jam");									
	System.out.println("Jam Keluar : "+tgl.getTanggal()+" ");
	}				
System.out.println("selisih jam");
	j=son.nextInt();
	total=j*2000;
	System.out.println("total bayar : "+total);
	System.out.println("Uang Cash : ");
z=son.nextInt();
	pembayaran=z-total;
	System.out.println("Uang Kembalian : "+pembayaran);
	belakang--;
	n++;
	}											
	else
	System.out.println("\nMobil Tidak Ditemukan");
			}
		}						
	else
	System.out.println("\nParkiran Kosong");								
	}
	break;				
				
case 3:{
if(depan<=belakang){
System.out.println("\nTanggal Sekarang "+tgl.getTanggal0());
System.out.println("No urut: | Plat Mobil \t jam masuk");
System.out.println("lahan parkir yang kosong "+n);
for(int i=depan;i<=belakang;i++)
System.out.println((i+1)+"|\t\t"+A[i]+"\t"+D[i]);
System.out.println("================================");
	}	
else
System.out.println("\nParkiran Kosong");							
	}
		break;
case 4: return;
	default	: System.out.println("\nKesalahan Dalam Input");
		}
		}
	while(ulang==true);	
	}
	else
		System.out.println("\n=> LAHAN PARKIR MINIMAL 1 MOBIL");
	}
	while(parkir==true);				
	}
}
