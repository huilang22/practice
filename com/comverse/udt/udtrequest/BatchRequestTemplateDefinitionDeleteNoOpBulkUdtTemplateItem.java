/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestTemplateDefinitionDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestTemplateDefinitionDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestTemplateDefinitionObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestTemplateDefinitionDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestTemplateDefinitionDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestTemplateDefinitionObjectData noOpInIn) {
    super(id, context, "BatchRequestTemplateDefinitionDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectHelper.toMap(noOpIn, new HashMap(), "BatchRequestTemplateDefinition").get("BatchRequestTemplateDefinition"));
    }
  }
/**
 *
 * Sets the  BatchRequestTemplateDefinition
 * @param noOpInIn BatchRequestTemplateDefinitionObjectData to set
 *
 */
  public void setBatchRequestTemplateDefinition(BatchRequestTemplateDefinitionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestTemplateDefinition passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestTemplateDefinitionObjectData getBatchRequestTemplateDefinition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestTemplateDefinitionObjectHelper.fromMap(inputMap, "BatchRequestTemplateDefinition");
  }
}
