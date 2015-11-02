/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyParameterFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestNotifyParameterFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestNotifyParameterFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestNotifyParameterObjectFilter batchRequestNotifyParameterFindIn;
/**
 *
 * Constructor to create a  BatchRequestNotifyParameterFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestNotifyParameterFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestNotifyParameterObjectFilter batchRequestNotifyParameterFindInIn) {
    super(id, context, "BatchRequestNotifyParameterFind");
    batchRequestNotifyParameterFindIn = batchRequestNotifyParameterFindInIn;
  }

  public void translateToMap() {
    if (batchRequestNotifyParameterFindIn != null) {
      Integer index =  batchRequestNotifyParameterFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectHelper.toMap(batchRequestNotifyParameterFindIn, new HashMap(), "BatchRequestNotifyParameter").get("BatchRequestNotifyParameter"));
    }
  }


/**
 *
 * Sets the BatchRequestNotifyParameter
 * @param batchRequestNotifyParameterFindInIn Value of the batchRequestNotifyParameterFindIn
 *
 */

  public void setBatchRequestNotifyParameter(BatchRequestNotifyParameterObjectFilter batchRequestNotifyParameterFindInIn) {
    batchRequestNotifyParameterFindIn = batchRequestNotifyParameterFindInIn;
  }

  public void translateFromMap() {
    batchRequestNotifyParameterFindIn = BatchRequestNotifyParameterObjectHelper.fromMapFilter(inputMap, "BatchRequestNotifyParameter");
  }

/**
 *
 * Gets the BatchRequestNotifyParameter
 * @return Value of the BatchRequestNotifyParameter
 *
 */

  public BatchRequestNotifyParameterObjectFilter getBatchRequestNotifyParameter( ) {
    return batchRequestNotifyParameterFindIn;
  }

}
