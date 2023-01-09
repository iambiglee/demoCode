package org.crs;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import com.wontlost.zxing.Constants;
import com.wontlost.zxing.ZXingVaadinReader;

@Route("/")
@PWA(shortName="qrtest" , name="qrtest")
public class QRView extends VerticalLayout {
    public QRView() {
        ZXingVaadinReader zXingVaadin = new ZXingVaadinReader();
        zXingVaadin.setFrom(Constants.From.camera);
        zXingVaadin.setId("video"); //id needs to be 'video' if From.camera.
        zXingVaadin.setWidth("350");
        zXingVaadin.setStyle("border : 1px solid gray");

//        zXingVaadin.addValueChangeListener(e->{
//            System.out.println("==QR=====:"+e.getValue());
//        });
        add(zXingVaadin);
    }
}
