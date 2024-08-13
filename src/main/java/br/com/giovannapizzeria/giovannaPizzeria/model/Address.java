package br.com.giovannapizzeria.giovannaPizzeria.model;

import lombok.Data;

@Data
public class Address {

    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String Estado;
    private String pais;
    private String cep;

}
