/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedAccountSuspendServicesNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedAccountSuspendServicesNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedAccountSuspendServicesNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedAccountSuspendServicesOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedAccountSuspendServicesNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedAccountSuspendServicesNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedAccountSuspendServicesOutputData noOpInIn) {
    super(id, context, "OrderedAccountSuspendServices");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedAccountSuspendServicesOutputData", OrderedAccountSuspendServicesOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  OrderedAccountSuspendServicesOutputData
 * @param noOpInIn OrderedAccountSuspendServicesOutputData to set
 *
 */
  public void setOrderedAccountSuspendServicesOutputData(OrderedAccountSuspendServicesOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedAccountSuspendServicesOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedAccountSuspendServicesOutputData getOrderedAccountSuspendServicesOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedAccountSuspendServicesOutputHelper.fromMap(inputMap);
  }
}
