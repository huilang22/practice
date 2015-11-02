/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedServiceTransferNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
      addInput("OrderedServiceTransferOutputData", OrderedServiceTransferOutputHelper.toMap(noOpIn).get("OrderedServiceTransferOutputData"));
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
