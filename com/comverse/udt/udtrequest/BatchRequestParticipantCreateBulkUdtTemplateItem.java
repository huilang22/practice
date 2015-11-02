/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantCreateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestParticipantCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParticipantCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestParticipantObjectBaseData batchRequestParticipantCreateIn;
/**
 *
 * Constructor to create a  BatchRequestParticipantCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParticipantCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantObjectBaseData batchRequestParticipantCreateInIn) {
    super(id, context, "BatchRequestParticipantCreate");
    batchRequestParticipantCreateIn = batchRequestParticipantCreateInIn;
  }

  public void translateToMap() {
    if (batchRequestParticipantCreateIn != null) {
      batchRequestParticipantCreateIn.resetFlags(true, true);
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectBaseHelper.toMap(batchRequestParticipantCreateIn, new HashMap(), "BatchRequestParticipant").get("BatchRequestParticipant"));
    }
  }


/**
 *
 * Sets the BatchRequestParticipant
 * @param batchRequestParticipantCreateInIn Value of the batchRequestParticipantCreateIn
 *
 */

  public void setBatchRequestParticipant(BatchRequestParticipantObjectBaseData batchRequestParticipantCreateInIn) {
    batchRequestParticipantCreateIn = batchRequestParticipantCreateInIn;
  }

  public void translateFromMap() {
    batchRequestParticipantCreateIn = BatchRequestParticipantObjectBaseHelper.fromMap(inputMap, "BatchRequestParticipant");
  }

/**
 *
 * Gets the BatchRequestParticipant
 * @return Value of the BatchRequestParticipant
 *
 */

  public BatchRequestParticipantObjectBaseData getBatchRequestParticipant( ) {
    return batchRequestParticipantCreateIn;
  }

}
