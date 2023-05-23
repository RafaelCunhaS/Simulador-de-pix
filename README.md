# Simulador de Pix

Projeto desenvolvido durante a aceleração em Java no curso da Trybe.

O desafio do projeto era simular um processo de transferência bancária via Pix, realizada por meio de um aplicativo mobile. O processo consistia em: a pessoa usuária do aplicativo preenche um valor e uma chave Pix e o aplicativo envia essas informações para o servidor do banco na nuvem. O foco aqui era **tratar os erros que podem acontecer** ao longo desta operação.

O objetivo principal era escrever dois componentes em Java:

1. **Processador de Pix:** é o componente que contém a lógica de negócio da operação. Dadas as entradas (valor e chave Pix), o processador de Pix será responsável por validá-las e enviá-las ao servidor na nuvem, interpretando a resposta recebida.

1. **Controlador de Pix:** é o componente que contém a lógica de apresentação deste fluxo. Ele é responsável por invocar o processador de Pix, passando as informações preenchidas pela pessoa usuária na tela do aplicativo. Também é responsabilidade do componente capturar qualquer erro que possa acontecer durante o processo e informar a pessoa usuária sobre o resultado da operação.

O processador de Pix interage com outros dois componentes:

1. **Conexão:** representa um canal de comunicação entre o aplicativo mobile e o servidor na nuvem. O processador de Pix vai usar uma conexão para enviar os dados de entrada (valor e chave Pix).

1. **Servidor:** é o componente que será utilizado pelo processador de Pix para abrir uma nova conexão com o servidor na nuvem.
