/// Класс NonGen - функциональный эквивалент класса Gen без обобщений
class NonGen {
    Object ob; // объект ob теперь имеет тип OЬject

    // передать конструктору ссылку на объект типа OЬject
    NonGen(Object о) {
        ob = о;
    }

    // возвратить тип OЬject
    Object getob() {
        return ob;
    }

    // показать тип объекта ob
    void showТype() {
        System.out.println("Oбъeкт ob относится к типу " +
                ob.getClass().getName());
    }
}
// продемонстрировать необобщенный класс
class NonGenDemo {
    public static void main(String args[]) {
        NonGen iOb;

        // создать объект типа NonGen и сохранить в нем
        // объект типа Integer . Выполняется автоупаковка
        iOb = new NonGen(88);
        // показать тип данных, хранящихся в переменной iОЬ
        iOb.showТype();

        // получить значение переменной iOb,
        // на этот раз требуется приведение типов
        int v = (Integer) iOb.getob();
        System.out.println(" Знaчeниe : " + v);
        System.out.println();
        // создать другой объект типа NonGen и
        // сохранить в нем объект типа String
        NonGen strOb = new NonGen("Tecт без обобщений");

        // показать тип данных , хранящихся в переменной strOb
        strOb.showТype();

        // получить значение переме нной strOb ,
        // И в этом случае потребуется приведение типов
        String str = (String) strOb.getob();
        System.out.println(" Знaчeниe : " + str);
        // этот код компилируется , но онпринципиально неверный!
        // iOb = strOb;
        // v = (Integer) iOb.getob(); // Ошибка во время выполнения!
    }
}