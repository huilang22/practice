/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateTableCreateRequest.java
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
 * Class used to create a RbrRateTableCreateRequest Udt Request
 *
 */

public class RbrRateTableCreateRequest extends RbrRateTableSubRequestParent {
/**
 *
 * Constructor to create a  RbrRateTableCreateRequest
 * @param id Unique request name
 * @param RbrRtTblCrIn RbrRateTableObjectData for RbrRateTableCreateRequest
 *
 */
@JsonCreator
  public RbrRateTableCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrRateTable")RbrRateTableObjectData RbrRtTblCrIn) {
    super(id, "RbrRateTableCreate");
    if (RbrRtTblCrIn != null) {
      addInput("RbrRateTable", RbrRateTableObjectHelper.toMap(RbrRtTblCrIn, new HashMap(), "RbrRateTable").get("RbrRateTable"));
    }
  }

/**
 *
 * Retrieves the RbrRateTableObjectData that results from the RbrRateTableCreateRequest call
 * @return RbrRateTableObjectData resulting from udt call
 *
 */

  public RbrRateTableObjectData getOutput() {
    return RbrRateTableObjectHelper.fromMap(outputMap, "RbrRateTable");
  }
}
