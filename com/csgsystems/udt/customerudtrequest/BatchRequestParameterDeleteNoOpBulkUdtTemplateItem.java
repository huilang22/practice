/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParameterDeleteNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bat.data.*;

/**
 *
 * NoOp class used to simulate a BatchRequestParameterDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestParameterDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestParameterObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestParameterDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestParameterDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParameterObjectBaseData noOpInIn) {
    super(id, context, "BatchRequestParameterDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequestParameter", BatchRequestParameterObjectBaseHelper.toMap(noOpIn, new HashMap(), "BatchRequestParameter").get("BatchRequestParameter"));
    }
  }
/**
 *
 * Sets the  BatchRequestParameter
 * @param noOpInIn BatchRequestParameterObjectBaseData to set
 *
 */
  public void setBatchRequestParameter(BatchRequestParameterObjectBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestParameter passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestParameterObjectBaseData getBatchRequestParameter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestParameterObjectBaseHelper.fromMap(inputMap, "BatchRequestParameter");
  }
}
