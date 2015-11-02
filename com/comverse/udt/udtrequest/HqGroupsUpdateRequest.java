/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupsUpdateRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a HqGroupsUpdateRequest Udt Request
 *
 */

public class HqGroupsUpdateRequest extends HqGroupsSubRequestParent {
/**
 *
 * Constructor to create a  HqGroupsUpdateRequest
 * @param id Unique request name
 * @param hguIn HqGroupsObjectData for HqGroupsUpdateRequest
 *
 */
@JsonCreator
  public HqGroupsUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroups")HqGroupsObjectData hguIn) {
    super(id, "HqGroupsUpdate");
    if (hguIn != null) {
      addInput("HqGroups", HqGroupsObjectHelper.toMap(hguIn, new HashMap(), "HqGroups").get("HqGroups"));
    }
  }

/**
 *
 * Retrieves the HqGroupsObjectData that results from the HqGroupsUpdateRequest call
 * @return HqGroupsObjectData resulting from udt call
 *
 */

  public HqGroupsObjectData getOutput() {
    return HqGroupsObjectHelper.fromMap(outputMap, "HqGroups");
  }
}
