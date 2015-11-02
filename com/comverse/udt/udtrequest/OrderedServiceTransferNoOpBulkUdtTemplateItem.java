/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedServiceTransferNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedServiceTransferNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedServiceTransferNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedServiceTransferOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedServiceTransferNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedServiceTransferNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedServiceTransferOutputData noOpInIn) {
    super(id, context, "OrderedServiceTransfer");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedServiceTransferOutputData", OrderedServiceTransferOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  OrderedServiceTransferOutputData
 * @param noOpInIn OrderedServiceTransferOutputData to set
 *
 */
  public void setOrderedServiceTransferOutputData(OrderedServiceTransferOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedServiceTransferOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedServiceTransferOutputData getOrderedServiceTransferOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedServiceTransferOutputHelper.fromMap(inputMap);
  }
}
