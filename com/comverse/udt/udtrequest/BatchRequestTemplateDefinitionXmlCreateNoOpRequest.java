/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionXmlCreateNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestTemplateDefinitionXmlCreateNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestTemplateDefinitionXmlCreateNoOpRequest extends BatchRequestTemplateDefinitionSubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestTemplateDefinitionXmlCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestTemplateDefinitionXmlCreateNoOpRequest(String id, BatchRequestTemplateDefinitionObjectKeyData noOpIn) {
    super(id, "BatchRequestTemplateDefinitionXmlCreateNoOpRequest");
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
