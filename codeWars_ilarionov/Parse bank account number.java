public class BankAccount {

    public static long parse(final String acctNbr) {

        String[] split = acctNbr.split("\\n");
        String result = "";
        
        for (int i = 0; i < split[0].length(); i += 3) {
            
            switch (split[0].substring(i, i + 3) + split[1].substring(i, i + 3) + split[2].substring(i, i + 3)) {
                case " _ | ||_|": result += "0"; break;
                case "     |  |": result += "1"; break;
                case " _  _||_ ": result += "2"; break;
                case " _  _| _|": result += "3"; break;
                case "   |_|  |": result += "4"; break;
                case " _ |_  _|": result += "5"; break;
                case " _ |_ |_|": result += "6"; break;
                case " _   |  |": result += "7"; break;
                case " _ |_||_|": result += "8"; break;
                case " _ |_| _|": result += "9"; break;
                default: throw new IllegalArgumentException();
            }

        }

        return Long.parseLong(result);
    }
}