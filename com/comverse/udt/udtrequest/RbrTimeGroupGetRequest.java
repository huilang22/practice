/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrTimeGroupGetRequest.java
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
 * Class used to create a RbrTimeGroupGetRequest Udt Request
 *
 */

public class RbrTimeGroupGetRequest extends RbrTimeGroupSubRequestParent {
/**
 *
 * Constructor to create a  RbrTimeGroupGetRequest
 * @param id Unique request name
 * @param RbrTmGrpGetIn RbrTmGrpObjectKeyData for RbrTimeGroupGetRequest
 *
 */
@JsonCreator
  public RbrTimeGroupGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrTimeGroup")RbrTmGrpObjectKeyData RbrTmGrpGetIn) {
    super(id, "RbrTimeGroupGet");
    if (RbrTmGrpGetIn != null) {
      addInput("RbrTimeGroup", RbrTmGrpObjectKeyHelper.toMap(RbrTmGrpGetIn, new HashMap(), "RbrTmGrpObjectKeyData").get("RbrTmGrpObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RbrTmGrpObjectData that results from the RbrTimeGroupGetRequest call
 * @return RbrTmGrpObjectData resulting from udt call
 *
 */

  public RbrTmGrpObjectData getOutput() {
    return RbrTmGrpObjectHelper.fromMap(outputMap, "RbrTimeGroup");
  }
}
