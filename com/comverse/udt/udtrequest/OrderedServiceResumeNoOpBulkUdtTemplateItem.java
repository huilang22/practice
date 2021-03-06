/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedServiceResumeNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedServiceResumeNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedServiceResumeNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedServiceResumeOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedServiceResumeNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedServiceResumeNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedServiceResumeOutputData noOpInIn) {
    super(id, context, "OrderedServiceResume");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedServiceResumeOutputData", OrderedServiceResumeOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  OrderedServiceResumeOutputData
 * @param noOpInIn OrderedServiceResumeOutputData to set
 *
 */
  public void setOrderedServiceResumeOutputData(OrderedServiceResumeOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedServiceResumeOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedServiceResumeOutputData getOrderedServiceResumeOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedServiceResumeOutputHelper.fromMap(inputMap);
  }
}
