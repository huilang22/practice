/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchInvSourceDeleteRequest.java
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
 * Class used to create a BatchInvSourceDeleteRequest Udt Request
 *
 */

public class BatchInvSourceDeleteRequest extends BatchInvSourceSubRequestParent {
/**
 *
 * Constructor to create a  BatchInvSourceDeleteRequest
 * @param id Unique request name
 * @param BISDeleteIn BISObjectKeyData for BatchInvSourceDeleteRequest
 *
 */
@JsonCreator
  public BatchInvSourceDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchInvSource")BISObjectKeyData BISDeleteIn) {
    super(id, "BatchInvSourceDelete");
    if (BISDeleteIn != null) {
      addInput("BatchInvSource", BISObjectKeyHelper.toMap(BISDeleteIn, new HashMap(), "BISObjectKeyData").get("BISObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BISObjectData that results from the BatchInvSourceDeleteRequest call
 * @return BISObjectData resulting from udt call
 *
 */

  public BISObjectData getOutput() {
    return BISObjectHelper.fromMap(outputMap, "BatchInvSource");
  }
}
