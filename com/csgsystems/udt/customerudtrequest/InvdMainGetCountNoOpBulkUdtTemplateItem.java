/*
 * Generated code DO NOT EDIT
 * Generated file: InvdMainGetCountNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvdMainGetCountNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvdMainGetCountNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected Integer noOpIn;

/**
 *
 * Constructor to create a   InvdMainGetCountNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvdMainGetCountNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer noOpInIn) {
    super(id, context, "InvdMainGetCount");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("InvdMainCount", noOpIn);
    }
  }
/**
 *
 * Sets the  InvdMainCount
 * @param noOpInIn Integer to set
 *
 */
  public void setInvdMainCount(Integer noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvdMainCount passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getInvdMainCount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (Integer)inputMap.get("InvdMainCount");
  }
}
