public class testBreak {

    public static void main(String [] args) {
        int[] someInts = {1, 10, 2, 3, 5, 8, 10};
        int searchTerm = 10;
        for(int oneInt : someInts) {
            if (oneInt == searchTerm) {
                System.out.println("Found it!");
                break;
            }
        }
    }

//    FOR LOOP example
//    int k[] = {1, 1, 2, 3, 5, 8, 13, 21};
//    for(int i : k) {
//        System.out.println(i);
//    }
//

//WHILE LOOP (Rarely used)
//    while (condition) {
//        statement1
//                statement2
//    ...
//    }
//
//DO-WHILE LOOP
//    do {
//        statement1
//                statement2
//    ...
//    } while (condition);
