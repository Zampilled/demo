package com.example.demo;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.pom.Navigatable;
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
        // Basic Popup to test if action works

        Project currentproject = event.getProject();
        String message = event.getPresentation().getText();
        String title = event.getPresentation().getDescription();
        Messages.showMessageDialog(
                currentproject,
                message,
                title,
                Messages.getInformationIcon()
        );
    }

}
