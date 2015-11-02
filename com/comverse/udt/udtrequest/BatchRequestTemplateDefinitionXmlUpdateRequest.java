/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionXmlUpdateRequest.java
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
 * Class used to create a BatchRequestTemplateDefinitionXmlUpdateRequest Udt Request
 *
 */

public class BatchRequestTemplateDefinitionXmlUpdateRequest extends BatchRequestTemplateDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestTemplateDefinitionXmlUpdateRequest
 * @param id Unique request name
 * @param batchRequestTemplateDefinitionXmlUpdateIn BatchRequestTemplateDefinitionObjectKeyData for BatchRequestTemplateDefinitionXmlUpdateRequest
 * @param batchRequestTemplateDefinitionXmlUpdateInXmlFile String for BatchRequestTemplateDefinitionXmlUpdateRequest
 *
 */
@JsonCreator
  public BatchRequestTemplateDefinitionXmlUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestTemplateDefinition")BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionXmlUpdateIn, @JsonProperty("BatchRequestTemplateDefinitionXmlUpdateInXmlFile")String batchRequestTemplateDefinitionXmlUpdateInXmlFile) {
    super(id, "BatchRequestTemplateDefinitionXmlUpdate");
    if (batchRequestTemplateDefinitionXmlUpdateIn != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(batchRequestTemplateDefinitionXmlUpdateIn, new HashMap(), "BatchRequestTemplateDefinitionObjectKeyData").get("BatchRequestTemplateDefinitionObjectKeyData"));
    }
    if (batchRequestTemplateDefinitionXmlUpdateInXmlFile != null) {
      addInput("BatchRequestTemplateDefinitionXmlUpdateInXmlFile", batchRequestTemplateDefinitionXmlUpdateInXmlFile);
    }
  }

/**
 *
 * Retrieves the BatchRequestTemplateDefinitionObjectKeyData that results from the BatchRequestTemplateDefinitionXmlUpdateRequest call
 * @return BatchRequestTemplateDefinitionObjectKeyData resulting from udt call
 *
 */

  public BatchRequestTemplateDefinitionObjectKeyData getOutput() {
    return BatchRequestTemplateDefinitionObjectKeyHelper.fromMap(outputMap, "BatchRequestTemplateDefinition");
  }
}
