package org.fkit.mapper;

import org.fkit.domain.Order;

public interface OrderMapper {

	Order selectOrderById(int id);
	
}
