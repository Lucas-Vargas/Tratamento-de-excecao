import java.util.InputMismatchException;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws OperadorInvalidoException {
        Scanner sc = new Scanner(System.in);
        Calc calc = new Calc();

        System.out.println("Digite um numero (apenas inteiros): ");
        String num1 = sc.next();

        System.out.println("Digite outro numero:");
        String num2  = sc.next();

        System.out.println("Digite uma operação (*, /, + ou -)");
        String oper = sc.next();

        System.out.println("Resultado:");
        System.out.println("Oper "+oper);
        try{
            int n1 = calc.parseInt(num1);
            int n2 = calc.parseInt(num2);
            double res = calc.calcular(n1,n2,oper);
            System.out.println(res);
            System.out.println("Oper: "+oper);

        }catch (InputMismatchException e){
            throw new InputMismatchException("Digite apenas números inteiros\nErro: "+e.getMessage());

        } catch (ArithmeticException e) {
            throw new RuntimeException("Não é permitido divisão por 0\nErro "+e.getMessage());

        } catch (OperadorInvalidoException e){
            throw new OperadorInvalidoException("Operador Inválido: ");

        }catch (NumberFormatException e){
            throw new NumberFormatException("Digite apenas números inteiros\nErro: "+e.getMessage());
        }

    }
}