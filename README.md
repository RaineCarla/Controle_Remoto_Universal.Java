Mi Remote – Controle Universal (Padrão Adapter)

Este projeto implementa um controle remoto universal (Mi Remote) capaz de controlar diferentes dispositivos, como TVs Samsung, TVs LG e Ar-condicionado, usando o padrão estrutural Adapter.
O objetivo é permitir que o controle remoto interaja com APIs de dispositivos com interfaces diferentes, sem precisar conhecer a implementação interna de cada um.

Estrutura do Projeto:

--Interface_ControleUniversal/Controle_Universal.java
Define a interface comum para todos os dispositivos (ligar(), desligar(), aumentarVolume(), diminuirVolume()).


APIs/
--Contém as classes das APIs originais de cada dispositivo:
TvSamsungAPi.java
TV_LG_APi.java
ArCondicionadoApi.java


-- Adapters/
Adaptadores que implementam a interface comum e traduzem as chamadas para cada API:
SamsungAdapter.java
LgAdapter.java
ArCondicionadoAdapter.java
MiRemoteApp.java


Classe cliente que usa a interface Controle_Universal para controlar qualquer dispositivo de forma padronizada.


Main.java
Testa o controle remoto universal com diferentes dispositivos

Linguagens utilizadas: 
Padrões de Projeto,
Java,
POO
