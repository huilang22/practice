/*
 * Generated code DO NOT EDIT
 * Generated file: OrderFindWithExtendedDataBulkUdtTemplateItem.java
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
 * Class used to create a OrderFindWithExtendedDataBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderFindWithExtendedDataBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OrderObjectFilter OrderFindWEDIn;
/**
 *
 * Constructor to create a  OrderFindWithExtendedDataBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderFindWithExtendedDataBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderObjectFilter OrderFindWEDInIn) {
    super(id, context, "OrderFindWithExtendedData");
    OrderFindWEDIn = OrderFindWEDInIn;
  }

  public void translateToMap() {
    if (OrderFindWEDIn != null) {
      Integer index =  OrderFindWEDIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Order", OrderObjectHelper.toMap(OrderFindWEDIn, new HashMap(), "Order").get("Order"));
    }
  }


/**
 *
 * Sets the Order
 * @param OrderFindWEDInIn Value of the OrderFindWEDIn
 *
 */

  public void setOrder(OrderObjectFilter OrderFindWEDInIn) {
    OrderFindWEDIn = OrderFindWEDInIn;
  }

  public void translateFromMap() {
    OrderFindWEDIn = OrderObjectHelper.fromMapFilter(inputMap, "Order");
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectFilter getOrder( ) {
    return OrderFindWEDIn;
  }

}
