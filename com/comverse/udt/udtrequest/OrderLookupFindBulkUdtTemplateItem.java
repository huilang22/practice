/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderLookupFindBulkUdtTemplateItem.java
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
 * Class used to create a OrderLookupFindBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderLookupFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OrderLookupObjectFilter OrderLookupFindIn;
/**
 *
 * Constructor to create a  OrderLookupFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderLookupFindBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderLookupObjectFilter OrderLookupFindInIn) {
    super(id, context, "OrderLookupFind");
    OrderLookupFindIn = OrderLookupFindInIn;
  }

  public void translateToMap() {
    if (OrderLookupFindIn != null) {
      Integer index =  OrderLookupFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("OrderLookup", OrderLookupObjectHelper.toMap(OrderLookupFindIn, new HashMap(), "OrderLookup").get("OrderLookup"));
    }
  }


/**
 *
 * Sets the OrderLookup
 * @param OrderLookupFindInIn Value of the OrderLookupFindIn
 *
 */

  public void setOrderLookup(OrderLookupObjectFilter OrderLookupFindInIn) {
    OrderLookupFindIn = OrderLookupFindInIn;
  }

  public void translateFromMap() {
    OrderLookupFindIn = OrderLookupObjectHelper.fromMapFilter(inputMap, "OrderLookup");
  }

/**
 *
 * Gets the OrderLookup
 * @return Value of the OrderLookup
 *
 */

  public OrderLookupObjectFilter getOrderLookup( ) {
    return OrderLookupFindIn;
  }

}
