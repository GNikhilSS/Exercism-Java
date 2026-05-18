class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        int res = 0;
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        if (operation == "") {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        if (operation == "/" && operand2 == 0) {
            throw new IllegalOperationException(
                "Division by zero is not allowed",
                new ArithmeticException()
            );
        }
        switch (operation) {
            case "+":
                res = operand1 + operand2;
                break;
            case "*":
                res = operand1 * operand2;
                break;
            case "/":
                res = operand1 / operand2;
                break;
            default:
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
        return "" + operand1 + " " + operation + " " + operand2 + " = " + res;
    }
}
