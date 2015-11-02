/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedContractUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OrderedContractUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedContractUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedContractUpdateOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedContractUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedContractUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedContractUpdateOutputData noOpInIn) {
    super(id, context, "OrderedContractUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedContractUpdateOutputData", OrderedContractUpdateOutputHelper.toMap(noOpIn).get("OrderedContractUpdateOutputData"));
    }
  }
/**
 *
 * Sets the  OrderedContractUpdateOutputData
 * @param noOpInIn OrderedContractUpdateOutputData to set
 *
 */
  public void setOrderedContractUpdateOutputData(OrderedContractUpdateOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedContractUpdateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedContractUpdateOutputData getOrderedContractUpdateOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedContractUpdateOutputHelper.fromMap(inputMap);
  }
}
