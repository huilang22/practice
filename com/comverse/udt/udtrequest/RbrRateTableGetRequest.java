/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateTableGetRequest.java
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
 * Class used to create a RbrRateTableGetRequest Udt Request
 *
 */

public class RbrRateTableGetRequest extends RbrRateTableSubRequestParent {
/**
 *
 * Constructor to create a  RbrRateTableGetRequest
 * @param id Unique request name
 * @param RbrRtTblGetIn RbrRateTableObjectKeyData for RbrRateTableGetRequest
 *
 */
@JsonCreator
  public RbrRateTableGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrRateTable")RbrRateTableObjectKeyData RbrRtTblGetIn) {
    super(id, "RbrRateTableGet");
    if (RbrRtTblGetIn != null) {
      addInput("RbrRateTable", RbrRateTableObjectKeyHelper.toMap(RbrRtTblGetIn, new HashMap(), "RbrRateTableObjectKeyData").get("RbrRateTableObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RbrRateTableObjectData that results from the RbrRateTableGetRequest call
 * @return RbrRateTableObjectData resulting from udt call
 *
 */

  public RbrRateTableObjectData getOutput() {
    return RbrRateTableObjectHelper.fromMap(outputMap, "RbrRateTable");
  }
}
