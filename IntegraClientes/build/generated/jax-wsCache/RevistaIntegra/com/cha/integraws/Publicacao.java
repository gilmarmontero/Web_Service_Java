
package com.cha.integraws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de publicacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="publicacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="area_pesquisa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo_publicacao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "publicacao", propOrder = {
    "areaPesquisa",
    "codigoPublicacao",
    "data",
    "titulo"
})
public class Publicacao {

    @XmlElement(name = "area_pesquisa")
    protected String areaPesquisa;
    @XmlElement(name = "codigo_publicacao")
    protected int codigoPublicacao;
    protected String data;
    protected String titulo;

    /**
     * Obtém o valor da propriedade areaPesquisa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaPesquisa() {
        return areaPesquisa;
    }

    /**
     * Define o valor da propriedade areaPesquisa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaPesquisa(String value) {
        this.areaPesquisa = value;
    }

    /**
     * Obtém o valor da propriedade codigoPublicacao.
     * 
     */
    public int getCodigoPublicacao() {
        return codigoPublicacao;
    }

    /**
     * Define o valor da propriedade codigoPublicacao.
     * 
     */
    public void setCodigoPublicacao(int value) {
        this.codigoPublicacao = value;
    }

    /**
     * Obtém o valor da propriedade data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Define o valor da propriedade data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Obtém o valor da propriedade titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o valor da propriedade titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

}
