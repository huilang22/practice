/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrTimeGroupFindRequest.java
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
 * Class used to create a RbrTimeGroupFindRequest Udt Request
 *
 */

public class RbrTimeGroupFindRequest extends RbrTimeGroupRequest {
/**
 *
 * Constructor to create a  RbrTimeGroupFindRequest
 * @param id Unique request name
 * @param RbrTmGrpFindIn RbrTmGrpObjectFilter for RbrTimeGroupFindRequest
 *
 */
@JsonCreator
  public RbrTimeGroupFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrTimeGroup")RbrTmGrpObjectFilter RbrTmGrpFindIn) {
    super(id, "RbrTimeGroupFind");
    if (RbrTmGrpFindIn != null) {
      Integer index =  RbrTmGrpFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrTimeGroup", RbrTmGrpObjectHelper.toMap(RbrTmGrpFindIn, new HashMap(), "RbrTimeGroup").get("RbrTimeGroup"));
    }
  }

/**
 *
 * Retrieves the RbrTmGrpObjectDataList that results from the RbrTimeGroupFindRequest call
 * @return RbrTmGrpObjectDataList resulting from udt call
 *
 */

  public RbrTmGrpObjectDataList getOutput() {
    return RbrTmGrpObjectHelper.fromMapList(outputMap, "RbrTimeGroupList");
  }
}
