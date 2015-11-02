/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantFindCountBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestParticipantFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParticipantFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestParticipantObjectFilter batchRequestParticipantFindCountIn;
/**
 *
 * Constructor to create a  BatchRequestParticipantFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParticipantFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantObjectFilter batchRequestParticipantFindCountInIn) {
    super(id, context, "BatchRequestParticipantFindCount");
    batchRequestParticipantFindCountIn = batchRequestParticipantFindCountInIn;
  }

  public void translateToMap() {
    if (batchRequestParticipantFindCountIn != null) {
      Integer index =  batchRequestParticipantFindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectHelper.toMap(batchRequestParticipantFindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }


/**
 *
 * Sets the BatchRequestParticipant
 * @param batchRequestParticipantFindCountInIn Value of the batchRequestParticipantFindCountIn
 *
 */

  public void setBatchRequestParticipant(BatchRequestParticipantObjectFilter batchRequestParticipantFindCountInIn) {
    batchRequestParticipantFindCountIn = batchRequestParticipantFindCountInIn;
  }

  public void translateFromMap() {
    batchRequestParticipantFindCountIn = BatchRequestParticipantObjectHelper.fromMapFilter(inputMap, "BatchRequestParticipant");
  }

/**
 *
 * Gets the BatchRequestParticipant
 * @return Value of the BatchRequestParticipant
 *
 */

  public BatchRequestParticipantObjectFilter getBatchRequestParticipant( ) {
    return batchRequestParticipantFindCountIn;
  }

}
