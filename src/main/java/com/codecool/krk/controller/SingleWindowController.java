package com.codecool.krk.controller;

import com.codecool.krk.fileThread.SingleCopyThread;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SingleWindowController {

    public Label elapsedTime;
    public Button stopButton;

    @FXML
    private Label source;

    @FXML
    public void stopOnAction() {
        SingleCopyThread thread = SingleCopyThread.getSingleThreadByName(source.getText());
        thread.interruptThread();
    }


}