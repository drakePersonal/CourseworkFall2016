package ContentPanes.HomeWork_01;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/****************
 * Created By User 9/5/2016,
 * this is a dumb little table that calls a database
 * I plan to make another window which contains this one later with a full range of reporting options
 * will replace this line with that when done
 ****************/
public class HomeWork_01 extends TableView{

    public  HomeWork_01(){
        TableColumn<Person,String> givenNameColumn = new TableColumn<>("Given Name");
        givenNameColumn.setMinWidth(200);
        givenNameColumn.setCellValueFactory(new PropertyValueFactory<>("givenName"));

        TableColumn<Person,String> lastNameColumn = new TableColumn<>("Last Name");
        lastNameColumn.setMinWidth(200);
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("surName"));

        TableColumn<Person,String> cityColumn = new TableColumn<>("City");
        cityColumn.setMinWidth(200);
        cityColumn.setCellValueFactory(new PropertyValueFactory<>("city"));

        TableColumn<Person,Integer> zipColumn = new TableColumn<>("Zip Code");
        zipColumn.setMinWidth(200);
        zipColumn.setCellValueFactory(new PropertyValueFactory<>("zip"));

        setItems(getPeopleForTable());
        getColumns().addAll(givenNameColumn,lastNameColumn,cityColumn,zipColumn);

    }

    private static ObservableList<Person> getPeopleForTable(){
        ObservableList<Person> people = FXCollections.observableArrayList();
        people.addAll(Query.getPeople());
        return people;
    }
}