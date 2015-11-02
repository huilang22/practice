/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupMembersGetRequest.java
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
 * Class used to create a HqGroupMembersGetRequest Udt Request
 *
 */

public class HqGroupMembersGetRequest extends HqGroupMembersSubRequestParent {
/**
 *
 * Constructor to create a  HqGroupMembersGetRequest
 * @param id Unique request name
 * @param HGMGetIn HqGroupMembersObjectData for HqGroupMembersGetRequest
 *
 */
@JsonCreator
  public HqGroupMembersGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupMembers")HqGroupMembersObjectData HGMGetIn) {
    super(id, "HqGroupMembersGet");
    if (HGMGetIn != null) {
      addInput("HqGroupMembers", HqGroupMembersObjectHelper.toMap(HGMGetIn, new HashMap(), "HqGroupMembers").get("HqGroupMembers"));
    }
  }

/**
 *
 * Retrieves the HqGroupMembersObjectData that results from the HqGroupMembersGetRequest call
 * @return HqGroupMembersObjectData resulting from udt call
 *
 */

  public HqGroupMembersObjectData getOutput() {
    return HqGroupMembersObjectHelper.fromMap(outputMap, "HqGroupMembers");
  }
}
