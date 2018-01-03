//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
<<<<<<< HEAD:src/main/java/org/inria/fr/ns/sr/StructureInrias.java
// Toute modification apportÃ©e Ã  ce fichier sera perdue lors de la recompilation du schÃ©ma source. 
// GÃ©nÃ©rÃ© le : 2018.01.02 Ã  05:29:46 PM CET 
=======
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.01.03 à 12:34:40 PM CET 
>>>>>>> c0b9d0b754ce32b736d01570bdbe021aa6447a0e:src/main/java/bastri/org/inria/fr/ns/sr/StructureInrias.java
//


package org.inria.fr.ns.sr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.inria.fr/dsi/si/app/bastri}structureinria" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "structureinria"
})
@XmlRootElement(name = "structureInrias")
public class StructureInrias {

    protected List<Structureinria> structureinria;

    /**
     * Gets the value of the structureinria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structureinria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructureinria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Structureinria }
     * 
     * 
     */
    public List<Structureinria> getStructureinria() {
        if (structureinria == null) {
            structureinria = new ArrayList<Structureinria>();
        }
        return this.structureinria;
    }

}
