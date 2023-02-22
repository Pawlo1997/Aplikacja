package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.nio.file.Paths;
import java.util.List;

public class Main extends Application {

    @Override
    public void stop() {
        System.out.println("In stop");    
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parser parser = new Parser();
        List<Employee> employeeList = parser.parse(ReadFile.read());
        employeeList.forEach(System.out::println);

        TableView tableView = new TableView();

        TableColumn<Employee, String> column1 =
                new TableColumn<>("name");

        column1.setCellValueFactory(
                new PropertyValueFactory<>("name"));


        TableColumn<Employee, String> column2 =
                new TableColumn<>("surname");

        column2.setCellValueFactory(
                new PropertyValueFactory<>("surname"));

        TableColumn<Employee, String> column3 =
                new TableColumn<>("number_phone");

        column3.setCellValueFactory(
                new PropertyValueFactory<>("number_phone"));

        // add column3 jak u gory


        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);
        tableView.getColumns().add(column3);


        for (Employee employee : employeeList) {
            tableView.getItems().add(
                    employee);
        }


        VBox vbox = new VBox(tableView);

        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);

        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
