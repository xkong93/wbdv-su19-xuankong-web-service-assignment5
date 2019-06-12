package com.example.wbdvsu19xuankongmyappassignment5.controller;

import com.example.wbdvsu19xuankongmyappassignment5.models.Widget;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xuan Kong
 * @Date 2019-06-11.
 */


@RestController
public class WidgetController {
  private static List<Widget> widgets = new ArrayList<>();

  static {
    widgets.add(new Widget(123, Widget.Type.HEADING, "Widget 1", "1", "heading demo text", "", true));
    widgets.add(new Widget(234, Widget.Type.PARAGRAPH, "Widget 2", "2", "para demo text", "", true));
    widgets.add(new Widget(345, Widget.Type.IMAGE, "Widget 3", "2", "img demo text", "https://northeastern.blackboard.com/branding/_1_1/NortheasternUniversityBlackboardBannerGray.png", true));
    widgets.add(new Widget(567, Widget.Type.LINK, "Widget 4", "2", "link demo text", "https://northeastern.blackboard.com/", true));
    widgets.add(new Widget(789, Widget.Type.LIST, "Widget 5", "2", "Hello World", "", false));
  }


  @PostMapping("/api/widgets")
  public Widget createWidget(
          @RequestBody Widget widget) {
    widgets.add(widget);
    return widget;
  }


  @GetMapping("/api/widgets")
  public List<Widget> findAllWigets(Widget widget) {
    return widgets;
  }


  @GetMapping("/api/widgets/{widgetId}")
  public Widget findWidgetById(@PathVariable("widgetId") Integer id) {
    for (Widget widget : widgets) {
      if (widget.getId().equals(id)) {
        return widget;
      }
    }
    return null;
  }

  @PutMapping("/api/widgets/{widgetId}")
  public Widget updateWidget(
          @PathVariable("widgetId") Integer wid,
          @RequestBody Widget newWidget) {

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

  @DeleteMapping("/api/widgets/{widgetId}")
  public void deleteWidget(@PathVariable("widgetId") Integer wid) {
    for (int i = 0; i < widgets.size(); i++) {
      if (widgets.get(i).getId().equals(wid)){
        widgets.remove(i);
      }
    }
  }
}
