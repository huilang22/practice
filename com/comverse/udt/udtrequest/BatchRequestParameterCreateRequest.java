/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParameterCreateRequest.java
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
 * Class used to create a BatchRequestParameterCreateRequest Udt Request
 *
 */

public class BatchRequestParameterCreateRequest extends BatchRequestParameterSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestParameterCreateRequest
 * @param id Unique request name
 * @param batchRequestParameterCreateIn BatchRequestParameterObjectBaseData for BatchRequestParameterCreateRequest
 *
 */
@JsonCreator
  public BatchRequestParameterCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestParameter")BatchRequestParameterObjectBaseData batchRequestParameterCreateIn) {
    super(id, "BatchRequestParameterCreate");
    if (batchRequestParameterCreateIn != null) {
      addInput("BatchRequestParameter", BatchRequestParameterObjectBaseHelper.toMap(batchRequestParameterCreateIn, new HashMap(), "BatchRequestParameter").get("BatchRequestParameter"));
    }
  }

/**
 *
 * Retrieves the BatchRequestParameterObjectBaseData that results from the BatchRequestParameterCreateRequest call
 * @return BatchRequestParameterObjectBaseData resulting from udt call
 *
 */

  public BatchRequestParameterObjectBaseData getOutput() {
    return BatchRequestParameterObjectBaseHelper.fromMap(outputMap, "BatchRequestParameter");
  }
}
