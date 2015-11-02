/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParameterGetRequest.java
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
 * Class used to create a BatchRequestParameterGetRequest Udt Request
 *
 */

public class BatchRequestParameterGetRequest extends BatchRequestParameterSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestParameterGetRequest
 * @param id Unique request name
 * @param batchRequestParameterGetIn BatchRequestParameterObjectBaseKeyData for BatchRequestParameterGetRequest
 *
 */
@JsonCreator
  public BatchRequestParameterGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestParameter")BatchRequestParameterObjectBaseKeyData batchRequestParameterGetIn) {
    super(id, "BatchRequestParameterGet");
    if (batchRequestParameterGetIn != null) {
      addInput("BatchRequestParameter", BatchRequestParameterObjectBaseKeyHelper.toMap(batchRequestParameterGetIn, new HashMap(), "BatchRequestParameterObjectBaseKeyData").get("BatchRequestParameterObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchRequestParameterObjectData that results from the BatchRequestParameterGetRequest call
 * @return BatchRequestParameterObjectData resulting from udt call
 *
 */

  public BatchRequestParameterObjectData getOutput() {
    return BatchRequestParameterObjectHelper.fromMap(outputMap, "BatchRequestParameter");
  }
}
