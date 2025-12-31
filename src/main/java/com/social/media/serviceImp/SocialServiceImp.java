package com.social.media.serviceImp;

import com.social.media.models.SocialUser;
import com.social.media.repository.SocialUserRepository;
import com.social.media.service.SocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SocialServiceImp implements SocialService {

    @Autowired
    SocialUserRepository socialUserRepository;
    @Override
    public List<SocialUser> getAllUsers() {
        return socialUserRepository.findAll();
    }

    @Override
    public SocialUser saveUser(SocialUser socialUser) {
        return socialUserRepository.save(socialUser);
    }

    @Override
    public SocialUser deleteUser(Long id) {

        SocialUser user = socialUserRepository.findById(id)
                        .orElseThrow(()-> new RuntimeException("User not found"));

        socialUserRepository.delete(user);
        return user;
    }


}
