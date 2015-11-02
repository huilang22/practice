/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableEnvironmentalVariableUpdateBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a BatchExecutableEnvironmentalVariableUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchExecutableEnvironmentalVariableUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchExecutableEnvironmentalVariableObjectData batchExecutableEnvVarUpdateIn;
/**
 *
 * Constructor to create a  BatchExecutableEnvironmentalVariableUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchExecutableEnvironmentalVariableUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchExecutableEnvironmentalVariableObjectData batchExecutableEnvVarUpdateInIn) {
    super(id, context, "BatchExecutableEnvironmentalVariableUpdate");
    batchExecutableEnvVarUpdateIn = batchExecutableEnvVarUpdateInIn;
  }

  public void translateToMap() {
    if (batchExecutableEnvVarUpdateIn != null) {
      batchExecutableEnvVarUpdateIn.resetFlags(true, true);
      addInput("BatchExecutableEnvironmentalVariable", BatchExecutableEnvironmentalVariableObjectHelper.toMap(batchExecutableEnvVarUpdateIn, new HashMap(), "BatchExecutableEnvironmentalVariable").get("BatchExecutableEnvironmentalVariable"));
    }
  }


/**
 *
 * Sets the BatchExecutableEnvironmentalVariable
 * @param batchExecutableEnvVarUpdateInIn Value of the batchExecutableEnvVarUpdateIn
 *
 */

  public void setBatchExecutableEnvironmentalVariable(BatchExecutableEnvironmentalVariableObjectData batchExecutableEnvVarUpdateInIn) {
    batchExecutableEnvVarUpdateIn = batchExecutableEnvVarUpdateInIn;
  }

  public void translateFromMap() {
    batchExecutableEnvVarUpdateIn = BatchExecutableEnvironmentalVariableObjectHelper.fromMap(inputMap, "BatchExecutableEnvironmentalVariable");
  }

/**
 *
 * Gets the BatchExecutableEnvironmentalVariable
 * @return Value of the BatchExecutableEnvironmentalVariable
 *
 */

  public BatchExecutableEnvironmentalVariableObjectData getBatchExecutableEnvironmentalVariable( ) {
    return batchExecutableEnvVarUpdateIn;
  }

}
