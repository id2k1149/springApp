package org.id2k1149;

import org.springframework.stereotype.Component;

public class JazzMusic implements Music{
    @Override
    public String getSong() {
        return "Soft Jazz";
    }
}
