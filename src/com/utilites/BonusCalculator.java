package com.utilites;

import java.util.List;
import java.util.Objects;

public class BonusCalculator {

    private static class User {
        String name;
        List<Basket> baskets;
    }

    private static class Basket {
        List<Item> items;
    }

    private static class Item {
        String name;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Item item = (Item) o;
            return Objects.equals(name, item.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    // bonus per basket:
    //   bread - 5
    //   milk - 7
    //   bread + milk - 10

    public long calculateTotalBonuses(List<User> users) {
      return  users == null ? 0 : users.stream()
              .mapToInt(BonusCalculator::getBonus)
              .sum();
    }

    private static int getBonus(User user) {
        return user.baskets == null ? 0 : user.baskets.stream()
                .mapToInt(BonusCalculator::getBonusByBasket)
                .sum();
    }

    private static int getBonusByBasket(Basket basket) {
        Item itemBread = new Item();  itemBread.name = "bread";
        Item itemMilk = new Item();  itemMilk.name = "milk";

        if (basket.items.containsAll(List.of(itemBread, itemMilk)))  return 10;
        else if (basket.items.contains(itemBread)) return 5;
        else if (basket.items.contains(itemMilk))  return 7;

        return 0;
    }
}
