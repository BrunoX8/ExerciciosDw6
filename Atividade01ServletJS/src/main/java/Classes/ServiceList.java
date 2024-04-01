package Classes;

import java.util.ArrayList;

public class ServiceList {
	
	public ServiceList()
	{
		
	}

	public ArrayList criaListaServicos()
	{
		ArrayList<Service> listaServicos = new ArrayList();
		Service CortarCabelo = new Service(1,"Corte masculino","Corte de cabelo e barba", 35.0);
		Service PintarCabelo = new Service(2,"Pintar cabelo","Colorir o cabelo de uma cor ou combinação a escolha do cliente.", 30.0);
		Service Depilacao = new Service(3,"Depilacao","Depilação de face, peito, pernas, a escolha do cliente.",50.0);
		Service FazerUnhas = new Service(4, "Fazer Unhas","Pintar, limpar, lixar e ou cortar as unhas do cliente", 20.0);
		Service Maquiagem = new Service(5, "Maquiagem","Passar maquiagem de acordo com o pedido do cliente", 35.00);
		
		listaServicos.add(CortarCabelo);
		listaServicos.add(PintarCabelo);
		listaServicos.add(Depilacao);
		listaServicos.add(FazerUnhas);
		listaServicos.add(Maquiagem);
		
		return listaServicos;
	}
}
