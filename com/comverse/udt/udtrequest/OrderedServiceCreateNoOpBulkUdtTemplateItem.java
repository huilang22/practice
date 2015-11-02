/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedServiceCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedServiceCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedServiceCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedServiceCreateOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedServiceCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedServiceCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedServiceCreateOutputData noOpInIn) {
    super(id, context, "OrderedServiceCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedServiceCreateOutputData", OrderedServiceCreateOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  OrderedServiceCreateOutputData
 * @param noOpInIn OrderedServiceCreateOutputData to set
 *
 */
  public void setOrderedServiceCreateOutputData(OrderedServiceCreateOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedServiceCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedServiceCreateOutputData getOrderedServiceCreateOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedServiceCreateOutputHelper.fromMap(inputMap);
  }
}
