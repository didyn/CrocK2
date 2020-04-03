public enum Servises {

    FIRST("краткосрочное пребывание"),
    SECOND("долгосрочное пребывание"),
    THIRD("пребывание с целью пользования медицинскими услугами"),
    FOURTH("транзит"),
    FIFTH("получение документов");

    private String servise;

    Servises(String servise) {
        this.servise = servise;
    }

    public String getServise() {
        return servise;
    }

    @Override
    public String toString() {
        return null;
    }
}
