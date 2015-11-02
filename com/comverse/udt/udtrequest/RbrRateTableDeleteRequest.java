/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateTableDeleteRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a RbrRateTableDeleteRequest Udt Request
 *
 */

public class RbrRateTableDeleteRequest extends RbrRateTableSubRequestParent {
/**
 *
 * Constructor to create a  RbrRateTableDeleteRequest
 * @param id Unique request name
 * @param RbrRtTblDeleteIn RbrRateTableObjectKeyData for RbrRateTableDeleteRequest
 *
 */
@JsonCreator
  public RbrRateTableDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrRateTable")RbrRateTableObjectKeyData RbrRtTblDeleteIn) {
    super(id, "RbrRateTableDelete");
    if (RbrRtTblDeleteIn != null) {
      addInput("RbrRateTable", RbrRateTableObjectKeyHelper.toMap(RbrRtTblDeleteIn, new HashMap(), "RbrRateTableObjectKeyData").get("RbrRateTableObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RbrRateTableObjectData that results from the RbrRateTableDeleteRequest call
 * @return RbrRateTableObjectData resulting from udt call
 *
 */

  public RbrRateTableObjectData getOutput() {
    return RbrRateTableObjectHelper.fromMap(outputMap, "RbrRateTable");
  }
}
