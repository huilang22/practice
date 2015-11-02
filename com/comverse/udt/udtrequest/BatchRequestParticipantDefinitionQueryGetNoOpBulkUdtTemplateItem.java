/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDefinitionQueryGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestParticipantDefinitionQueryGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestParticipantDefinitionQueryGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BulkParticipantQuery noOpIn;

/**
 *
 * Constructor to create a   BatchRequestParticipantDefinitionQueryGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestParticipantDefinitionQueryGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BulkParticipantQuery noOpInIn) {
    super(id, context, "BatchRequestParticipantDefinitionQueryGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("BatchRequestParticipantDefinitionQueryGetOut", noOpIn);
    }
  }
/**
 *
 * Sets the  BatchRequestParticipantDefinitionQueryGetOut
 * @param noOpInIn BulkParticipantQuery to set
 *
 */
  public void setBatchRequestParticipantDefinitionQueryGetOut(BulkParticipantQuery noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestParticipantDefinitionQueryGetOut passed into the constructor
 * @return Simulated response
 *
 */
  public BulkParticipantQuery getBatchRequestParticipantDefinitionQueryGetOut() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (BulkParticipantQuery)inputMap.get("BatchRequestParticipantDefinitionQueryGetOut");
  }
}
