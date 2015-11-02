/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestParticipantFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParticipantFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestParticipantObjectFilter batchRequestParticipantFindIn;
/**
 *
 * Constructor to create a  BatchRequestParticipantFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParticipantFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantObjectFilter batchRequestParticipantFindInIn) {
    super(id, context, "BatchRequestParticipantFind");
    batchRequestParticipantFindIn = batchRequestParticipantFindInIn;
  }

  public void translateToMap() {
    if (batchRequestParticipantFindIn != null) {
      Integer index =  batchRequestParticipantFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectHelper.toMap(batchRequestParticipantFindIn, new HashMap(), "BatchRequestParticipant").get("BatchRequestParticipant"));
    }
  }


/**
 *
 * Sets the BatchRequestParticipant
 * @param batchRequestParticipantFindInIn Value of the batchRequestParticipantFindIn
 *
 */

  public void setBatchRequestParticipant(BatchRequestParticipantObjectFilter batchRequestParticipantFindInIn) {
    batchRequestParticipantFindIn = batchRequestParticipantFindInIn;
  }

  public void translateFromMap() {
    batchRequestParticipantFindIn = BatchRequestParticipantObjectHelper.fromMapFilter(inputMap, "BatchRequestParticipant");
  }

/**
 *
 * Gets the BatchRequestParticipant
 * @return Value of the BatchRequestParticipant
 *
 */

  public BatchRequestParticipantObjectFilter getBatchRequestParticipant( ) {
    return batchRequestParticipantFindIn;
  }

}
