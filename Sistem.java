import java.util.ArrayList;

public class Sistem implements Observable {
    private ArrayList<Observer> pelanggan = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        pelanggan.add(observer);
    }

     @Override
    public void removeObserver(Observer observer) {
        pelanggan.remove(observer);
    }

    @Override
    public void notify(String s) {
        for (Observer custumer : pelanggan) {
            custumer.update(s);
        }
    }
}