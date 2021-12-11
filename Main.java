import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main( String[] args )
    {
    
    Observable sistem = new Sistem();
    Observer pelanggan = new Pelanggan();

    sistem.addObserver(pelanggan);

    System.out.println("Selamat datang di MUNA ROBOT STORE kami. Store yang yang memberikan rekomendasi robot sesuai dengan kebutuhan anda. \nMohon jawab beberapa pertanyaan di bawah ini (minimal kamu harus menjawab y di salah satu pertanyaan) : ");

    scanner = new Scanner(System.in);

    System.out.print("\n1. Apakah anda membutuhkan robot yang bisa memasak? (y/n) \n Ketik jawaban : ");
    String answer1 = scanner.nextLine();

    System.out.print("\n2. Apakah anda membutuhkan robot yang bisa bersih-bersih? (y/n) \n Ketik jawaban : ");
    String answer2 = scanner.nextLine();

    System.out.print("\n3. Apakah anda membutuhkan robot yang bisa menjadi penjaga? (y/n) \n Ketik jawaban : ");
    String answer3 = scanner.nextLine();


    Recommender recommender = null;
    recommender = new Recommender();
    
    if (answer1.equals("y") && answer2.equals("n") && answer3.equals("n")){
        recommender.setRobotRecom(new CookerRobot());

        System.out.println("\nRobot yang direkomendasikan untuk anda : "+ recommender.getRecom());
        
        Robot robotMasak = new RobotMasak(new RobotBasic());
        robotMasak.assemble();

        RobotPrice rM = new RobotMasakPrice();
    	RobotPriceAdapter hargaRobotMasak = new RobotPriceAdapter(rM);
        System.out.println("Harga robot pemasak sebesar " + hargaRobotMasak.getPrice() + " rupiah");
        System.out.println("=====================================================================");
        sistem.notify(" pemasak ");


    } else if (answer1.equals("n") && answer2.equals("y") && answer3.equals("n")){
        recommender.setRobotRecom(new CleanerRobot());

        System.out.println("\nRobot yang direkomendasikan untuk anda : "+ recommender.getRecom());

        Robot robotBersih = new RobotBersih(new RobotBasic());
        robotBersih.assemble();

        RobotPrice rB = new RobotBersihPrice();
    	RobotPriceAdapter hargaRobotBersih = new RobotPriceAdapter(rB);
        System.out.println("Harga robot bersih sebesar " + hargaRobotBersih.getPrice() + " rupiah");

        System.out.println("=====================================================================");
        sistem.notify(" pembersih ");


    } else if (answer1.equals("n") && answer2.equals("n") && answer3.equals("y")){
        recommender.setRobotRecom(new GuardRobot());

        System.out.println("\nRobot yang direkomendasikan untuk anda : "+ recommender.getRecom());

        Robot robotPenjaga = new RobotPenjaga(new RobotBasic());
        robotPenjaga.assemble();

        RobotPrice rP = new RobotPenjagaPrice();
    	RobotPriceAdapter hargaRobotPenjaga = new RobotPriceAdapter(rP);
        System.out.println("Harga robot penjaga sebesar " + hargaRobotPenjaga.getPrice() + " rupiah");
        
        System.out.println("=====================================================================");
        sistem.notify(" penjaga ");

    } else if (answer1.equals("y") || answer2.equals("y") || answer3.equals("y")){
        recommender.setRobotRecom(new MultitaskingRobot());

        System.out.println("\nRobot yang direkomendasikan untuk anda : "+ recommender.getRecom());

        Robot robotMultitasking = new RobotMultitasking(new RobotBasic());
        robotMultitasking.assemble();

        RobotPrice rMs = new RobotMultitaskingPrice();
    	RobotPriceAdapter hargaRobotMultitasking = new RobotPriceAdapter(rMs);
        System.out.println("Harga robot serbabisa sebesar " + hargaRobotMultitasking.getPrice() + " rupiah");

        System.out.println("=====================================================================");
        sistem.notify(" serbabisa ");

    } else{
        System.out.println("\n=====================================================================");
        System.out.println("Pilihan tidak tersedia");
    }
    

    }
}
