/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDefinitionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestParticipantDefinitionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParticipantDefinitionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestParticipantDefinitionObjectData batchRequestParticipantDefinitionUpdateIn;
/**
 *
 * Constructor to create a  BatchRequestParticipantDefinitionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParticipantDefinitionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantDefinitionObjectData batchRequestParticipantDefinitionUpdateInIn) {
    super(id, context, "BatchRequestParticipantDefinitionUpdate");
    batchRequestParticipantDefinitionUpdateIn = batchRequestParticipantDefinitionUpdateInIn;
  }

  public void translateToMap() {
    if (batchRequestParticipantDefinitionUpdateIn != null) {
      batchRequestParticipantDefinitionUpdateIn.resetFlags(true, true);
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectHelper.toMap(batchRequestParticipantDefinitionUpdateIn, new HashMap(), "BatchRequestParticipantDefinition").get("BatchRequestParticipantDefinition"));
    }
  }


/**
 *
 * Sets the BatchRequestParticipantDefinition
 * @param batchRequestParticipantDefinitionUpdateInIn Value of the batchRequestParticipantDefinitionUpdateIn
 *
 */

  public void setBatchRequestParticipantDefinition(BatchRequestParticipantDefinitionObjectData batchRequestParticipantDefinitionUpdateInIn) {
    batchRequestParticipantDefinitionUpdateIn = batchRequestParticipantDefinitionUpdateInIn;
  }

  public void translateFromMap() {
    batchRequestParticipantDefinitionUpdateIn = BatchRequestParticipantDefinitionObjectHelper.fromMap(inputMap, "BatchRequestParticipantDefinition");
  }

/**
 *
 * Gets the BatchRequestParticipantDefinition
 * @return Value of the BatchRequestParticipantDefinition
 *
 */

  public BatchRequestParticipantDefinitionObjectData getBatchRequestParticipantDefinition( ) {
    return batchRequestParticipantDefinitionUpdateIn;
  }

}
