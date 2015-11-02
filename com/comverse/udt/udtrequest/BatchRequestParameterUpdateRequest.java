/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParameterUpdateRequest.java
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
 * Class used to create a BatchRequestParameterUpdateRequest Udt Request
 *
 */

public class BatchRequestParameterUpdateRequest extends BatchRequestParameterSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestParameterUpdateRequest
 * @param id Unique request name
 * @param batchRequestParameterUpdateIn BatchRequestParameterObjectBaseData for BatchRequestParameterUpdateRequest
 *
 */
@JsonCreator
  public BatchRequestParameterUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestParameter")BatchRequestParameterObjectBaseData batchRequestParameterUpdateIn) {
    super(id, "BatchRequestParameterUpdate");
    if (batchRequestParameterUpdateIn != null) {
      addInput("BatchRequestParameter", BatchRequestParameterObjectBaseHelper.toMap(batchRequestParameterUpdateIn, new HashMap(), "BatchRequestParameter").get("BatchRequestParameter"));
    }
  }

/**
 *
 * Retrieves the BatchRequestParameterObjectBaseData that results from the BatchRequestParameterUpdateRequest call
 * @return BatchRequestParameterObjectBaseData resulting from udt call
 *
 */

  public BatchRequestParameterObjectBaseData getOutput() {
    return BatchRequestParameterObjectBaseHelper.fromMap(outputMap, "BatchRequestParameter");
  }
}
