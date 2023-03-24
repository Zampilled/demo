package com.example.demo;

import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.jcef.JBCefBrowser;

import javax.annotation.Nullable;
import javax.swing.*;
import java.awt.*;


/**
 * Dialog Screen to view webpages
 */
public class WebViewer extends DialogWrapper {
    private String url;

    /**
     * Initialization of WebViewer and url to use
     * @param url to use for webviewer
     */
    public WebViewer(String url){
        super(true);
        setTitle("Web Viewer");
        this.url = url;
        init();
    }

    /**
     * Removing "Ok" and "Cancel" Buttons
     */
    @Override
    protected Action[] createActions(){
        return new Action[0];
    }

    /**
     * Creates WebView Dialog Screen
     * <p>
     * Creates Dialog screen and adds Browser
     * element to it with required url
     * @return WebView Dialog screen
     */
    // Adds WebView component to Dialog screen
    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        JPanel dialog = new JPanel(new BorderLayout());
        dialog.add(new JBCefBrowser(url).getComponent());

        return dialog;
    }
}