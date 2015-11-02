/*
 * Generated code DO NOT EDIT
 * Generated file: BatchTypeParameterDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchTypeParameterDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchTypeParameterDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchTypeParameterObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchTypeParameterDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchTypeParameterDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTypeParameterObjectData noOpInIn) {
    super(id, context, "BatchTypeParameterDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchTypeParameter", BatchTypeParameterObjectHelper.toMap(noOpIn, new HashMap(), "BatchTypeParameter").get("BatchTypeParameter"));
    }
  }
/**
 *
 * Sets the  BatchTypeParameter
 * @param noOpInIn BatchTypeParameterObjectData to set
 *
 */
  public void setBatchTypeParameter(BatchTypeParameterObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchTypeParameter passed into the constructor
 * @return Simulated response
 *
 */
  public BatchTypeParameterObjectData getBatchTypeParameter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchTypeParameterObjectHelper.fromMap(inputMap, "BatchTypeParameter");
  }
}
