package Adapters;

import Interface_ControleUniversal.Controle_Universal;

public class MiRemoteApp {
    public final Controle_Universal dispositivo;

    public MiRemoteApp(Controle_Universal dispositivo){
        this.dispositivo= dispositivo;
    }

    public void assistir() {
        dispositivo.ligar();
        dispositivo.aumentarVolume();
        System.out.println("[Mi Remote] Assistindo...");
    }

    public void encerrar() {
        dispositivo.diminuirVolume();
        dispositivo.desligar();
        System.out.println("[Mi Remote] Encerrado.");
    }
}
