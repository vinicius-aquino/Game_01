package rpg;

import java.util.Random;
import java.util.Scanner;

public class games {
	public static void main(String [] args) {
		/*
		String nome, idade,peso,cidade,estado,pais;
		System.out.println("Please write a name: ");
		nome = in.nextLine();//cria uma string eo in.nextLine() vai pegar a informação que digitar.
		System.out.println("Please write your age: ");
		idade = in.nextLine();
		System.out.println("Please write your weight: ");
		peso = in.nextLine();
		System.out.println("Please write your city: ");
		cidade = in.nextLine();
		System.out.println("Please write your state: ");
		estado = in.nextLine();
		System.out.println("Please write your country: ");
		pais = in.nextLine();
		System.out.println("--------------");
		System.out.println("exibindo o resultado: ");//exibindo o nome que eu digitei
		System.out.println("nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("peso: " + peso);
		System.out.println("estado: " + estado);
		System.out.println("cidade: " + cidade);
		System.out.println("pais: " + pais); */
		
		Scanner in = new Scanner(System.in);//serve para pegar alguma informação do sistema com in.
		String nome;
		Random rand = new Random();//gerador de aleatorio
		int vida_inimigo = 100;
		int skill = 50;
		int hit	= rand.nextInt(100);
		int vida_boss = 350;
		int magic_boss = 85;
		int boss_critical = rand.nextInt(200);
		int kill = magic_boss + boss_critical;
		int vida = 250;
		//comparar strings
		//if(nome.equals("fulano")).....faça uma açao
		
		System.out.println("WELCOME TO THE GAME! INSERT YOUR NAME:");
		nome = in.nextLine();
		System.out.println("Bem vindo " +nome);
		System.out.println("Qual direção voce quer ir?(w,s,)");
		String comando = in.nextLine();
		if(comando.equals("w")) {
			System.out.println("Voce esta indo para frente!");
			System.out.println("Um inimigo surgiu o que voce quer fazer?(a=atacar ou f=fugir)");
			comando = in.nextLine();
			if(comando.equals("a")) {
				System.out.println("Voce atacou o inimigo!");
				if(skill >= 50 && hit >= 75) {
					int vida_atual = vida_inimigo - hit;
					System.out.println("Voce deu um dano CRITICO!");
					System.out.println("A vida do inimigo esta em: " +vida_atual);
				}else {
					int vida_atual = vida_inimigo - hit;//preciso criar uma var para mostrar o vida atual do inimigo
					System.out.println("o dano foi de " +hit);
					System.out.println("A vida do inimigo esta em: "+vida_atual);
				}
			}else {
				System.out.println("Voce fugio! GAME OVER");
			}
		}else if(comando.equals("s")) {
			if(vida_boss > 0) {
				System.out.println("Voce esta indo para tras!");
				System.out.println("O BOSS surgiu o que voce quer fazer?(a=atacar ou f=fugir)");
				comando = in.nextLine();
				if(comando.equals("a")) {
					System.out.println("Voce atacou o BOSS!");
					if(skill >= 50 && hit >= 75) {
						int vida_atualb = vida_boss - hit;
						System.out.println("Voce deu um dano CRITICO! e podera atacar novamente");
						System.out.println("A vida do BOSS esta em: " +vida_atualb);
						System.out.println("Ataque novamente com a tecla 'a' ");
						comando = in.nextLine();
						if(comando.equals("a")) {
							vida_atualb --;
							System.out.println("o dano foi de " +hit);
							System.out.println("a vida do BOSS é de " +vida_atualb);
							System.out.println("o BOSS ira te atacar");
							int vida_p = vida - kill;
							if(vida_p < 0) {
								System.out.println("GAME OVER");
							}else {
									System.out.println("o critico do BOSS foi de " +kill);
									System.out.println("voce podera atacar");
									comando = in.nextLine();
									if(comando.equals("a")) {
										vida_atualb --;
										System.out.println("o dano foi de " +hit);
										System.out.println("a vida do BOSS esta em " +vida_atualb);
										System.out.println("o BOSS ira te atacar");
										int vida_m = vida - magic_boss;
										System.out.println("o dano magico do BOSS foi de " +magic_boss);
										System.out.println("a sua vida esta em " +vida_m);
									}else {
										System.out.println("GAME OVER");
									}
								}
							}
						}else {
							int vida_atual = vida_boss - hit;//preciso criar uma var para mostrar o vida atual do inimigo
							System.out.println("o dano foi de " +hit);
							System.out.println("A vida do BOSS esta em: "+vida_atual);
							System.out.println("o BOSS ira te atacar");
							int vida_m = vida - magic_boss;
							System.out.println("o dano do BOSS foi de " +magic_boss);
							System.out.println("a sua vida esta em " +vida_m);
						}
					}else {
						int vida_atual = vida_boss - hit;//preciso criar uma var para mostrar o vida atual do inimigo
						System.out.println("o dano foi de " +hit);
						System.out.println("A vida do BOSS esta em: "+vida_atual);
						System.out.println("o BOSS ira te atacar");
						int vida_m = vida - magic_boss;
						System.out.println("o dano do BOSS foi de " +magic_boss);
						System.out.println("a sua vida esta em " +vida_m);
					}
				}else {
					System.out.println("Voce fugio! GAME OVER");
				}
			}				
	}

}
