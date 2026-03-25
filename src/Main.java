import APIs.ArCondicionadoApi;
import APIs.TV_LG_APi;
import APIs.TvSamsungAPi;
import Adapters.ArCondicionadoAdapter;
import Adapters.LgAdapter;
import Adapters.MiRemoteApp;
import Adapters.SamsungAdapter;
import Interface_ControleUniversal.Controle_Universal;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------");
        Controle_Universal samsung = new SamsungAdapter(new TvSamsungAPi());
        MiRemoteApp app1 = new MiRemoteApp(samsung);
        app1.assistir();
        app1.encerrar();

        System.out.println("--------------------------------------------");
        Controle_Universal lg = new LgAdapter(new TV_LG_APi());
        MiRemoteApp app2 = new MiRemoteApp(lg);
        app2.assistir();
        app2.encerrar();

        System.out.println("--------------------------------------------");
        Controle_Universal ar_condicionado = new ArCondicionadoAdapter(new ArCondicionadoApi());
        MiRemoteApp app3 = new MiRemoteApp(ar_condicionado);
        app3.assistir();
        app3.encerrar();

        System.out.println("--------------------------------------------");
    }
}
