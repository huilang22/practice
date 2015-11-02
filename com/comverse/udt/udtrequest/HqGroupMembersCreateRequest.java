/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupMembersCreateRequest.java
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
 * Class used to create a HqGroupMembersCreateRequest Udt Request
 *
 */

public class HqGroupMembersCreateRequest extends HqGroupMembersSubRequestParent {
/**
 *
 * Constructor to create a  HqGroupMembersCreateRequest
 * @param id Unique request name
 * @param HGMCreateIn HqGroupMembersObjectData for HqGroupMembersCreateRequest
 *
 */
@JsonCreator
  public HqGroupMembersCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupMembers")HqGroupMembersObjectData HGMCreateIn) {
    super(id, "HqGroupMembersCreate");
    if (HGMCreateIn != null) {
      addInput("HqGroupMembers", HqGroupMembersObjectHelper.toMap(HGMCreateIn, new HashMap(), "HqGroupMembers").get("HqGroupMembers"));
    }
  }

/**
 *
 * Retrieves the HqGroupMembersObjectData that results from the HqGroupMembersCreateRequest call
 * @return HqGroupMembersObjectData resulting from udt call
 *
 */

  public HqGroupMembersObjectData getOutput() {
    return HqGroupMembersObjectHelper.fromMap(outputMap, "HqGroupMembers");
  }
}
