/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDefinitionQueryCreateBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestParticipantDefinitionQueryCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParticipantDefinitionQueryCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionQueryCreateIn;
  protected BulkParticipantQuery batchRequestParticipantDefinitionQueryCreateInParticipantQuery;
/**
 *
 * Constructor to create a  BatchRequestParticipantDefinitionQueryCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParticipantDefinitionQueryCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionQueryCreateInIn, BulkParticipantQuery batchRequestParticipantDefinitionQueryCreateInParticipantQueryIn) {
    super(id, context, "BatchRequestParticipantDefinitionQueryCreate");
    batchRequestParticipantDefinitionQueryCreateIn = batchRequestParticipantDefinitionQueryCreateInIn;
    batchRequestParticipantDefinitionQueryCreateInParticipantQuery = batchRequestParticipantDefinitionQueryCreateInParticipantQueryIn;
  }

  public void translateToMap() {
    if (batchRequestParticipantDefinitionQueryCreateIn != null) {
      batchRequestParticipantDefinitionQueryCreateIn.resetFlags(true, true);
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectKeyHelper.toMap(batchRequestParticipantDefinitionQueryCreateIn, new HashMap(), "BatchRequestParticipantDefinitionObjectKeyData").get("BatchRequestParticipantDefinitionObjectKeyData"));
    }
    if (batchRequestParticipantDefinitionQueryCreateInParticipantQuery != null) {
      addInput("BatchRequestParticipantDefinitionQueryCreateInParticipantQuery", batchRequestParticipantDefinitionQueryCreateInParticipantQuery);
    }
  }


/**
 *
 * Sets the BatchRequestParticipantDefinition
 * @param batchRequestParticipantDefinitionQueryCreateInIn Value of the batchRequestParticipantDefinitionQueryCreateIn
 *
 */

  public void setBatchRequestParticipantDefinition(BatchRequestParticipantDefinitionObjectKeyData batchRequestParticipantDefinitionQueryCreateInIn) {
    batchRequestParticipantDefinitionQueryCreateIn = batchRequestParticipantDefinitionQueryCreateInIn;
  }

/**
 *
 * Sets the BatchRequestParticipantDefinitionQueryCreateInParticipantQuery
 * @param batchRequestParticipantDefinitionQueryCreateInParticipantQueryIn Value of the batchRequestParticipantDefinitionQueryCreateInParticipantQuery
 *
 */

  public void setBatchRequestParticipantDefinitionQueryCreateInParticipantQuery(BulkParticipantQuery batchRequestParticipantDefinitionQueryCreateInParticipantQueryIn) {
    batchRequestParticipantDefinitionQueryCreateInParticipantQuery = batchRequestParticipantDefinitionQueryCreateInParticipantQueryIn;
  }

  public void translateFromMap() {
    batchRequestParticipantDefinitionQueryCreateIn = BatchRequestParticipantDefinitionObjectKeyHelper.fromMap(inputMap, "BatchRequestParticipantDefinition");
    batchRequestParticipantDefinitionQueryCreateInParticipantQuery = (BulkParticipantQuery)inputMap.get("BatchRequestParticipantDefinitionQueryCreateInParticipantQuery");
  }

/**
 *
 * Gets the BatchRequestParticipantDefinition
 * @return Value of the BatchRequestParticipantDefinition
 *
 */

  public BatchRequestParticipantDefinitionObjectKeyData getBatchRequestParticipantDefinition( ) {
    return batchRequestParticipantDefinitionQueryCreateIn;
  }

/**
 *
 * Gets the BatchRequestParticipantDefinitionQueryCreateInParticipantQuery
 * @return Value of the BatchRequestParticipantDefinitionQueryCreateInParticipantQuery
 *
 */

  public BulkParticipantQuery getBatchRequestParticipantDefinitionQueryCreateInParticipantQuery( ) {
    return batchRequestParticipantDefinitionQueryCreateInParticipantQuery;
  }

}
