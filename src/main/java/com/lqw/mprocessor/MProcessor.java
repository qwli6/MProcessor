package com.lqw.mprocessor;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;

public class MProcessor {

    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {

            try {
                UIManager.setLookAndFeel(new FlatDarculaLaf());
            } catch (UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }

            MProcessor mProcessor = new MProcessor();

            mProcessor.initMain();
        });
    }


    public void initMain() {


    }
}
