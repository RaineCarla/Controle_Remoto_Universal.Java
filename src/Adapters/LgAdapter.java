package Adapters;

import APIs.TV_LG_APi;
import APIs.TvSamsungAPi;
import Interface_ControleUniversal.Controle_Universal;

public class LgAdapter implements Controle_Universal {
    private final TV_LG_APi tv;

    public LgAdapter (TV_LG_APi tv ){
        this.tv= tv;
    }

    @Override
    public void ligar() {
        tv.ligarTv();
    }

    @Override
    public void desligar() {
        tv.desligarTv();

    }

    @Override
    public void aumentarVolume() {
        tv.aumentarSom();

    }

    @Override
    public void diminuirVolume() {
        tv.reduzirSom();

    }
}
