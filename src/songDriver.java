import java.util.ArrayList;

public class songDriver
{
    public static void main (String[] args)
    {
        // array of hour increments
        String[] hoursInWords = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};

        // array of lyric endings
        String[] endings = {"a frog on a frog tree", "a pair of rollerblades", "a bowl of potato salad", "a fluffy duckling",
                "a personal zamboni", "a plate of sashimi", "a set of pretty pens", "a capybara wearing stilts",
                "a limited edition pillow pet", "a crocodile that breathes fire", "a lifetime supply of chex mix",
                "a friendly dinosaur"};

        System.out.print(createLyric(1, hoursInWords, endings));

    } // end main method

    // brain method to write lyric
    public static String createLyric (int hourNum, String[] hoursInWords, String[] endings)
    {
        String output = "";

        // base case
        if (hourNum == 13)
        {
            output = "";
        }

        // adds the previous lyrics' endings to current lyric
        else
        {
            output = "On the " + hoursInWords[hourNum-1] + " day of Christmas, my true love sent to me, " + endingLyric(hourNum, hoursInWords, endings);
        } // end if more than one hour has passed

        return output;
    } // end createLyric class

    public static String endingLyric (int hourNum, String[] hoursInWords, String[] endings)
    {
        String output = "";
        for (int i = 1; i < hourNum+1; i++)
        {
            if (hourNum == 1)
            {
                output = endings[0] + ".\n";
            }
            else if (i == hourNum)
            {
                output += "and " + endings[hourNum - i] + ".\n";
            }
            else
            {
                output += endings[hourNum - i] + ", ";
            }
        } // end for loop

        output += createLyric(hourNum+1, hoursInWords, endings);

        //System.out.println(createLyric(hourNum+1, hoursInWords, endings));
        return output;
    } // end endingLyric method

} // end songDriver class
