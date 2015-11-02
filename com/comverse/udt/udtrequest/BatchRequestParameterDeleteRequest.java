/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParameterDeleteRequest.java
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
 * Class used to create a BatchRequestParameterDeleteRequest Udt Request
 *
 */

public class BatchRequestParameterDeleteRequest extends BatchRequestParameterSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestParameterDeleteRequest
 * @param id Unique request name
 * @param batchRequestParameterDeleteIn BatchRequestParameterObjectBaseKeyData for BatchRequestParameterDeleteRequest
 *
 */
@JsonCreator
  public BatchRequestParameterDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestParameter")BatchRequestParameterObjectBaseKeyData batchRequestParameterDeleteIn) {
    super(id, "BatchRequestParameterDelete");
    if (batchRequestParameterDeleteIn != null) {
      addInput("BatchRequestParameter", BatchRequestParameterObjectBaseKeyHelper.toMap(batchRequestParameterDeleteIn, new HashMap(), "BatchRequestParameterObjectBaseKeyData").get("BatchRequestParameterObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchRequestParameterObjectBaseData that results from the BatchRequestParameterDeleteRequest call
 * @return BatchRequestParameterObjectBaseData resulting from udt call
 *
 */

  public BatchRequestParameterObjectBaseData getOutput() {
    return BatchRequestParameterObjectBaseHelper.fromMap(outputMap, "BatchRequestParameter");
  }
}
