package muflih;

public class Mian {

	public static void main(String[] args) {
		System.out.println("____Object Kotak____");
		// membuat object dari class kotak
		Kotak main = new Kotak();
		
		// method setter kotak
		main.setpanjang(1.20);
		main.setlebar(1.25);
			
		// method getter kotak
		System.out.println("panjang : " + main.getpanjang());
		System.out.println("lebar : " + main.getlebar());
		System.out.println("luas : " + main.getpanjang()*main.getlebar());
		System.out.println("keliling : " + main.getlebar()*main.getpanjang()*main.getlebar()*main.getpanjang());
		
		System.out.println("______Object Kelas mahasiswa______");
		//membuat object dari class mahasiswa
		Mahasiswa mahasiswa = new Mahasiswa();
		
		//method setter mahasiswa
		mahasiswa.nama = "MUFLI DIANK EFENDI";
		mahasiswa.nim = "D0217534";
		mahasiswa.alamat = "KAROSSA";
		mahasiswa.golonganDarah = "--";
		mahasiswa.status = "MAHASISWA";
		mahasiswa.tinggiBadan = "167";
		mahasiswa.beratBadan = "46";
		
		//method getter mahasiswa
		System.out.println("nama : " + mahasiswa.getnama());
		System.out.println("nim : " + mahasiswa.getnama());
		System.out.println("alamat : " + mahasiswa.getalamat());
		System.out.println("golongan Darah : " + mahasiswa.getgolongnDarah());
		System.out.println("Status : " + mahasiswa.getstatus());
		System.out.println("tinggi badan : " + mahasiswa.gettinggiBadan());
		System.out.println("berat badan : " + mahasiswa.getberatBadan());

		System.out.println("_____Object Kelas node____");
		//membuat object dari kelas node
		Node node = new Node();
		
		//method setter node
		node.label = "KELAS MUHAMMAD";
		node.Value = 15;
		
		//method getter node
		System.out.println("Nama Kelas : " + node.getlabel());
		System.out.println("jumlah Jiwa : " + node.getValue());

		System.out.println("_____Object Kelas stack____");
		//membuat object dari kelas stack
		Stack stack = new Stack();
		
		stack.value[0] = "MUFLI DIANK EFENDI";
		stack.value[1] = "MUH QADRY";
		stack.value[2] = "MUH WFIQ";
		stack.value[3] = "MUH AMING";
		stack.value[4] = "MUH ANMAR";
		stack.value[5] = "MUH FAJRIN";
		stack.value[6] = "MUH ABDY";
		stack.value[7] = "MUH FARHAN";
		stack.value[8] = "MUH NAS";
		stack.value[9] = "MUH MASDAR";
		stack.value[10] = "MUH HAMID";
		stack.value[11] = "MUH FAHRUL";
		stack.value[12] = "MUH YUSUF";
		stack.value[13] = "MUH ALIF";
		stack.value[14] = "MUH ALFANDY";

		//menampilkan stack
		for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};

		
		}
	

	}


