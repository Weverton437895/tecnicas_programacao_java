package view;

import modelo.PagamentoCartao;

import modelo.PagamentoDinheiro;

public class Main2 {

	public static void main(String args[]) {
		
	
		  double valorProduto = 100.0;

		  	PagamentoDinheiro pagamentoDinheiro = new PagamentoDinheiro(valorProduto);
	        System.out.println("Pagamento em Dinheiro");
	        System.out.println(pagamentoDinheiro.emitirRecibo());

	        System.out.println();

	        // Pagamento com cartão
	        PagamentoCartao pagamentoCartao = new PagamentoCartao(valorProduto);
	        System.out.println("Pagamento com Cartão");
	        System.out.println(pagamentoCartao.emitirRecibo());
	
	}
}
