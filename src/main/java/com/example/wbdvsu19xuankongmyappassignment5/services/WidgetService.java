package com.example.wbdvsu19xuankongmyappassignment5.services;

import com.example.wbdvsu19xuankongmyappassignment5.models.Widget;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xuan Kong
 * @Date 2019-06-11.
 */
public class WidgetService {

  public static List<Widget> widgets = new ArrayList<>();


  static {
    widgets.add(new Widget(123, Widget.Type.HEADING, "Widget 1", "1", "heading demo text", "", true));
    widgets.add(new Widget(234, Widget.Type.PARAGRAPH, "Widget 2", "2", "para demo text", "", true));
    widgets.add(new Widget(345, Widget.Type.IMAGE, "Widget 3", "2", "img demo text", "https://northeastern.blackboard.com/branding/_1_1/NortheasternUniversityBlackboardBannerGray.png", true));
    widgets.add(new Widget(567, Widget.Type.LINK, "Widget 4", "2", "link demo text", "https://northeastern.blackboard.com/", true));
    widgets.add(new Widget(789, Widget.Type.LIST, "Widget 5", "2", "Hello World", "", false));
  }

  public List<Widget> createWidget(Widget widget) {
    widgets.add(widget);
    return widgets;
  }


  public List<Widget> findAllWigets() {
    return widgets;
  }


  public Widget findWidgetById(Integer id) {
    for (Widget widget : widgets) {
      if (widget.getId().equals(id)) {
        return widget;
      }
    }
    return null;
  }

  public Widget updateWidget(Integer wid, Widget newWidget) {

    for (Widget widget : widgets) {
      if (widget.getId().equals(wid)) {
        widget.setWidgetType(newWidget.getWidgetType());
        widget.setName(newWidget.getName());
        widget.setSize(newWidget.getSize());
        widget.setText(newWidget.getText());
        widget.setSrc(newWidget.getSrc());
        widget.setOrder(newWidget.getOrder());
        return newWidget;
      }
    }
    return null;
  }

  public void deleteWidget(Integer wid) {
    for (int i = 0; i < widgets.size(); i++) {
      if (widgets.get(i).getId().equals(wid)) {
        widgets.remove(i);
      }
    }
  }
}
