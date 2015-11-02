/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointUpdateRequest.java
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
 * Class used to create a UsagePointUpdateRequest Udt Request
 *
 */

public class UsagePointUpdateRequest extends UsagePointSubRequestParent {
/**
 *
 * Constructor to create a  UsagePointUpdateRequest
 * @param id Unique request name
 * @param UsgPntUpdateIn UsgPntObjectData for UsagePointUpdateRequest
 *
 */
@JsonCreator
  public UsagePointUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsagePoint")UsgPntObjectData UsgPntUpdateIn) {
    super(id, "UsagePointUpdate");
    if (UsgPntUpdateIn != null) {
      addInput("UsagePoint", UsgPntObjectHelper.toMap(UsgPntUpdateIn, new HashMap(), "UsagePoint").get("UsagePoint"));
    }
  }

/**
 *
 * Retrieves the UsgPntObjectData that results from the UsagePointUpdateRequest call
 * @return UsgPntObjectData resulting from udt call
 *
 */

  public UsgPntObjectData getOutput() {
    return UsgPntObjectHelper.fromMap(outputMap, "UsagePoint");
  }
}
