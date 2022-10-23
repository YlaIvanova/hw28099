public class Main {
    public static void main(String[] args) {

        Car lada = new Car(" LADA"," Granta",2015," Россия "," желтый",
                250,1.7,"МКПП","хэчбек",5,"летняя","бензиновый");

        Car bmw = new Car(" BMW"," Z8",2020," Германия "," черный",
                350,3.0,"АКПП","седан",5,"летняя","дизель");

        Car kia = new Car(" Kia"," Sportage 6 поколение",2022," Южная Корея "," красный",
                320,2.5,"АКПП","кроссовер",7,"зимняя","электрокар");

        Train lastochka = new Train("Ласточка","модель B-901",2011,"Россия",null,
                301,3500,0,"Белорусского вокзал",
                "станции Минск-Пассажирский",11);
        Train leningrad = new Train("Ленинград","модель  D-125",2019,"Россия",null,
                270,1700,0,"Ленинградский вокзал",
                "станции Ленинград-Пассажирский",8);

        Bus liaz = new Bus("Лиаз","К-201",2001,"Россия","желтый",230,"бензиновый");
        Bus gaz = new Bus("Газ","Г-24",2008,"Россия","белый",180,"дизель");
        Bus yaz = new Bus("УАЗ","АВТО",2018,"Россия","синий",200,"бензиновый");


        System.out.println(lada);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(lastochka);
        System.out.println(leningrad);
        System.out.println(liaz);
        System.out.println(gaz);
        System.out.println(yaz);

    }
}

