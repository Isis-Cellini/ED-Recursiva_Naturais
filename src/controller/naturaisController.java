package controller;

public class naturaisController {

	public naturaisController() {
		// TODO Auto-generated constructor stub
	}

	public int somaNat(int quantidade) {
		int valor = 0;
		if (quantidade == 0) { //quando nao houver mais numeros para adicionar
			return 0;
		} else {		
				valor = valor+quantidade;
				quantidade = quantidade -1; //remove um da quantidade de numeros
			}
			return valor + somaNat(quantidade);
		}
	}
