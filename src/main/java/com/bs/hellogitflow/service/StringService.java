package com.bs.hellogitflow.service;

import org.springframework.stereotype.Service;

@Service
public class StringService {
    /**
     * 스트링 이어 붙이기
     */
    public String appendString(String a, String b){
        StringBuffer str = new StringBuffer(a);
        str.append(b);
        return str.toString();
    }
}
