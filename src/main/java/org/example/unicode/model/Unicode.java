package org.example.unicode.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Unicode {
    @Id
    int unicode;
    char bogstav;

    public int getUnicode() {
        return unicode;
    }

    public void setUnicode(int unicode) {
        this.unicode = unicode;
    }

    public char getBogstav() {
        return bogstav;
    }

    public void setBogstav(char bogstav) {
        this.bogstav = bogstav;
    }
}
