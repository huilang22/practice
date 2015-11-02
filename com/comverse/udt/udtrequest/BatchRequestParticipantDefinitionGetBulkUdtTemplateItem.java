/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDefinitionGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestParticipantDefinitionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParticipantDefinitionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionGetIn;
/**
 *
 * Constructor to create a  BatchRequestParticipantDefinitionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParticipantDefinitionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionGetInIn) {
    super(id, context, "BatchRequestParticipantDefinitionGet");
    batchRequestParticipantDefinitionGetIn = batchRequestParticipantDefinitionGetInIn;
  }

  public void translateToMap() {
    if (batchRequestParticipantDefinitionGetIn != null) {
      batchRequestParticipantDefinitionGetIn.resetFlags(true, true);
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectKeyHelper.toMap(batchRequestParticipantDefinitionGetIn, new HashMap(), "BatchRequestParticipantDefinitionObjectKeyData").get("BatchRequestParticipantDefinitionObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchRequestParticipantDefinition
 * @param batchRequestParticipantDefinitionGetInIn Value of the batchRequestParticipantDefinitionGetIn
 *
 */

  public void setBatchRequestParticipantDefinition(BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionGetInIn) {
    batchRequestParticipantDefinitionGetIn = batchRequestParticipantDefinitionGetInIn;
  }

  public void translateFromMap() {
    batchRequestParticipantDefinitionGetIn = BatchRequestParticipantDefinitionObjectKeyHelper.fromMap(inputMap, "BatchRequestParticipantDefinition");
  }

/**
 *
 * Gets the BatchRequestParticipantDefinition
 * @return Value of the BatchRequestParticipantDefinition
 *
 */

  public BatchRequestParticipantDefinitionObjectKeyData getBatchRequestParticipantDefinition( ) {
    return batchRequestParticipantDefinitionGetIn;
  }

}
