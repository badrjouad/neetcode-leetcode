package easy.strings;

import java.util.ArrayList;
import java.util.List;

public class StringMatch {

    public List<String> stringMatching(String[] words) {

        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 1; j < words.length; j++) {
                if (words[i].length() > words[j].length()) {
                    if (words[i].contains(words[j])) {
                        if(!result.contains(words[j]))
                        {
                            result.add(words[j]);
                        }

                    }
                }
            }
        }

        return result;
    }
}
