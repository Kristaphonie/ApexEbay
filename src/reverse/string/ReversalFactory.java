package reverse.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Chris on 9/11/2015.
 */
public class ReversalFactory {
//    Reverse a string without using existing an existing reversal method in JDK, like �Jacky is a dog� to �ykcaJ si a god� and/or  �Jacky is a dog� to �god a si ykcaJ�

    public List reverseAnyString() {
        final List<String> reverseMe = new ArrayList<>(Arrays.asList("I am going to be reversed")); // I was going to do racecar, but I think that would have been cheating.
        String[] splitList = reverseMe.get(0).split("");
        List<String> count = new ArrayList<>();
        List<String> blah = new ArrayList<>(Arrays.asList(splitList[0]));
        List<String> reversed = new ArrayList<>();

        for (String split : splitList) {
            count.add(split);
            blah.add(split);
        }

        int j = 0;
        for (int i = blah.size() - 1; j < count.size(); i--) {
            reversed.add(splitList[i - 1]);
            blah.remove(i);
            j++;
        }

        return reversed;
    }
}
