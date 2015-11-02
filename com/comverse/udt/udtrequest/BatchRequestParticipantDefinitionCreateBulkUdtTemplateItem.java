/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDefinitionCreateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestParticipantDefinitionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParticipantDefinitionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestParticipantDefinitionObjectData batchRequestParticipantDefinitionCreateIn;
/**
 *
 * Constructor to create a  BatchRequestParticipantDefinitionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParticipantDefinitionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantDefinitionObjectData batchRequestParticipantDefinitionCreateInIn) {
    super(id, context, "BatchRequestParticipantDefinitionCreate");
    batchRequestParticipantDefinitionCreateIn = batchRequestParticipantDefinitionCreateInIn;
  }

  public void translateToMap() {
    if (batchRequestParticipantDefinitionCreateIn != null) {
      batchRequestParticipantDefinitionCreateIn.resetFlags(true, true);
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectHelper.toMap(batchRequestParticipantDefinitionCreateIn, new HashMap(), "BatchRequestParticipantDefinition").get("BatchRequestParticipantDefinition"));
    }
  }


/**
 *
 * Sets the BatchRequestParticipantDefinition
 * @param batchRequestParticipantDefinitionCreateInIn Value of the batchRequestParticipantDefinitionCreateIn
 *
 */

  public void setBatchRequestParticipantDefinition(BatchRequestParticipantDefinitionObjectData batchRequestParticipantDefinitionCreateInIn) {
    batchRequestParticipantDefinitionCreateIn = batchRequestParticipantDefinitionCreateInIn;
  }

  public void translateFromMap() {
    batchRequestParticipantDefinitionCreateIn = BatchRequestParticipantDefinitionObjectHelper.fromMap(inputMap, "BatchRequestParticipantDefinition");
  }

/**
 *
 * Gets the BatchRequestParticipantDefinition
 * @return Value of the BatchRequestParticipantDefinition
 *
 */

  public BatchRequestParticipantDefinitionObjectData getBatchRequestParticipantDefinition( ) {
    return batchRequestParticipantDefinitionCreateIn;
  }

}
