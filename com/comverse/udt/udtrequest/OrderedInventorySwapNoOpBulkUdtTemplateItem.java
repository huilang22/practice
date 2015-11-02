/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedInventorySwapNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a OrderedInventorySwapNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedInventorySwapNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedInventorySwapOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedInventorySwapNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedInventorySwapNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedInventorySwapOutputData noOpInIn) {
    super(id, context, "OrderedInventorySwap");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedInventorySwapOutputData", OrderedInventorySwapOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  OrderedInventorySwapOutputData
 * @param noOpInIn OrderedInventorySwapOutputData to set
 *
 */
  public void setOrderedInventorySwapOutputData(OrderedInventorySwapOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedInventorySwapOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedInventorySwapOutputData getOrderedInventorySwapOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedInventorySwapOutputHelper.fromMap(inputMap);
  }
}
