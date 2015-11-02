/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupMembersUpdateRequest.java
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
 * Class used to create a HqGroupMembersUpdateRequest Udt Request
 *
 */

public class HqGroupMembersUpdateRequest extends HqGroupMembersSubRequestParent {
/**
 *
 * Constructor to create a  HqGroupMembersUpdateRequest
 * @param id Unique request name
 * @param HGMUpdateIn HqGroupMembersObjectData for HqGroupMembersUpdateRequest
 *
 */
@JsonCreator
  public HqGroupMembersUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupMembers")HqGroupMembersObjectData HGMUpdateIn) {
    super(id, "HqGroupMembersUpdate");
    if (HGMUpdateIn != null) {
      addInput("HqGroupMembers", HqGroupMembersObjectHelper.toMap(HGMUpdateIn, new HashMap(), "HqGroupMembers").get("HqGroupMembers"));
    }
  }

/**
 *
 * Retrieves the HqGroupMembersObjectData that results from the HqGroupMembersUpdateRequest call
 * @return HqGroupMembersObjectData resulting from udt call
 *
 */

  public HqGroupMembersObjectData getOutput() {
    return HqGroupMembersObjectHelper.fromMap(outputMap, "HqGroupMembers");
  }
}
