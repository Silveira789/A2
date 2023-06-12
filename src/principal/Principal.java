package principal;

import modelo.Produto;
import modelo.Sabor;
import modelo.TipoUsuario;
import modelo.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args)
    {
        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        Scanner scannerNum = new Scanner(System.in);

        // Validação do usuário
        boolean autenticacao = false;
        Usuario usuarioAtual = null;
        boolean validador = false;

        // Mocke de Usuário
        List<Usuario> usuarios = new ArrayList<>();

        Usuario fulano = new Usuario("Fulano", "123", "33511102", TipoUsuario.ADMIN);
        Usuario sicrano = new Usuario("Sicrano", "321", "33511108", TipoUsuario.USUARIO);

        usuarios.add(fulano);
        usuarios.add(sicrano);

        // Mock de Produto
        List<Produto> produtos = new ArrayList<>();

        Produto bombom = new Produto(1, "Bombom de Chocolate", "Redondo", Sabor.AMARGO, LocalDate.now());
        Produto barra = new Produto(1, "Barra de Chocolate", "Quadrada", Sabor.BRANCO, LocalDate.now());

        produtos.add(bombom);
        produtos.add(barra);


        do
        {
            System.out.println("<--AUTENTICAÇÃO-->");

            System.out.print("Login: ");
            String nomeUsuario = scanner.nextLine();

            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            // Percorrer mocke de Usuários
            for (Usuario user : usuarios) {
                if (user.getLogin().equals(nomeUsuario) && user.getSenha().equals(senha)) {
                    autenticacao = true;
                    usuarioAtual = user;
                }
            }

            if (!autenticacao)
            {
                System.out.println("Dados inválidos! Tente novamente");
            } else if (autenticacao)
            {
                System.out.println("Login com sucesso! Bem vindo, " + usuarioAtual.getLogin() + ".");
                System.out.println(usuarioAtual.getTipoUsuario().getDescricao());
                boolean validarOpcao;

                while (autenticacao) {
                    int opcao;

                    System.out.println("==== Cacau Palmas ==== ");
                    System.out.println("Seja bem vindo.");
                    System.out.println("-----------------------------------");

                    switch (usuarioAtual.getTipoUsuario().name()){
                        case "ADMIN":
                            menuAdmin();
                            System.out.print("Opção: ");
                            opcao = scanner.nextInt();
                            scanner.nextLine();
                            //validarOpcao = true;
                            switch (opcao) {
                                case 1:
                                    System.out.println("Listar produtos");
                                    for (Produto p :
                                            produtos) {
                                        System.out.println(p.getDescricao());
                                    }
                                    break;
                                case 2:
                                    System.out.println("Configurar Perfil");
                                    //changeSettings(currentUser, scanner);
                                    break;

                                case 3:
                                    System.out.println("<-Cadastrar produto->");
                                    Produto novoProduto = new Produto();

                                    System.out.println("Digite o Codigo: ");
                                    novoProduto.setCodigo(scanner.nextInt());

                                    System.out.println("Digite o Descrição: ");
                                    novoProduto.setDescricao(scanner.next());

                                    System.out.println("Digite o Tipo: ");
                                    novoProduto.setTipo(scanner.next());

                                    System.out.println("Digite o sabor:");
                                    Sabor.listarSabores();
                                    int op = -1;
                                    op = scannerNum.nextInt();
                                    novoProduto.setSabor(Sabor.buscarPorId(op));

                                    System.out.println("Digite a data");
                                    String data = scanner.next();
                                    novoProduto.setDataFabricacao(LocalDate.parse(data));


                                    Produto.cadastrarProduto(novoProduto);
                                    break;
                                case 4:
                                    System.out.println("Logout com sucesso. Retornando a tela de login...");
                                    autenticacao = false;
                                    break;
                                default:
                                    System.out.println("Opção invalida. Tente novamente.");
                                    //validarOpcao = false;
                                    break;
                            }
                            break;
                        case "USUARIO":
                            menuUsuario();
                            System.out.print("Opção: ");
                            opcao = scanner.nextInt();
                            scanner.nextLine();
                            //validarOpcao = true;
                            switch (opcao) {
                                case 1:
                                    System.out.println("HI");
                                    //displayProductList();
                                    break;
                                case 2:
                                    System.out.println("Hello");
                                    //changeSettings(currentUser, scanner);
                                    break;
                                case 3:
                                    System.out.println("Logout com sucesso. Retornando a tela de login...");
                                    autenticacao = false;
                                    break;
                                default:
                                    System.out.println("Opção invalida. Tente novamente.");
                                    //validarOpcao = false;
                                    break;
                            }
                            break;
                    }
                    System.out.println("-----------------------------------");

                    // if(usuarioAtual.getPerfil().equals(Perfil.ADMIN)){
                    // }else {
                    // }
                }
            }
//            if (!autenticacao) {
//                System.out.println("Senha ou Login invalidas. Por favor verifique e tente novamente.");
//            }
        } while (!autenticacao);
    }



    // Verificar retirada de IF/Else
    //Refinamento de função

    public static void menuAdmin(){
        System.out.println("Selecione sua opção: ");
        System.out.println("1. Lista de Produtos");
        System.out.println("2. Configurar Perfil");
        System.out.println("3. Cadastrar produto");
        System.out.println("4. Logout");
    }

    public static void menuUsuario(){
        System.out.println("Selecione sua opção: ");
        System.out.println("1. Lista de Produtos");
        System.out.println("2. Configurar Perfil");
        System.out.println("3. Logout");
    }
}








