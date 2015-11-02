/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableEnvironmentalVariableCreateBulkUdtTemplateItem.java
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
 * Class used to create a BatchExecutableEnvironmentalVariableCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchExecutableEnvironmentalVariableCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchExecutableEnvironmentalVariableObjectData batchExecutableEnvVarCreateIn;
/**
 *
 * Constructor to create a  BatchExecutableEnvironmentalVariableCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchExecutableEnvironmentalVariableCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchExecutableEnvironmentalVariableObjectData batchExecutableEnvVarCreateInIn) {
    super(id, context, "BatchExecutableEnvironmentalVariableCreate");
    batchExecutableEnvVarCreateIn = batchExecutableEnvVarCreateInIn;
  }

  public void translateToMap() {
    if (batchExecutableEnvVarCreateIn != null) {
      batchExecutableEnvVarCreateIn.resetFlags(true, true);
      addInput("BatchExecutableEnvironmentalVariable", BatchExecutableEnvironmentalVariableObjectHelper.toMap(batchExecutableEnvVarCreateIn, new HashMap(), "BatchExecutableEnvironmentalVariable").get("BatchExecutableEnvironmentalVariable"));
    }
  }


/**
 *
 * Sets the BatchExecutableEnvironmentalVariable
 * @param batchExecutableEnvVarCreateInIn Value of the batchExecutableEnvVarCreateIn
 *
 */

  public void setBatchExecutableEnvironmentalVariable(BatchExecutableEnvironmentalVariableObjectData batchExecutableEnvVarCreateInIn) {
    batchExecutableEnvVarCreateIn = batchExecutableEnvVarCreateInIn;
  }

  public void translateFromMap() {
    batchExecutableEnvVarCreateIn = BatchExecutableEnvironmentalVariableObjectHelper.fromMap(inputMap, "BatchExecutableEnvironmentalVariable");
  }

/**
 *
 * Gets the BatchExecutableEnvironmentalVariable
 * @return Value of the BatchExecutableEnvironmentalVariable
 *
 */

  public BatchExecutableEnvironmentalVariableObjectData getBatchExecutableEnvironmentalVariable( ) {
    return batchExecutableEnvVarCreateIn;
  }

}
