package ua.alexandroid1.alex.controller;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;
import ua.alexandroid1.alex.domainModel.MyDataObject;

@RestController
public class MainController {

    private static final String template = "Это ответ метода, %s!";
    private final AtomicLong counter = new AtomicLong();

    // этот метод будет принимать время методом GET и на его основе
    // отвечать клиенту
    @RequestMapping(value= "/{time}", method = RequestMethod.GET)
    @ResponseBody
    public MyDataObject getMyData(@PathVariable long time) {
        return new MyDataObject(/*counter.incrementAndGet(), */Calendar.getInstance(), String.format(template, "GET!"));
    }

    // этот метод будет принимать Объект MyDataObject и отдавать его клиенту
    // обычно метод PUT используют для сохранения либо для обновления объекта
    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public MyDataObject putMyData(@RequestBody MyDataObject md) {
        return md;
    }

    // этот метод будет методом POST отдавать объект MyDataObject
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public MyDataObject postMyData() {
        return new MyDataObject(/*counter.incrementAndGet(), */Calendar.getInstance(), String.format(template, "POST!"));
    }

    // этот метод будет принимать время методом DELETE
    // и на его основе можно удалит объект
    @RequestMapping(value= "/{time}", method = RequestMethod.DELETE)
    @ResponseBody
    public MyDataObject deleteMyData(@PathVariable long time) {
        return new MyDataObject(/*counter.incrementAndGet(), */Calendar.getInstance(), String.format(template, "DELETE!"));
    }

}
