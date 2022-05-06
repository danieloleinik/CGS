import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        while(opcao != 9) {

            System.out.println("**** MENU ****");
            System.out.println("(1) Cadastrar Usuário");
            System.out.println("(2) Listar Usuario"); //teste do Daniel na branch listar_usuario_novo
            System.out.println("(3) Deletar Usuário");
            System.out.println("(4) Atualizar Usuário\n"); //corrigido Nicolas
            System.out.println("(9) Sair\n");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

//correcao

            if(opcao == 1) {
                SingletonBD.CadastrarUsuario();
            }
            else if(opcao == 2) {
                SingletonBD.listarUsuarios();
                System.out.println("Voce acabou de listar os usuarios");
            }
            else if(opcao == 3) {
                SingletonBD.deletarUsuario(); //chama deletar usuario apos selecao - thiago
            }
            else if(opcao == 4) {
                SingletonBD.atualizarUsuario();
            }
            else if(opcao == 9) {
                System.exit(0);
            }
            else{
                System.out.println("\n\n\n\n\n\n\n\n\n");
            }
        }
    }
}