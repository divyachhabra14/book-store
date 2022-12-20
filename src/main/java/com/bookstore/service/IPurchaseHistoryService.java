package com.bookstore.service;

import com.bookstore.model.PurchaseHistory;
import com.bookstore.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {

	PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);
	List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
