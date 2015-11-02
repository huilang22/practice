/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParticipantDeleteBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a BatchRequestParticipantDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParticipantDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestParticipantObjectBaseKeyData batchRequestParticipantDeleteIn;
/**
 *
 * Constructor to create a  BatchRequestParticipantDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParticipantDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantObjectBaseKeyData batchRequestParticipantDeleteInIn) {
    super(id, context, "BatchRequestParticipantDelete");
    batchRequestParticipantDeleteIn = batchRequestParticipantDeleteInIn;
  }

  public void translateToMap() {
    if (batchRequestParticipantDeleteIn != null) {
      batchRequestParticipantDeleteIn.resetFlags(true, true);
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectBaseKeyHelper.toMap(batchRequestParticipantDeleteIn, new HashMap(), "BatchRequestParticipantObjectBaseKeyData").get("BatchRequestParticipantObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestParticipant
 * @param batchRequestParticipantDeleteInIn Value of the batchRequestParticipantDeleteIn
 *
 */

  public void setBatchRequestParticipant(BatchRequestParticipantObjectBaseKeyData batchRequestParticipantDeleteInIn) {
    batchRequestParticipantDeleteIn = batchRequestParticipantDeleteInIn;
  }

  public void translateFromMap() {
    batchRequestParticipantDeleteIn = BatchRequestParticipantObjectBaseKeyHelper.fromMap(inputMap, "BatchRequestParticipant");
  }

/**
 *
 * Gets the BatchRequestParticipant
 * @return Value of the BatchRequestParticipant
 *
 */

  public BatchRequestParticipantObjectBaseKeyData getBatchRequestParticipant( ) {
    return batchRequestParticipantDeleteIn;
  }

}
