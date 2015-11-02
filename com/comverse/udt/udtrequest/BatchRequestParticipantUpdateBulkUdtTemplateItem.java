/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestParticipantUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParticipantUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestParticipantObjectBaseData batchRequestParticipantUpdateIn;
/**
 *
 * Constructor to create a  BatchRequestParticipantUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParticipantUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantObjectBaseData batchRequestParticipantUpdateInIn) {
    super(id, context, "BatchRequestParticipantUpdate");
    batchRequestParticipantUpdateIn = batchRequestParticipantUpdateInIn;
  }

  public void translateToMap() {
    if (batchRequestParticipantUpdateIn != null) {
      batchRequestParticipantUpdateIn.resetFlags(true, true);
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectBaseHelper.toMap(batchRequestParticipantUpdateIn, new HashMap(), "BatchRequestParticipant").get("BatchRequestParticipant"));
    }
  }


/**
 *
 * Sets the BatchRequestParticipant
 * @param batchRequestParticipantUpdateInIn Value of the batchRequestParticipantUpdateIn
 *
 */

  public void setBatchRequestParticipant(BatchRequestParticipantObjectBaseData batchRequestParticipantUpdateInIn) {
    batchRequestParticipantUpdateIn = batchRequestParticipantUpdateInIn;
  }

  public void translateFromMap() {
    batchRequestParticipantUpdateIn = BatchRequestParticipantObjectBaseHelper.fromMap(inputMap, "BatchRequestParticipant");
  }

/**
 *
 * Gets the BatchRequestParticipant
 * @return Value of the BatchRequestParticipant
 *
 */

  public BatchRequestParticipantObjectBaseData getBatchRequestParticipant( ) {
    return batchRequestParticipantUpdateIn;
  }

}
