public class Calc {

    protected double add(int a, int b){
        return a+b;
    }

    protected double sub(int a, int b){
        return a-b;
    }

    protected double mul(int a, int b){
        return a*b;
    }

    protected double div(int a, int b){
        return a/b;
    }

    public double calcular(int a, int b, String oper) throws OperadorInvalidoException {
            return switch (oper) {
                case "+" -> add(a, b);
                case "-" -> sub(a, b);
                case "*" -> mul(a, b);
                case "/" -> div(a, b);
                default -> throw new OperadorInvalidoException("Operador invalido");
            };
    }

    public int parseInt(String num) throws OperadorInvalidoException {
        return Integer.parseInt(num);
    }





} //Calc end
