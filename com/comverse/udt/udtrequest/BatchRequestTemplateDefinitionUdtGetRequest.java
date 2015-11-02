/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionUdtGetRequest.java
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
 * Class used to create a BatchRequestTemplateDefinitionUdtGetRequest Udt Request
 *
 */

public class BatchRequestTemplateDefinitionUdtGetRequest extends BatchRequestTemplateDefinitionRequest {
/**
 *
 * Constructor to create a  BatchRequestTemplateDefinitionUdtGetRequest
 * @param id Unique request name
 * @param batchRequestTemplateDefinitionUdtGetIn BatchRequestTemplateDefinitionObjectKeyData for BatchRequestTemplateDefinitionUdtGetRequest
 *
 */
@JsonCreator
  public BatchRequestTemplateDefinitionUdtGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestTemplateDefinition")BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionUdtGetIn) {
    super(id, "BatchRequestTemplateDefinitionUdtGet");
    if (batchRequestTemplateDefinitionUdtGetIn != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(batchRequestTemplateDefinitionUdtGetIn, new HashMap(), "BatchRequestTemplateDefinitionObjectKeyData").get("BatchRequestTemplateDefinitionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BulkUdtTemplateRootRequest that results from the BatchRequestTemplateDefinitionUdtGetRequest call
 * @return BulkUdtTemplateRootRequest resulting from udt call
 *
 */

  public BulkUdtTemplateRootRequest getOutput() {
    return  (BulkUdtTemplateRootRequest)outputMap.get("BatchRequestTemplateDefinitionUdtGetOutUdtTemplateData");
  }
}
