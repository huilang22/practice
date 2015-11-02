/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupMemberUpdateRequest.java
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
 * Class used to create a GroupMemberUpdateRequest Udt Request
 *
 */

public class GroupMemberUpdateRequest extends GroupMemberSubRequestParent {
/**
 *
 * Constructor to create a  GroupMemberUpdateRequest
 * @param id Unique request name
 * @param GMupdateIn GroupMemberObjectData for GroupMemberUpdateRequest
 *
 */
@JsonCreator
  public GroupMemberUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GroupMember")GroupMemberObjectData GMupdateIn) {
    super(id, "GroupMemberUpdate");
    if (GMupdateIn != null) {
      addInput("GroupMember", GroupMemberObjectHelper.toMap(GMupdateIn, new HashMap(), "GroupMember").get("GroupMember"));
    }
  }

/**
 *
 * Retrieves the GroupMemberObjectData that results from the GroupMemberUpdateRequest call
 * @return GroupMemberObjectData resulting from udt call
 *
 */

  public GroupMemberObjectData getOutput() {
    return GroupMemberObjectHelper.fromMap(outputMap, "GroupMember");
  }
}
