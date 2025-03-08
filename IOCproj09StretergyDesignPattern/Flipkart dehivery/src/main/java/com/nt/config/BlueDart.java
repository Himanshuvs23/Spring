package com.nt.config;

import org.springframework.stereotype.Component;

@Component("BDart")
public final class BlueDart implements Courier {
    public String delivery (int oid){
        return oid+"order items are delivered by DTDC";
    }

}
