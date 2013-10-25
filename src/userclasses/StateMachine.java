/**
 * Your application code goes here
 */
package userclasses;

import com.codename1.components.InfiniteProgress;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.Log;
import com.codename1.io.NetworkManager;
import com.codename1.io.Storage;
import com.codename1.io.Util;
import generated.StateMachineBase;
import com.codename1.ui.*;
import com.codename1.ui.animations.CommonTransitions;
import com.codename1.ui.events.*;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.Style;
import com.codename1.ui.util.Resources;
import com.codename1.util.StringUtil;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {

    Vector<Hashtable> vector;
    private Vector<Hashtable> buttons;
    int point;
    String correctAns;
    int count;
    int correct;
    int wrong;
    int score;
    Hashtable ht;
    String buttonPicked;
    private String status;
    private Hashtable<String, String> myHighScores;
    private Vector<Hashtable> allLogos;
    private int beginning;

    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }

    /**
     * this method should be used to initialize variables instead of the
     * constructor/class scope to avoid race conditions
     */
    @Override
    protected void initVars(Resources res) {
        score = 10;
        correct = 0;
        wrong = 0;
        count = 9;
    }

    private void fixImages() {
        Image im = fetchResourceFile().getImage("logo.png");
        Image im1 = fetchResourceFile().getImage("logo1.png");
        Image im2 = fetchResourceFile().getImage("logo2.png");
        Image im3 = fetchResourceFile().getImage("logo3.png");
        Image im4 = fetchResourceFile().getImage("logo4.png");
        Image im5 = fetchResourceFile().getImage("logo5.png");
        Image im6 = fetchResourceFile().getImage("logo6.png");
        Image im7 = fetchResourceFile().getImage("logo7.png");
        Image im8 = fetchResourceFile().getImage("logo8.png");
        Image im9 = fetchResourceFile().getImage("logo9.png");


        Hashtable<String, Object> h = new Hashtable<String, Object>();
        Hashtable<String, Object> h1 = new Hashtable<String, Object>();
        Hashtable<String, Object> h2 = new Hashtable<String, Object>();
        Hashtable<String, Object> h3 = new Hashtable<String, Object>();
        Hashtable<String, Object> h4 = new Hashtable<String, Object>();
        Hashtable<String, Object> h5 = new Hashtable<String, Object>();
        Hashtable<String, Object> h6 = new Hashtable<String, Object>();
        Hashtable<String, Object> h7 = new Hashtable<String, Object>();
        Hashtable<String, Object> h8 = new Hashtable<String, Object>();
        Hashtable<String, Object> h9 = new Hashtable<String, Object>();
        Hashtable<String, Object> h10 = new Hashtable<String, Object>();

        h.put("Image", im);
        h.put("optA", "Superman");
        h.put("optB", "spiderman");
        h.put("correctAns", "Superman");
        h1.put("Image", im1);
        h1.put("optA", "Up Nepa");
        h1.put("optB", "ghost busters");
        h1.put("correctAns", "ghost busters");
        h2.put("Image", im2);
        h2.put("optA", "Excel");
        h2.put("optB", "Notepad");
        h2.put("correctAns", "Excel");
        h3.put("Image", im3);
        h3.put("optA", "diamond");
        h3.put("optB", "silver");
        h3.put("correctAns", "diamond");
        h4.put("Image", im4);
        h4.put("optA", "Kangaroo");
        h4.put("optB", "Puma");
        h4.put("correctAns", "Puma");
        h5.put("Image", im5);
        h5.put("optA", "Stamp");
        h5.put("optB", "Pause");
        h5.put("correctAns", "Stamp");
        h6.put("Image", im6);
        h6.put("optA", "Calvin Klein");
        h6.put("optB", "channel");
        h6.put("correctAns", "channel");
        h7.put("Image", im7);
        h7.put("optA", "ManU");
        h7.put("optB", "Barca");
        h7.put("correctAns", "Barca");
        h8.put("Image", im8);
        h8.put("optA", "WinRar");
        h8.put("optB", "WinZip");
        h8.put("correctAns", "WinZip");
        h9.put("Image", im9);
        h9.put("optA", "nintendo");
        h9.put("optB", "Children");
        h9.put("correctAns", "nintendo");

        vector = new Vector<Hashtable>();
        vector.add(h);
        vector.add(h1);
        vector.add(h2);
        vector.add(h3);
        vector.add(h4);
        vector.add(h5);
        vector.add(h6);
        vector.add(h7);
        vector.add(h8);
        vector.add(h9);
        vector.add(h10);
    }

    private void getLevel() {
//        System.out.println("get level 3");
//        Image im = fetchResourceFile().getImage("logo.png");
//        Image im1 = fetchResourceFile().getImage("logo1.png");
//        Image im2 = fetchResourceFile().getImage("logo2.png");
//        Image im3 = fetchResourceFile().getImage("logo3.png");
//        Image im4 = fetchResourceFile().getImage("logo4.png");
//        Image im5 = fetchResourceFile().getImage("logo5.png");
//        Image im6 = fetchResourceFile().getImage("logo6.png");
//        Image im7 = fetchResourceFile().getImage("logo7.png");
//        Image im8 = fetchResourceFile().getImage("logo8.png");
//        Image im9 = fetchResourceFile().getImage("logo9.png");
//
//
//        Hashtable<String, Object> h = new Hashtable<String, Object>();
//        Hashtable<String, Object> h1 = new Hashtable<String, Object>();
//        Hashtable<String, Object> h2 = new Hashtable<String, Object>();
//        Hashtable<String, Object> h3 = new Hashtable<String, Object>();
//        Hashtable<String, Object> h4 = new Hashtable<String, Object>();
//        Hashtable<String, Object> h5 = new Hashtable<String, Object>();
//        Hashtable<String, Object> h6 = new Hashtable<String, Object>();
//        Hashtable<String, Object> h7 = new Hashtable<String, Object>();
//        Hashtable<String, Object> h8 = new Hashtable<String, Object>();
//        Hashtable<String, Object> h9 = new Hashtable<String, Object>();
//        // Hashtable<String, Object> h10 = new Hashtable<String, Object>();
//
//        h.put("Image", im);
//        h.put("optA", "Superman");
//        h.put("optB", "spiderman");
//        h.put("correctAns", "Superman");
//        h1.put("Image", im1);
//        h1.put("optA", "Up Nepa");
//        h1.put("optB", "ghost busters");
//        h1.put("correctAns", "ghost busters");
//        h2.put("Image", im2);
//        h2.put("optA", "Excel");
//        h2.put("optB", "Notepad");
//        h2.put("correctAns", "Excel");
//        h3.put("Image", im3);
//        h3.put("optA", "diamond");
//        h3.put("optB", "silver");
//        h3.put("correctAns", "diamond");
//        h4.put("Image", im4);
//        h4.put("optA", "Kangaroo");
//        h4.put("optB", "Puma");
//        h4.put("correctAns", "Puma");
//        h5.put("Image", im5);
//        h5.put("optA", "Stamp");
//        h5.put("optB", "Pause");
//        h5.put("correctAns", "Stamp");
//        h6.put("Image", im6);
//        h6.put("optA", "Calvin Klein");
//        h6.put("optB", "channel");
//        h6.put("correctAns", "channel");
//        h7.put("Image", im7);
//        h7.put("optA", "ManU");
//        h7.put("optB", "Barca");
//        h7.put("correctAns", "Barca");
//        h8.put("Image", im8);
//        h8.put("optA", "WinRar");
//        h8.put("optB", "WinZip");
//        h8.put("correctAns", "WinZip");
//        h9.put("Image", im9);
//        h9.put("optA", "nintendo");
//        h9.put("optB", "Children");
//        h9.put("correctAns", "nintendo");
//
//
//        vector = new Vector<Hashtable>();
//        vector.add(h);
//        vector.add(h1);
//        vector.add(h2);
//        vector.add(h3);
//        vector.add(h4);
//        vector.add(h5);
//        vector.add(h6);
//        vector.add(h7);
//        vector.add(h8);
//        vector.add(h9);
        //vector.add(h10);

        String allAlphabeths = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
        Vector<String> ses = new Vector<String>();
        ses = StringUtil.tokenizeString(allAlphabeths, ",");
        Random r = new Random();

        for (int i = 0; i < (allLogos.size() - 1); i++) {
            String newString = "";
            Hashtable hashtable = allLogos.elementAt(i);
            for (int j = 0; j < 3; j++) {
                int siz = r.nextInt(ses.size());
                String string = ses.elementAt(siz);
                System.out.println("the string :" + string);
                System.out.println("the hashtable :" + hashtable.get("correctAns").toString());
                newString = newString + string;
                System.out.println("the new string : " + newString);
            }
            hashtable.put("alteredAns", hashtable.get("correctAns").toString() + newString);
        }

        System.out.println("the new vector _____________" + allLogos);
    }

    @Override
    protected void beforeStart(Form f) {
        Image bgImage = fetchResourceFile().getImage("BG.png");
        f.getStyle().setBgImage(bgImage);
        f.getStyle().setBackgroundType(Style.BACKGROUND_IMAGE_SCALED);
    }

    @Override
    protected void beforePlay(Form f) {
        Storage.getInstance().clearStorage();
        Display.getInstance().unlockOrientation();
        Image bgImage = fetchResourceFile().getImage("BG.png");
        f.getStyle().setBgImage(bgImage);
        f.getStyle().setBackgroundType(Style.BACKGROUND_IMAGE_SCALED);
    }

    @Override
    protected void onStart_ObjAction(Component c, ActionEvent event) {
        Dialog.show("know it all!!!", "You will select the correct logo to be a winner...", "have fun!!", null);
    }

    @Override
    protected void beforeSplash(Form f) {
        Image bgImage = fetchResourceFile().getImage("SplashScreen.jpg");
        f.getStyle().setBgImage(bgImage);
        f.getStyle().setBackgroundType(Style.BACKGROUND_IMAGE_SCALED);
    }

//    @Override
//    protected void onPlay_PlayAction(Component c, ActionEvent event) {
//        System.out.println("started");
//        fixImages();
//        showForm("Main", null);
//
//    }
    @Override
    protected void onPlay_ExitAction(Component c, ActionEvent event) {
        Display.getInstance().exitApplication();
    }

    @Override
    protected void onPlay_HelpAction(Component c, ActionEvent event) {
        showForm("start", null);
    }

    @Override
    protected void beforeMain(Form f) {
        Display.getInstance().lockOrientation(true);
        Image bgImage = fetchResourceFile().getImage("BG.png");
        f.getStyle().setBgImage(bgImage);
        f.getStyle().setBackgroundType(Style.BACKGROUND_IMAGE_SCALED);
        // Container c = findContainer(f);
        //fixImages();
        count = 0;

        ht = allLogos.elementAt(count);

        findContainer2(f).addComponent(addImage(ht.get("option_1").toString(), ht.get("option_2").toString(), ht.get("correctAns").toString(), ht.get("id").toString(), (EncodedImage) ht.get("image"), f));
        count++;

    }

    public Container addImage(final String optA, final String optB, final String CA, String id, EncodedImage en, final Form f) {

        Resources res = fetchResourceFile();
        final Container c = createContainer(res, "firstLevelRenderer");
        Label l = findLevelOneLogo(c);
//        if (!logo_url.endsWith(".jpg")) {
//            logo_url = logo_url + ".jpg";
//        }
//        ImageDownloadService.createImageToStorage(logo_url, l, id, new Dimension(Display.getInstance().getDisplayWidth() / 3, Display.getInstance().getDisplayHeight() / 4));
//        //l.setIcon(image);
//        Image i;
//        try {
//            i = Image.createImage(Storage.getInstance().createInputStream(id));
//            l.setIcon(i.scaledWidth(Display.getInstance().getDisplayWidth() / 3));
//        } catch (IOException ex) {
//            Log.p(ex.getMessage());
//            //Logger.getLogger(StateMachine.class.getName()).log(Level.SEVERE, null, ex);
//        }

        l.setIcon(en);
        System.out.println(optA + " , " + optB + " and " + CA);
        System.out.println("THe corr ans is " + CA);
        findLevelOneOptACheckBox(c).setText(optA);
        findLevelOneOptBCheckBox(c).setText(optB);
        findLevelOneOptACheckBox(c).addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (count == (allLogos.size() - 1)) {
                    Dialog.show("RESULT", "you have successfully finished this section with " + score + " points. moving to the next section", "OK", null);
                    beginning += 21;
                    fetchLogos(String.valueOf(beginning));
                    if (status == null || !"200".equals(status)) {
                        noInternet();
                    } else {
                        if (allLogos == null || allLogos.isEmpty()) {
                            Dialog.show("OoPss!!!", "search returned no logos", "OK", null);
                        } else {
                            fetchLogoImages();
                            showForm("SecondLevelForm", null);
                        }

                    }
                    count = 0;

                } else {
                    if (findLevelOneOptACheckBox(c).isSelected()) {
                        findLevelOneOptBCheckBox(c).setSelected(false);
                        if (findLevelOneOptACheckBox(c).getText().equals(CA)) {


                            //Image rightImage = fetchResourceFile().getImage("right2.jpg");
                            Dialog dlgRight = new Dialog("GOOD,YOU ARE CORRECT");
                            Label l = new Label();
                            //l.setIcon(rightImage);
                            dlgRight.addComponent(l);
                            dlgRight.setTimeout(1000);
                            dlgRight.show();
                            score += 10;
                            count++;
                            System.out.println("count : " + count);
                            System.out.println("vector size :" + allLogos.size());
                            if (count == allLogos.size() - 1) {
                                Dialog.show("RESULT", "you have successfully finished this section with " + score + " points. moving to the next section", "OK", null);

                                beginning += 21;
                                fetchLogos(String.valueOf(beginning));
                                if (status == null || !"200".equals(status)) {
                                    noInternet();
                                } else {
                                    if (allLogos == null || allLogos.isEmpty()) {
                                        Dialog.show("OoPss!!!", "search returned no logos", "OK", null);
                                    } else {
                                        fetchLogoImages();
                                        showForm("SecondLevelForm", null);
                                    }

                                }
                                //showForm("SecondLevelForm", null);
                            } else {
                                for (int i = 0; i < allLogos.size(); i++) {
                                    if (count == i) {
                                        ht = allLogos.elementAt(i);
                                        findContainer2(f).removeAll();
                                        //findContainer2(f).addComponent(addImage((Image) ht.get("Image"), ht.get("optA").toString(), ht.get("optB").toString(), ht.get("correctAns").toString(), f));
                                        findContainer2(f).addComponent(addImage(ht.get("option_1").toString(), ht.get("option_2").toString(), ht.get("correctAns").toString(), ht.get("id").toString(), (EncodedImage) ht.get("image"), f));
                                    }
                                }
                                f.revalidate();
                            }


                        } else {
                            Image wrongImage = fetchResourceFile().getImage("exit.png");
                            Dialog dlgWrong = new Dialog("OHH NO DEAR,YOU ARE WRONG");
                            Label l = new Label();
                            l.setIcon(wrongImage);
                            dlgWrong.addComponent(l);
                            dlgWrong.setTimeout(1000);
                            dlgWrong.show();
                            count++;
                            score -= 10;
                            System.out.println("count : " + count);
                            System.out.println("vector size :" + allLogos.size());
                            if (count == allLogos.size()) {
                                Dialog.show("RESULT", "you have successfully finished this section with " + score + " points. moving to the next section", "OK", null);
                                beginning += 21;
                                fetchLogos(String.valueOf(beginning));
                                if (status == null || !"200".equals(status)) {
                                    noInternet();
                                } else {
                                    if (allLogos == null || allLogos.isEmpty()) {
                                        Dialog.show("OoPss!!!", "search returned no logos", "OK", null);
                                    } else {
                                        fetchLogoImages();
                                        showForm("SecondLevelForm", null);
                                    }

                                }
                                //showForm("SecondLevelForm", null);
                            } else {
                                for (int i = 0; i < allLogos.size(); i++) {
                                    if (count == i) {
                                        ht = allLogos.elementAt(i);
                                        findContainer2(f).removeAll();
                                        //findContainer2(f).addComponent(addImage((Image) ht.get("Image"), ht.get("optA").toString(), ht.get("optB").toString(), ht.get("correctAns").toString(), f));
                                        findContainer2(f).addComponent(addImage(ht.get("option_1").toString(), ht.get("option_2").toString(), ht.get("correctAns").toString(), ht.get("id").toString(), (EncodedImage) ht.get("image"), f));
                                    }
                                }
                                f.revalidate();
                            }

                        }

                    }
                }

            }
        });
        findLevelOneOptBCheckBox(c).addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (count == allLogos.size() - 1) {
                    System.out.println("Congrats");
                    Dialog.show("RESULT", "you have successfully finished this section with " + score + " points. moving to the next section", "OK", null);
                    beginning += 21;
                    fetchLogos(String.valueOf(beginning));
                    if (status == null || !"200".equals(status)) {
                        noInternet();
                    } else {
                        if (allLogos == null || allLogos.isEmpty()) {
                            Dialog.show("OoPss!!!", "search returned no logos", "OK", null);
                        } else {
                            fetchLogoImages();
                            showForm("SecondLevelForm", null);
                        }

                    }
                    //showForm("SecondLevelForm", null);

                } else {
                    if (findLevelOneOptBCheckBox(c).isSelected()) {
                        findLevelOneOptACheckBox(c).setSelected(false);
                        if (findLevelOneOptBCheckBox(c).getText().equals(CA)) {

                            Image rightImage = fetchResourceFile().getImage("right2.jpg");
                            Dialog dlgRight = new Dialog("GOOD,YOU ARE CORRECT");
                            Label l = new Label();
                            l.setIcon(rightImage);
                            dlgRight.addComponent(l);
                            dlgRight.setTimeout(1000);
                            dlgRight.show();
                            count++;
                            correct += 5;
                            score += 10;
                            System.out.println("count : " + count);
                            System.out.println("vector size :" + allLogos.size());
                            if (count == allLogos.size() - 1) {
                                Dialog.show("RESULT", "you have successfully finished this section with " + score + " points. moving to the next section", "OK", null);
                                beginning += 21;
                                fetchLogos(String.valueOf(beginning));
                                if (status == null || !"200".equals(status)) {
                                    noInternet();
                                } else {
                                    if (allLogos == null || allLogos.isEmpty()) {
                                        Dialog.show("OoPss!!!", "search returned no logos", "OK", null);
                                    } else {
                                        fetchLogoImages();
                                        showForm("SecondLevelForm", null);
                                    }

                                }
                                // showForm("SecondLevelForm", null);
                            } else {
                                for (int i = 0; i < allLogos.size(); i++) {
                                    if (count == i) {
                                        ht = allLogos.elementAt(i);
                                        findContainer2(f).removeAll();
                                        //findContainer2(f).addComponent(addImage((Image) ht.get("Image"), ht.get("optA").toString(), ht.get("optB").toString(), ht.get("correctAns").toString(), f));
                                        findContainer2(f).addComponent(addImage(ht.get("option_1").toString(), ht.get("option_2").toString(), ht.get("correctAns").toString(), ht.get("id").toString(), (EncodedImage) ht.get("image"), f));
                                    }
                                }
                                f.revalidate();
                            }

                        } else {
                            Image wrongImage = fetchResourceFile().getImage("exit.png");
                            Dialog dlgWrong = new Dialog("OHH NO DEAR,YOU ARE WRONG");
                            Label l = new Label();
                            l.setIcon(wrongImage);
                            dlgWrong.addComponent(l);
                            dlgWrong.setTimeout(1000);
                            dlgWrong.show();
                            count++;
                            wrong++;
                            score -= 10;
                            System.out.println("count : " + count);
                            System.out.println("vector size :" + allLogos.size());
                            if (count == allLogos.size() - 1) {
                                Dialog.show("RESULT", "you have successfully finished this section with " + score + " points. moving to the next section", "OK", null);
                                beginning += 21;
                                fetchLogos(String.valueOf(beginning));
                                if (status == null || !"200".equals(status)) {
                                    noInternet();
                                } else {
                                    if (allLogos == null || allLogos.isEmpty()) {
                                        Dialog.show("OoPss!!!", "search returned no logos", "OK", null);
                                    } else {
                                        fetchLogoImages();
                                        showForm("SecondLevelForm", null);
                                    }

                                }
                                // showForm("SecondLevelForm", null);
                            } else {
                                for (int i = 0; i < allLogos.size(); i++) {
                                    if (count == i) {
                                        ht = allLogos.elementAt(i);
                                        findContainer2(f).removeAll();
                                        //findContainer2(f).addComponent(addImage((Image) ht.get("Image"), ht.get("optA").toString(), ht.get("optB").toString(), ht.get("correctAns").toString(), f));
                                        findContainer2(f).addComponent(addImage(ht.get("option_1").toString(), ht.get("option_2").toString(), ht.get("correctAns").toString(), ht.get("id").toString(), (EncodedImage) ht.get("image"), f));
                                    }
                                }
                                f.revalidate();
                            }

                        }

                    }
                }
                //;

            }
        });
        return c;
    }

    private void fetchLogos(String startFrom) {
        final ConnectionRequest request = new ConnectionRequest() {
//            @Override
//            protected void readHeaders(Object connection) throws IOException {
//
//                status = getHeader(connection, null);
//                // System.out.println("The status of the connection: " + status);
//            }
//            //*****************
            @Override
            protected void readResponse(InputStream input) throws IOException {

                status = String.valueOf(getResponseCode());
                //Storage.getInstance().createOutputStream(name)
                try {
                    JSONParser p = new JSONParser();
                    // p = StringUtil.replaceAll(p, "\\n", "\n");
                    InputStreamReader inp = new InputStreamReader(input);
                    Hashtable h = p.parse(inp);//StringUtil.replaceAll(h.get("root"), "\n\n", "\n")
                    allLogos = (Vector<Hashtable>) h.get("root");
                    System.out.println("All Logos : " + allLogos);
                } catch (Exception e) {
                    Dialog.show("Error Encountered", e.getMessage(), "OK", null);
                }
            }
        };


        final NetworkManager manager = NetworkManager.getInstance();
        Command c = new Command("Cancel") {
            @Override
            public void actionPerformed(ActionEvent evt) {
                //killNetworkAccess();
                ((Dialog) Display.getInstance().getCurrent()).dispose();
                manager.killAndWait(request);
            }
        };

        InfiniteProgress ip = new InfiniteProgress();
        //Dialog dlg = ip.showInifiniteBlocking();
        Dialog d = new Dialog();
        d.setDialogUIID("Container");
        d.setLayout(new BorderLayout());
        Container cnt = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        Label l = new Label("fetching...");
        l.getStyle().getBgTransparency();
        cnt.addComponent(l);
        cnt.addComponent(ip);
        d.addComponent(BorderLayout.CENTER, cnt);
        d.setTransitionInAnimator(CommonTransitions.createEmpty());
        d.setTransitionOutAnimator(CommonTransitions.createEmpty());
        d.showPacked(BorderLayout.CENTER, false);
        d.setBackCommand(c);

        String url = "http://107.20.244.125/logogame/index.php?startfrom=" + startFrom;
        request.setUrl(url);

        request.setFailSilently(true);//stops user from seeing error message on failure
        request.setPost(false);
        request.setDuplicateSupported(true);
        //request.setTimeout(2000);
        request.setDisposeOnCompletion(d);


        //NetworkManager manager = NetworkManager.getInstance();
        manager.start();
        manager.setTimeout(2000);
        manager.addToQueueAndWait(request);
    }

    private void fetchLogoImages() {
        final Vector<Hashtable> imvec = new Vector<Hashtable>();
        for (int i = 0; i < allLogos.size(); i++) {
            final Hashtable hashtable = allLogos.elementAt(i);

            ConnectionRequest r = new ConnectionRequest() {
                @Override
                protected void readResponse(InputStream input) throws IOException {
                    EncodedImage en = EncodedImage.create(input);
                    Hashtable h = new Hashtable();
                    h.put("correctAns", hashtable.get("correctAns").toString());
                    h.put("option_1", hashtable.get("option_1").toString());
                    h.put("option_2", hashtable.get("option_2").toString());
                    h.put("id", hashtable.get("id").toString());
                    h.put("image", en);

                    imvec.add(h);

//                    OutputStream o = Storage.getInstance().createOutputStream(hashtable.get("id").toString());
//                    Util.copy(input, o);
//                    Util.cleanup(o);//close(o);
                }
            };

            InfiniteProgress ip = new InfiniteProgress();
            //Dialog dlg = ip.showInifiniteBlocking();
            Dialog d = new Dialog();
            d.setDialogUIID("Container");
            d.setLayout(new BorderLayout());
            Container cnt = new Container(new BoxLayout(BoxLayout.Y_AXIS));
            Label l = new Label("loading images......please wait.");
            l.getStyle().getBgTransparency();
            cnt.addComponent(l);
            cnt.addComponent(ip);
            d.addComponent(BorderLayout.CENTER, cnt);
            d.setTransitionInAnimator(CommonTransitions.createEmpty());
            d.setTransitionOutAnimator(CommonTransitions.createEmpty());
            d.showPacked(BorderLayout.CENTER, false);

            String url;
            if (!hashtable.get("logo_url").toString().endsWith(".jpg")) {
                url = hashtable.get("logo_url").toString() + ".jpg";
            } else {
                url = hashtable.get("logo_url").toString();
            }

            r.setPost(false);
            r.setUrl(url);//RL("...");
            r.setDisposeOnCompletion(d);
            NetworkManager.getInstance().addToQueueAndWait(r);

        }

        if (!imvec.isEmpty()) {
            allLogos = imvec;
//            try {
////                Storage.getInstance().writeObject("myLogos", imvec);
//                allLogos.clear();
//                allLogos = imvec;
//                imvec.clear();
//            } catch (Exception e) {
//                Log.p("error occured storing the image folder '" + e.getMessage() + "'");
//            }
        }
    }

    @Override
    protected void onPlay_PlayButtonAction(Component c, ActionEvent event) {
        System.out.println("started");
        // downloadImage();
        beginning = 0;
        fetchLogos(String.valueOf(beginning));
        if (status == null || !"200".equals(status)) {
            noInternet();
        } else {
            if (allLogos == null || allLogos.isEmpty()) {
                Dialog.show("OoPss!!!", "search returned no logos", "OK", null);
            } else {
                fetchLogoImages();
                showForm("Main", null);
            }

        }
//        fixImages();
//        showForm("Main", null);

    }

    private void noInternet() {
        Dialog dlg = new Dialog();
        TextArea text = new TextArea("looks like you are not connected to the internet");
        text.setEditable(false);
        dlg.addComponent(text);
        dlg.setTimeout(3000);
        dlg.show();
    }

    @Override
    protected void beforeSecondLevelForm(final Form f) {
        Display.getInstance().lockOrientation(true);
        buttons = new Vector<Hashtable>();
        Image bgImage = fetchResourceFile().getImage("BG.png");
        f.getStyle().setBgImage(bgImage);
        f.getStyle().setBackgroundType(Style.BACKGROUND_IMAGE_SCALED);


        point = 0;
        Hashtable h = new Hashtable();
        for (int i = 0; i < allLogos.size(); i++) {

            if (i == point) {
                h = allLogos.elementAt(i);
                System.out.println(h);
                String name = ((String) h.get("correctAns")).toLowerCase();
                String id = (String) h.get("id");
                Image image = (Image) h.get("image");
//                try {
//                    image = Image.createImage(Storage.getInstance().createInputStream(id));
//                    //l.setIcon(i.scaledWidth(Display.getInstance().getDisplayWidth() / 3));
//                    findSecondLevelLogo(f).setIcon(image.scaledWidth(Display.getInstance().getDisplayWidth() / 3));
//                } catch (IOException ex) {
//                    Log.p(ex.getMessage());
//                    System.out.println("Image Not found ");
//                    //Logger.getLogger(StateMachine.class.getName()).log(Level.SEVERE, null, ex);
//                }
                findSecondLevelLogo(f).setIcon(image.scaledWidth(Display.getInstance().getDisplayWidth() / 3));

                correctAns = (String) h.get("correctAns");
                Vector<String> nam = new Vector<String>();
                for (int j = 0; j < name.length(); j++) {
                    nam.add(String.valueOf(name.charAt(j)));
                }
                Collections.shuffle(nam);
                //final 
                for (int k = 0; k < nam.size(); k++) {
                    final Button b = new Button();
                    b.setText((String) nam.elementAt(k));
                    b.setName(String.valueOf(k));

                    b.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent evt) {
                            Hashtable hash = new Hashtable();
                            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                            findSecondLogoNameLabel(f).setText(findSecondLogoNameLabel(f).getText() + b.getText());
                            buttonPicked = b.getName();
                            hash.put("id", b.getName());
                            hash.put("text", b.getText());
                            buttons.add(hash);
                            b.setEnabled(false);
                            f.revalidate();
                        }
                    });

                    findLettersContainer2(f).addComponent(b);
                    f.revalidate();
                }
            }

        }

        Command hom = new Command("Home") {
            @Override
            public void actionPerformed(ActionEvent evt) {
                //super.actionPerformed(evt); //To change body of generated methods, choose Tools | Templates.
                showForm("play", null);
            }
        };
        f.addCommand(hom);
        f.setBackCommand(hom);

    }

    @Override
    protected void onSecondLevelForm_ClearNameButtonAction(Component c, ActionEvent event) {
        //findSecondLogoNameLabel(c.getComponentForm()).
        if (buttons != null && (buttons.size() > 0)) {
            Hashtable h = buttons.lastElement();
            buttonPicked = h.get("id").toString();
            System.out.println("button picked :::::" + buttonPicked);
        }
        if ((findSecondLogoNameLabel(c.getComponentForm()).getText().length()) > 0) {
            findSecondLogoNameLabel(c.getComponentForm()).setText(findSecondLogoNameLabel(c.getComponentForm()).getText().substring(0, findSecondLogoNameLabel(c.getComponentForm()).getText().length() - 1));
        }
        Container c1 = findLettersContainer2(c.getComponentForm());
        int comps = c1.getComponentCount();
        if (buttonPicked != null) {
            System.out.println("button picked last :" + buttonPicked);
            for (int i = 0; i < comps; i++) {
                System.out.println("components at ------");
                System.out.println(c1.getComponentAt(i).getName());

                if (buttonPicked.equals(c1.getComponentAt(i).getName()) && (!c1.getComponentAt(i).isEnabled())) {
                    c1.getComponentAt(i).setEnabled(true);

                    for (int j = 0; j < buttons.size(); j++) {
                        Hashtable h = buttons.elementAt(j);
                        if (h.get("id").toString().equals(buttonPicked)) {
                            buttons.removeElementAt(j);
                        }
                    }
                }
            }
        }
        //findSecondLogoNameLabel(c.getComponentForm()).getText().substring(findSecondLogoNameLabel(c.getComponentForm()).getText().length() - 1);
        c.getComponentForm().revalidate();
    }

    @Override
    protected void onSecondLevelForm_SubmitNameButtonAction(final Component c, ActionEvent event) {
        buttons = new Vector<Hashtable>();
        String imageName = findSecondLogoNameLabel(c.getComponentForm()).getText();
        if (imageName.equals(correctAns.toLowerCase())) {
            score += 10;
            Dialog.show("Good", imageName, "OK", null);
        } else {
            score -= 10;
            Dialog.show("Na wah oo", "OLODO like you. You typed '" + imageName.toLowerCase() + "' but the correct answer is '" + correctAns.toLowerCase() + "'", "OK", null);
        }

        point += 1;
        if (point == (allLogos.size() - 1)) {
            Dialog.show("Good!!!", "you have successfully finished this section with '" + score + "' points. moving to the next section", "OK", null);

            beginning += 21;
            fetchLogos(String.valueOf(beginning));
            if (status == null || !"200".equals(status)) {
                noInternet();
            } else {
                if (allLogos == null || allLogos.isEmpty()) {
                    Dialog.show("OoPss!!!", "search returned no logos", "OK", null);
                } else {
                    fetchLogoImages();
                    getLevel();
                    showForm("ThirdLevelForm", null);
                }

            }


        } else {
            Hashtable h = new Hashtable();
            //findImageLabel(c.getComponentForm());
            findLettersContainer2(c.getComponentForm()).removeAll();
            findSecondLogoNameLabel(c.getComponentForm()).setText("");
            c.getComponentForm().revalidate();
            for (int i = 0; i < allLogos.size(); i++) {
                if (i == point) {
                    h = allLogos.elementAt(i);
                    System.out.println(h);
                    String id = (String) h.get("id");
                    Image image = (Image) h.get("image");
//                    Image image;
//                    try {
//                        image = Image.createImage(Storage.getInstance().createInputStream(id));
//                        //l.setIcon(i.scaledWidth(Display.getInstance().getDisplayWidth() / 3));
//                        findSecondLevelLogo(c.getComponentForm()).setIcon(image.scaledWidth(Display.getInstance().getDisplayWidth() / 3));
//                    } catch (IOException ex) {
//                        Log.p(ex.getMessage());
//                        System.out.println("Image Not found ");
//                        //Logger.getLogger(StateMachine.class.getName()).log(Level.SEVERE, null, ex);
//                    }
                    //findSecondLevelLogo(c.getComponentForm()).setIcon((Image) h.get("Image"));
                    findSecondLevelLogo(c.getComponentForm()).setIcon(image.scaledWidth(Display.getInstance().getDisplayWidth() / 3));
                    String name = ((String) h.get("correctAns")).toLowerCase();
                    correctAns = (String) h.get("correctAns");
                    Vector<String> nam = new Vector<String>();
                    for (int j = 0; j < name.length(); j++) {
                        nam.add(String.valueOf(name.charAt(j)));
                    }
                    Collections.shuffle(nam);

                    for (int k = 0; k < nam.size(); k++) {
                        final Button b = new Button();
                        b.setText((String) nam.elementAt(k));
                        b.setName(String.valueOf(k));
                        b.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent evt) {
                                Hashtable hash = new Hashtable();
                                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                findSecondLogoNameLabel(c.getComponentForm()).setText(findSecondLogoNameLabel(c.getComponentForm()).getText() + b.getText());
                                //buttonPicked = b.getName();
                                hash.put("id", b.getName());
                                hash.put("text", b.getText());
                                buttons.add(hash);
                                b.setEnabled(false);
                                c.getComponentForm().revalidate();
                            }
                        });

                        findLettersContainer2(c.getComponentForm()).addComponent(b);
                        c.getComponentForm().revalidate();
                    }
                }

            }
        }
    }

    @Override
    protected void onSecondLevelForm_NextnameButtonAction(final Component c, ActionEvent event) {
        buttons = new Vector<Hashtable>();
//        String imageName = findSecondLogoNameLabel(c.getComponentForm()).getText();
//        if (imageName.equals(correctAns.toLowerCase())) {
//            Dialog.show("Good", imageName, "OK", null);
//        } else {
//            Dialog.show("Oh no", "you just lost a point", "OK", null);
//        }
        Dialog.show("Duh!!!", "you just lost 5 points. the right answer is '" + correctAns.toLowerCase() + "'", "OK", null);

        point += 1;
        score -= 5;
        if (point == (allLogos.size() - 1)) {
            Dialog.show("RESULT", "you have successfully finished this section with " + score + " points. moving to the next section", "OK", null);

            beginning += 21;
            fetchLogos(String.valueOf(beginning));
            if (status == null || !"200".equals(status)) {
                noInternet();
            } else {
                if (allLogos == null || allLogos.isEmpty()) {
                    Dialog.show("OoPss!!!", "search returned no logos", "OK", null);
                } else {
                    fetchLogoImages();
                    getLevel();
                    showForm("ThirdLevelForm", null);
                }

            }
        } else {
            Hashtable h = new Hashtable();

            //findImageLabel(c.getComponentForm());
            findLettersContainer2(c.getComponentForm()).removeAll();
            findSecondLogoNameLabel(c.getComponentForm()).setText("");
            c.getComponentForm().revalidate();
            for (int i = 0; i < allLogos.size(); i++) {
                if (i == point) {
                    h = allLogos.elementAt(i);
                    System.out.println(h);
                    String id = (String) h.get("id");
                    Image image = (Image) h.get("image");
//                    Image image;
//                    try {
//                        image = Image.createImage(Storage.getInstance().createInputStream(id));
//                        //l.setIcon(i.scaledWidth(Display.getInstance().getDisplayWidth() / 3));
//                        findSecondLevelLogo(c.getComponentForm()).setIcon(image.scaledWidth(Display.getInstance().getDisplayWidth() / 3));
//                    } catch (IOException ex) {
//                        Log.p(ex.getMessage());
//                        System.out.println("Image Not found ");
//                        //Logger.getLogger(StateMachine.class.getName()).log(Level.SEVERE, null, ex);
//                    }
                    //findSecondLevelLogo(c.getComponentForm()).setIcon((Image) h.get("Image"));
                    findSecondLevelLogo(c.getComponentForm()).setIcon(image.scaledWidth(Display.getInstance().getDisplayWidth() / 3));
                    String name = ((String) h.get("correctAns")).toLowerCase();
                    correctAns = (String) h.get("correctAns");
                    Vector<String> nam = new Vector<String>();
                    for (int j = 0; j < name.length(); j++) {
                        nam.add(String.valueOf(name.charAt(j)));
                    }
                    Collections.shuffle(nam);

                    for (int k = 0; k < nam.size(); k++) {
                        final Button b = new Button();
                        b.setText((String) nam.elementAt(k));
                        b.setName(String.valueOf(k));
                        b.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent evt) {
                                Hashtable hash = new Hashtable();
                                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                findSecondLogoNameLabel(c.getComponentForm()).setText(findSecondLogoNameLabel(c.getComponentForm()).getText() + b.getText());
                                hash.put("id", b.getName());
                                hash.put("text", b.getText());
                                buttons.add(hash);
                                b.setEnabled(false);
                                c.getComponentForm().revalidate();
                            }
                        });

                        findLettersContainer2(c.getComponentForm()).addComponent(b);
                        c.getComponentForm().revalidate();
                    }
                }

            }
        }


    }

    @Override
    protected void beforeThirdLevelForm(final Form f) {
        Display.getInstance().lockOrientation(true);
        buttons = new Vector<Hashtable>();
        Image bgImage = fetchResourceFile().getImage("BG.png");
        f.getStyle().setBgImage(bgImage);
        f.getStyle().setBackgroundType(Style.BACKGROUND_IMAGE_SCALED);

        point = 0;
        Hashtable h = new Hashtable();
        for (int i = 0; i < allLogos.size(); i++) {
            if (i == point) {
                h = allLogos.elementAt(i);
                System.out.println(h);
                String id = (String) h.get("id");
                Image image = (Image) h.get("image");
//                try {
//                    image = Image.createImage(Storage.getInstance().createInputStream(id));
//                    //l.setIcon(i.scaledWidth(Display.getInstance().getDisplayWidth() / 3));
//                    findThirdlevelLogo(f).setIcon(image.scaledWidth(Display.getInstance().getDisplayWidth() / 3));
//                } catch (IOException ex) {
//                    Log.p(ex.getMessage());
//                    System.out.println("Image Not found ");
//                    //Logger.getLogger(StateMachine.class.getName()).log(Level.SEVERE, null, ex);
//                }
                //findThirdlevelLogo(f).setIcon((Image) h.get("Image"));
                findThirdlevelLogo(f).setIcon(image.scaledWidth(Display.getInstance().getDisplayWidth() / 3));
                
                String name = ((String) h.get("alteredAns")).toLowerCase();
                correctAns = (String) h.get("correctAns");
                Vector<String> nam = new Vector<String>();
                for (int j = 0; j < name.length(); j++) {
                    nam.add(String.valueOf(name.charAt(j)));
                }
                Collections.shuffle(nam);
                for (int k = 0; k < nam.size(); k++) {
                    final Button b = new Button();
                    b.setText((String) nam.elementAt(k));
                    b.setName(String.valueOf(k));
                    b.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent evt) {
                            Hashtable hash = new Hashtable();
                            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                            findThirdlevelnamelogo(f).setText(findThirdlevelnamelogo(f).getText() + b.getText());
                            hash.put("id", b.getName());
                            hash.put("text", b.getText());
                            buttons.add(hash);
                            b.setEnabled(false);
                            f.revalidate();
                        }
                    });

                    findLettersContainer(f).addComponent(b);
                    f.revalidate();
                }
            }

        }

        Command hom = new Command("Home") {
            @Override
            public void actionPerformed(ActionEvent evt) {
                //super.actionPerformed(evt); //To change body of generated methods, choose Tools | Templates.
                showForm("play", null);
            }
        };
        f.addCommand(hom);
        f.setBackCommand(hom);
    }

    @Override
    protected void onThirdLevelForm_ClearButtonAction(Component c, ActionEvent event) {
        if (buttons != null && (buttons.size() > 0)) {
            Hashtable h = buttons.lastElement();
            buttonPicked = h.get("id").toString();
            System.out.println("button picked :::::" + buttonPicked);
        }
        if ((findThirdlevelnamelogo(c.getComponentForm()).getText().length()) > 0) {
            findThirdlevelnamelogo(c.getComponentForm()).setText(findThirdlevelnamelogo(c.getComponentForm()).getText().substring(0, findThirdlevelnamelogo(c.getComponentForm()).getText().length() - 1));
        }
        Container c1 = findLettersContainer(c.getComponentForm());
        int comps = c1.getComponentCount();
        if (buttonPicked != null) {
            System.out.println("button picked last :" + buttonPicked);
            for (int i = 0; i < comps; i++) {
                System.out.println("components at ------");
                System.out.println(c1.getComponentAt(i).getName());

                if (buttonPicked.equals(c1.getComponentAt(i).getName()) && (!c1.getComponentAt(i).isEnabled())) {
                    c1.getComponentAt(i).setEnabled(true);
                    for (int j = 0; j < buttons.size(); j++) {
                        Hashtable h = buttons.elementAt(j);
                        if (h.get("id").toString().equals(buttonPicked)) {
                            buttons.removeElementAt(j);
                        }
                    }
                }
            }
        }

        c.getComponentForm().revalidate();
    }

    @Override
    protected void onThirdLevelForm_NextButtonAction(final Component c, ActionEvent event) {
        buttons = new Vector<Hashtable>();
        Dialog.show("Duh!!!", "you just lost 5 points. the right answer is '" + correctAns.toLowerCase() + "'", "OK", null);
//        String imageName = findThirdlevelnamelogo(c.getComponentForm()).getText();
//        if (imageName.equals(correctAns.toLowerCase())) {
//            
//        } else {
//            Dialog.show("Oh no", "you just lost a point", "OK", null);
//        }
        score -= 5;
        point += 1;
        if (point == (allLogos.size() - 1)) {
            Dialog.show("Hurray!!!", "You have completed this game", "OK", null);
            // getLevel();
            showForm("play", null);
        } else {
            Hashtable h = new Hashtable();

            //findImageLabel(c.getComponentForm());
            findLettersContainer(c.getComponentForm()).removeAll();
            findThirdlevelnamelogo(c.getComponentForm()).setText("");
            c.getComponentForm().revalidate();
            for (int i = 0; i < allLogos.size(); i++) {
                if (i == point) {
                    h = allLogos.elementAt(i);
                    System.out.println(h);

                    String id = (String) h.get("id");
                    Image image = (Image) h.get("image");
//                    try {
//                        image = Image.createImage(Storage.getInstance().createInputStream(id));
//                        //l.setIcon(i.scaledWidth(Display.getInstance().getDisplayWidth() / 3));
//                        findThirdlevelLogo(c.getComponentForm()).setIcon(image.scaledWidth(Display.getInstance().getDisplayWidth() / 3));
//                    } catch (IOException ex) {
//                        Log.p(ex.getMessage());
//                        System.out.println("Image Not found ");
//                        //Logger.getLogger(StateMachine.class.getName()).log(Level.SEVERE, null, ex);
//                    }

                    //findThirdlevelLogo(c.getComponentForm()).setIcon((Image) h.get("Image"));
                    findThirdlevelLogo(c.getComponentForm()).setIcon(image.scaledWidth(Display.getInstance().getDisplayWidth() / 3));
                    
                    String name = ((String) h.get("alteredAns")).toLowerCase();
                    correctAns = (String) h.get("correctAns");
                    Vector<String> nam = new Vector<String>();
                    for (int j = 0; j < name.length(); j++) {
                        nam.add(String.valueOf(name.charAt(j)));
                    }
                    Collections.shuffle(nam);

                    for (int k = 0; k < nam.size(); k++) {
                        final Button b = new Button();
                        b.setText((String) nam.elementAt(k));
                        b.setName(String.valueOf(k));
                        b.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent evt) {
                                Hashtable hash = new Hashtable();
                                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                findThirdlevelnamelogo(c.getComponentForm()).setText(findThirdlevelnamelogo(c.getComponentForm()).getText() + b.getText());
                                hash.put("id", b.getName());
                                hash.put("text", b.getText());
                                buttons.add(hash);
                                b.setEnabled(false);
                                c.getComponentForm().revalidate();
                            }
                        });

                        findLettersContainer(c.getComponentForm()).addComponent(b);
                        c.getComponentForm().revalidate();
                    }
                }

            }
        }

    }

    @Override
    protected void onThirdLevelForm_SubmitButtonAction(final Component c, ActionEvent event) {
        buttons = new Vector<Hashtable>();
        String imageName = findThirdlevelnamelogo(c.getComponentForm()).getText();
        if (imageName.equals(correctAns.toLowerCase())) {
            score += 10;
            Dialog.show("Good", imageName, "OK", null);
        } else {
            score -= 10;
            Dialog.show("Na wah oo", "OLODO like you. You typed '" + imageName.toLowerCase() + "' but the correct answer is '" + correctAns.toLowerCase() + "'", "OK", null);
        }

        point += 1;
        if (point == (allLogos.size() - 1)) {
            Dialog.show("Hurray!!!", "You have completed the game with a total score of '" + score + "'", "OK", null);
            // getLevel();
            showForm("play", null);
        } else {
            Hashtable h = new Hashtable();
            //findImageLabel(c.getComponentForm());
            findLettersContainer(c.getComponentForm()).removeAll();
            findThirdlevelnamelogo(c.getComponentForm()).setText("");
            c.getComponentForm().revalidate();
            for (int i = 0; i < allLogos.size(); i++) {
                if (i == point) {
                    h = allLogos.elementAt(i);
                    System.out.println(h);

                    String id = (String) h.get("id");
                    Image image = (Image) h.get("image");
//                    try {
//                        image = Image.createImage(Storage.getInstance().createInputStream(id));
//                        //l.setIcon(i.scaledWidth(Display.getInstance().getDisplayWidth() / 3));
//                        findThirdlevelLogo(c.getComponentForm()).setIcon(image.scaledWidth(Display.getInstance().getDisplayWidth() / 3));
//                    } catch (IOException ex) {
//                        Log.p(ex.getMessage());
//                        System.out.println("Image Not found ");
//                        //Logger.getLogger(StateMachine.class.getName()).log(Level.SEVERE, null, ex);
//                    }

                    //findThirdlevelLogo(c.getComponentForm()).setIcon((Image) h.get("Image"));
                    findThirdlevelLogo(c.getComponentForm()).setIcon(image.scaledWidth(Display.getInstance().getDisplayWidth() / 3));
                    String name = ((String) h.get("alteredAns")).toLowerCase();
                    correctAns = (String) h.get("correctAns");
                    Vector<String> nam = new Vector<String>();
                    for (int j = 0; j < name.length(); j++) {
                        nam.add(String.valueOf(name.charAt(j)));
                    }
                    Collections.shuffle(nam);

                    for (int k = 0; k < nam.size(); k++) {
                        final Button b = new Button();
                        b.setText((String) nam.elementAt(k));
                        b.setName(String.valueOf(k));
                        b.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent evt) {
                                Hashtable hash = new Hashtable();
                                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                findThirdlevelnamelogo(c.getComponentForm()).setText(findThirdlevelnamelogo(c.getComponentForm()).getText() + b.getText());
                                hash.put("id", b.getName());
                                hash.put("text", b.getText());
                                buttons.add(hash);
                                b.setEnabled(false);
                                c.getComponentForm().revalidate();
                            }
                        });

                        findLettersContainer(c.getComponentForm()).addComponent(b);
                        c.getComponentForm().revalidate();
                    }
                }

            }
        }
    }
    
//    private void downloadImage() {
//        final String filePath = "/catholic.jpg";
//        ConnectionRequest cr = new ConnectionRequest() {
//            @Override
//            protected void readResponse(InputStream input) throws IOException {
//                OutputStream os = FileSystemStorage.getInstance().openOutputStream(filePath);
//                
//                Util.copy(input, os);
//                Dialog.show("Hurray!!!", "Saved", "OK", null);
//            }
//        };
//        cr.setPost(false);
//        cr.setUrl("http://mobile-hook.com/images/albumart/Catholic.jpg");
//        NetworkManager.getInstance().addToQueue(cr);
    // }
//     final String filePath = "/local_vid.mp4";        
//        
//        ConnectionRequest cr = new ConnectionRequest() {
//            protected void readResponse(InputStream input) throws IOException  {
//                OutputStream os = FileSystemStorage.getInstance().openOutputStream(filePath);
//                Util.copy(input, os);
//            }
//        };
//
//        cr.setPost(false);
//        cr.setUrl(http://mobile-hook.com/images/albumart/Catholic.jpg);
//        NetworkManager.getInstance().addToQueue(cr);
}
