package tstsolo;

import javax.swing.JOptionPane;

public class t1 {
	
	public static void main(String[] args) {
		
	JOptionPane.showInternalMessageDialog(null, "bem vindo a criação de perfil,aqui você pode criar um personagem");
    String  nome = JOptionPane.showInputDialog("escolha seu nome:");
	String  idad = JOptionPane.showInputDialog("escolha sua idade:");
	String classe =  JOptionPane.showInputDialog("escolha sua classe:");
	String raca = JOptionPane.showInputDialog("escolha sua raça:");
	String  din = JOptionPane.showInputDialog("quanto dinheiro você tem?");
	String  fra = JOptionPane.showInputDialog("quantos frag você tem?");
	
	double idade = Double.parseDouble(idad);
	double dinh = Double.parseDouble(din);
	double frag = Double.parseDouble(fra);
	
	double  soma = JOptionPane.showConfirmDialog(null, "deseja somar seus frags e seu dinheiro?");
	soma = frag + dinh; 
	if(soma == 1) {
		JOptionPane.showInternalMessageDialog(null, "resultado da soma: " + soma );
	}else{
		JOptionPane.showInternalMessageDialog(null, "fds kkk");
		JOptionPane.showInternalMessageDialog(null, "resultado da soma: " + soma );
	}

	System.out.println("					perfil						");
	System.out.println("nome:"+nome);
	System.out.println("idade: "+idade+" anos");
	System.out.println("classe: "+classe);
	System.out.println("trabalho: "+raca);
	System.out.println("dinheiro: "+dinh);
	System.out.println("frag: "+frag);
	System.out.println("frag + dinheiro é: "+soma);

	}
}
