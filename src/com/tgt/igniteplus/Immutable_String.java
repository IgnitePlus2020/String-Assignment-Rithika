//Proof that strings are immutable
//        Comapre s1 and s2
//        Before modifications they are pointing to same object.
//        Once we tried to change the content of the object using ‘s1’,
//        a new object is created in the pool with “JAVAJ2EE” as it’s content and it’s reference is assigned to s1.
//        If the strings are mutable, both s1 and s2 should point to same object even after modification.

package com.tgt.igniteplus;

public class Immutable_String {
    public static void main(String[] args)
    {
        String s1 = "JAVA";
        String s2 = "JAVA";

        System.out.println(s1 == s2);          //Output : true

        System.out.println("Before cncatenation : "+s1);

        s1 = s1 + "J2EE";
        System.out.println("After concatenation : "+s1);

        System.out.println(s1 == s2);         //Output : false
    }
}
