import java.lang.reflect.Array;
import java.util.Random;

public class GameLogic {
    static String noun[] = new String[]{"Man","State","Country","Bed",
            "Sock","Movie","Milk","Mike","David","Fish","Dog","Cat",
            "Monkey","Ship","Babies","Book","Women","City","Rover","Maya",
            "Juice","Van","Computer","Tissue","Hand","Space","Dirt","Boy",
            "Girl","Building","Mountain","Ocean","Website","GPU","CPU","Ram",
            "Tablet","Laptop","Apple","Window","Pickle","Xbox","Playstation" };
    static String verb[] = new String[]{"is","are","were","grow","look","smell","seem","stay",
            "become","remain","taste","turn","broke","act","answer","approve",
            "break","build","eat","edit","enter","play","shop","shout",
            "sneeze","solve","skip","replace","see","zip","doubt","feel",
            "notice","own","recognize","think","like","look","love","hate","fear",
            "can","could","may","might","must","shall","should","would"};
    static String subject[] = new String[]{"coffee","tea","food","pizza","soup","sad",
            "happy","school","dorm","room","big","small","vast","bad",
            "good","soft","scratchy","problems","music","far","nothing","party",
            "people","puppies","zippers","pants","coats","games","things","keys",
            "earbuds","cups","still","shoes","closed","open","late","early"};

    public static String RandomStatement(){
        int ranNoun  = new Random().nextInt(noun.length);
        int ranVerb = new Random().nextInt(verb.length);
        int ranSub = new Random().nextInt(subject.length);

        String rt = noun[ranNoun] + " " + verb[ranVerb] + " " + subject[ranSub];
        return rt;
    }



//might need to comment this out, and I can't remember how java deals with
    //static and such, but this is kind of the idea, then in the server we can call
    //the method how ever many times we want, and label them as BOT.
    public static void main(String args[]){
        for(int i=0; i< 4; i++){
            System.out.println(RandomStatement());
        }
    }
}

