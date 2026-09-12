package br.com.JavaCommerce.exception;

public class TipoFreteInvalidoException extends RuntimeException {
    /*1. Ela deve herdar de RuntimeException (Unchecked Exception).
2. O construtor dela deve receber uma mensagem e repassar para a classe mãe
(super).
 */
    public TipoFreteInvalidoException(String mensagem){
        super(mensagem);
    }
}
