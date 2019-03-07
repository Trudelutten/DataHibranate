package no.noroff.DataHibernate.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "characters")
public class characters implements Serializable {

    public characters() {

    }

    public characters(int pcid, String characterName, int characterLevel, String characterClass) {
        this.cid=cid;
        this.pcid=pcid;
        this.characterName=characterName;
        this.characterLevel=characterLevel;
        this.characterClass=characterClass;
    }

    public int getCharacterId () {
        return cid;
    }


    public int getPcid() {
        return pcid;
    }

    public void setPcid(int pcid) {
        this.pcid = pcid;
    }

    public String getCharacterName () {
        return characterName;
    }

    public void setCharacterName (String characterName) {
        this.characterName = characterName;
    }

    public int getCharacterLevel() {
        return characterLevel;
    }

    public void setCharacterLevel(int characterLevel) {
        this.characterLevel = characterLevel;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    @Override
    public String toString() {
        return cid + "\t" + pcid + "\t" + characterName + "\t" + characterLevel;
    }

    @Id
    @Column(name = "cid", unique = true)
    private int cid;

    @Column(name = "pcid", nullable = false)
    private int pcid;

    @Column(name = "characterName", nullable = false)
    private String characterName;

    @Column(name = "characterLevel", nullable = false)
    private int characterLevel;

    @Column(name = "characterClass", nullable = false)
    private String characterClass;

}
