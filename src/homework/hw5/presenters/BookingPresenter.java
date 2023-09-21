package homework.hw5.presenters;

import homework.hw5.models.Table;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final Model model;
    private final View view;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.setObserver(this);
    }

    /**
     * Получить список всех столиков
     */
    public Collection<Table> loadTables() {
        return model.loadTables();
    }

    public void updateTablesUI() {
        view.showTables(loadTables());
    }

    public void updateReservationResultUI(int reservationNo) {
        view.showReservationResult(reservationNo);
    }

    @Override
    public void onReservationTable(Date reservationDate, int tableNo, String name) {
        int reservationNo = model.reservationTable(reservationDate, tableNo, name);
        updateReservationResultUI(reservationNo);
    }

    /**
     * Выводит сообщение об изменении бронирования
     * @param reservationNo номер брони
     */

    public void updateChangeCurrentReservationResultUI(int reservationNo) {
        view.showCurrentReservationResult(reservationNo);
    }

    /**
     *
     * @param oldReservation  номер старой брони
     * @param reservationDate дата бронирования
     * @param tableNo         номер столика
     * @param name            имя
     */
    @Override
    public void changeCurrentReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        int reservationNo = model.changeReservationTable(oldReservation, reservationDate, tableNo, name);
        updateChangeCurrentReservationResultUI(reservationNo);
    }
}
