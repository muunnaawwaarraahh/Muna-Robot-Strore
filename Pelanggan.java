
public class Pelanggan implements Observer {
    @Override
    public void update(String s) {
        // System.out.println("kabar waktu " + s + ", jangan sampai kehabisan!! ");
        System.out.println("==> Pesanan robot "+ s +" anda sudah selesai dirakit. Pesanan akan segera di antar kediaman anda. \n");
    }
}