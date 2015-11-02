/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupMemberCreateRequest.java
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
 * Class used to create a GroupMemberCreateRequest Udt Request
 *
 */

public class GroupMemberCreateRequest extends GroupMemberSubRequestParent {
/**
 *
 * Constructor to create a  GroupMemberCreateRequest
 * @param id Unique request name
 * @param GMcreateIn GroupMemberObjectData for GroupMemberCreateRequest
 *
 */
@JsonCreator
  public GroupMemberCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GroupMember")GroupMemberObjectData GMcreateIn) {
    super(id, "GroupMemberCreate");
    if (GMcreateIn != null) {
      addInput("GroupMember", GroupMemberObjectHelper.toMap(GMcreateIn, new HashMap(), "GroupMember").get("GroupMember"));
    }
  }

/**
 *
 * Retrieves the GroupMemberObjectData that results from the GroupMemberCreateRequest call
 * @return GroupMemberObjectData resulting from udt call
 *
 */

  public GroupMemberObjectData getOutput() {
    return GroupMemberObjectHelper.fromMap(outputMap, "GroupMember");
  }
}
