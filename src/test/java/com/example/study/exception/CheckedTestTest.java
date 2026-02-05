package com.example.study.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CheckedTestTest {

    @Test
    void checked_catch(){
        CheckedTest.Service service = new CheckedTest.Service();
        service.callCatch();
    }

    @Test
    void checked_throw(){
        CheckedTest.Service service = new CheckedTest.Service();
        assertThatThrownBy(() -> service.callThrow())
                .isInstanceOf(CheckedTest.MyCheckedException.class);
    }

    @Test
    void unchecked_catch(){
        CheckedTest.Service service = new CheckedTest.Service();
        service.callCatch();
    }

    @Test
    void unchecked_throw(){
        CheckedTest.Service service = new CheckedTest.Service();
        assertThatThrownBy(()->service.callThrow())
                .isInstanceOf(UncheckedTest.class);
    }

}