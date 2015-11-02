/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeDeleteRequest.java
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
 * Class used to create a BatchTypeDeleteRequest Udt Request
 *
 */

public class BatchTypeDeleteRequest extends BatchTypeSubRequestParent {
/**
 *
 * Constructor to create a  BatchTypeDeleteRequest
 * @param id Unique request name
 * @param batchTypeDeleteIn BatchTypeObjectKeyData for BatchTypeDeleteRequest
 *
 */
@JsonCreator
  public BatchTypeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchType")BatchTypeObjectKeyData batchTypeDeleteIn) {
    super(id, "BatchTypeDelete");
    if (batchTypeDeleteIn != null) {
      addInput("BatchType", BatchTypeObjectKeyHelper.toMap(batchTypeDeleteIn, new HashMap(), "BatchTypeObjectKeyData").get("BatchTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchTypeObjectData that results from the BatchTypeDeleteRequest call
 * @return BatchTypeObjectData resulting from udt call
 *
 */

  public BatchTypeObjectData getOutput() {
    return BatchTypeObjectHelper.fromMap(outputMap, "BatchType");
  }
}
