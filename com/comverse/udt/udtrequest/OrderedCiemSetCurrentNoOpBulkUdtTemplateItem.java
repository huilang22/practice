/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedCiemSetCurrentNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedCiemSetCurrentNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedCiemSetCurrentNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedCiemSetCurrentOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedCiemSetCurrentNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedCiemSetCurrentNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedCiemSetCurrentOutputData noOpInIn) {
    super(id, context, "OrderedCiemSetCurrent");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedCiemSetCurrentOutputData", OrderedCiemSetCurrentOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  OrderedCiemSetCurrentOutputData
 * @param noOpInIn OrderedCiemSetCurrentOutputData to set
 *
 */
  public void setOrderedCiemSetCurrentOutputData(OrderedCiemSetCurrentOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedCiemSetCurrentOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedCiemSetCurrentOutputData getOrderedCiemSetCurrentOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedCiemSetCurrentOutputHelper.fromMap(inputMap);
  }
}
