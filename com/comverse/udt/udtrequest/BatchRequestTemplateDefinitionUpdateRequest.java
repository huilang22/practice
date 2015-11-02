/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionUpdateRequest.java
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
 * Class used to create a BatchRequestTemplateDefinitionUpdateRequest Udt Request
 *
 */

public class BatchRequestTemplateDefinitionUpdateRequest extends BatchRequestTemplateDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestTemplateDefinitionUpdateRequest
 * @param id Unique request name
 * @param batchRequestTemplateDefinitionUpdateIn BatchRequestTemplateDefinitionObjectData for BatchRequestTemplateDefinitionUpdateRequest
 *
 */
@JsonCreator
  public BatchRequestTemplateDefinitionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestTemplateDefinition")BatchRequestTemplateDefinitionObjectData batchRequestTemplateDefinitionUpdateIn) {
    super(id, "BatchRequestTemplateDefinitionUpdate");
    if (batchRequestTemplateDefinitionUpdateIn != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectHelper.toMap(batchRequestTemplateDefinitionUpdateIn, new HashMap(), "BatchRequestTemplateDefinition").get("BatchRequestTemplateDefinition"));
    }
  }

/**
 *
 * Retrieves the BatchRequestTemplateDefinitionObjectData that results from the BatchRequestTemplateDefinitionUpdateRequest call
 * @return BatchRequestTemplateDefinitionObjectData resulting from udt call
 *
 */

  public BatchRequestTemplateDefinitionObjectData getOutput() {
    return BatchRequestTemplateDefinitionObjectHelper.fromMap(outputMap, "BatchRequestTemplateDefinition");
  }
}
