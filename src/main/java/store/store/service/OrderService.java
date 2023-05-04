package store.store.service;

import java.util.List;

public interface OrderService {
    void add(List<Integer> list);

    List<Integer> get();
}
