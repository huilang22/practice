/*
 * Generated code DO NOT EDIT
 * Generated file: ProductPackageActiveComponentCountNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProductPackageActiveComponentCountNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductPackageActiveComponentCountNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected Integer noOpIn;

/**
 *
 * Constructor to create a   ProductPackageActiveComponentCountNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductPackageActiveComponentCountNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer noOpInIn) {
    super(id, context, "ProductPackageActiveComponentCount");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("ActiveCount", noOpIn);
    }
  }
/**
 *
 * Sets the  ActiveCount
 * @param noOpInIn Integer to set
 *
 */
  public void setActiveCount(Integer noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ActiveCount passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getActiveCount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (Integer)inputMap.get("ActiveCount");
  }
}
