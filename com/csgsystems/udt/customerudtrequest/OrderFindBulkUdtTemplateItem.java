/*
 * Generated code DO NOT EDIT
 * Generated file: OrderFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a OrderFindBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OrderObjectFilter OrderFindIn;
/**
 *
 * Constructor to create a  OrderFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderFindBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderObjectFilter OrderFindInIn) {
    super(id, context, "OrderFind");
    OrderFindIn = OrderFindInIn;
  }

  public void translateToMap() {
    if (OrderFindIn != null) {
      Integer index =  OrderFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Order", OrderObjectHelper.toMap(OrderFindIn, new HashMap(), "Order").get("Order"));
    }
  }


/**
 *
 * Sets the Order
 * @param OrderFindInIn Value of the OrderFindIn
 *
 */

  public void setOrder(OrderObjectFilter OrderFindInIn) {
    OrderFindIn = OrderFindInIn;
  }

  public void translateFromMap() {
    OrderFindIn = OrderObjectHelper.fromMapFilter(inputMap, "Order");
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectFilter getOrder( ) {
    return OrderFindIn;
  }

}
