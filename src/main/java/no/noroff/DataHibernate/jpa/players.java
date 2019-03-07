package no.noroff.DataHibernate.jpa;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "players")
public class players implements Serializable {

    /*
    public Map<String, String> charactersforperson = new HashMap<>();

    private void setCharactersForPerson() {
        List<characters> allCharactersList = getAllCharacters(); //To store all the characters in DB
        for (characters c : allCharactersList) {
            if (pid == c.getPcid()) {
                charactersforperson.put(c.getCharacterName(), c.getCharacterClass());
            }
        }
    }

    public Map<String, String> getCharactersForPerson() {
        return charactersforperson;
    }
    */

    public players() {
        //Empty constructor
    }

    public players(String playerFirstName, String playerLastName, String playerUserName, String playerEmailAddress, String playerPassWord) {
        this.playerFirstName = playerFirstName;
        this.playerLastName = playerLastName;
        this.playerUserName = playerUserName;
        this.playerEmailAddress = playerEmailAddress;
        this.playerPassWord = playerPassWord;

        //setCharactersForPerson();

    }


    public int getPlayerId () {
        return pid;
    }

    /*
    public void setId(int pid) {
        this.pid = pid;
    }*/

    public String getPlayerFirstName() {
        return playerFirstName;
    }

    public void setPlayerFirstName(String playerFirstName) {
        this.playerFirstName = playerFirstName;
    }

    public String getPlayerLastName() {
        return playerLastName;
    }

    public void setPlayerLastName(String playerLastName) {
        this.playerLastName = playerLastName;
    }

    public String getPlayerUserName() {
        return playerUserName;
    }

    public void setPlayerUserName(String playerUserName) {
        this.playerUserName = playerUserName;
    }

    public String getPlayerEmailAddress() {
        return playerEmailAddress;
    }

    public void setPlayerEmailAddress(String playerEmailAddress) {
        this.playerEmailAddress = playerEmailAddress;
    }

    public String getPlayerPassWord() {
        return playerPassWord;
    }

    public void setPlayerPassWord(String playerPassWord) {
        this.playerPassWord = playerPassWord;
    }

    @Override
    public String toString() {
        return "Player id: " + pid + "\n" + "Username: " + playerUserName + "\n" + "User Em@il: " + playerEmailAddress +"\n";
    }

    @Id
    @Column(name = "pid", unique = true)
    private int pid;

    @Column(name = "firstName", nullable = true)
    private String playerFirstName;

    @Column(name = "lastName", nullable = true)
    private String playerLastName;

    @Column(name = "userName", nullable = false)
    private String playerUserName;

    @Column(name = "emailAddress", nullable = false)
    private String playerEmailAddress;

    @Column(name = "passWord", nullable = false)
    @JsonIgnore
    private String playerPassWord;

    /*
    @Column(name = "charactersforperson", nullable = false)
    private Map<String, String> charactersforperson;*/

}
