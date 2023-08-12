package pro.sky.springhw31.service;

import org.springframework.stereotype.Service;
import pro.sky.springhw31.model.Basket;

import java.util.List;
import java.util.Map;

@Service
public class BasketService {
    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public Map<Integer, Integer> add(List<Integer> ids) {
        return basket.add(ids);
    }

    public Map<Integer, Integer> get() {
        return basket.get();
    }
}
