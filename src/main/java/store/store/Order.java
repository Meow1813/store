package store.store;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Repository
@SessionScope
public class Order {
    private List<Integer> order = new ArrayList<>();

    public void add(List<Integer> list) {
        order.addAll(list);
    }

    public List<Integer> get() {
        return order;
    }
}
