/*
 * Generated code DO NOT EDIT
 * Generated file: BatchExecutableEnvironmentalVariableGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchExecutableEnvironmentalVariableGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchExecutableEnvironmentalVariableGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchExecutableEnvironmentalVariableObjectKeyData batchExecutableEnvVarGetIn;
/**
 *
 * Constructor to create a  BatchExecutableEnvironmentalVariableGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchExecutableEnvironmentalVariableGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchExecutableEnvironmentalVariableObjectKeyData batchExecutableEnvVarGetInIn) {
    super(id, context, "BatchExecutableEnvironmentalVariableGet");
    batchExecutableEnvVarGetIn = batchExecutableEnvVarGetInIn;
  }

  public void translateToMap() {
    if (batchExecutableEnvVarGetIn != null) {
      batchExecutableEnvVarGetIn.resetFlags(true, true);
      addInput("BatchExecutableEnvironmentalVariable", BatchExecutableEnvironmentalVariableObjectKeyHelper.toMap(batchExecutableEnvVarGetIn, new HashMap(), "BatchExecutableEnvironmentalVariableObjectKeyData").get("BatchExecutableEnvironmentalVariableObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchExecutableEnvironmentalVariable
 * @param batchExecutableEnvVarGetInIn Value of the batchExecutableEnvVarGetIn
 *
 */

  public void setBatchExecutableEnvironmentalVariable(BatchExecutableEnvironmentalVariableObjectKeyData batchExecutableEnvVarGetInIn) {
    batchExecutableEnvVarGetIn = batchExecutableEnvVarGetInIn;
  }

  public void translateFromMap() {
    batchExecutableEnvVarGetIn = BatchExecutableEnvironmentalVariableObjectKeyHelper.fromMap(inputMap, "BatchExecutableEnvironmentalVariable");
  }

/**
 *
 * Gets the BatchExecutableEnvironmentalVariable
 * @return Value of the BatchExecutableEnvironmentalVariable
 *
 */

  public BatchExecutableEnvironmentalVariableObjectKeyData getBatchExecutableEnvironmentalVariable( ) {
    return batchExecutableEnvVarGetIn;
  }

}
