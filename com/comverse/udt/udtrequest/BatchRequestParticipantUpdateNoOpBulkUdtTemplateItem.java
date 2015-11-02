/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestParticipantUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestParticipantUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestParticipantObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestParticipantUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestParticipantUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantObjectBaseData noOpInIn) {
    super(id, context, "BatchRequestParticipantUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectBaseHelper.toMap(noOpIn, new HashMap(), "BatchRequestParticipant").get("BatchRequestParticipant"));
    }
  }
/**
 *
 * Sets the  BatchRequestParticipant
 * @param noOpInIn BatchRequestParticipantObjectBaseData to set
 *
 */
  public void setBatchRequestParticipant(BatchRequestParticipantObjectBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestParticipant passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestParticipantObjectBaseData getBatchRequestParticipant() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestParticipantObjectBaseHelper.fromMap(inputMap, "BatchRequestParticipant");
  }
}
