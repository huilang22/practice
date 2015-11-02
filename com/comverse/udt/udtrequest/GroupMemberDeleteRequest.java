/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupMemberDeleteRequest.java
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
 * Class used to create a GroupMemberDeleteRequest Udt Request
 *
 */

public class GroupMemberDeleteRequest extends GroupMemberSubRequestParent {
/**
 *
 * Constructor to create a  GroupMemberDeleteRequest
 * @param id Unique request name
 * @param GMdeleteIn GroupMemberObjectKeyData for GroupMemberDeleteRequest
 * @param GMInactiveDate Date for GroupMemberDeleteRequest
 *
 */
@JsonCreator
  public GroupMemberDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("GroupMember")GroupMemberObjectKeyData GMdeleteIn, @JsonProperty("InactiveDate")Date GMInactiveDate) {
    super(id, "GroupMemberDelete");
    if (GMdeleteIn != null) {
      addInput("GroupMember", GroupMemberObjectKeyHelper.toMap(GMdeleteIn, new HashMap(), "GroupMemberObjectKeyData").get("GroupMemberObjectKeyData"));
    }
    if (GMInactiveDate != null) {
      addInput("InactiveDate", GMInactiveDate);
    }
  }

/**
 *
 * Retrieves the GroupMemberObjectData that results from the GroupMemberDeleteRequest call
 * @return GroupMemberObjectData resulting from udt call
 *
 */

  public GroupMemberObjectData getOutput() {
    return GroupMemberObjectHelper.fromMap(outputMap, "GroupMember");
  }
}
