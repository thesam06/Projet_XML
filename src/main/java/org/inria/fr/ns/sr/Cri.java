//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
<<<<<<< HEAD:src/main/java/org/inria/fr/ns/sr/Cri.java
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.01.02 à 05:29:46 PM CET 
=======
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2018.01.03 � 12:34:40 PM CET 
>>>>>>> c0b9d0b754ce32b736d01570bdbe021aa6447a0e:src/main/java/bastri/org/inria/fr/ns/sr/Cri.java
//


package org.inria.fr.ns.sr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour cri complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="cri"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="siid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cri", propOrder = {
    "value"
})
public class Cri {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "siid")
    protected String siid;

    /**
     * Obtient la valeur de la propri�t� value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * D�finit la valeur de la propri�t� value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propri�t� siid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiid() {
        return siid;
    }

    /**
     * D�finit la valeur de la propri�t� siid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiid(String value) {
        this.siid = value;
    }

}