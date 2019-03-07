package no.noroff.DataHibernate.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "characterclasses")
public class characterclasses implements Serializable {

    public int getCcId() {
        return ccid;
    }

    public String getCharacterClassName() {
        return characterClassName;
    }

    public String getCharacterClassAbility() {
        return characterClassAbility;
    }

    public void setCcId(int ccid) {
        this.ccid = ccid;
    }

    public void setCharacterClassName(String characterClassName) {
        this.characterClassName = characterClassName;
    }

    public void setCharacterClassAbility(String characterClassAbility) {
        this.characterClassAbility = characterClassAbility;
    }

    @Override
    public String toString() {
        return ccid + "\t" + characterClassName + "\t" + characterClassAbility;
    }

    @Id
    @Column(name = "ccid", unique = true)
    private int ccid;

    @Column(name = "characterClassName", nullable = true)
    private String characterClassName;

    @Column(name = "characterClassAbility", nullable = true)
    private String characterClassAbility;

}
