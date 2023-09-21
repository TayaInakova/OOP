package homework.hw5.presenters;

import homework.hw5.models.Table;

import java.util.Collection;

public interface View {

    void setObserver(ViewObserver observer);

    void showTables(Collection<Table> tables);

    void showReservationResult(int reservationNo);

    void showCurrentReservationResult(int reservationNo);
}
