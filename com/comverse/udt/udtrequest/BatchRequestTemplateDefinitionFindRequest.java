/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionFindRequest.java
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
 * Class used to create a BatchRequestTemplateDefinitionFindRequest Udt Request
 *
 */

public class BatchRequestTemplateDefinitionFindRequest extends BatchRequestTemplateDefinitionRequest {
/**
 *
 * Constructor to create a  BatchRequestTemplateDefinitionFindRequest
 * @param id Unique request name
 * @param batchRequestTemplateDefinitionFindIn BatchRequestTemplateDefinitionObjectFilter for BatchRequestTemplateDefinitionFindRequest
 *
 */
@JsonCreator
  public BatchRequestTemplateDefinitionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestTemplateDefinition")BatchRequestTemplateDefinitionObjectFilter batchRequestTemplateDefinitionFindIn) {
    super(id, "BatchRequestTemplateDefinitionFind");
    if (batchRequestTemplateDefinitionFindIn != null) {
      Integer index =  batchRequestTemplateDefinitionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestTemplateDefinition", BatchRequestTemplateDefinitionObjectHelper.toMap(batchRequestTemplateDefinitionFindIn, new HashMap(), "BatchRequestTemplateDefinition").get("BatchRequestTemplateDefinition"));
    }
  }

/**
 *
 * Retrieves the BatchRequestTemplateDefinitionObjectDataList that results from the BatchRequestTemplateDefinitionFindRequest call
 * @return BatchRequestTemplateDefinitionObjectDataList resulting from udt call
 *
 */

  public BatchRequestTemplateDefinitionObjectDataList getOutput() {
    return BatchRequestTemplateDefinitionObjectHelper.fromMapList(outputMap, "BatchRequestTemplateDefinitionList");
  }
}
