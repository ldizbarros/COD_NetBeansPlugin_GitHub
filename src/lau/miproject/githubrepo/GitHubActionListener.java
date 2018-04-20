package lau.miproject.githubrepo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import org.kohsuke.github.GHCreateRepositoryBuilder;
import org.kohsuke.github.GitHub;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "lau.miproject.githubrepo.GitHubActionListener"
)
@ActionRegistration(
        iconBase = "lau/miproject/githubrepo/github-16.png",
        displayName = "#CTL_GitHubActionListener"
)
@ActionReference(path = "Menu/Versioning", position = 0)
@Messages("CTL_GitHubActionListener=GitHub")
public final class GitHubActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        GitHub github;
        try {
            github = GitHub.connect();
            GHCreateRepositoryBuilder builder;
            builder = github.createRepository("reepo");
            builder.create();
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }
}
