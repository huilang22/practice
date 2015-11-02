/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderGetDetailBulkUdtTemplateItem.java
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
 * Class used to create a OrderGetDetailBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderGetDetailBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OrderObjectKeyData omOrderGetDetailOrderIn;
/**
 *
 * Constructor to create a  OrderGetDetailBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderGetDetailBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderObjectKeyData omOrderGetDetailOrderInIn) {
    super(id, context, "OrderGetDetail");
    omOrderGetDetailOrderIn = omOrderGetDetailOrderInIn;
  }

  public void translateToMap() {
    if (omOrderGetDetailOrderIn != null) {
      omOrderGetDetailOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectKeyHelper.toMap(omOrderGetDetailOrderIn, new HashMap(), "OrderObjectKeyData").get("OrderObjectKeyData"));
    }
  }


/**
 *
 * Sets the Order
 * @param omOrderGetDetailOrderInIn Value of the omOrderGetDetailOrderIn
 *
 */

  public void setOrder(OrderObjectKeyData omOrderGetDetailOrderInIn) {
    omOrderGetDetailOrderIn = omOrderGetDetailOrderInIn;
  }

  public void translateFromMap() {
    omOrderGetDetailOrderIn = OrderObjectKeyHelper.fromMap(inputMap, "Order");
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectKeyData getOrder( ) {
    return omOrderGetDetailOrderIn;
  }

}
