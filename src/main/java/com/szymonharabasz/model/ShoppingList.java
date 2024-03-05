package com.szymonharabasz.model;

import java.util.Collection;

public record ShoppingList(String name, Collection<ShoppingListProduct> products, ListReference reference) {
}
