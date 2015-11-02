/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyParameterCreateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestNotifyParameterCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestNotifyParameterCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestNotifyParameterObjectData batchRequestNotifyParameterCreateIn;
/**
 *
 * Constructor to create a  BatchRequestNotifyParameterCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestNotifyParameterCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestNotifyParameterObjectData batchRequestNotifyParameterCreateInIn) {
    super(id, context, "BatchRequestNotifyParameterCreate");
    batchRequestNotifyParameterCreateIn = batchRequestNotifyParameterCreateInIn;
  }

  public void translateToMap() {
    if (batchRequestNotifyParameterCreateIn != null) {
      batchRequestNotifyParameterCreateIn.resetFlags(true, true);
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectHelper.toMap(batchRequestNotifyParameterCreateIn, new HashMap(), "BatchRequestNotifyParameter").get("BatchRequestNotifyParameter"));
    }
  }


/**
 *
 * Sets the BatchRequestNotifyParameter
 * @param batchRequestNotifyParameterCreateInIn Value of the batchRequestNotifyParameterCreateIn
 *
 */

  public void setBatchRequestNotifyParameter(BatchRequestNotifyParameterObjectData batchRequestNotifyParameterCreateInIn) {
    batchRequestNotifyParameterCreateIn = batchRequestNotifyParameterCreateInIn;
  }

  public void translateFromMap() {
    batchRequestNotifyParameterCreateIn = BatchRequestNotifyParameterObjectHelper.fromMap(inputMap, "BatchRequestNotifyParameter");
  }

/**
 *
 * Gets the BatchRequestNotifyParameter
 * @return Value of the BatchRequestNotifyParameter
 *
 */

  public BatchRequestNotifyParameterObjectData getBatchRequestNotifyParameter( ) {
    return batchRequestNotifyParameterCreateIn;
  }

}
