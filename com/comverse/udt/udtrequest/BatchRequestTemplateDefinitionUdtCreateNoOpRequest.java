/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionUdtCreateNoOpRequest.java
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

import com.csgsystems.bat.data.*;

/**
 *
 * NoOp class used to simulate a BatchRequestTemplateDefinitionUdtCreateNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestTemplateDefinitionUdtCreateNoOpRequest extends BatchRequestTemplateDefinitionSubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestTemplateDefinitionUdtCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestTemplateDefinitionUdtCreateNoOpRequest(String id, BatchRequestTemplateDefinitionObjectKeyData noOpIn) {
    super(id, "BatchRequestTemplateDefinitionUdtCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(noOpIn, new HashMap(), "BatchRequestTemplateDefinition").get("BatchRequestTemplateDefinition"));
    }
  }
/**
 *
 * Retrieves the BatchRequestTemplateDefinitionObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestTemplateDefinitionObjectKeyData getOutput() {
    return BatchRequestTemplateDefinitionObjectKeyHelper.fromMap(outputMap, "BatchRequestTemplateDefinition");
  }
}
