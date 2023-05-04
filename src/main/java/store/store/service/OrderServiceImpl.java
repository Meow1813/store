package store.store.service;

import org.springframework.stereotype.Service;
import store.store.Order;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final Order order;

    public OrderServiceImpl(Order order) {
        this.order = order;
    }

    @Override
    public void add(List<Integer> list) {
        order.add(list);
    }

    @Override
    public List<Integer> get() {
        return order.get();
    }
}
