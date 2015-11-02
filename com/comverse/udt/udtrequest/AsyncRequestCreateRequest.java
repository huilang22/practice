/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AsyncRequestCreateRequest.java
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

import com.csgsystems.utl.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a AsyncRequestCreateRequest Udt Request
 *
 */

public class AsyncRequestCreateRequest extends AsyncRequestRequest {
/**
 *
 * Constructor to create a  AsyncRequestCreateRequest
 * @param id Unique request name
 * @param AsyncRequestCreateIn AsyncRequestObjectData for AsyncRequestCreateRequest
 *
 */
@JsonCreator
  public AsyncRequestCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AsyncRequest")AsyncRequestObjectData AsyncRequestCreateIn) {
    super(id, "AsyncRequestCreate");
    if (AsyncRequestCreateIn != null) {
      addInput("AsyncRequest", AsyncRequestObjectHelper.toMap(AsyncRequestCreateIn, new HashMap(), "BatchId").get("BatchId"));
    }
  }

/**
 *
 * Retrieves the BigInteger that results from the AsyncRequestCreateRequest call
 * @return BigInteger resulting from udt call
 *
 */

  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("BatchId");
  }
}
