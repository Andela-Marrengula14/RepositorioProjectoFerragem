/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;

/**
 *
 * @author Aurelio Macie Junior
 */
public class FornecedorBeans {
    private int codigo;
    private String nomeEmpresa;
    private String nomeEntregador;
    private String nrDeIdentificacao;
    private String contacto;
    private String horaDeEntrega;
    private String pesquisa;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nomeEmpresa
     */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * @param nomeEmpresa the nomeEmpresa to set
     */
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    /**
     * @return the nomeEntregador
     */
    public String getNomeEntregador() {
        return nomeEntregador;
    }

    /**
     * @param nomeEntregador the nomeEntregador to set
     */
    public void setNomeEntregador(String nomeEntregador) {
        this.nomeEntregador = nomeEntregador;
    }

    /**
     * @return the nrDeIdentificacao
     */
    public String getNrDeIdentificacao() {
        return nrDeIdentificacao;
    }

    /**
     * @param nrDeIdentificacao the nrDeIdentificacao to set
     */
    public void setNrDeIdentificacao(String nrDeIdentificacao) {
        this.nrDeIdentificacao = nrDeIdentificacao;
    }

    /**
     * @return the contacto
     */
    public String getContacto() {
        return contacto;
    }

    /**
     * @param contacto the contacto to set
     */
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    /**
     * @return the horaDeEntrega
     */
    public String getHoraDeEntrega() {
        return horaDeEntrega;
    }

    /**
     * @param horaDeEntrega the horaDeEntrega to set
     */
    public void setHoraDeEntrega(String horaDeEntrega) {
        this.horaDeEntrega = horaDeEntrega;
    }
}
