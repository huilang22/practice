/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedServiceUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedServiceUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedServiceUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedServiceUpdateOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedServiceUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedServiceUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedServiceUpdateOutputData noOpInIn) {
    super(id, context, "OrderedServiceUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedServiceUpdateOutputData", OrderedServiceUpdateOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  OrderedServiceUpdateOutputData
 * @param noOpInIn OrderedServiceUpdateOutputData to set
 *
 */
  public void setOrderedServiceUpdateOutputData(OrderedServiceUpdateOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedServiceUpdateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedServiceUpdateOutputData getOrderedServiceUpdateOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedServiceUpdateOutputHelper.fromMap(inputMap);
  }
}
