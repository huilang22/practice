/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyParameterFindCountBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestNotifyParameterFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestNotifyParameterFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestNotifyParameterObjectFilter batchRequestNotifyParameterFindCountIn;
/**
 *
 * Constructor to create a  BatchRequestNotifyParameterFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestNotifyParameterFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestNotifyParameterObjectFilter batchRequestNotifyParameterFindCountInIn) {
    super(id, context, "BatchRequestNotifyParameterFindCount");
    batchRequestNotifyParameterFindCountIn = batchRequestNotifyParameterFindCountInIn;
  }

  public void translateToMap() {
    if (batchRequestNotifyParameterFindCountIn != null) {
      Integer index =  batchRequestNotifyParameterFindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectHelper.toMap(batchRequestNotifyParameterFindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }


/**
 *
 * Sets the BatchRequestNotifyParameter
 * @param batchRequestNotifyParameterFindCountInIn Value of the batchRequestNotifyParameterFindCountIn
 *
 */

  public void setBatchRequestNotifyParameter(BatchRequestNotifyParameterObjectFilter batchRequestNotifyParameterFindCountInIn) {
    batchRequestNotifyParameterFindCountIn = batchRequestNotifyParameterFindCountInIn;
  }

  public void translateFromMap() {
    batchRequestNotifyParameterFindCountIn = BatchRequestNotifyParameterObjectHelper.fromMapFilter(inputMap, "BatchRequestNotifyParameter");
  }

/**
 *
 * Gets the BatchRequestNotifyParameter
 * @return Value of the BatchRequestNotifyParameter
 *
 */

  public BatchRequestNotifyParameterObjectFilter getBatchRequestNotifyParameter( ) {
    return batchRequestNotifyParameterFindCountIn;
  }

}
