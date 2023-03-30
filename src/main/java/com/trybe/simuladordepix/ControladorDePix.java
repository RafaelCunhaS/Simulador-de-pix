package com.trybe.simuladordepix;

import java.io.IOException;

public class ControladorDePix {

  private final ProcessadorDePix processadorDePix;

  public ControladorDePix(ProcessadorDePix processadorDePix) {
    this.processadorDePix = processadorDePix;
  }

  /**
   * Método a ser executado no momento em que a pessoa usuária confirmar a operação de Pix.
   *
   * @param valor Valor em centavos a ser transferido.
   * @param chave Chave Pix do beneficiário da transação.
   *
   * @return Mensagem a ser exibida à pessoa usuária, informando-a sobre o resultado da operação.
   * @throws ErroDePix
   */
  public String aoConfirmarPix(int valor, String chave) {
    try {
      processadorDePix.executarPix(valor, chave);
      return Mensagens.SUCESSO;
    } catch (ErroValorNaoPositivo e) {
      return e.getMessage();
    } catch (ErroChaveEmBranco e) {
      return e.getMessage();
    } catch (ErroSaldoInsuficiente e) {
      return e.getMessage();
    } catch (ErroChaveNaoEncontrada e) {
      return e.getMessage();
    } catch (ErroInterno e) {
      return e.getMessage();
    } catch (IOException e) {
      return "Erro de conexão.";
    } catch (ErroDePix e) {
      return e.getMessage();
    }
  }
}
