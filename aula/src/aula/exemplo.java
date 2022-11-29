package aula;

import javax.swing.JOptionPane;

public class exemplo {

	public static void main(String[] args) {
		String login,senha;
		int tentativas = 3;
		//Scanner sc = new Scanner(System.in);
		do {
			login = JOptionPane.showInputDialog("Login:");
			senha = JOptionPane.showInputDialog("Senha:");
			//login = sc.next();
			//senha = sc.next();
			if(!login.equals("ifgoiano")|| !senha.equals("1234"))//verificar se errou
				JOptionPane.showMessageDialog(null, "Login ou senha incorreto, restam"+ tentativas--);
			else
				break;
		}while(tentativas>0);
if(tentativas==0)//o usuário gastou todas as tentativas
			JOptionPane.showMessageDialog(null, "Bloqueado");
		else 
			JOptionPane.showMessageDialog(null,"Logado com sucesso");

	}

}
