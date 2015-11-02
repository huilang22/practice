/*
 * Generated code DO NOT EDIT
 * Generated file: ProductRateKeyJurisdictionDeriveNoOpBulkUdtTemplateItem.java
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

/**
 *
 * NoOp class used to simulate a ProductRateKeyJurisdictionDeriveNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductRateKeyJurisdictionDeriveNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected Integer noOpIn;

/**
 *
 * Constructor to create a   ProductRateKeyJurisdictionDeriveNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductRateKeyJurisdictionDeriveNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer noOpInIn) {
    super(id, context, "ProductRateKeyJurisdictionDerive");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("JurisdictionCode", noOpIn);
    }
  }
/**
 *
 * Sets the  JurisdictionCode
 * @param noOpInIn Integer to set
 *
 */
  public void setJurisdictionCode(Integer noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the JurisdictionCode passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getJurisdictionCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (Integer)inputMap.get("JurisdictionCode");
  }
}
