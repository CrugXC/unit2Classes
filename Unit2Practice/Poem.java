import java.util.Random;

public class Poem
{
    private String[] articles = {The, “A”};

    private String[] adjectives = {“jealous”, “irritated”, “skeptical”, “bewildered”, “discouraged”, “insignificant”, “inadequate”, “embarrassed”, “overwhelmed”, “daring”, “fascinating”, “amused”, “playful”, “optimistic”, “surprised”, “successful”, “worthwhile”, “valuable”, “discerning”, “confident”, “thankful”, “responsive”, “pensive”, “relaxed”, “sleepy”, “apathetic”, “isolated”, inferior”, “stupid”, “remorseful”, “distant”, “sarcastic”, “frustrated”, “jealous”};

    private String[] noun = {“friend”, “boss”, “co-worker”, “parent”, “child”, “student”, “teacher”, “sister”, “brother”, “mother”, “father”};

    public static void main(String[] args)
    {
        Random r1 = new Random();
        System.out.println(articles[r1.nextInt(1)]);
        System.out.println(adjectives[r1.nextInt(34)]);
        System.out.println(noun[r1.nextInt(11)]);
    }
}
