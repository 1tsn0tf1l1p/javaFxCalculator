package app.view;

import app.controller.ButtonController;
import app.controller.DigitButtonPressedController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;

import java.util.Arrays;

public class MainView extends VBox {
    private Button btnAc;
    private Button btnPlusMinus;
    private Button btnPercent;
    private Button btnDivide;
    private Button btnMultiply;
    private Button btnMinus;
    private Button btnPlus;
    private Button btnEqual;
    private Button btnDot;
    private TextField tfResult;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnC;
    private Button btnSin;
    private Button btnCos;
    private Button btnTan;
    private Button btnCot;
    private GridPane gridPaneButtons;
    private ButtonBar buttonBar;

    public MainView() {
        initElements();
        addElements();
        addActions();
        this.requestFocus();
    }

    private void addActions() {
        this.setOnKeyPressed(new DigitButtonPressedController(this));
        ButtonController buttonController = new ButtonController(this);
        Button[] buttons = {btn0, btn1, btn2, btn3, btn4,
                btn5, btn6, btn7, btn8, btn9, btnDivide, btnPercent, btnAc, btnEqual,
                btnPlus, btnPlusMinus, btnDot, btnMultiply, btnMinus};
        Arrays.stream(buttons).forEach(button -> button.setOnAction(buttonController));
    }


    private void addElements() {
        this.setPadding(new Insets(15));
        this.setSpacing(15);
        this.setAlignment(Pos.CENTER);

        gridPaneButtons.setHgap(10);
        gridPaneButtons.setVgap(10);
        gridPaneButtons.setPadding(new Insets(20));
        gridPaneButtons.setAlignment(Pos.CENTER);

        // Add column constraints
        for (int i = 0; i < 5; i++) {
            ColumnConstraints colConst = new ColumnConstraints();
            colConst.setPercentWidth(25);
            gridPaneButtons.getColumnConstraints().add(colConst);
        }

        // Add row constraints
        for (int i = 0; i < 5; i++) {
            RowConstraints rowConst = new RowConstraints();
            rowConst.setPercentHeight(20);
            gridPaneButtons.getRowConstraints().add(rowConst);
        }


        gridPaneButtons.addRow(0, btnC, btnAc, btnPlusMinus, btnPercent, btnDivide);
        gridPaneButtons.addRow(1, btnSin, btn7, btn8, btn9, btnMultiply);
        gridPaneButtons.addRow(2, btnCos, btn4, btn5, btn6, btnMinus);
        gridPaneButtons.addRow(3, btnTan, btn1, btn2, btn3, btnPlus);
        gridPaneButtons.add(btnCot, 0, 4);
        gridPaneButtons.add(btn0, 1, 4, 2, 1);
        gridPaneButtons.add(btnDot, 3, 4);
        gridPaneButtons.add(btnEqual, 4, 4);

        this.getChildren().addAll(tfResult, gridPaneButtons);
    }

    private void initElements() {
        btnAc = new Button("AC");
        btnC = new Button("C");
        btnPlusMinus = new Button("+/-");
        btnPercent = new Button("%");
        btnDivide = new Button("/");
        btnMultiply = new Button("*");
        btnMinus = new Button("-");
        btnPlus = new Button("+");
        btnEqual = new Button("=");
        btnDot = new Button(".");

        btn0 = new Button("0");
        btn1 = new Button("1");
        btn2 = new Button("2");
        btn3 = new Button("3");
        btn4 = new Button("4");
        btn5 = new Button("5");
        btn6 = new Button("6");
        btn7 = new Button("7");
        btn8 = new Button("8");
        btn9 = new Button("9");

        btnSin = new Button("sin");
        btnCos = new Button("cos");
        btnTan = new Button("tan");
        btnCot = new Button("cot");

        Button[] buttons = {btn0, btn1, btn2, btn3, btn4,
                btn5, btn6, btn7, btn8, btn9, btnDivide, btnPercent, btnAc, btnEqual,
                btnPlus, btnPlusMinus, btnDot, btnMultiply, btnMinus, btnC, btnSin, btnCos, btnTan, btnCot};

        Arrays.stream(buttons).forEach(this::buttonConfig);

        tfResult = new TextField();
        tfResult.setEditable(false);
        tfResult.setText("0");
        tfResult.setAlignment(Pos.CENTER_RIGHT);
        tfResult.setPadding(new Insets(10));
        tfResult.setPrefHeight(50);
        tfResult.setStyle("-fx-font-size: 18px;");

        gridPaneButtons = new GridPane();
        buttonBar = new ButtonBar();
    }

    private void buttonConfig(Button button) {
        button.setPadding(new Insets(10));
        button.setMaxWidth(Double.MAX_VALUE);
        button.setMaxHeight(Double.MAX_VALUE);
    }

    public Button getBtnAc() {
        return btnAc;
    }

    public void setBtnAc(Button btnAc) {
        this.btnAc = btnAc;
    }

    public Button getBtnPlusMinus() {
        return btnPlusMinus;
    }

    public void setBtnPlusMinus(Button btnPlusMinus) {
        this.btnPlusMinus = btnPlusMinus;
    }

    public Button getBtnPercent() {
        return btnPercent;
    }

    public void setBtnPercent(Button btnPercent) {
        this.btnPercent = btnPercent;
    }

    public Button getBtnDivide() {
        return btnDivide;
    }

    public void setBtnDivide(Button btnDivide) {
        this.btnDivide = btnDivide;
    }

    public Button getBtnMultiply() {
        return btnMultiply;
    }

    public void setBtnMultiply(Button btnMultiply) {
        this.btnMultiply = btnMultiply;
    }

    public Button getBtnMinus() {
        return btnMinus;
    }

    public void setBtnMinus(Button btnMinus) {
        this.btnMinus = btnMinus;
    }

    public Button getBtnPlus() {
        return btnPlus;
    }

    public void setBtnPlus(Button btnPlus) {
        this.btnPlus = btnPlus;
    }

    public Button getBtnEqual() {
        return btnEqual;
    }

    public void setBtnEqual(Button btnEqual) {
        this.btnEqual = btnEqual;
    }

    public Button getBtnDot() {
        return btnDot;
    }

    public void setBtnDot(Button btnDot) {
        this.btnDot = btnDot;
    }

    public TextField getTfResult() {
        return tfResult;
    }

    public void setTfResult(TextField tfResult) {
        this.tfResult = tfResult;
    }

    public Button getBtn0() {
        return btn0;
    }

    public void setBtn0(Button btn0) {
        this.btn0 = btn0;
    }

    public Button getBtn1() {
        return btn1;
    }

    public void setBtn1(Button btn1) {
        this.btn1 = btn1;
    }

    public Button getBtn2() {
        return btn2;
    }

    public void setBtn2(Button btn2) {
        this.btn2 = btn2;
    }

    public Button getBtn3() {
        return btn3;
    }

    public void setBtn3(Button btn3) {
        this.btn3 = btn3;
    }

    public Button getBtn4() {
        return btn4;
    }

    public void setBtn4(Button btn4) {
        this.btn4 = btn4;
    }

    public Button getBtn5() {
        return btn5;
    }

    public void setBtn5(Button btn5) {
        this.btn5 = btn5;
    }

    public Button getBtn6() {
        return btn6;
    }

    public void setBtn6(Button btn6) {
        this.btn6 = btn6;
    }

    public Button getBtn7() {
        return btn7;
    }

    public void setBtn7(Button btn7) {
        this.btn7 = btn7;
    }

    public Button getBtn8() {
        return btn8;
    }

    public void setBtn8(Button btn8) {
        this.btn8 = btn8;
    }

    public Button getBtn9() {
        return btn9;
    }

    public void setBtn9(Button btn9) {
        this.btn9 = btn9;
    }

    public GridPane getGridPaneButtons() {
        return gridPaneButtons;
    }

    public void setGridPaneButtons(GridPane gridPaneButtons) {
        this.gridPaneButtons = gridPaneButtons;
    }

    public ButtonBar getButtonBar() {
        return buttonBar;
    }

    public void setButtonBar(ButtonBar buttonBar) {
        this.buttonBar = buttonBar;
    }

    public Button getBtnC() {
        return btnC;
    }

    public void setBtnC(Button btnC) {
        this.btnC = btnC;
    }

    public Button getBtnSin() {
        return btnSin;
    }

    public void setBtnSin(Button btnSin) {
        this.btnSin = btnSin;
    }

    public Button getBtnCos() {
        return btnCos;
    }

    public void setBtnCos(Button btnCos) {
        this.btnCos = btnCos;
    }

    public Button getBtnTan() {
        return btnTan;
    }

    public void setBtnTan(Button btnTan) {
        this.btnTan = btnTan;
    }

    public Button getBtnCot() {
        return btnCot;
    }

    public void setBtnCot(Button btnCot) {
        this.btnCot = btnCot;
    }
}