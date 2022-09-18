package Transferencia;

import org.junit.jupiter.api.Test;
import transferencia.Conta;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    Cliente xuxa;

    Cliente silvioSantos;

    Conta contaXuxa;


    @Test
    public void realizarTransacao(){
        xuxa = new Cliente("Xuxa","12345678900","11111111");
        silvioSantos =new Cliente("Silvio Santos", "00987654321","22222222");

        contaXuxa = new Conta("0025", "2254", "2500", xuxa);
        Conta contasilvio = new Conta("0026", "2251", "3500", silvioSantos);

        contaXuxa.realizarTransferencia(1000.00, contasilvio);

        assertEquals( 1500.00, contaXuxa.getSaldo() );
        assertEquals( 4500.00, contasilvio.getSaldo());



    }

}
