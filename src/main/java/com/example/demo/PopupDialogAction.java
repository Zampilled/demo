package com.example.demo;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

public class PopupDialogAction extends AnAction {

    private AnActionEvent event;

    /**
     * Sets if this action should be visible in the user interface
     * @param event Carries information on the invocation place and data available
     */
    @Override
    public void update(@NotNull AnActionEvent event) {
        Project currentProject = event.getProject();
        event.getPresentation().setEnabledAndVisible(currentProject != null);
    }

    /**
     * Opens Dialog
     * <p>
     * Opens first Dialog screen when
     * Tools -> Internal Actions -> UI -> Demos is pressed
     * @param event Carries information on the invocation place
     */
    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        MyDialog dialog = new MyDialog();
        dialog.show();


    }

}
