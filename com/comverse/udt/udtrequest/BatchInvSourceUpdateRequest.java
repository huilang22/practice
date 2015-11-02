/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchInvSourceUpdateRequest.java
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
 * Class used to create a BatchInvSourceUpdateRequest Udt Request
 *
 */

public class BatchInvSourceUpdateRequest extends BatchInvSourceSubRequestParent {
/**
 *
 * Constructor to create a  BatchInvSourceUpdateRequest
 * @param id Unique request name
 * @param BISUpdateIn BISObjectData for BatchInvSourceUpdateRequest
 *
 */
@JsonCreator
  public BatchInvSourceUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchInvSource")BISObjectData BISUpdateIn) {
    super(id, "BatchInvSourceUpdate");
    if (BISUpdateIn != null) {
      addInput("BatchInvSource", BISObjectHelper.toMap(BISUpdateIn, new HashMap(), "BatchInvSource").get("BatchInvSource"));
    }
  }

/**
 *
 * Retrieves the BISObjectData that results from the BatchInvSourceUpdateRequest call
 * @return BISObjectData resulting from udt call
 *
 */

  public BISObjectData getOutput() {
    return BISObjectHelper.fromMap(outputMap, "BatchInvSource");
  }
}
