public class Window implements tabloAlert, operator {

    private int number; //номер окна

    public int getNumber() {
        return number;
    }

    /**
     * при нажатии на кнопку находится талон с максимальным временем ожидания в списке талонов,
     * этот талон удаляется из списка, выводится на экран номер этого талона
     */
    @Override
    public void button() {

    }

    /**
     * вывод на табло номер окна к номеру талона
     * @param number - номер окна
     */
    @Override
    public void tabloOutput(int number) {

    }

    /**
     * метод который ищет в списке талонов талон с максимальным временем ожидания
     * @param array
     * @return
     */
    private Talon maxTimeExpect(Talon[] array){

        return null;
    }
}
