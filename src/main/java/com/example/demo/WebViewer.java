package com.example.demo;

import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.jcef.JBCefBrowser;

import javax.annotation.Nullable;
import javax.swing.*;
import java.awt.*;


// Dialog Screen to view webpages
public class WebViewer extends DialogWrapper {
    private String url;

    // Initialized the WebViewer and adds url to view
    public WebViewer(String url){
        super(true);
        setTitle("Web Viewer");
        this.url = url;
        init();
    }

    // Removing "Ok" and "Cancel" Buttons
    @Override
    protected Action[] createActions(){
        return new Action[0];
    }

    // Adds webview component to Dialog screen
    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        JPanel dialog = new JPanel(new BorderLayout());
        dialog.add(new JBCefBrowser(url).getComponent());

        return dialog;
    }
}