package com.kopzinski.util;

import java.util.Calendar;
/* teste edit...*/
public class Crono {
  
  private Calendar inicio;
  private String prefixo = "Kop! GFC ";
  private String descricao = "";
  
  public Crono(String descricao) {
    this.descricao = descricao;
    inicio = Calendar.getInstance();
    System.out.println(prefixo + this.descricao + " INICIO");
  }
  
  public void duracao() {
    Long duracao = Calendar.getInstance().getTimeInMillis() - inicio.getTimeInMillis();
    System.out.println(prefixo + this.descricao + " FINAL" + " | Time: (" + duracao + ")");
  }
  
}
