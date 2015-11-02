/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParameterGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestParameterGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParameterGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestParameterObjectBaseKeyData batchRequestParameterGetIn;
/**
 *
 * Constructor to create a  BatchRequestParameterGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParameterGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParameterObjectBaseKeyData batchRequestParameterGetInIn) {
    super(id, context, "BatchRequestParameterGet");
    batchRequestParameterGetIn = batchRequestParameterGetInIn;
  }

  public void translateToMap() {
    if (batchRequestParameterGetIn != null) {
      batchRequestParameterGetIn.resetFlags(true, true);
      addInput("BatchRequestParameter", BatchRequestParameterObjectBaseKeyHelper.toMap(batchRequestParameterGetIn, new HashMap(), "BatchRequestParameterObjectBaseKeyData").get("BatchRequestParameterObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestParameter
 * @param batchRequestParameterGetInIn Value of the batchRequestParameterGetIn
 *
 */

  public void setBatchRequestParameter(BatchRequestParameterObjectBaseKeyData batchRequestParameterGetInIn) {
    batchRequestParameterGetIn = batchRequestParameterGetInIn;
  }

  public void translateFromMap() {
    batchRequestParameterGetIn = BatchRequestParameterObjectBaseKeyHelper.fromMap(inputMap, "BatchRequestParameter");
  }

/**
 *
 * Gets the BatchRequestParameter
 * @return Value of the BatchRequestParameter
 *
 */

  public BatchRequestParameterObjectBaseKeyData getBatchRequestParameter( ) {
    return batchRequestParameterGetIn;
  }

}
