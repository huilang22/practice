/*
 * Generated code DO NOT EDIT
 * Generated file: OrderStatusFindBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a OrderStatusFindBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderStatusFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OrderStatusObjectFilter OrderStatusFindIn;
/**
 *
 * Constructor to create a  OrderStatusFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderStatusFindBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderStatusObjectFilter OrderStatusFindInIn) {
    super(id, context, "OrderStatusFind");
    OrderStatusFindIn = OrderStatusFindInIn;
  }

  public void translateToMap() {
    if (OrderStatusFindIn != null) {
      Integer index =  OrderStatusFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("OrderStatus", OrderStatusObjectHelper.toMap(OrderStatusFindIn, new HashMap(), "OrderStatus").get("OrderStatus"));
    }
  }


/**
 *
 * Sets the OrderStatus
 * @param OrderStatusFindInIn Value of the OrderStatusFindIn
 *
 */

  public void setOrderStatus(OrderStatusObjectFilter OrderStatusFindInIn) {
    OrderStatusFindIn = OrderStatusFindInIn;
  }

  public void translateFromMap() {
    OrderStatusFindIn = OrderStatusObjectHelper.fromMapFilter(inputMap, "OrderStatus");
  }

/**
 *
 * Gets the OrderStatus
 * @return Value of the OrderStatus
 *
 */

  public OrderStatusObjectFilter getOrderStatus( ) {
    return OrderStatusFindIn;
  }

}
