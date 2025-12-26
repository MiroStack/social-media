package com.social.media.models;

import jakarta.persistence.*;

// one-to-one relationship user -> profile

@Entity
public class SocialProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne()
    @JoinColumn(name = "social_user")
    private SocialUser user;
}
