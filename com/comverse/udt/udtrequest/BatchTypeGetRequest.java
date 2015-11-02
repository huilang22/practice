/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeGetRequest.java
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
 * Class used to create a BatchTypeGetRequest Udt Request
 *
 */

public class BatchTypeGetRequest extends BatchTypeSubRequestParent {
/**
 *
 * Constructor to create a  BatchTypeGetRequest
 * @param id Unique request name
 * @param batchTypeGetIn BatchTypeObjectKeyData for BatchTypeGetRequest
 *
 */
@JsonCreator
  public BatchTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchType")BatchTypeObjectKeyData batchTypeGetIn) {
    super(id, "BatchTypeGet");
    if (batchTypeGetIn != null) {
      addInput("BatchType", BatchTypeObjectKeyHelper.toMap(batchTypeGetIn, new HashMap(), "BatchTypeObjectKeyData").get("BatchTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchTypeObjectData that results from the BatchTypeGetRequest call
 * @return BatchTypeObjectData resulting from udt call
 *
 */

  public BatchTypeObjectData getOutput() {
    return BatchTypeObjectHelper.fromMap(outputMap, "BatchType");
  }
}
