package lau.miproject.githubrepo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
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
        
    }
}
