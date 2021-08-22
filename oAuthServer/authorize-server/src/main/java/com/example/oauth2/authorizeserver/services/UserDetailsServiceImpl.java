package com.example.oauth2.authorizeserver.services;

import com.example.oauth2.authorizeserver.models.dtos.CustomUserDetails;
import com.example.oauth2.authorizeserver.models.entities.UserEntity;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Arrays;
import java.util.stream.Collectors;

public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserService userService;

    public UserDetailsServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userService.getUser(UserEntity.builder().username(username).build());

        if(userEntity == null) {
            throw new UsernameNotFoundException("The user not exists. Please check again");
        }

        CustomUserDetails customUserDetails = CustomUserDetails.builder()
                .username(userEntity.getUsername())
                .password(userEntity.getPassword())
                .authorities(Arrays.stream(userEntity.getRoles().split(",")).map(x -> new SimpleGrantedAuthority(x)).collect(Collectors.toList()))
                .accountNonExpired(true)
                .accountNonLocked(true)
                .credentialsNonExpired(true)
                .enabled(true)
                .build();

        return customUserDetails;
    }
}
