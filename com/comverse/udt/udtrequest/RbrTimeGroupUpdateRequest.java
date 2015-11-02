/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrTimeGroupUpdateRequest.java
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
 * Class used to create a RbrTimeGroupUpdateRequest Udt Request
 *
 */

public class RbrTimeGroupUpdateRequest extends RbrTimeGroupSubRequestParent {
/**
 *
 * Constructor to create a  RbrTimeGroupUpdateRequest
 * @param id Unique request name
 * @param RbrTmGrpUpdateIn RbrTmGrpObjectData for RbrTimeGroupUpdateRequest
 *
 */
@JsonCreator
  public RbrTimeGroupUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrTimeGroup")RbrTmGrpObjectData RbrTmGrpUpdateIn) {
    super(id, "RbrTimeGroupUpdate");
    if (RbrTmGrpUpdateIn != null) {
      addInput("RbrTimeGroup", RbrTmGrpObjectHelper.toMap(RbrTmGrpUpdateIn, new HashMap(), "RbrTimeGroup").get("RbrTimeGroup"));
    }
  }

/**
 *
 * Retrieves the RbrTmGrpObjectData that results from the RbrTimeGroupUpdateRequest call
 * @return RbrTmGrpObjectData resulting from udt call
 *
 */

  public RbrTmGrpObjectData getOutput() {
    return RbrTmGrpObjectHelper.fromMap(outputMap, "RbrTimeGroup");
  }
}
