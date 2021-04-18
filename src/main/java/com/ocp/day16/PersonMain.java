package com.ocp.day16;

public class PersonMain {

    public static void main(String[] args) {
        //Double參考型態比較嚴謹要加小數點
        //Person p1 = new Person("Hean", 170.0, 60);
        Person p1 = new Person("Hean", 170.0, 60.0);
        Person p2 = new Person("Hean", 170.0, 60.2);

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        /*
            關於寫為hashCode的屬性的返回值和來自同一類的兩個實例的equals方法的返回值
            ，哪兩個語句是正確的？ （選擇兩個）
            A如果hashCode值不同，則對象可能相等。
            B如果hashCode值相同，則對象必須相等。
            C如果hashCode值相同，則對象可能相等。
            D如果hashCode值不同，則對象必須不相等
            正確答案 C D
         */
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
