/*
 * Generated code DO NOT EDIT
 * Generated file: CtmDataUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a CtmDataUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtmDataUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtmDataRowData noOpIn;

/**
 *
 * Constructor to create a   CtmDataUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtmDataUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmDataRowData noOpInIn) {
    super(id, context, "CtmDataUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtmData", CtmDataRowHelper.toMap(noOpIn, new HashMap(), "CtmData").get("CtmData"));
    }
  }
/**
 *
 * Sets the  CtmData
 * @param noOpInIn CtmDataRowData to set
 *
 */
  public void setCtmData(CtmDataRowData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtmData passed into the constructor
 * @return Simulated response
 *
 */
  public CtmDataRowData getCtmData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtmDataRowHelper.fromMap(inputMap, "CtmData");
  }
}
