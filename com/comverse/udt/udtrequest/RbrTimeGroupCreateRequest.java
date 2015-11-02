/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrTimeGroupCreateRequest.java
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
 * Class used to create a RbrTimeGroupCreateRequest Udt Request
 *
 */

public class RbrTimeGroupCreateRequest extends RbrTimeGroupSubRequestParent {
/**
 *
 * Constructor to create a  RbrTimeGroupCreateRequest
 * @param id Unique request name
 * @param RbrTmGrpCreateIn RbrTmGrpObjectData for RbrTimeGroupCreateRequest
 *
 */
@JsonCreator
  public RbrTimeGroupCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrTimeGroup")RbrTmGrpObjectData RbrTmGrpCreateIn) {
    super(id, "RbrTimeGroupCreate");
    if (RbrTmGrpCreateIn != null) {
      addInput("RbrTimeGroup", RbrTmGrpObjectHelper.toMap(RbrTmGrpCreateIn, new HashMap(), "RbrTimeGroup").get("RbrTimeGroup"));
    }
  }

/**
 *
 * Retrieves the RbrTmGrpObjectData that results from the RbrTimeGroupCreateRequest call
 * @return RbrTmGrpObjectData resulting from udt call
 *
 */

  public RbrTmGrpObjectData getOutput() {
    return RbrTmGrpObjectHelper.fromMap(outputMap, "RbrTimeGroup");
  }
}
