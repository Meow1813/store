package store.store.controller;

import org.springframework.web.bind.annotation.*;
import store.store.service.OrderServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderServiceImpl orderService;

    public OrderController(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> list) {
        orderService.add(list);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return orderService.get();
    }
}
