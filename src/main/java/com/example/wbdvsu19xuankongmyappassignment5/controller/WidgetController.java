package com.example.wbdvsu19xuankongmyappassignment5.controller;

import com.example.wbdvsu19xuankongmyappassignment5.models.Widget;
import com.example.wbdvsu19xuankongmyappassignment5.services.WidgetService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Xuan Kong
 * @Date 2019-06-11.
 */


@RestController
@CrossOrigin("*")
public class WidgetController {

  WidgetService widgetService;

  WidgetController() {
    widgetService = new WidgetService();
  }

  @PostMapping("/api/widgets")
  public List<Widget> createWidget(
          @RequestBody Widget widget) {
    widgetService.createWidget(widget);
    return widgetService.findAllWigets();
  }


  @GetMapping("/api/widgets")
  public List<Widget> findAllWigets(Widget widget) {

    return widgetService.findAllWigets();
  }


  @GetMapping("/api/widgets/{widgetId}")
  public Widget findWidgetById(@PathVariable("widgetId") Integer id) {

    return widgetService.findWidgetById(id);
  }

  @PutMapping("/api/widgets/{widgetId}")
  public Widget updateWidget(
          @PathVariable("widgetId") Integer wid,
          @RequestBody Widget newWidget) {
    return widgetService.updateWidget(wid, newWidget);
  }

  @DeleteMapping("/api/widgets/{widgetId}")
  public void deleteWidget(@PathVariable("widgetId") Integer wid) {

    widgetService.deleteWidget(wid);
  }
}
