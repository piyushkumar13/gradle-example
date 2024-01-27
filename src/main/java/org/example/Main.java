package org.example;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Piyush Kumar.
 * @since 26/01/24.
 */
public class Main {
    public static void main(String[] args) {

        String name = "Testing";

        boolean notBlank = StringUtils.isNotBlank(name);

        if (notBlank){
            System.out.println("The name is not blank");
        }else {
            System.out.println("The name is blank");
        }

        System.out.println("Hello world!");
    }
}