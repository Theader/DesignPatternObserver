package br.com.theader.observer;

import br.com.theader.observer.entities.Cliente;
import br.com.theader.observer.entities.Produto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObserverApplication.class, args);
	}{
		Produto IPhone11 = new Produto("IPhone11",false);
		Produto MotoG7 = new Produto("MotoG7",false);

		Cliente voCliente1 = new Cliente("Thiago");
		Cliente voCliente2 = new Cliente("João");
		Cliente voCliente3 = new Cliente("Natalia");

		IPhone11.RegistrarObserver(voCliente1);
		IPhone11.RegistrarObserver(voCliente2);

		IPhone11.setDisponivel(false);
		IPhone11.setDisponivel(true);

		MotoG7.RegistrarObserver(voCliente3);
		MotoG7.setDisponivel(false);
		MotoG7.setDisponivel(true);
	}

}
