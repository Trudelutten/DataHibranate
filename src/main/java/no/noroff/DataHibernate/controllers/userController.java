package no.noroff.DataHibernate.controllers;

import no.noroff.DataHibernate.DataHibernateApplication;
import no.noroff.DataHibernate.jpa.characterclasses;
import no.noroff.DataHibernate.jpa.characters;
import no.noroff.DataHibernate.jpa.players;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class userController {

    /*
    @ResponseBody
    @GetMapping("/players")
    public List<players> displayAllPlayers() {
        System.out.println("Trying to find person: ");
        List<players> playerList = DataHibernateApplication.getAllPlayers();
        return playerList;
    }*/

    @GetMapping("/players")
    public List<players> displayAllPlayers() {
        System.out.println("Trying to find all players: ");
        return DataHibernateApplication.getAllPlayers();
    }

    /*
    @GetMapping("/players/{pid}")
    public List<players> playerGet(@PathVariable int pid) {
        System.out.println("Trying to find person: " + pid);
        List<players> playerList= DataHibernateApplication.selectPlayer(pid);
        return playerList;
    }*/

    @GetMapping("/players/{pid}")
    public players getOnePlayer(@PathVariable int pid) {
        System.out.println("Trying to find player with id: " + pid);
        List<players> playerList= DataHibernateApplication.getAllPlayers();
        for (players p : playerList) {
            if(p.getPlayerId()==pid){
                 return p;            }
        }
        return null;
    }

    @ResponseBody
    @PostMapping("/players/post")
    public players insertNewPerson(@ModelAttribute players p) {
        System.out.println("Player " + p.getPlayerUserName() + " added");
        System.out.println(p.getPlayerId());
        DataHibernateApplication.addPlayer(p);
        return p;
    }

    @GetMapping("/characters")
    public List<characters> getAllCharacter() {
        System.out.println("Trying to find all character.");
        return DataHibernateApplication.getAllCharacters();
    }

    @GetMapping("/characters/{cid}")
    public characters getOneCharacter(@PathVariable int cid) {
        System.out.println("Trying to find character with id: " + cid);
        List<characters> characterList= DataHibernateApplication.getAllCharacters();
        for (characters c : characterList) {
            if(c.getCharacterId()==cid){
                return c;
            }
        }
        return null;
    }

    @PostMapping("/characters/post")
    @ResponseBody
    public characters insertNewCharacter(@ModelAttribute characters c) {
        System.out.println("Character " + c.getCharacterName() + " added");
        System.out.println(c.getPcid());
        DataHibernateApplication.addCharacter(c);
        return c;
    }


    @GetMapping("/characterclasses")
    public List<characterclasses> getAllCharacterClasses() {
        System.out.println("Trying to find all character classes.");
        return DataHibernateApplication.getAllCharacterClasses();
    }

    @GetMapping("/characterclasses/{ccid}")
    public characterclasses getOneCharacterClass(@PathVariable int ccid) {
        System.out.println("Trying to find character class with id: " + ccid);
        List<characterclasses> characterClassList= DataHibernateApplication.getAllCharacterClasses();
        for (characterclasses cc : characterClassList) {
            if(cc.getCcId()==ccid){
                return cc;            }
        }
        return null;
    }

}
