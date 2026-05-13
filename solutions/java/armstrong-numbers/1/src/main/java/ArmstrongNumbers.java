class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int sum = 0;
        String numInString = String.valueOf(numberToCheck);
         
        for (int i = 0; i < numInString.length(); i++) {
            sum += (int) Math.pow((int) numInString.charAt(i) - (int) '0', numInString.length());
        }

        return sum == numberToCheck;
    }

}
