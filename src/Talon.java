import java.util.Date;

public class Talon implements print {

    private int number;//номер талона
    private Servises servise;//услуга
    private long timeOfGet;//время получения талона в миллисекундах

    public int getNumber() {
        return number;
    }

    public Servises getServise() {
        return servise;
    }

    public long getTimeOfGet() {
        return timeOfGet;
    }

    /**
     * печать номера талона
     */
    @Override
    public void talonPrint() {

    }
}
