package com.carlos.springboot.app.items.models.service;

import java.util.List;

import com.carlos.springboot.app.items.models.Item;

public interface IItemService {
	public List<Item> findAll();

	public Item findById(Long id, Integer cantidad);
}
