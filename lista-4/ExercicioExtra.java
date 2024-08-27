import java.util.Scanner;

public class ExercicioExtra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String item1, item2, item3;
        item1 = "Xis Salada";
        item2 = "Xis Frango";
        item3 = "Xis Vegano";
        String adicional1, adicional2, adicional3;
        adicional1 = "Queijo Extra";
        adicional2 = "Cebola Extra";
        adicional3 = "Batata Palha";
        String bebida1, bebida2, bebida3;
        bebida1 = "Coca-cola 2 litros";
        bebida2 = "Guarará 2 litros";
        bebida3 = "Suco de Laranja copo de 500ml";
        int menu = 0;
        float valorItem1, valorItem2, valorItem3, valorAdicional1, valorAdicional2, valorAdicional3, valorBebida1,
                valorBebida2, valorBebida3;
        valorItem1 = 22f;
        valorItem2 = 24f;
        valorItem3 = 20f;
        valorAdicional1 = 3f;
        valorAdicional2 = 1f;
        valorAdicional3 = 2f;
        valorBebida1 = 10f;
        valorBebida2 = 9f;
        valorBebida3 = 6.5f;
        int cardapio = 0;
        float carrinho = 0;
        String extrato = "Extrato: ";

        while (menu != 5 || menu != 2 || menu != 10 || cardapio != 10) {
            System.out.println(
                    "Bem vindo ao BurgueDev!! \nDigite 1 para iniciar seu pedido, 10 para ir para o carrinho, 5 para cancelar");
            menu = in.nextInt();
            if (menu == 5 || menu == 10) {
                break;
            }
            if (menu == 1) {
                System.out.printf(
                        "Cardápio:\nLanches:\n%s R$%.2f\n%s R$%.2f\n%s R$%.2f\nAdicionais:\n%s R$%.2f\n%s R$%.2f\n%s R$%.2f\nBebidas:\n%s R$%.2f\n%s R$%.2f\n%s R$%.2f",
                        item1, valorItem1, item2, valorItem2, item3, valorItem3, adicional1, valorAdicional1,
                        adicional2, valorAdicional2, adicional3, valorAdicional3, bebida1, valorBebida1, bebida2,
                        valorBebida2, bebida3, valorBebida3);
                while (cardapio != 10) {
                    System.out.println(
                            "\nDigite 1 para Xis Salada, 2 para Xis Frango, 3 para Xis Vegano, -1 para ir para bebidas, 10 para ir para o carrinho");
                    cardapio = in.nextInt();
                    if (cardapio == 10 || menu == 2 || menu == 5 || cardapio == 2) {
                        break;
                    }
                    if (cardapio == 1) {
                        carrinho = carrinho + valorItem1;
                        extrato = extrato + item1;
                        System.out.println(
                                "Digite 4 para adicionar Queijo Extra, 5 para Cebola Extra, 6 para Batata Palha, 0 Sem adicionais");
                        cardapio = in.nextInt();
                        if (cardapio == 4) {
                            extrato = extrato + adicional1;
                            carrinho = carrinho + valorAdicional1;
                            System.out.println(
                                    "Digite 1 para continuar comprando, 2 para ver carrinho, 5 para cancelar pedido");
                            menu = in.nextInt();
                        } else if (cardapio == 5) {
                            extrato = extrato + adicional2;
                            carrinho = carrinho + valorAdicional2;
                            System.out.println(
                                    "Digite 1 para continuar comprando, 2 para ver carrinho, 5 para cancelar pedido");
                            menu = in.nextInt();
                        } else if (cardapio == 6) {
                            carrinho = carrinho + valorAdicional3;
                            extrato = extrato + adicional3;
                            System.out.println(
                                    "Digite 1 para continuar comprando, 2 para ver carrinho, 5 para cancelar pedido");
                            menu = in.nextInt();
                        } else if (cardapio == 0) {
                            System.out.println(
                                    "Digite 1 para continuar comprando, 2 para ver carrinho, 5 para cancelar pedido");
                            menu = in.nextInt();
                        }
                    } else if (cardapio == 2) {
                        carrinho = carrinho + valorItem2;
                        extrato = extrato + item2;
                        System.out.println(
                                "Digite 4 para adicionar Queijo Extra, 5 para Cebola Extra, 6 para Batata Palha, 0 Sem adicionais");
                        cardapio = in.nextInt();
                        if (cardapio == 4) {
                            extrato = extrato + adicional1;
                            carrinho = carrinho + valorAdicional1;
                            System.out.println(
                                    "Digite 1 para continuar comprando, 2 para ver carrinho, 5 para cancelar pedido");
                            menu = in.nextInt();
                        } else if (cardapio == 5) {
                            extrato = extrato + adicional2;
                            carrinho = carrinho + valorAdicional2;
                            System.out.println(
                                    "Digite 1 para continuar comprando, 2 para ver carrinho, 5 para cancelar pedido");
                            menu = in.nextInt();
                        } else if (cardapio == 6) {
                            extrato = extrato + adicional3;
                            carrinho = carrinho + valorAdicional3;
                            System.out.println(
                                    "Digite 1 para continuar comprando, 2 para ver carrinho, 5 para cancelar pedido");
                            menu = in.nextInt();
                        } else if (cardapio == 0) {
                            System.out.println(
                                    "Digite 1 para continuar comprando, 2 para ver carrinho, 5 para cancelar pedido");
                            menu = in.nextInt();
                        }
                    } else if (cardapio == 3) {
                        carrinho = carrinho + valorItem3;
                        extrato = extrato + item3;
                        System.out.println(
                                "Digite 4 para adicionar Queijo Extra, 5 para Cebola Extra, 6 para Batata Palha, 0 Sem adicionais");
                        cardapio = in.nextInt();
                        if (cardapio == 4) {
                            extrato = extrato + adicional1;
                            carrinho = carrinho + valorAdicional1;
                            System.out.println(
                                    "Digite 1 para continuar comprando, 2 para ver carrinho, 5 para cancelar pedido");
                            menu = in.nextInt();
                        } else if (cardapio == 5) {
                            extrato = extrato + adicional2;
                            carrinho = carrinho + valorAdicional2;
                            System.out.println(
                                    "Digite 1 para continuar comprando, 2 para ver carrinho, 5 para cancelar pedido");
                            menu = in.nextInt();
                        } else if (cardapio == 6) {
                            extrato = extrato + adicional3;
                            carrinho = carrinho + valorAdicional3;
                            System.out.println(
                                    "Digite 1 para continuar comprando, 2 para ver carrinho, 5 para cancelar pedido");
                            menu = in.nextInt();
                        } else if (cardapio == 0) {
                            System.out.println(
                                    "Digite 1 para continuar comprando, 2 para ver carrinho, 5 para cancelar pedido");
                            menu = in.nextInt();
                        }
                    } else if (menu == 1 || cardapio == -1){
                        System.out.println(
                                "Digite 1 para Coca-cola, 2 para Guaraná, 3 para Suco de Laranja, 0 para voltar ao menu");
                        cardapio = in.nextInt();
                        if (cardapio == 1) {
                            carrinho = carrinho + valorBebida1;
                            extrato = extrato + bebida1;
                        } else if (cardapio == 2) {
                            carrinho = carrinho + valorBebida2;
                            extrato = extrato + bebida2;
                        } else if (cardapio == 3) {
                            carrinho = carrinho + valorBebida3;
                            extrato = extrato + bebida3;
                        }

                    }

                } if (menu == 2){
                    break;
                }
            }
            if (menu == 10 || menu == 2 || cardapio == 10) {
                System.out.printf("Carrinho:\n %s\nValor total:%.2f", extrato, carrinho);
                break;
            }
        }
        in.close();
    }
}
/*
 * 
 * FACA UM PROGRAMA EM JAVA QUE, UTILIZANDO LAÇOS DE REPETIÇÃO, CALCULE O VALOR
 * TOTAL DO LANCHE DA FAMÍLIA
 * PODENDO
 * 
 * - ADICIONAR LANCHE, COM ADICIONAIS
 * - ADICIONAR BEBIDA
 * 
 * É O CARRINHO / RESTAURANTE DO IFOOD
 * 
 * CRIEM UM MINI CARDAPIO, COM PELO MENOS 3 ITENS, 3 ADICIONAIS, E 3 BEBIDAS.
 * CADA ITEM, TEM NOME E PREÇO, NO FINAL
 * QUERO VER UM "EXTRATO" DO PEDIDO + PREÇO TOTAL DO PEDIDO
 */