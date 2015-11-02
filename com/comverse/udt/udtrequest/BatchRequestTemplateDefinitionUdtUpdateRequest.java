/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionUdtUpdateRequest.java
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
 * Class used to create a BatchRequestTemplateDefinitionUdtUpdateRequest Udt Request
 *
 */

public class BatchRequestTemplateDefinitionUdtUpdateRequest extends BatchRequestTemplateDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestTemplateDefinitionUdtUpdateRequest
 * @param id Unique request name
 * @param batchRequestTemplateDefinitionUdtUpdateIn BatchRequestTemplateDefinitionObjectKeyData for BatchRequestTemplateDefinitionUdtUpdateRequest
 * @param batchRequestTemplateDefinitionUdtUpdateInUdtTemplateData BulkUdtTemplateRootRequest for BatchRequestTemplateDefinitionUdtUpdateRequest
 *
 */
@JsonCreator
  public BatchRequestTemplateDefinitionUdtUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestTemplateDefinition")BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionUdtUpdateIn, @JsonProperty("BatchRequestTemplateDefinitionUdtUpdateInUdtTemplateData")BulkUdtTemplateRootRequest batchRequestTemplateDefinitionUdtUpdateInUdtTemplateData) {
    super(id, "BatchRequestTemplateDefinitionUdtUpdate");
    if (batchRequestTemplateDefinitionUdtUpdateIn != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(batchRequestTemplateDefinitionUdtUpdateIn, new HashMap(), "BatchRequestTemplateDefinitionObjectKeyData").get("BatchRequestTemplateDefinitionObjectKeyData"));
    }
    if (batchRequestTemplateDefinitionUdtUpdateInUdtTemplateData != null) {
      addInput("BatchRequestTemplateDefinitionUdtUpdateInUdtTemplateData", batchRequestTemplateDefinitionUdtUpdateInUdtTemplateData);
    }
  }

/**
 *
 * Retrieves the BatchRequestTemplateDefinitionObjectKeyData that results from the BatchRequestTemplateDefinitionUdtUpdateRequest call
 * @return BatchRequestTemplateDefinitionObjectKeyData resulting from udt call
 *
 */

  public BatchRequestTemplateDefinitionObjectKeyData getOutput() {
    return BatchRequestTemplateDefinitionObjectKeyHelper.fromMap(outputMap, "BatchRequestTemplateDefinition");
  }
}
