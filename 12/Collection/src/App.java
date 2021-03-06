import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Theater theater = new Theater("Olympian", 8, 12);
        List<Theater.Seat> seatCopy = new ArrayList<>(theater.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if (theater.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

        Collections.shuffle(seatCopy);
        System.out.println("Printin seatCopy");
        printList(seatCopy);
        System.out.println("Printin theater.seat");
        printList(theater.seats);

        Theater.Seat minSeat = Collections.min(seatCopy);
        Theater.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);

        List<Theater.Seat> newList = new ArrayList<>(theater.seats.size());
        Collections.copy(newList, theater.seats);

        // theater.getSeats();
        // if (theater.reserveSeat("B13")) {
        // System.out.println("Please pay");
        // } else {
        // System.out.println("Sorry, seat is taken");
        // }
        // if (theater.reserveSeat("H11")) {
        // System.out.println("Please pay");
        // } else {
        // System.out.println("Sorry, seat is taken");
        // }

        // A排序比B前，A比B前，回傳負值<0
        // A排序比B後，A比B後，回傳正值>0
        // str1<str2: return <0,依字母排序,1排在2前面,在前面的較小,在後面的較大
        // str1>str2: return >0
        // System.out.println("A".compareTo("B"));
        // System.out.println("B".compareTo("A"));
        // System.out.println("1".compareTo("2"));
        // System.out.println("2".compareTo("1"));

    }

    public static void printList(List<Theater.Seat> list) {
        for (Theater.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("============================================================");
    }

    public static void sortList(List<? extends Theater.Seat> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
