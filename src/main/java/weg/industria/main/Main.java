package weg.industria.main;

import weg.industria.service.ServiceApplication;
import weg.industria.view.UserIF;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        while (true){
            int optionMenu = UserIF.menu();
            ServiceApplication.mainFlux(optionMenu);
        }
    }
}