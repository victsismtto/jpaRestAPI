package com.example.jpa.resources;
import com.example.jpa.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<String> findAll() {

        return ResponseEntity.ok().body("test");
    }
}
