package com.quytb.util;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SecurityUtils {
    @SuppressWarnings("unchecked")
    public static List<String> getAuthorities(){
        List<String> results = new ArrayList<>();
        List<GrantedAuthority> authorities = (List<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        results = authorities.stream().map(x -> x.getAuthority()).collect(Collectors.toList());
        return results;
    }
}
