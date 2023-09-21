package homework.hw5.models;

import homework.hw5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class TableModel implements Model {

    private Collection<Table> tables;

    /**
     * Получить список столиков
     */
    public Collection<Table> loadTables() {

        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;
    }

    /**
     * Бронирование столика
     *
     * @param reservationDate дата бронирования
     * @param tableNo         номер столика
     * @param name            имя клиента
     * @return номер резерва
     */
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table t : tables) {
            if (t.getNo() == tableNo) {
                Reservation reservation = new Reservation(reservationDate, name);
                t.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
    }

    /**
     * TODO: Добавить реализацию в рамках выполнения домашней работы
     *
     * @param oldReservation  номер старой брони
     * @param reservationDate дата бронирования
     * @param tableNo         номер столика
     * @param name            имя
     * @return новый номер брони
     */
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        boolean flag = false;
        for (Iterator<Table> iterator = tables.iterator(); iterator.hasNext(); ) {
            Table t = iterator.next();
            if (!t.getReservations().isEmpty()) {
                for (Iterator<Reservation> iterator1 = t.getReservations().iterator(); iterator1.hasNext(); ) {
                    Reservation r = iterator1.next();
                    if (oldReservation == r.getId()) {
                        iterator1.remove();
                        flag = true;
                    }
                }
            }
        }
        if (flag) return reservationTable(reservationDate, tableNo, name);
        else return -1;
    }
}