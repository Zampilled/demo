package com.example.demo;

import com.intellij.openapi.ui.DialogWrapper;
import javax.annotation.Nullable;

import javax.swing.*;
import java.awt.*;


public class MyDialog extends DialogWrapper {

    // Initializing Dialog Screen
    public MyDialog() {
        super(true);
        setTitle("Editor Chooser");
        init();
    }

    // Removing "Ok" and "Cancel" Buttons
    @Override
    protected Action[] createActions(){
        return new Action[0];
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {


        JPanel dialogPanel = new JPanel(new BorderLayout());

        // Initialization of EMACS button
        JButton emacsButton = new JButton("EMACS");
        emacsButton.setPreferredSize(new Dimension(200,100));
        emacsButton.setFont(new Font("MONOSPACED", Font.BOLD, 40));
        emacsButton.addActionListener(event -> {
            handleClick("https://www.gnu.org/software/emacs/");
        });
        dialogPanel.add(emacsButton, BorderLayout.WEST);

        // Initialization of VI button
        JButton viButton = new JButton("VI");
        viButton.setFont(new Font("MONOSPACED", Font.BOLD, 40));
        viButton.addActionListener(event ->{
            handleClick("https://www.vim.org/");
        });
        viButton.setPreferredSize(new Dimension(200,100));
        dialogPanel.add(viButton, BorderLayout.EAST);

        return dialogPanel;
    }

    // Handles Click of both buttons and opens a web browser
    private void handleClick(String url){
        WebViewer web = new WebViewer(url);
        web.show();
    }

};