/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedPackageDisconnectNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedPackageDisconnectNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedPackageDisconnectNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedPackageDisconnectOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedPackageDisconnectNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedPackageDisconnectNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedPackageDisconnectOutputData noOpInIn) {
    super(id, context, "OrderedPackageDisconnect");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedPackageDisconnectOutputData", OrderedPackageDisconnectOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  OrderedPackageDisconnectOutputData
 * @param noOpInIn OrderedPackageDisconnectOutputData to set
 *
 */
  public void setOrderedPackageDisconnectOutputData(OrderedPackageDisconnectOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedPackageDisconnectOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedPackageDisconnectOutputData getOrderedPackageDisconnectOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedPackageDisconnectOutputHelper.fromMap(inputMap);
  }
}
