package Adapters;

import APIs.ArCondicionadoApi;
import Interface_ControleUniversal.Controle_Universal;

public class ArCondicionadoAdapter implements Controle_Universal {

    private final ArCondicionadoApi ar;

    public ArCondicionadoAdapter(ArCondicionadoApi ar) {
        this.ar = ar;
    }

    @Override
    public void ligar() {
        ar.ligarAr();
    }

    @Override
    public void desligar() {
        ar.desligarAr();

    }

    @Override
    public void aumentarVolume() {
        ar.aumentaTemperaturaAr();

    }

    @Override
    public void diminuirVolume() {
        ar.diminuirTemperaturaAr();

    }
}
