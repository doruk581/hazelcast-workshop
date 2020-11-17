package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BasketService {


    @Cacheable("basketItems")
    public String getBasketInfoById(String id) {
        return retrieveFromDatabase(id);
    }

    public String retrieveFromDatabase(String id){
        try {
            Thread.sleep(5000);
        }catch(Exception e){
            log.error("Exception occurred");
        }

        return "CORRECT WORD";
    }
}
