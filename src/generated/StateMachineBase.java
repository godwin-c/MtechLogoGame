/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("InfiniteProgress", com.codename1.components.InfiniteProgress.class);
        UIBuilder.registerCustomComponent("CheckBox", com.codename1.ui.CheckBox.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "splash";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("InfiniteProgress", com.codename1.components.InfiniteProgress.class);
        UIBuilder.registerCustomComponent("CheckBox", com.codename1.ui.CheckBox.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "splash");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.Container findContainer4(Component root) {
        return (com.codename1.ui.Container)findByName("Container4", root);
    }

    public com.codename1.ui.Container findContainer4() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer3(Component root) {
        return (com.codename1.ui.Container)findByName("Container3", root);
    }

    public com.codename1.ui.Container findContainer3() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer2(Component root) {
        return (com.codename1.ui.Container)findByName("Container2", root);
    }

    public com.codename1.ui.Container findContainer2() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer1(Component root) {
        return (com.codename1.ui.Container)findByName("Container1", root);
    }

    public com.codename1.ui.Container findContainer1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findSecondLevelLogo(Component root) {
        return (com.codename1.ui.Label)findByName("secondLevelLogo", root);
    }

    public com.codename1.ui.Label findSecondLevelLogo() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("secondLevelLogo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("secondLevelLogo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findLevelOneOptBCheckBox(Component root) {
        return (com.codename1.ui.CheckBox)findByName("levelOneOptBCheckBox", root);
    }

    public com.codename1.ui.CheckBox findLevelOneOptBCheckBox() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("levelOneOptBCheckBox", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("levelOneOptBCheckBox", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findThirdlevelnamelogo(Component root) {
        return (com.codename1.ui.Label)findByName("thirdlevelnamelogo", root);
    }

    public com.codename1.ui.Label findThirdlevelnamelogo() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("thirdlevelnamelogo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("thirdlevelnamelogo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findHelp(Component root) {
        return (com.codename1.ui.Button)findByName("help", root);
    }

    public com.codename1.ui.Button findHelp() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("help", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("help", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findNextButton(Component root) {
        return (com.codename1.ui.Button)findByName("nextButton", root);
    }

    public com.codename1.ui.Button findNextButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("nextButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("nextButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findClearButton(Component root) {
        return (com.codename1.ui.Button)findByName("clearButton", root);
    }

    public com.codename1.ui.Button findClearButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("clearButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("clearButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findSecondLogoNameLabel(Component root) {
        return (com.codename1.ui.Label)findByName("secondLogoNameLabel", root);
    }

    public com.codename1.ui.Label findSecondLogoNameLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("secondLogoNameLabel", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("secondLogoNameLabel", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findClearNameButton(Component root) {
        return (com.codename1.ui.Button)findByName("clearNameButton", root);
    }

    public com.codename1.ui.Button findClearNameButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("clearNameButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("clearNameButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLevelOneLogo(Component root) {
        return (com.codename1.ui.Label)findByName("levelOneLogo", root);
    }

    public com.codename1.ui.Label findLevelOneLogo() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("levelOneLogo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("levelOneLogo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findLettersContainer2(Component root) {
        return (com.codename1.ui.Container)findByName("lettersContainer2", root);
    }

    public com.codename1.ui.Container findLettersContainer2() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("lettersContainer2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("lettersContainer2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findPlayButton(Component root) {
        return (com.codename1.ui.Button)findByName("playButton", root);
    }

    public com.codename1.ui.Button findPlayButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("playButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("playButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findNextnameButton(Component root) {
        return (com.codename1.ui.Button)findByName("nextnameButton", root);
    }

    public com.codename1.ui.Button findNextnameButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("nextnameButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("nextnameButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findLettersContainer(Component root) {
        return (com.codename1.ui.Container)findByName("lettersContainer", root);
    }

    public com.codename1.ui.Container findLettersContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("lettersContainer", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("lettersContainer", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findSubmitNameButton(Component root) {
        return (com.codename1.ui.Button)findByName("submitNameButton", root);
    }

    public com.codename1.ui.Button findSubmitNameButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("submitNameButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("submitNameButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.InfiniteProgress findInfiniteProgress(Component root) {
        return (com.codename1.components.InfiniteProgress)findByName("InfiniteProgress", root);
    }

    public com.codename1.components.InfiniteProgress findInfiniteProgress() {
        com.codename1.components.InfiniteProgress cmp = (com.codename1.components.InfiniteProgress)findByName("InfiniteProgress", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.InfiniteProgress)findByName("InfiniteProgress", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findSubmitButton(Component root) {
        return (com.codename1.ui.Button)findByName("submitButton", root);
    }

    public com.codename1.ui.Button findSubmitButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("submitButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("submitButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findExit(Component root) {
        return (com.codename1.ui.Button)findByName("exit", root);
    }

    public com.codename1.ui.Button findExit() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("exit", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("exit", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findPoint(Component root) {
        return (com.codename1.ui.Button)findByName("point", root);
    }

    public com.codename1.ui.Button findPoint() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("point", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("point", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findThirdlevelLogo(Component root) {
        return (com.codename1.ui.Label)findByName("thirdlevelLogo", root);
    }

    public com.codename1.ui.Label findThirdlevelLogo() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("thirdlevelLogo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("thirdlevelLogo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel(Component root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findObj(Component root) {
        return (com.codename1.ui.Button)findByName("obj", root);
    }

    public com.codename1.ui.Button findObj() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("obj", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("obj", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findFirstLevelRenderer(Component root) {
        return (com.codename1.ui.Container)findByName("firstLevelRenderer", root);
    }

    public com.codename1.ui.Container findFirstLevelRenderer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("firstLevelRenderer", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("firstLevelRenderer", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findLevelOneOptACheckBox(Component root) {
        return (com.codename1.ui.CheckBox)findByName("levelOneOptACheckBox", root);
    }

    public com.codename1.ui.CheckBox findLevelOneOptACheckBox() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("levelOneOptACheckBox", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("levelOneOptACheckBox", aboutToShowThisContainer);
        }
        return cmp;
    }

    protected void exitForm(Form f) {
        if("firstLevelRenderer".equals(f.getName())) {
            exitFirstLevelRenderer(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ThirdLevelForm".equals(f.getName())) {
            exitThirdLevelForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("start".equals(f.getName())) {
            exitStart(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SecondLevelForm".equals(f.getName())) {
            exitSecondLevelForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("play".equals(f.getName())) {
            exitPlay(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("splash".equals(f.getName())) {
            exitSplash(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitFirstLevelRenderer(Form f) {
    }


    protected void exitThirdLevelForm(Form f) {
    }


    protected void exitStart(Form f) {
    }


    protected void exitMain(Form f) {
    }


    protected void exitSecondLevelForm(Form f) {
    }


    protected void exitPlay(Form f) {
    }


    protected void exitSplash(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("firstLevelRenderer".equals(f.getName())) {
            beforeFirstLevelRenderer(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ThirdLevelForm".equals(f.getName())) {
            beforeThirdLevelForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("start".equals(f.getName())) {
            beforeStart(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SecondLevelForm".equals(f.getName())) {
            beforeSecondLevelForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("play".equals(f.getName())) {
            beforePlay(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("splash".equals(f.getName())) {
            beforeSplash(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeFirstLevelRenderer(Form f) {
    }


    protected void beforeThirdLevelForm(Form f) {
    }


    protected void beforeStart(Form f) {
    }


    protected void beforeMain(Form f) {
    }


    protected void beforeSecondLevelForm(Form f) {
    }


    protected void beforePlay(Form f) {
    }


    protected void beforeSplash(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("firstLevelRenderer".equals(c.getName())) {
            beforeContainerFirstLevelRenderer(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ThirdLevelForm".equals(c.getName())) {
            beforeContainerThirdLevelForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("start".equals(c.getName())) {
            beforeContainerStart(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("SecondLevelForm".equals(c.getName())) {
            beforeContainerSecondLevelForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("play".equals(c.getName())) {
            beforeContainerPlay(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("splash".equals(c.getName())) {
            beforeContainerSplash(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerFirstLevelRenderer(Container c) {
    }


    protected void beforeContainerThirdLevelForm(Container c) {
    }


    protected void beforeContainerStart(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }


    protected void beforeContainerSecondLevelForm(Container c) {
    }


    protected void beforeContainerPlay(Container c) {
    }


    protected void beforeContainerSplash(Container c) {
    }

    protected void postShow(Form f) {
        if("firstLevelRenderer".equals(f.getName())) {
            postFirstLevelRenderer(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ThirdLevelForm".equals(f.getName())) {
            postThirdLevelForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("start".equals(f.getName())) {
            postStart(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SecondLevelForm".equals(f.getName())) {
            postSecondLevelForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("play".equals(f.getName())) {
            postPlay(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("splash".equals(f.getName())) {
            postSplash(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postFirstLevelRenderer(Form f) {
    }


    protected void postThirdLevelForm(Form f) {
    }


    protected void postStart(Form f) {
    }


    protected void postMain(Form f) {
    }


    protected void postSecondLevelForm(Form f) {
    }


    protected void postPlay(Form f) {
    }


    protected void postSplash(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("firstLevelRenderer".equals(c.getName())) {
            postContainerFirstLevelRenderer(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ThirdLevelForm".equals(c.getName())) {
            postContainerThirdLevelForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("start".equals(c.getName())) {
            postContainerStart(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("SecondLevelForm".equals(c.getName())) {
            postContainerSecondLevelForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("play".equals(c.getName())) {
            postContainerPlay(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("splash".equals(c.getName())) {
            postContainerSplash(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerFirstLevelRenderer(Container c) {
    }


    protected void postContainerThirdLevelForm(Container c) {
    }


    protected void postContainerStart(Container c) {
    }


    protected void postContainerMain(Container c) {
    }


    protected void postContainerSecondLevelForm(Container c) {
    }


    protected void postContainerPlay(Container c) {
    }


    protected void postContainerSplash(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("firstLevelRenderer".equals(rootName)) {
            onCreateFirstLevelRenderer();
            aboutToShowThisContainer = null;
            return;
        }

        if("ThirdLevelForm".equals(rootName)) {
            onCreateThirdLevelForm();
            aboutToShowThisContainer = null;
            return;
        }

        if("start".equals(rootName)) {
            onCreateStart();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

        if("SecondLevelForm".equals(rootName)) {
            onCreateSecondLevelForm();
            aboutToShowThisContainer = null;
            return;
        }

        if("play".equals(rootName)) {
            onCreatePlay();
            aboutToShowThisContainer = null;
            return;
        }

        if("splash".equals(rootName)) {
            onCreateSplash();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateFirstLevelRenderer() {
    }


    protected void onCreateThirdLevelForm() {
    }


    protected void onCreateStart() {
    }


    protected void onCreateMain() {
    }


    protected void onCreateSecondLevelForm() {
    }


    protected void onCreatePlay() {
    }


    protected void onCreateSplash() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("firstLevelRenderer".equals(f.getName())) {
            getStateFirstLevelRenderer(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("ThirdLevelForm".equals(f.getName())) {
            getStateThirdLevelForm(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("start".equals(f.getName())) {
            getStateStart(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("SecondLevelForm".equals(f.getName())) {
            getStateSecondLevelForm(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("play".equals(f.getName())) {
            getStatePlay(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("splash".equals(f.getName())) {
            getStateSplash(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateFirstLevelRenderer(Form f, Hashtable h) {
    }


    protected void getStateThirdLevelForm(Form f, Hashtable h) {
    }


    protected void getStateStart(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }


    protected void getStateSecondLevelForm(Form f, Hashtable h) {
    }


    protected void getStatePlay(Form f, Hashtable h) {
    }


    protected void getStateSplash(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("firstLevelRenderer".equals(f.getName())) {
            setStateFirstLevelRenderer(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("ThirdLevelForm".equals(f.getName())) {
            setStateThirdLevelForm(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("start".equals(f.getName())) {
            setStateStart(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("SecondLevelForm".equals(f.getName())) {
            setStateSecondLevelForm(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("play".equals(f.getName())) {
            setStatePlay(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("splash".equals(f.getName())) {
            setStateSplash(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateFirstLevelRenderer(Form f, Hashtable state) {
    }


    protected void setStateThirdLevelForm(Form f, Hashtable state) {
    }


    protected void setStateStart(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }


    protected void setStateSecondLevelForm(Form f, Hashtable state) {
    }


    protected void setStatePlay(Form f, Hashtable state) {
    }


    protected void setStateSplash(Form f, Hashtable state) {
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("firstLevelRenderer")) {
            if("levelOneOptACheckBox".equals(c.getName())) {
                onFirstLevelRenderer_LevelOneOptACheckBoxAction(c, event);
                return;
            }
            if("levelOneOptBCheckBox".equals(c.getName())) {
                onFirstLevelRenderer_LevelOneOptBCheckBoxAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("ThirdLevelForm")) {
            if("submitButton".equals(c.getName())) {
                onThirdLevelForm_SubmitButtonAction(c, event);
                return;
            }
            if("clearButton".equals(c.getName())) {
                onThirdLevelForm_ClearButtonAction(c, event);
                return;
            }
            if("nextButton".equals(c.getName())) {
                onThirdLevelForm_NextButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("start")) {
            if("obj".equals(c.getName())) {
                onStart_ObjAction(c, event);
                return;
            }
            if("point".equals(c.getName())) {
                onStart_PointAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("SecondLevelForm")) {
            if("submitNameButton".equals(c.getName())) {
                onSecondLevelForm_SubmitNameButtonAction(c, event);
                return;
            }
            if("clearNameButton".equals(c.getName())) {
                onSecondLevelForm_ClearNameButtonAction(c, event);
                return;
            }
            if("nextnameButton".equals(c.getName())) {
                onSecondLevelForm_NextnameButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("play")) {
            if("help".equals(c.getName())) {
                onPlay_HelpAction(c, event);
                return;
            }
            if("playButton".equals(c.getName())) {
                onPlay_PlayButtonAction(c, event);
                return;
            }
            if("exit".equals(c.getName())) {
                onPlay_ExitAction(c, event);
                return;
            }
        }
    }

      protected void onFirstLevelRenderer_LevelOneOptACheckBoxAction(Component c, ActionEvent event) {
      }

      protected void onFirstLevelRenderer_LevelOneOptBCheckBoxAction(Component c, ActionEvent event) {
      }

      protected void onThirdLevelForm_SubmitButtonAction(Component c, ActionEvent event) {
      }

      protected void onThirdLevelForm_ClearButtonAction(Component c, ActionEvent event) {
      }

      protected void onThirdLevelForm_NextButtonAction(Component c, ActionEvent event) {
      }

      protected void onStart_ObjAction(Component c, ActionEvent event) {
      }

      protected void onStart_PointAction(Component c, ActionEvent event) {
      }

      protected void onSecondLevelForm_SubmitNameButtonAction(Component c, ActionEvent event) {
      }

      protected void onSecondLevelForm_ClearNameButtonAction(Component c, ActionEvent event) {
      }

      protected void onSecondLevelForm_NextnameButtonAction(Component c, ActionEvent event) {
      }

      protected void onPlay_HelpAction(Component c, ActionEvent event) {
      }

      protected void onPlay_PlayButtonAction(Component c, ActionEvent event) {
      }

      protected void onPlay_ExitAction(Component c, ActionEvent event) {
      }

}
