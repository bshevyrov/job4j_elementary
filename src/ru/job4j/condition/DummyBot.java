package ru.job4j.condition;

public class DummyBot {
    public static String answear(String question) {

        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answear("Привет, Бот");
        System.out.println(rsl);
        rsl = DummyBot.answear("Пока.");
        System.out.println(rsl);
    }
}
