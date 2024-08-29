package com.example.a12_110502201;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class A12_110502201_Controller {
    @FXML
    private CheckBox myCheckBox;
    @FXML
    private RadioButton rButton1, rButton2;
    @FXML
    private Label myLabel1, myLabel2, myLabel3, myLabel4;
    @FXML
    private Button myButton;
    @FXML
    private ImageView myImageView;

    // 初始好兩張圖片
    Image imageA = new Image(getClass().getResourceAsStream("small_lonely_1.gif"));
    Image imageB = new Image(getClass().getResourceAsStream("small_lonely_2.gif"));
    boolean isImageB = false;

    // change_1用來切換imageA和imageB，透過isImageB狀態去判斷要切換哪張圖片
    public void change_1(ActionEvent event) {
        if (!isImageB) {
            myImageView.setImage(imageB);
            isImageB = true;
        }
        else {
            myImageView.setImage(imageA);
            isImageB = false;
        }
    }
    // change_2用來控制CheckBox
    public void change_2(ActionEvent event) {
        if (myCheckBox.isSelected()) {
            myLabel2.setText("小孤獨可以瑟瑟 ⌓‿⌓");
        }
        else {
            myLabel2.setText("小孤獨不可以瑟瑟Σ( ° △ °|||)︴");
        }
    }
    // answer用來控制RadioButton
    public void answer(ActionEvent event) {
        if (rButton1.isSelected()) {
            myLabel4.setText("幹你黎明，還我普魯修卡");
        }
        else if (rButton2.isSelected()) {
            myLabel4.setText("阿 ~ 素晴らしい");
        }
    }
}
