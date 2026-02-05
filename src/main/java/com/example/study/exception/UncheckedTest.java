package com.example.study.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UncheckedTest {

    static class MyUncheckedException extends RuntimeException{
        public MyUncheckedException(String message) {
            super(message);
        }

        static class Service{
            Repository repository = new Repository();

            public void callCatch(){
                try{
                    repository.call();
                } catch (MyUncheckedException e){
                    log.info("예외 처리, message={}", e.getMessage(), e);
                }
            }

            public void callThrow(){
                repository.call();
            }
        }

        static class Repository{
            public void call(){
                throw new MyUncheckedException("ex");
            }
        }
    }


}
