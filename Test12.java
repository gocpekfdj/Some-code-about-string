package File01;

import java.util.*;
//编写这样一个程序，该程序创建了在某一字符串中出现的字符索引
// （即，哪个字符出现在字符串中的哪个地方）。（提示：使用HashMap）
//Hello world
//{r=[7], d=[9], e=[1], w=[5], H=[0], l=[2, 3, 8], o=[4, 6]}
public class Test12 {
    public static void main(String[]args)throws Exception{
        HashMap map = new HashMap();
        HashSet set = new HashSet();
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();//读取整行数据
        String s1 = s.replace(" ","");//replace 删除掉字符串中所有的空格
        int num;
        num = s1.length();// 得到字符串长度
        for(int i=0;i<num;i++){
            set.add(s1.charAt(i)); //set集合存放所有出现的字符以及字符索引，key 存放索引， value 存放字符

        }
        for(int i=0;i<num;i++){
            map.put(i,s1.charAt(i));//map 集合存放所有出现的字符
        }
        System.out.println(set);
        System.out.println(map);
        ArrayList list = new ArrayList(set); //将运行类型转换为ArrayList,方便遍历
        System.out.println(list);
       Set set1 = map.keySet();
        Iterator iterator = set1.iterator();  //创建一个迭代器，方便map遍历
        System.out.println("num = "+num);
       System.out.print("{");
        num = list.size();
        /*
         * 先循环遍历list集合,在循环内嵌套遍历map的value集合，
         * 如果list中的值与value相等，则输出value对应的key
         *
         */
       try{
           for(int i=0;i<num;i++){

               System.out.print(list.get(i)+"=[");
               iterator = set1.iterator();
               int flag = -1 ;
               while (iterator.hasNext()) {
                   Object next =  iterator.next();
                   if(list.get(i)==map.get(next)){
                       flag++;
                       if(flag!=0)
                           System.out.print(",");
                       System.out.print(next);
                   }
               }
               //System.out.print("i = "+i);
               if(i==(num-1))
               System.out.print("]}");
               else
                   System.out.print("],");

           }

       }catch (Exception e){

       }



    }
}
