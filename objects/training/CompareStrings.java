package com.clouway.objects.training;

/**
 * Created by clouway on 15-5-19.
 */
public class CompareStrings {
    String a="slavi";
    String b="slavq";

    public void compare(){
       if(a.compareTo(b)>0){
           System.out.println(a+" e po golqmo ot "+b);
       }
        else {
           System.out.println(b+" e po golqmo ot "+a);
       }

    }
}
