package com.qa.works.utils;

import java.util.Random;

public class Helpers {

    public int randomNumber(int size){
       return new Random().nextInt(size);
    }
}
