//Простой обобщенный класс с двумя параметрами типа: Т и V
class TwoGen<T,V> {
    T ob1;
    V ob2;

    //передать конструктору ссылки на объекты типа Т и V
    TwoGen(T ol, V о2) {
        ob1 = ol;
        ob2 = о2;
    }
    //показать типы Т и V
    void showTypes() {
        System.out.println("Tип Т: " + ob1.getClass().getName());
        System.out.println("Tип V: " + ob2.getClass().getName());
    }

    T getob1() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }
}
//продемонстрировать применение класса ТwoGen
class SimpGen {
    public static void main(String args[]) {

        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Обобщения");
        //показать типы
        tgObj.showTypes();
        //Получить и показать значения
        int v = tgObj.getob1();
        System.out.println("Знaчeниe : " + v);
        String str = tgObj.getob2();
        System.out.println("Знaчeниe : " + str);
    }
}