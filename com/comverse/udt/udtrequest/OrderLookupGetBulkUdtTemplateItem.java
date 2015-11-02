/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderLookupGetBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a OrderLookupGetBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderLookupGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OrderLookupObjectKeyData OrderLookupGetIn;
/**
 *
 * Constructor to create a  OrderLookupGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderLookupGetBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderLookupObjectKeyData OrderLookupGetInIn) {
    super(id, context, "OrderLookupGet");
    OrderLookupGetIn = OrderLookupGetInIn;
  }

  public void translateToMap() {
    if (OrderLookupGetIn != null) {
      OrderLookupGetIn.resetFlags(true, true);
      addInput("OrderLookup", OrderLookupObjectKeyHelper.toMap(OrderLookupGetIn, new HashMap(), "OrderLookupObjectKeyData").get("OrderLookupObjectKeyData"));
    }
  }


/**
 *
 * Sets the OrderLookup
 * @param OrderLookupGetInIn Value of the OrderLookupGetIn
 *
 */

  public void setOrderLookup(OrderLookupObjectKeyData OrderLookupGetInIn) {
    OrderLookupGetIn = OrderLookupGetInIn;
  }

  public void translateFromMap() {
    OrderLookupGetIn = OrderLookupObjectKeyHelper.fromMap(inputMap, "OrderLookup");
  }

/**
 *
 * Gets the OrderLookup
 * @return Value of the OrderLookup
 *
 */

  public OrderLookupObjectKeyData getOrderLookup( ) {
    return OrderLookupGetIn;
  }

}
