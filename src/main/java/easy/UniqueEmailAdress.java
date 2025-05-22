package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAdress {

    public int numUniqueEmails(String[] emails) {

        Set<String> uniqueEmais = new HashSet<>();
        for(String  email : emails)
        {
            String [] splitedEmail = email.split("@");
            String localName = splitedEmail[0];
            String domaineName= splitedEmail[1];

            localName = localName.replace(".", "");
            int indexPlus = localName.indexOf('+');
            if(indexPlus!=-1)
            {
                localName=localName.substring(0,indexPlus);
            }

            String cleanMail = localName+"@"+domaineName;
            uniqueEmais.add(cleanMail);

        }

        for(String s : uniqueEmais)
        {
            System.out.println(s);
        }

        return uniqueEmais.size();

    }
}
