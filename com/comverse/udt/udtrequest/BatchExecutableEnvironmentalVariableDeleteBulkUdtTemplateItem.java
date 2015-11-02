/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableEnvironmentalVariableDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BatchExecutableEnvironmentalVariableDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchExecutableEnvironmentalVariableDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchExecutableEnvironmentalVariableObjectKeyData batchExecutableEnvVarDeleteIn;
/**
 *
 * Constructor to create a  BatchExecutableEnvironmentalVariableDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchExecutableEnvironmentalVariableDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchExecutableEnvironmentalVariableObjectKeyData batchExecutableEnvVarDeleteInIn) {
    super(id, context, "BatchExecutableEnvironmentalVariableDelete");
    batchExecutableEnvVarDeleteIn = batchExecutableEnvVarDeleteInIn;
  }

  public void translateToMap() {
    if (batchExecutableEnvVarDeleteIn != null) {
      batchExecutableEnvVarDeleteIn.resetFlags(true, true);
      addInput("BatchExecutableEnvironmentalVariable", BatchExecutableEnvironmentalVariableObjectKeyHelper.toMap(batchExecutableEnvVarDeleteIn, new HashMap(), "BatchExecutableEnvironmentalVariableObjectKeyData").get("BatchExecutableEnvironmentalVariableObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchExecutableEnvironmentalVariable
 * @param batchExecutableEnvVarDeleteInIn Value of the batchExecutableEnvVarDeleteIn
 *
 */

  public void setBatchExecutableEnvironmentalVariable(BatchExecutableEnvironmentalVariableObjectKeyData batchExecutableEnvVarDeleteInIn) {
    batchExecutableEnvVarDeleteIn = batchExecutableEnvVarDeleteInIn;
  }

  public void translateFromMap() {
    batchExecutableEnvVarDeleteIn = BatchExecutableEnvironmentalVariableObjectKeyHelper.fromMap(inputMap, "BatchExecutableEnvironmentalVariable");
  }

/**
 *
 * Gets the BatchExecutableEnvironmentalVariable
 * @return Value of the BatchExecutableEnvironmentalVariable
 *
 */

  public BatchExecutableEnvironmentalVariableObjectKeyData getBatchExecutableEnvironmentalVariable( ) {
    return batchExecutableEnvVarDeleteIn;
  }

}
