package com.bs.hellogitflow.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class StringServiceTest {
    @InjectMocks
    private StringService stringService;

    @Test()
    @DisplayName("스트링 이어붙이기")
    void test_appendString(){
        //given
        String a = "hello";
        String b = "word";
        //when
        String appendString = stringService.appendString(a, b);
        //then
        Assertions.assertThat(appendString).isEqualTo("helloword");
    }
}