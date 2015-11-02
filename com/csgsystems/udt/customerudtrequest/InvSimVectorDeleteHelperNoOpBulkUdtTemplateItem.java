/*
 * Generated code DO NOT EDIT
 * Generated file: InvSimVectorDeleteHelperNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvSimVectorDeleteHelperNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvSimVectorDeleteHelperNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected Integer noOpIn;

/**
 *
 * Constructor to create a   InvSimVectorDeleteHelperNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvSimVectorDeleteHelperNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer noOpInIn) {
    super(id, context, "InvSimVectorDeleteHelper");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("ReturnCode", noOpIn);
    }
  }
/**
 *
 * Sets the  ReturnCode
 * @param noOpInIn Integer to set
 *
 */
  public void setReturnCode(Integer noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ReturnCode passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getReturnCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (Integer)inputMap.get("ReturnCode");
  }
}
