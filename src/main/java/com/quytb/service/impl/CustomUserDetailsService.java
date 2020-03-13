package com.quytb.service.impl;

import com.quytb.constant.SystemConstant;
import com.quytb.dto.MyUser;
import com.quytb.entity.UserEntity;
import com.quytb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findOneByUsernameAndStatus(username, SystemConstant.ACTIVE_STATUS);
        if(userEntity == null ){
            throw  new UsernameNotFoundException("User not found");
        }

        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities = userEntity.getRoles().stream().map(x -> new SimpleGrantedAuthority(x.getCode())).collect(Collectors.toList());
        MyUser myUser = new MyUser(userEntity.getUsername(), userEntity.getPassword(),
                         true,true, true, true, authorities);
        myUser.setFullname(userEntity.getFullname());
        return myUser;
    }
}
