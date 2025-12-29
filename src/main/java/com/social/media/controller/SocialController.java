package com.social.media.controller;

import com.social.media.models.SocialUser;
import com.social.media.serviceImp.SocialServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SocialController {
    @Autowired
   private SocialServiceImp serviceImp;

    @GetMapping("/social/users")
    public ResponseEntity<List<SocialUser>> getUsers(){
        return ResponseEntity.ok(serviceImp.getAllUsers());
    }

    @PostMapping("/social/users")
    public ResponseEntity<SocialUser> saveUser(@RequestBody SocialUser socialUser){
        return new ResponseEntity<>(serviceImp.saveUser(socialUser), HttpStatus.CREATED);
    }
}
