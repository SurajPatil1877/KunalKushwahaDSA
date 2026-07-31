package linearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Suraj";
        char target = 'S';
        System.out.println(search(name, target));
    }

    //search char in a string
    static boolean search(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        return false;
    }
}
