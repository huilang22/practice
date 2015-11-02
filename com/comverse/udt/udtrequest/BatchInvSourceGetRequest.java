/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchInvSourceGetRequest.java
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
 * Class used to create a BatchInvSourceGetRequest Udt Request
 *
 */

public class BatchInvSourceGetRequest extends BatchInvSourceSubRequestParent {
/**
 *
 * Constructor to create a  BatchInvSourceGetRequest
 * @param id Unique request name
 * @param BISGetIn BISObjectKeyData for BatchInvSourceGetRequest
 *
 */
@JsonCreator
  public BatchInvSourceGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchInvSource")BISObjectKeyData BISGetIn) {
    super(id, "BatchInvSourceGet");
    if (BISGetIn != null) {
      addInput("BatchInvSource", BISObjectKeyHelper.toMap(BISGetIn, new HashMap(), "BISObjectKeyData").get("BISObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BISObjectData that results from the BatchInvSourceGetRequest call
 * @return BISObjectData resulting from udt call
 *
 */

  public BISObjectData getOutput() {
    return BISObjectHelper.fromMap(outputMap, "BatchInvSource");
  }
}
