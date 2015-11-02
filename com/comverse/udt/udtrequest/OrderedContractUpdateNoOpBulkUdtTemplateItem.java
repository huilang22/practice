/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedContractUpdateNoOpBulkUdtTemplateItem.java
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
      addInput("OrderedContractUpdateOutputData", OrderedContractUpdateOutputHelper.toMap(noOpIn));
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
