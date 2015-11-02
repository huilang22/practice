/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderPpvUsageRequiredNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceOrderPpvUsageRequiredNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceOrderPpvUsageRequiredNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected Integer noOpIn;

/**
 *
 * Constructor to create a   ServiceOrderPpvUsageRequiredNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceOrderPpvUsageRequiredNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer noOpInIn) {
    super(id, context, "ServiceOrderPpvUsageRequired");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("Result", noOpIn);
    }
  }
/**
 *
 * Sets the  Result
 * @param noOpInIn Integer to set
 *
 */
  public void setResult(Integer noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Result passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getResult() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (Integer)inputMap.get("Result");
  }
}
