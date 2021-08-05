package org.famousart.web;

import org.famousart.modele.Tableau;
import org.famousart.modele.TableauRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TableauController {
    @Autowired
    private TableauRepo tableauRepo;
    @RequestMapping("/tableaus")
    public String getTableaux(){
	return "Bienvenue sur Famous Art";
     }
}
