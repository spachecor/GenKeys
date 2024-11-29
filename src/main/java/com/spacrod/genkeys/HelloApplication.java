package com.spacrod.genkeys;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /* TODO
        * DEBERÁ SER UNA APP QUE GENERE CONTRASEÑAS SEGURAS COMPLEJAS CON LAS SIGUIENTES CARACTERÍSTICAS:
        * - 14 CARACTERES
        * - LETRAS MAYÚSCULAS Y MINÚSCULAS
        * - INCLUIR CARACTERES ESPECIALES + OBLIGATORIO Ñ Y ;
        * - SIN ESPACIOS EN BLANCO
        *
        * DEBERÁ GENERAR CONTRASEÑAS SIMPLES NUMÉRICAS DE LONGITUD A ELEGIR CON NÚMEROS ALEATORIOS
        * */
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}