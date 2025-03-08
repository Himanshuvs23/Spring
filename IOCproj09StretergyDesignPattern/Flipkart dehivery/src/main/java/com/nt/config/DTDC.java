package com.nt.config;

import org.springframework.stereotype.Component;

@Component("DTDC")
public final class DTDC implements Courier {

    public String delivery (int oid){
        return oid+"order items are delivered by DTDC";
    }

}
