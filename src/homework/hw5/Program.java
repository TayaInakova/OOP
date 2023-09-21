package homework.hw5;

import homework.hw5.models.TableModel;
import homework.hw5.presenters.BookingPresenter;
import homework.hw5.views.BookingView;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter presenter = new BookingPresenter(model, view);

        presenter.updateTablesUI();

        view.reservationTable(new Date(), 3, "Станислав");

        view.changeReservationTable(5641, new Date(), 4, "Станислав");
    }
}
