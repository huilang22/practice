/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionCreateRequest.java
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
 * Class used to create a BatchRequestTemplateDefinitionCreateRequest Udt Request
 *
 */

public class BatchRequestTemplateDefinitionCreateRequest extends BatchRequestTemplateDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestTemplateDefinitionCreateRequest
 * @param id Unique request name
 * @param batchRequestTemplateDefinitionCreateIn BatchRequestTemplateDefinitionObjectData for BatchRequestTemplateDefinitionCreateRequest
 *
 */
@JsonCreator
  public BatchRequestTemplateDefinitionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestTemplateDefinition")BatchRequestTemplateDefinitionObjectData batchRequestTemplateDefinitionCreateIn) {
    super(id, "BatchRequestTemplateDefinitionCreate");
    if (batchRequestTemplateDefinitionCreateIn != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectHelper.toMap(batchRequestTemplateDefinitionCreateIn, new HashMap(), "BatchRequestTemplateDefinition").get("BatchRequestTemplateDefinition"));
    }
  }

/**
 *
 * Retrieves the BatchRequestTemplateDefinitionObjectData that results from the BatchRequestTemplateDefinitionCreateRequest call
 * @return BatchRequestTemplateDefinitionObjectData resulting from udt call
 *
 */

  public BatchRequestTemplateDefinitionObjectData getOutput() {
    return BatchRequestTemplateDefinitionObjectHelper.fromMap(outputMap, "BatchRequestTemplateDefinition");
  }
}
