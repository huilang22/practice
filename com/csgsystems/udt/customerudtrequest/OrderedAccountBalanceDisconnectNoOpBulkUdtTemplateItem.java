/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedAccountBalanceDisconnectNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a OrderedAccountBalanceDisconnectNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderedAccountBalanceDisconnectNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OrderedAccountBalanceDisconnectOutputData noOpIn;

/**
 *
 * Constructor to create a   OrderedAccountBalanceDisconnectNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderedAccountBalanceDisconnectNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderedAccountBalanceDisconnectOutputData noOpInIn) {
    super(id, context, "OrderedAccountBalanceDisconnect");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OrderedAccountBalanceDisconnectOutputData", OrderedAccountBalanceDisconnectOutputHelper.toMap(noOpIn).get("OrderedAccountBalanceDisconnectOutputData"));
    }
  }
/**
 *
 * Sets the  OrderedAccountBalanceDisconnectOutputData
 * @param noOpInIn OrderedAccountBalanceDisconnectOutputData to set
 *
 */
  public void setOrderedAccountBalanceDisconnectOutputData(OrderedAccountBalanceDisconnectOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OrderedAccountBalanceDisconnectOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public OrderedAccountBalanceDisconnectOutputData getOrderedAccountBalanceDisconnectOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OrderedAccountBalanceDisconnectOutputHelper.fromMap(inputMap);
  }
}
