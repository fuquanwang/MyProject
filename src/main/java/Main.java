/**
 * Created by Fuquan on 6/20/2015.
 */

import com.fuquan.pojo.People;
import com.fuquan.utils.Utils;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        People p1 = new People("Xiaoming", 25);
        People p2 = new People("Alex", 21);
        People p3 = new People("Niu", 23);

        Map<String, People> friend = Maps.newHashMap();
        friend.put("Good Friend", p2);
        friend.put("OK Friend", p3);

        List<Map<String, People>> friends = Lists.newArrayList(friend);
        p1.setFriends(friends);

        System.out.println(Utils.peopleToJSON(p1));
    }
}
