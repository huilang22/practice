/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParameterCreateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestParameterCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParameterCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestParameterObjectBaseData batchRequestParameterCreateIn;
/**
 *
 * Constructor to create a  BatchRequestParameterCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParameterCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParameterObjectBaseData batchRequestParameterCreateInIn) {
    super(id, context, "BatchRequestParameterCreate");
    batchRequestParameterCreateIn = batchRequestParameterCreateInIn;
  }

  public void translateToMap() {
    if (batchRequestParameterCreateIn != null) {
      batchRequestParameterCreateIn.resetFlags(true, true);
      addInput("BatchRequestParameter", BatchRequestParameterObjectBaseHelper.toMap(batchRequestParameterCreateIn, new HashMap(), "BatchRequestParameter").get("BatchRequestParameter"));
    }
  }


/**
 *
 * Sets the BatchRequestParameter
 * @param batchRequestParameterCreateInIn Value of the batchRequestParameterCreateIn
 *
 */

  public void setBatchRequestParameter(BatchRequestParameterObjectBaseData batchRequestParameterCreateInIn) {
    batchRequestParameterCreateIn = batchRequestParameterCreateInIn;
  }

  public void translateFromMap() {
    batchRequestParameterCreateIn = BatchRequestParameterObjectBaseHelper.fromMap(inputMap, "BatchRequestParameter");
  }

/**
 *
 * Gets the BatchRequestParameter
 * @return Value of the BatchRequestParameter
 *
 */

  public BatchRequestParameterObjectBaseData getBatchRequestParameter( ) {
    return batchRequestParameterCreateIn;
  }

}
