package step3.view;

import step3.domain.Cars;

import java.util.Arrays;
import java.util.Scanner;

public class Utils {
    static Scanner input = new Scanner(System.in);

    public static class OutputView {

        private static final String OUTPUT_HOW_MANY_CAR = "자동차의 이름은 무엇 인가요?";
        private static final String OUTPUT_HOW_MANY_RACING_ATTEMPT = "시도할 회수는 몇 회 인가요?";
        private static final String OUTPUT_MOVE_CAR_POSITION = "-";

        public static void outputHowManyCar() {
            System.out.println(OUTPUT_HOW_MANY_CAR);
        }

        public static void outputHowManyRacingAttempt() {
            System.out.println(OUTPUT_HOW_MANY_RACING_ATTEMPT);
        }

        public static void outputMoveCarPosition(final Cars cars) {
            System.out.println("");
            cars.getCars().forEach( car -> {
                System.out.print(car.getCarName() + " : ");
                System.out.println(OUTPUT_MOVE_CAR_POSITION.repeat(car.getDistance()));
            });
        }
    }

    public static class InputView {

        public static String inputCarNames() {
            OutputView.outputHowManyCar();
            return input.next();
        }

        public static int inputRacingAttempt() {
            OutputView.outputHowManyRacingAttempt();
            return input.nextInt();
        }

    }

}
