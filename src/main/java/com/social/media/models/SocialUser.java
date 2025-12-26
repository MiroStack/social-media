package com.social.media.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

// one to one relationship user -> profile

@Entity
public class SocialUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "user")
    private SocialProfile socialProfile;

    @OneToMany
    private List<Post> posts = new ArrayList<>();
}
