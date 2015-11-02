/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedProductUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedProductUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedProductUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedProductUpdateOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedProductUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedProductUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedProductUpdateOutputData noOpInIn) {
    super(id, context, "OrderedProductUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedProductUpdateOutputData", OrderedProductUpdateOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  OrderedProductUpdateOutputData
 * @param noOpInIn OrderedProductUpdateOutputData to set
 *
 */
  public void setOrderedProductUpdateOutputData(OrderedProductUpdateOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedProductUpdateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedProductUpdateOutputData getOrderedProductUpdateOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedProductUpdateOutputHelper.fromMap(inputMap);
  }
}
