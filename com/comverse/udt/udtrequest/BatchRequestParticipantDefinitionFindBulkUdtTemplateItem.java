/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDefinitionFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestParticipantDefinitionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParticipantDefinitionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestParticipantDefinitionObjectFilter batchRequestParticipantDefinitionFindIn;
/**
 *
 * Constructor to create a  BatchRequestParticipantDefinitionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParticipantDefinitionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantDefinitionObjectFilter batchRequestParticipantDefinitionFindInIn) {
    super(id, context, "BatchRequestParticipantDefinitionFind");
    batchRequestParticipantDefinitionFindIn = batchRequestParticipantDefinitionFindInIn;
  }

  public void translateToMap() {
    if (batchRequestParticipantDefinitionFindIn != null) {
      Integer index =  batchRequestParticipantDefinitionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectHelper.toMap(batchRequestParticipantDefinitionFindIn, new HashMap(), "BatchRequestParticipantDefinition").get("BatchRequestParticipantDefinition"));
    }
  }


/**
 *
 * Sets the BatchRequestParticipantDefinition
 * @param batchRequestParticipantDefinitionFindInIn Value of the batchRequestParticipantDefinitionFindIn
 *
 */

  public void setBatchRequestParticipantDefinition(BatchRequestParticipantDefinitionObjectFilter batchRequestParticipantDefinitionFindInIn) {
    batchRequestParticipantDefinitionFindIn = batchRequestParticipantDefinitionFindInIn;
  }

  public void translateFromMap() {
    batchRequestParticipantDefinitionFindIn = BatchRequestParticipantDefinitionObjectHelper.fromMapFilter(inputMap, "BatchRequestParticipantDefinition");
  }

/**
 *
 * Gets the BatchRequestParticipantDefinition
 * @return Value of the BatchRequestParticipantDefinition
 *
 */

  public BatchRequestParticipantDefinitionObjectFilter getBatchRequestParticipantDefinition( ) {
    return batchRequestParticipantDefinitionFindIn;
  }

}
