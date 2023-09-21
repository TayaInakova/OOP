package homework.hw5.views;

import homework.hw5.models.Table;
import homework.hw5.presenters.View;
import homework.hw5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {


    private ViewObserver observer;

    /**
     * Установить наблюдателя, отслеживающего действия пользователя
     *
     * @param observer наблюдатель
     */
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    public void showTables(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    @Override
    public void showReservationResult(int reservationNo) {
        if (reservationNo > 0) {
            System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationNo);
        } else {
            System.out.println("Не удалось забронировать столик. Попробуйте повторить операцию позже.");
        }
    }

    @Override
    public void showCurrentReservationResult(int reservationNo) {
        if (reservationNo > 0) {
            System.out.printf("Бронь успешно изменена. Новый номер вашей брони: #%d\n", reservationNo);
        } else {
            System.out.println("Не удалось изменить бронь. Попробуйте повторить операцию позже.");
        }
    }

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование столика
     *
     * @param reservationDate дата бронирования
     * @param tableNo         номер столика
     * @param name            Имя
     */
    public void reservationTable(Date reservationDate, int tableNo, String name) {
        if (observer != null) {
            observer.onReservationTable(reservationDate, tableNo, name);
        }
    }

    /**
     * Действие клиента (пользователь нажал на кнопку изменения бронирования), перебронирование столика
     *
     * @param oldReservation  номер старого резерва
     * @param reservationDate дата бронирования
     * @param tableNo         номер столика
     * @param name            имя
     */
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        if (observer != null) {
            observer.changeCurrentReservationTable(oldReservation, reservationDate, tableNo, name);
        }
    }
}
