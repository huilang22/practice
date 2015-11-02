/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageGetRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a UnbilledUsageGetRequest Udt Request
 *
 */

public class UnbilledUsageGetRequest extends UnbilledUsageSubRequestParent {
/**
 *
 * Constructor to create a  UnbilledUsageGetRequest
 * @param id Unique request name
 * @param UnbilledUsagegetIn UnbilledUsageObjectKeyData for UnbilledUsageGetRequest
 *
 */
@JsonCreator
  public UnbilledUsageGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnbilledUsage")UnbilledUsageObjectKeyData UnbilledUsagegetIn) {
    super(id, "UnbilledUsageGet");
    if (UnbilledUsagegetIn != null) {
      addInput("UnbilledUsage", UnbilledUsageObjectKeyHelper.toMap(UnbilledUsagegetIn, new HashMap(), "UnbilledUsageObjectKeyData").get("UnbilledUsageObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UnbilledUsageObjectData that results from the UnbilledUsageGetRequest call
 * @return UnbilledUsageObjectData resulting from udt call
 *
 */

  public UnbilledUsageObjectData getOutput() {
    return UnbilledUsageObjectHelper.fromMap(outputMap, "UnbilledUsage");
  }
}
