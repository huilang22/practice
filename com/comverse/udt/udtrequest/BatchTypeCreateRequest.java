/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeCreateRequest.java
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
 * Class used to create a BatchTypeCreateRequest Udt Request
 *
 */

public class BatchTypeCreateRequest extends BatchTypeSubRequestParent {
/**
 *
 * Constructor to create a  BatchTypeCreateRequest
 * @param id Unique request name
 * @param batchTypeCreateIn BatchTypeObjectData for BatchTypeCreateRequest
 *
 */
@JsonCreator
  public BatchTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchType")BatchTypeObjectData batchTypeCreateIn) {
    super(id, "BatchTypeCreate");
    if (batchTypeCreateIn != null) {
      addInput("BatchType", BatchTypeObjectHelper.toMap(batchTypeCreateIn, new HashMap(), "BatchType").get("BatchType"));
    }
  }

/**
 *
 * Retrieves the BatchTypeObjectData that results from the BatchTypeCreateRequest call
 * @return BatchTypeObjectData resulting from udt call
 *
 */

  public BatchTypeObjectData getOutput() {
    return BatchTypeObjectHelper.fromMap(outputMap, "BatchType");
  }
}
