/*
 * Generated code DO NOT EDIT
 * Generated file: BatchExecutableEnvironmentalVariableUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchExecutableEnvironmentalVariableUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchExecutableEnvironmentalVariableUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchExecutableEnvironmentalVariableObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchExecutableEnvironmentalVariableUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchExecutableEnvironmentalVariableUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchExecutableEnvironmentalVariableObjectData noOpInIn) {
    super(id, context, "BatchExecutableEnvironmentalVariableUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchExecutableEnvironmentalVariable", BatchExecutableEnvironmentalVariableObjectHelper.toMap(noOpIn, new HashMap(), "BatchExecutableEnvironmentalVariable").get("BatchExecutableEnvironmentalVariable"));
    }
  }
/**
 *
 * Sets the  BatchExecutableEnvironmentalVariable
 * @param noOpInIn BatchExecutableEnvironmentalVariableObjectData to set
 *
 */
  public void setBatchExecutableEnvironmentalVariable(BatchExecutableEnvironmentalVariableObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchExecutableEnvironmentalVariable passed into the constructor
 * @return Simulated response
 *
 */
  public BatchExecutableEnvironmentalVariableObjectData getBatchExecutableEnvironmentalVariable() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchExecutableEnvironmentalVariableObjectHelper.fromMap(inputMap, "BatchExecutableEnvironmentalVariable");
  }
}
