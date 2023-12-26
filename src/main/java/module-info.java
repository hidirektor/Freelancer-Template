module me.freelance.freelancer {
    requires javafx.controls;
    requires javafx.fxml;


    opens me.freelance.freelancer to javafx.fxml;
    exports me.freelance.freelancer;
    exports me.freelance.freelancer.Screens;
    opens me.freelance.freelancer.Screens to javafx.fxml;
}