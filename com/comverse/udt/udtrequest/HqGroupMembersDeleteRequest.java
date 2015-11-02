/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupMembersDeleteRequest.java
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
 * Class used to create a HqGroupMembersDeleteRequest Udt Request
 *
 */

public class HqGroupMembersDeleteRequest extends HqGroupMembersSubRequestParent {
/**
 *
 * Constructor to create a  HqGroupMembersDeleteRequest
 * @param id Unique request name
 * @param HGMDeleteIn HqGroupMembersObjectData for HqGroupMembersDeleteRequest
 *
 */
@JsonCreator
  public HqGroupMembersDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupMembers")HqGroupMembersObjectData HGMDeleteIn) {
    super(id, "HqGroupMembersDelete");
    if (HGMDeleteIn != null) {
      addInput("HqGroupMembers", HqGroupMembersObjectHelper.toMap(HGMDeleteIn, new HashMap(), "HqGroupMembers").get("HqGroupMembers"));
    }
  }

/**
 *
 * Retrieves the HqGroupMembersObjectData that results from the HqGroupMembersDeleteRequest call
 * @return HqGroupMembersObjectData resulting from udt call
 *
 */

  public HqGroupMembersObjectData getOutput() {
    return HqGroupMembersObjectHelper.fromMap(outputMap, "HqGroupMembers");
  }
}
