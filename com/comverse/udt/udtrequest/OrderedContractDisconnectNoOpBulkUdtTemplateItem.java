/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedContractDisconnectNoOpBulkUdtTemplateItem.java
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
      addInput("OrderedContractDisconnectOutputData", OrderedContractDisconnectOutputHelper.toMap(noOpIn));
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
