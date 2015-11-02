/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedProductDisconnectNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedProductDisconnectNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedProductDisconnectNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedProductDisconnectOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedProductDisconnectNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedProductDisconnectNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedProductDisconnectOutputData noOpInIn) {
    super(id, context, "OrderedProductDisconnect");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedProductDisconnectOutputData", OrderedProductDisconnectOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  OrderedProductDisconnectOutputData
 * @param noOpInIn OrderedProductDisconnectOutputData to set
 *
 */
  public void setOrderedProductDisconnectOutputData(OrderedProductDisconnectOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedProductDisconnectOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedProductDisconnectOutputData getOrderedProductDisconnectOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedProductDisconnectOutputHelper.fromMap(inputMap);
  }
}
