/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionUdtCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchRequestTemplateDefinitionUdtCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestTemplateDefinitionUdtCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestTemplateDefinitionObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   BatchRequestTemplateDefinitionUdtCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestTemplateDefinitionUdtCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestTemplateDefinitionObjectKeyData noOpInIn) {
    super(id, context, "BatchRequestTemplateDefinitionUdtCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(noOpIn, new HashMap(), "BatchRequestTemplateDefinition").get("BatchRequestTemplateDefinition"));
    }
  }
/**
 *
 * Sets the  BatchRequestTemplateDefinition
 * @param noOpInIn BatchRequestTemplateDefinitionObjectKeyData to set
 *
 */
  public void setBatchRequestTemplateDefinition(BatchRequestTemplateDefinitionObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestTemplateDefinition passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestTemplateDefinitionObjectKeyData getBatchRequestTemplateDefinition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestTemplateDefinitionObjectKeyHelper.fromMap(inputMap, "BatchRequestTemplateDefinition");
  }
}
