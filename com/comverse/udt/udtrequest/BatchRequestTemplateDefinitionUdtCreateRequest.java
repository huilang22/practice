/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionUdtCreateRequest.java
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
 * Class used to create a BatchRequestTemplateDefinitionUdtCreateRequest Udt Request
 *
 */

public class BatchRequestTemplateDefinitionUdtCreateRequest extends BatchRequestTemplateDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestTemplateDefinitionUdtCreateRequest
 * @param id Unique request name
 * @param batchRequestTemplateDefinitionUdtCreateIn BatchRequestTemplateDefinitionObjectKeyData for BatchRequestTemplateDefinitionUdtCreateRequest
 * @param batchRequestTemplateDefinitionUdtCreateInUdtTemplateData BulkUdtTemplateRootRequest for BatchRequestTemplateDefinitionUdtCreateRequest
 *
 */
@JsonCreator
  public BatchRequestTemplateDefinitionUdtCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestTemplateDefinition")BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionUdtCreateIn, @JsonProperty("BatchRequestTemplateDefinitionUdtCreateInUdtTemplateData")BulkUdtTemplateRootRequest batchRequestTemplateDefinitionUdtCreateInUdtTemplateData) {
    super(id, "BatchRequestTemplateDefinitionUdtCreate");
    if (batchRequestTemplateDefinitionUdtCreateIn != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(batchRequestTemplateDefinitionUdtCreateIn, new HashMap(), "BatchRequestTemplateDefinitionObjectKeyData").get("BatchRequestTemplateDefinitionObjectKeyData"));
    }
    if (batchRequestTemplateDefinitionUdtCreateInUdtTemplateData != null) {
      addInput("BatchRequestTemplateDefinitionUdtCreateInUdtTemplateData", batchRequestTemplateDefinitionUdtCreateInUdtTemplateData);
    }
  }

/**
 *
 * Retrieves the BatchRequestTemplateDefinitionObjectKeyData that results from the BatchRequestTemplateDefinitionUdtCreateRequest call
 * @return BatchRequestTemplateDefinitionObjectKeyData resulting from udt call
 *
 */

  public BatchRequestTemplateDefinitionObjectKeyData getOutput() {
    return BatchRequestTemplateDefinitionObjectKeyHelper.fromMap(outputMap, "BatchRequestTemplateDefinition");
  }
}
