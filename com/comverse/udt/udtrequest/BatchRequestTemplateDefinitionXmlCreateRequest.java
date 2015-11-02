/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionXmlCreateRequest.java
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
 * Class used to create a BatchRequestTemplateDefinitionXmlCreateRequest Udt Request
 *
 */

public class BatchRequestTemplateDefinitionXmlCreateRequest extends BatchRequestTemplateDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestTemplateDefinitionXmlCreateRequest
 * @param id Unique request name
 * @param batchRequestTemplateDefinitionXmlCreateIn BatchRequestTemplateDefinitionObjectKeyData for BatchRequestTemplateDefinitionXmlCreateRequest
 * @param batchRequestTemplateDefinitionXmlCreateInXmlFile String for BatchRequestTemplateDefinitionXmlCreateRequest
 *
 */
@JsonCreator
  public BatchRequestTemplateDefinitionXmlCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestTemplateDefinition")BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionXmlCreateIn, @JsonProperty("BatchRequestTemplateDefinitionXmlCreateInXmlFile")String batchRequestTemplateDefinitionXmlCreateInXmlFile) {
    super(id, "BatchRequestTemplateDefinitionXmlCreate");
    if (batchRequestTemplateDefinitionXmlCreateIn != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(batchRequestTemplateDefinitionXmlCreateIn, new HashMap(), "BatchRequestTemplateDefinitionObjectKeyData").get("BatchRequestTemplateDefinitionObjectKeyData"));
    }
    if (batchRequestTemplateDefinitionXmlCreateInXmlFile != null) {
      addInput("BatchRequestTemplateDefinitionXmlCreateInXmlFile", batchRequestTemplateDefinitionXmlCreateInXmlFile);
    }
  }

/**
 *
 * Retrieves the BatchRequestTemplateDefinitionObjectKeyData that results from the BatchRequestTemplateDefinitionXmlCreateRequest call
 * @return BatchRequestTemplateDefinitionObjectKeyData resulting from udt call
 *
 */

  public BatchRequestTemplateDefinitionObjectKeyData getOutput() {
    return BatchRequestTemplateDefinitionObjectKeyHelper.fromMap(outputMap, "BatchRequestTemplateDefinition");
  }
}
