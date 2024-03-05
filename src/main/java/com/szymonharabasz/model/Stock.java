package com.szymonharabasz.model;

import java.util.Collection;

public record Stock(String name, Collection<StockProduct> products) {
}
