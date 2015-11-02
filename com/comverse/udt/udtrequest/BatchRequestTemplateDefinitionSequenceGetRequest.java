/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionSequenceGetRequest.java
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
 * Class used to create a BatchRequestTemplateDefinitionSequenceGetRequest Udt Request
 *
 */

public class BatchRequestTemplateDefinitionSequenceGetRequest extends BatchRequestTemplateDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestTemplateDefinitionSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BatchRequestTemplateDefinitionSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BatchRequestTemplateDefinitionSequenceGet");
  }

/**
 *
 * Retrieves the BatchRequestTemplateDefinitionObjectKeyData that results from the BatchRequestTemplateDefinitionSequenceGetRequest call
 * @return BatchRequestTemplateDefinitionObjectKeyData resulting from udt call
 *
 */

  public BatchRequestTemplateDefinitionObjectKeyData getOutput() {
    return BatchRequestTemplateDefinitionObjectKeyHelper.fromMap(outputMap, "BatchRequestTemplateDefinition");
  }
}
