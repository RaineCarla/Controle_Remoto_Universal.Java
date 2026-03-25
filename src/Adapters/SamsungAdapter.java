package Adapters;

import APIs.TvSamsungAPi;
import Interface_ControleUniversal.Controle_Universal;

public class SamsungAdapter implements Controle_Universal {

    private final TvSamsungAPi tv;
    public SamsungAdapter(TvSamsungAPi tv ){
        this.tv= tv;
    }

    @Override
    public void ligar() {
        tv.powerOn();

    }

    @Override
    public void desligar() {
        tv.powerOff();

    }

    @Override
    public void aumentarVolume() {
        tv.volumeUp();

    }

    @Override
    public void diminuirVolume() {
        tv.volumeDown();

    }
}
