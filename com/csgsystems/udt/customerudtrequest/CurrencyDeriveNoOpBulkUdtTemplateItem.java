/*
 * Generated code DO NOT EDIT
 * Generated file: CurrencyDeriveNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CurrencyDeriveNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CurrencyDeriveNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected Integer noOpIn;

/**
 *
 * Constructor to create a   CurrencyDeriveNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CurrencyDeriveNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer noOpInIn) {
    super(id, context, "CurrencyDerive");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("CurrencyCode", noOpIn);
    }
  }
/**
 *
 * Sets the  CurrencyCode
 * @param noOpInIn Integer to set
 *
 */
  public void setCurrencyCode(Integer noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CurrencyCode passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getCurrencyCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (Integer)inputMap.get("CurrencyCode");
  }
}
