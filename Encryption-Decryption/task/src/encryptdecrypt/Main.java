package encryptdecrypt;

public class Main {
    public static void main(String[] args) {
        String data = "";
        String mode  = "enc";
        String key = "0";
        for(int i = 0; i < args.length; i++){
            data = args[i].equals("-data") ? args[i+1] : data;
            mode = args[i].equals("-mode") ? args[i + 1] : mode;
            key = args[i].equals("-key") ? args[i+1] : key;
        }
        int keyy = Integer.parseInt(key);

        switch(mode) {
            case "enc":
                char[] chars = data.toCharArray();
                for (int i = 0; i < chars.length; i++) {

                    chars[i] = (char)((int) chars[i] + keyy);
                }
                System.out.println(chars);
                break;
            case "dec":
                char[] charss = data.toCharArray();
                for (int i = 0; i < charss.length; i++) {

                    charss[i] = (char)((int) charss[i] - keyy);
                }
                System.out.println(charss);
                break;
        }
    }
}
