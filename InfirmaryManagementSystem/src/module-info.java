module InfirmaryManagementSystem {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;
	requires java.desktop;
	requires java.sql;

	opens application to javafx.graphics, javafx.fxml;
}