package com.structure;

import java.util.Scanner;

public class PM extends MP{

    private Integer spending;

    public PM(Integer spending) {
        super(spending);
    }

    public static boolean getPermission(){
        System.out.print("Give permission to arrest(Yes/No) : ");
        Scanner sc = new Scanner(System.in);
        String permission = sc.next();
        if(permission.equalsIgnoreCase("Yes")){
            return true;
        }

        return false;
    }
}
