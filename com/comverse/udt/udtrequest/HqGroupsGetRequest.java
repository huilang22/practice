/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupsGetRequest.java
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
 * Class used to create a HqGroupsGetRequest Udt Request
 *
 */

public class HqGroupsGetRequest extends HqGroupsSubRequestParent {
/**
 *
 * Constructor to create a  HqGroupsGetRequest
 * @param id Unique request name
 * @param hggIn HqGroupsObjectData for HqGroupsGetRequest
 *
 */
@JsonCreator
  public HqGroupsGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroups")HqGroupsObjectData hggIn) {
    super(id, "HqGroupsGet");
    if (hggIn != null) {
      addInput("HqGroups", HqGroupsObjectHelper.toMap(hggIn, new HashMap(), "HqGroups").get("HqGroups"));
    }
  }

/**
 *
 * Retrieves the HqGroupsObjectData that results from the HqGroupsGetRequest call
 * @return HqGroupsObjectData resulting from udt call
 *
 */

  public HqGroupsObjectData getOutput() {
    return HqGroupsObjectHelper.fromMap(outputMap, "HqGroups");
  }
}
