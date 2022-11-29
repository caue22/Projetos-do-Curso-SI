package aula20_05;
import javax.swing.*;
public class CalculadoraSIMPLES {

	public static void main(String[] args) {
		String aux = "", sinal = "";
		Double x1, x2, resultado = 0.0;
		JOptionPane.showMessageDialog(null, "Calculadora simples");
		aux = JOptionPane.showInputDialog("Digite o primeiro valor");
		x1= Double.parseDouble(aux);
		sinal = JOptionPane.showInputDialog("Digite qual operação deseja realizar = * / + - ");
		aux = JOptionPane.showInputDialog("Digite o segundo valor");
		x2= Double.parseDouble(aux);
		
		if(sinal.equals("*")){
			resultado = x1*x2;
		} else if(sinal.equals("/")) {
			resultado = x1/x2;
		}else if(sinal.equals("+")){
			resultado = x1+x2;
		} else if(sinal.equals("-")) {
			resultado=x1-x2;
		}
		
		JOptionPane.showMessageDialog(null, resultado);
		
		

	}

}
