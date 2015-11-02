/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionDeleteRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BatchRequestTemplateDefinitionDeleteRequest Udt Request
 *
 */

public class BatchRequestTemplateDefinitionDeleteRequest extends BatchRequestTemplateDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestTemplateDefinitionDeleteRequest
 * @param id Unique request name
 * @param batchRequestTemplateDefinitionDeleteIn BatchRequestTemplateDefinitionObjectKeyData for BatchRequestTemplateDefinitionDeleteRequest
 *
 */
@JsonCreator
  public BatchRequestTemplateDefinitionDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestTemplateDefinition")BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionDeleteIn) {
    super(id, "BatchRequestTemplateDefinitionDelete");
    if (batchRequestTemplateDefinitionDeleteIn != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(batchRequestTemplateDefinitionDeleteIn, new HashMap(), "BatchRequestTemplateDefinitionObjectKeyData").get("BatchRequestTemplateDefinitionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchRequestTemplateDefinitionObjectData that results from the BatchRequestTemplateDefinitionDeleteRequest call
 * @return BatchRequestTemplateDefinitionObjectData resulting from udt call
 *
 */

  public BatchRequestTemplateDefinitionObjectData getOutput() {
    return BatchRequestTemplateDefinitionObjectHelper.fromMap(outputMap, "BatchRequestTemplateDefinition");
  }
}
