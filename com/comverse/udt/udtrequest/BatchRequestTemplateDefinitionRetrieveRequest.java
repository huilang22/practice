/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionRetrieveRequest.java
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
 * Class used to create a BatchRequestTemplateDefinitionRetrieveRequest Udt Request
 *
 */

public class BatchRequestTemplateDefinitionRetrieveRequest extends BatchRequestTemplateDefinitionRequest {
/**
 *
 * Constructor to create a  BatchRequestTemplateDefinitionRetrieveRequest
 * @param id Unique request name
 * @param batchRequestTemplateDefinitionRetrieveIn BatchRequestTemplateDefinitionObjectKeyData for BatchRequestTemplateDefinitionRetrieveRequest
 *
 */
@JsonCreator
  public BatchRequestTemplateDefinitionRetrieveRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestTemplateDefinition")BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionRetrieveIn) {
    super(id, "BatchRequestTemplateDefinitionRetrieve");
    if (batchRequestTemplateDefinitionRetrieveIn != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(batchRequestTemplateDefinitionRetrieveIn, new HashMap(), "BatchRequestTemplateDefinitionObjectKeyData").get("BatchRequestTemplateDefinitionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the Object that results from the BatchRequestTemplateDefinitionRetrieveRequest call
 * @return Object resulting from udt call
 *
 */

  public Object getOutput() {
    return  (Object)outputMap.get("Template");
  }
}
