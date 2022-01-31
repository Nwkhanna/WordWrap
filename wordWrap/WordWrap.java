import java.util.Scanner;

public class WordWrap {
    /* Name: Nikhil Khanna, NetID: 32016772, Lab 1/September 17, 2021, Friday 11:05 AM*/
    static Scanner sc = new Scanner(System.in); // sc is a static so that it can be used across classes and methods.
    public static void main(String[] args) {
        System.out.println(
            "This program will attempt to modify text into specified line widths while keeping blank lines in the process.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for width: ");
        int lineWidth = sc.nextInt();
        System.out.println("Enter your text(please specify the word Stop. on its own line to tell the reader to stop.): ");
        String lineBreak = "\n";
        String buffer = "";
        String bufferOutput = "";
        String line = sc.nextLine();
        while (!line.equals("Stop.")) {
            if (line.equals("")) {
                bufferOutput += buffer;
                buffer = lineBreak + lineBreak;
            }
            Scanner wordScan = new Scanner(line);
            while (wordScan.hasNext()) {
                String words = wordScan.next();
                if (words.length() + buffer.length() <= lineWidth) {
                    buffer += words + " ";
                } else if (words.length() + buffer.length() >= lineWidth) {
                    bufferOutput += buffer + lineBreak;
                    buffer = words + " ";
                } else if (words.length() >= lineWidth) {
                    buffer += lineBreak;
                    buffer += words + lineBreak;
                    bufferOutput = buffer;
                    buffer = "";
                }
            }
            line = sc.nextLine();
        }
        bufferOutput += buffer;
        System.out.print(bufferOutput);
    }
}