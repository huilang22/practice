/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedContractDisconnectNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedContractDisconnectNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedContractDisconnectNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedContractDisconnectOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedContractDisconnectNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedContractDisconnectNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedContractDisconnectOutputData noOpInIn) {
    super(id, context, "OrderedContractDisconnect");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedContractDisconnectOutputData", OrderedContractDisconnectOutputHelper.toMap(noOpIn).get("OrderedContractDisconnectOutputData"));
    }
  }
/**
 *
 * Sets the  OrderedContractDisconnectOutputData
 * @param noOpInIn OrderedContractDisconnectOutputData to set
 *
 */
  public void setOrderedContractDisconnectOutputData(OrderedContractDisconnectOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedContractDisconnectOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedContractDisconnectOutputData getOrderedContractDisconnectOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedContractDisconnectOutputHelper.fromMap(inputMap);
  }
}
