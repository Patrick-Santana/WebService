package org.example.webservice.resources;

import org.example.webservice.entitites.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {

        User u =  new User(1L, "Karla", "KarlaPrivacy@gmail.com","99999999","1254789");
        return ResponseEntity.ok().body(u);
    }

}
