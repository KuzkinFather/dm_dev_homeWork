package com.dmdev.homework;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * <p>
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 * <p>
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */


public class HW3_cycle {

    public static void main(String[] args) {
        int startZP = 600;


        System.out.println(calculateMoney(startZP));

    }

    public static int calculateMoney(int money) {
        int result = 0;
        int ZP = money;
        int moneyForEat = 300;
        double moneyForBroker = ZP * 0.10;
        double moneyForBrokerPercent = 0;
        for (int i = 1; i <= 28; i++) {
            result += ZP - moneyForEat - moneyForBroker;
            moneyForBrokerPercent += moneyForBroker + (moneyForBroker * 0.02);
            if (i == 7 || i == 13 || i == 19 || i == 28) {
                ZP += 400;
            }
            System.out.println("В " + i + " месяце накоплено: " + result + ". У брокера: " + moneyForBrokerPercent + ". ЗП сейчас: " + ZP);
        }
        return result;
    }

}
