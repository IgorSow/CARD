package checksums;

import java.util.stream.Stream;

public class LuhnCheckSumVerifer implements ChecksumVerifer {


    @Override
    public boolean verif(String number) {
        number = removeSpace(number);

        int[] numbersIntArray = convertStringToTableOfInteger(number);
        int summToCheck = 0;

        for (int i = 0; i < numbersIntArray.length; i++) {

            if (i % 2 == 0) {
                int tempSum;
                tempSum = numbersIntArray[i] * 2;
                summToCheck += isLesThenTen(tempSum);
            } else {
                summToCheck += numbersIntArray[i];
            }
        }
        return validStatement(summToCheck);

    }

    private String removeSpace(String number) {
        return number.replace(" ", "");
    }

    private boolean validStatement(int sumToCheck) {
        if (sumToCheck % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private int isLesThenTen(int tempSumm) {
        if (tempSumm >= 10) {
            return tempSumm - 9;
        } else {
            return tempSumm;
        }
    }

    private int[] convertStringToTableOfInteger(String number) {
        return Stream.of(number.split("")).mapToInt(Integer::parseInt).toArray();
    }
}
