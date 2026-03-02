package com.javarush.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        //напишите тут ваш код
        Random random = new Random();
        int randomNumber = random.nextInt(8);
        String magicPrediction = null;
        if (randomNumber == 0) {
            magicPrediction = CERTAIN;
        } else if (randomNumber == 1) {
            magicPrediction = DEFINITELY;
        } else if (randomNumber == 2) {
            magicPrediction = MOST_LIKELY;
        } else if (randomNumber == 3) {
            magicPrediction = OUTLOOK_GOOD;
        } else if (randomNumber == 4) {
            magicPrediction = ASK_AGAIN_LATER;
        } else if (randomNumber == 5) {
            magicPrediction = TRY_AGAIN;
        } else if (randomNumber == 6) {
            magicPrediction = NO;
        } else if (randomNumber == 7) {
            magicPrediction = VERY_DOUBTFUL;
        }

        return magicPrediction;
    }
}
