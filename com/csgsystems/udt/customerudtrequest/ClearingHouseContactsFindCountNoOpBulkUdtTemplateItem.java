/*
 * Generated code DO NOT EDIT
 * Generated file: ClearingHouseContactsFindCountNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ClearingHouseContactsFindCountNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ClearingHouseContactsFindCountNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected Integer noOpIn;

/**
 *
 * Constructor to create a   ClearingHouseContactsFindCountNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ClearingHouseContactsFindCountNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer noOpInIn) {
    super(id, context, "ClearingHouseContactsFindCount");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("TotalCount", noOpIn);
    }
  }
/**
 *
 * Sets the  TotalCount
 * @param noOpInIn Integer to set
 *
 */
  public void setTotalCount(Integer noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the TotalCount passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getTotalCount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (Integer)inputMap.get("TotalCount");
  }
}
