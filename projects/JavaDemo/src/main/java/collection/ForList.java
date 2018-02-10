package collection;

import java.util.*;
import java.util.stream.Collectors;

public class ForList{
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHA");

        List<String> newList=list.stream().map(s -> {
            System.out.println(s);
            return "13123";
        }).collect(Collectors.toList());

        System.out.println("=sss=");
//
//        list.stream().map(s -> {
//            System.out.println(s);
//            return ;
//        });


        //第一种遍历方法使用foreach遍历List
        for (String str : newList) {            //也可以改写for(int i=0;i<list.size();i++)这种形式
            System.out.println(str);
        }

        System.out.println("=========");

        //第二种遍历，把链表变为数组相关的内容进行遍历
        String[] strArray=new String[list.size()];
        list.toArray(strArray);
        for(int i=0;i<strArray.length;i++) //这里也可以改写为  foreach(String str:strArray)这种形式
        {
            System.out.println(strArray[i]);
        }
        System.out.println("=========");
        //第三种遍历 使用迭代器进行相关遍历

        Iterator<String> ite=list.iterator();
        while(ite.hasNext())//判断下一个元素之后有值
        {
            System.out.println(ite.next());
        }
    }
}