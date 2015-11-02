/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrTimeGroupDeleteRequest.java
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
 * Class used to create a RbrTimeGroupDeleteRequest Udt Request
 *
 */

public class RbrTimeGroupDeleteRequest extends RbrTimeGroupSubRequestParent {
/**
 *
 * Constructor to create a  RbrTimeGroupDeleteRequest
 * @param id Unique request name
 * @param RbrTmGrpDeleteIn RbrTmGrpObjectKeyData for RbrTimeGroupDeleteRequest
 *
 */
@JsonCreator
  public RbrTimeGroupDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrTimeGroup")RbrTmGrpObjectKeyData RbrTmGrpDeleteIn) {
    super(id, "RbrTimeGroupDelete");
    if (RbrTmGrpDeleteIn != null) {
      addInput("RbrTimeGroup", RbrTmGrpObjectKeyHelper.toMap(RbrTmGrpDeleteIn, new HashMap(), "RbrTmGrpObjectKeyData").get("RbrTmGrpObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RbrTmGrpObjectData that results from the RbrTimeGroupDeleteRequest call
 * @return RbrTmGrpObjectData resulting from udt call
 *
 */

  public RbrTmGrpObjectData getOutput() {
    return RbrTmGrpObjectHelper.fromMap(outputMap, "RbrTimeGroup");
  }
}
