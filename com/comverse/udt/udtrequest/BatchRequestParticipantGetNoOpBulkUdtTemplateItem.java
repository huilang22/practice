/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestParticipantGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestParticipantGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestParticipantObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestParticipantGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestParticipantGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantObjectData noOpInIn) {
    super(id, context, "BatchRequestParticipantGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectHelper.toMap(noOpIn, new HashMap(), "BatchRequestParticipant").get("BatchRequestParticipant"));
    }
  }
/**
 *
 * Sets the  BatchRequestParticipant
 * @param noOpInIn BatchRequestParticipantObjectData to set
 *
 */
  public void setBatchRequestParticipant(BatchRequestParticipantObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestParticipant passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestParticipantObjectData getBatchRequestParticipant() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestParticipantObjectHelper.fromMap(inputMap, "BatchRequestParticipant");
  }
}
