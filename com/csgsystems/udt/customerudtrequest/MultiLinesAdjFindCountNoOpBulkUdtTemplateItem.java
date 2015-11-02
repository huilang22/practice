/*
 * Generated code DO NOT EDIT
 * Generated file: MultiLinesAdjFindCountNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a MultiLinesAdjFindCountNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class MultiLinesAdjFindCountNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected Integer noOpIn;

/**
 *
 * Constructor to create a   MultiLinesAdjFindCountNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public MultiLinesAdjFindCountNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer noOpInIn) {
    super(id, context, "MultiLinesAdjFindCount");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("MLABillCountOut", noOpIn);
    }
  }
/**
 *
 * Sets the  MLABillCountOut
 * @param noOpInIn Integer to set
 *
 */
  public void setMLABillCountOut(Integer noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the MLABillCountOut passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getMLABillCountOut() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (Integer)inputMap.get("MLABillCountOut");
  }
}
