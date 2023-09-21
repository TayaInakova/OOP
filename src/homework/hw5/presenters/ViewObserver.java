package homework.hw5.presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date reservationDate, int tableNo, String name);

    void changeCurrentReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
