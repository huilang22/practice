/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParticipantGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestParticipantGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParticipantGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestParticipantObjectBaseKeyData batchRequestParticipantGetIn;
/**
 *
 * Constructor to create a  BatchRequestParticipantGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParticipantGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantObjectBaseKeyData batchRequestParticipantGetInIn) {
    super(id, context, "BatchRequestParticipantGet");
    batchRequestParticipantGetIn = batchRequestParticipantGetInIn;
  }

  public void translateToMap() {
    if (batchRequestParticipantGetIn != null) {
      batchRequestParticipantGetIn.resetFlags(true, true);
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectBaseKeyHelper.toMap(batchRequestParticipantGetIn, new HashMap(), "BatchRequestParticipantObjectBaseKeyData").get("BatchRequestParticipantObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestParticipant
 * @param batchRequestParticipantGetInIn Value of the batchRequestParticipantGetIn
 *
 */

  public void setBatchRequestParticipant(BatchRequestParticipantObjectBaseKeyData batchRequestParticipantGetInIn) {
    batchRequestParticipantGetIn = batchRequestParticipantGetInIn;
  }

  public void translateFromMap() {
    batchRequestParticipantGetIn = BatchRequestParticipantObjectBaseKeyHelper.fromMap(inputMap, "BatchRequestParticipant");
  }

/**
 *
 * Gets the BatchRequestParticipant
 * @return Value of the BatchRequestParticipant
 *
 */

  public BatchRequestParticipantObjectBaseKeyData getBatchRequestParticipant( ) {
    return batchRequestParticipantGetIn;
  }

}
