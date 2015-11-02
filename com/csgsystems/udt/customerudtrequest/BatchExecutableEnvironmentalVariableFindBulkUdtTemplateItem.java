/*
 * Generated code DO NOT EDIT
 * Generated file: BatchExecutableEnvironmentalVariableFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchExecutableEnvironmentalVariableFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchExecutableEnvironmentalVariableFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchExecutableEnvironmentalVariableObjectFilter batchExecutableEnvVarFindIn;
/**
 *
 * Constructor to create a  BatchExecutableEnvironmentalVariableFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchExecutableEnvironmentalVariableFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchExecutableEnvironmentalVariableObjectFilter batchExecutableEnvVarFindInIn) {
    super(id, context, "BatchExecutableEnvironmentalVariableFind");
    batchExecutableEnvVarFindIn = batchExecutableEnvVarFindInIn;
  }

  public void translateToMap() {
    if (batchExecutableEnvVarFindIn != null) {
      Integer index =  batchExecutableEnvVarFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchExecutableEnvironmentalVariable", BatchExecutableEnvironmentalVariableObjectHelper.toMap(batchExecutableEnvVarFindIn, new HashMap(), "BatchExecutableEnvironmentalVariable").get("BatchExecutableEnvironmentalVariable"));
    }
  }


/**
 *
 * Sets the BatchExecutableEnvironmentalVariable
 * @param batchExecutableEnvVarFindInIn Value of the batchExecutableEnvVarFindIn
 *
 */

  public void setBatchExecutableEnvironmentalVariable(BatchExecutableEnvironmentalVariableObjectFilter batchExecutableEnvVarFindInIn) {
    batchExecutableEnvVarFindIn = batchExecutableEnvVarFindInIn;
  }

  public void translateFromMap() {
    batchExecutableEnvVarFindIn = BatchExecutableEnvironmentalVariableObjectHelper.fromMapFilter(inputMap, "BatchExecutableEnvironmentalVariable");
  }

/**
 *
 * Gets the BatchExecutableEnvironmentalVariable
 * @return Value of the BatchExecutableEnvironmentalVariable
 *
 */

  public BatchExecutableEnvironmentalVariableObjectFilter getBatchExecutableEnvironmentalVariable( ) {
    return batchExecutableEnvVarFindIn;
  }

}
