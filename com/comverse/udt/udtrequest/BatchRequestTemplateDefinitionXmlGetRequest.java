/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionXmlGetRequest.java
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
 * Class used to create a BatchRequestTemplateDefinitionXmlGetRequest Udt Request
 *
 */

public class BatchRequestTemplateDefinitionXmlGetRequest extends BatchRequestTemplateDefinitionRequest {
/**
 *
 * Constructor to create a  BatchRequestTemplateDefinitionXmlGetRequest
 * @param id Unique request name
 * @param batchRequestTemplateDefinitionXmlGetIn BatchRequestTemplateDefinitionObjectKeyData for BatchRequestTemplateDefinitionXmlGetRequest
 *
 */
@JsonCreator
  public BatchRequestTemplateDefinitionXmlGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestTemplateDefinition")BatchRequestTemplateDefinitionObjectKeyData batchRequestTemplateDefinitionXmlGetIn) {
    super(id, "BatchRequestTemplateDefinitionXmlGet");
    if (batchRequestTemplateDefinitionXmlGetIn != null) {
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectKeyHelper.toMap(batchRequestTemplateDefinitionXmlGetIn, new HashMap(), "BatchRequestTemplateDefinitionObjectKeyData").get("BatchRequestTemplateDefinitionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the String that results from the BatchRequestTemplateDefinitionXmlGetRequest call
 * @return String resulting from udt call
 *
 */

  public String getOutput() {
    return  (String)outputMap.get("BatchRequestTemplateDefinitionXmlGetOutXmlFile");
  }
}
