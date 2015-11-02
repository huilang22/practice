/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateTableUpdateRequest.java
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
 * Class used to create a RbrRateTableUpdateRequest Udt Request
 *
 */

public class RbrRateTableUpdateRequest extends RbrRateTableSubRequestParent {
/**
 *
 * Constructor to create a  RbrRateTableUpdateRequest
 * @param id Unique request name
 * @param RbrRtTblUpdIn RbrRateTableObjectData for RbrRateTableUpdateRequest
 *
 */
@JsonCreator
  public RbrRateTableUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrRateTable")RbrRateTableObjectData RbrRtTblUpdIn) {
    super(id, "RbrRateTableUpdate");
    if (RbrRtTblUpdIn != null) {
      addInput("RbrRateTable", RbrRateTableObjectHelper.toMap(RbrRtTblUpdIn, new HashMap(), "RbrRateTable").get("RbrRateTable"));
    }
  }

/**
 *
 * Retrieves the RbrRateTableObjectData that results from the RbrRateTableUpdateRequest call
 * @return RbrRateTableObjectData resulting from udt call
 *
 */

  public RbrRateTableObjectData getOutput() {
    return RbrRateTableObjectHelper.fromMap(outputMap, "RbrRateTable");
  }
}
