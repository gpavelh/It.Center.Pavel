package Lesson05.Ex4; //Абстрактный класс Human реализующий интерфейсы «Run» и
//«Swim» (интерфесы в папке Ex3). Создано 2 наследника класса Human - Dervisee01 и 02
//с конкретной реализацией методов, которые объявлены в интерфейсах.

import Lesson05.Ex3.Run;
import Lesson05.Ex3.Swim;

import java.sql.SQLOutput;

public abstract class Human implements Run, Swim {
    @Override
    public void actionRun() {
        System.out.println("Беги");
    }

    @Override
    public void actionSwim() {
        System.out.println("Плыви");
    }

    @Override
    public void actionFastSwim() {

    }

    @Override
    public void actionFastRun() {

    }
}
