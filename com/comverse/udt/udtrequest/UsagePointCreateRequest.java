/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointCreateRequest.java
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
 * Class used to create a UsagePointCreateRequest Udt Request
 *
 */

public class UsagePointCreateRequest extends UsagePointSubRequestParent {
/**
 *
 * Constructor to create a  UsagePointCreateRequest
 * @param id Unique request name
 * @param UsgPntCreateIn UsgPntObjectData for UsagePointCreateRequest
 *
 */
@JsonCreator
  public UsagePointCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsagePoint")UsgPntObjectData UsgPntCreateIn) {
    super(id, "UsagePointCreate");
    if (UsgPntCreateIn != null) {
      addInput("UsagePoint", UsgPntObjectHelper.toMap(UsgPntCreateIn, new HashMap(), "UsagePoint").get("UsagePoint"));
    }
  }

/**
 *
 * Retrieves the UsgPntObjectData that results from the UsagePointCreateRequest call
 * @return UsgPntObjectData resulting from udt call
 *
 */

  public UsgPntObjectData getOutput() {
    return UsgPntObjectHelper.fromMap(outputMap, "UsagePoint");
  }
}
