/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeUpdateRequest.java
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
 * Class used to create a BatchTypeUpdateRequest Udt Request
 *
 */

public class BatchTypeUpdateRequest extends BatchTypeSubRequestParent {
/**
 *
 * Constructor to create a  BatchTypeUpdateRequest
 * @param id Unique request name
 * @param batchTypeUpdateIn BatchTypeObjectData for BatchTypeUpdateRequest
 *
 */
@JsonCreator
  public BatchTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchType")BatchTypeObjectData batchTypeUpdateIn) {
    super(id, "BatchTypeUpdate");
    if (batchTypeUpdateIn != null) {
      addInput("BatchType", BatchTypeObjectHelper.toMap(batchTypeUpdateIn, new HashMap(), "BatchType").get("BatchType"));
    }
  }

/**
 *
 * Retrieves the BatchTypeObjectData that results from the BatchTypeUpdateRequest call
 * @return BatchTypeObjectData resulting from udt call
 *
 */

  public BatchTypeObjectData getOutput() {
    return BatchTypeObjectHelper.fromMap(outputMap, "BatchType");
  }
}
