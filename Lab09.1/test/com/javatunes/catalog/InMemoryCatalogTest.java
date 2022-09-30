package com.javatunes.catalog;

import org.junit.Test;

import static org.junit.Assert.*;

public class InMemoryCatalogTest {

    @Test
    public void findById() {
        MusicItem actual = new InMemoryCatalog().findById(14L);

    }
}