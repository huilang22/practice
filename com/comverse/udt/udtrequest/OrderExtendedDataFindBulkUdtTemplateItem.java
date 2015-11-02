/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderExtendedDataFindBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a OrderExtendedDataFindBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderExtendedDataFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OrderObjectKeyData OrderEDFindIn;
/**
 *
 * Constructor to create a  OrderExtendedDataFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderExtendedDataFindBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderObjectKeyData OrderEDFindInIn) {
    super(id, context, "OrderExtendedDataFind");
    OrderEDFindIn = OrderEDFindInIn;
  }

  public void translateToMap() {
    if (OrderEDFindIn != null) {
      OrderEDFindIn.resetFlags(true, true);
      addInput("Order", OrderObjectKeyHelper.toMap(OrderEDFindIn, new HashMap(), "OrderObjectKeyData").get("OrderObjectKeyData"));
    }
  }


/**
 *
 * Sets the Order
 * @param OrderEDFindInIn Value of the OrderEDFindIn
 *
 */

  public void setOrder(OrderObjectKeyData OrderEDFindInIn) {
    OrderEDFindIn = OrderEDFindInIn;
  }

  public void translateFromMap() {
    OrderEDFindIn = OrderObjectKeyHelper.fromMap(inputMap, "Order");
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectKeyData getOrder( ) {
    return OrderEDFindIn;
  }

}
