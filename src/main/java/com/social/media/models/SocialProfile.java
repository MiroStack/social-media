package com.social.media.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

// one-to-one relationship user -> profile

@Entity
@Data
public class SocialProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne()
    @JoinColumn(name = "social_user")
    @JsonIgnore
    private SocialUser user;

    private String description;

    public void setUser(SocialUser user) {
        this.user = user;
        if (user.getSocialProfile() != this)
            user.setSocialProfile(this);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
}
