package com.example.demo;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

public class PopupDialogAction extends AnAction {

    private AnActionEvent event;

    @Override
    public void update(@NotNull AnActionEvent event) {
        Project currentProject = event.getProject();
        event.getPresentation().setEnabledAndVisible(currentProject != null);
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        // Opens first Dialog screen when Tools -> Internal Actions -> UI -> Demos is pressed

        MyDialog dialog = new MyDialog();
        dialog.show();


    }

}
