/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedAccountResumeServicesNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedAccountResumeServicesNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedAccountResumeServicesNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedAccountResumeServicesOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedAccountResumeServicesNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedAccountResumeServicesNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedAccountResumeServicesOutputData noOpInIn) {
    super(id, context, "OrderedAccountResumeServices");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedAccountResumeServicesOutputData", OrderedAccountResumeServicesOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  OrderedAccountResumeServicesOutputData
 * @param noOpInIn OrderedAccountResumeServicesOutputData to set
 *
 */
  public void setOrderedAccountResumeServicesOutputData(OrderedAccountResumeServicesOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedAccountResumeServicesOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedAccountResumeServicesOutputData getOrderedAccountResumeServicesOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedAccountResumeServicesOutputHelper.fromMap(inputMap);
  }
}
