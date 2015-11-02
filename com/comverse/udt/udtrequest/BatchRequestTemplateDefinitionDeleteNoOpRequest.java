/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionDeleteNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestTemplateDefinitionDeleteNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestTemplateDefinitionDeleteNoOpRequest extends BatchRequestTemplateDefinitionSubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestTemplateDefinitionDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestTemplateDefinitionDeleteNoOpRequest(String id, BatchRequestTemplateDefinitionObjectData noOpIn) {
    super(id, "BatchRequestTemplateDefinitionDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectHelper.toMap(noOpIn, new HashMap(), "BatchRequestTemplateDefinition").get("BatchRequestTemplateDefinition"));
    }
  }
/**
 *
 * Retrieves the BatchRequestTemplateDefinitionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestTemplateDefinitionObjectData getOutput() {
    return BatchRequestTemplateDefinitionObjectHelper.fromMap(outputMap, "BatchRequestTemplateDefinition");
  }
}
