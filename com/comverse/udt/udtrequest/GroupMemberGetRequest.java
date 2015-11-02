/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupMemberGetRequest.java
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
 * Class used to create a GroupMemberGetRequest Udt Request
 *
 */

public class GroupMemberGetRequest extends GroupMemberSubRequestParent {
/**
 *
 * Constructor to create a  GroupMemberGetRequest
 * @param id Unique request name
 * @param GMgetIn GroupMemberObjectKeyData for GroupMemberGetRequest
 *
 */
@JsonCreator
  public GroupMemberGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("GroupMember")GroupMemberObjectKeyData GMgetIn) {
    super(id, "GroupMemberGet");
    if (GMgetIn != null) {
      addInput("GroupMember", GroupMemberObjectKeyHelper.toMap(GMgetIn, new HashMap(), "GroupMemberObjectKeyData").get("GroupMemberObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GroupMemberObjectData that results from the GroupMemberGetRequest call
 * @return GroupMemberObjectData resulting from udt call
 *
 */

  public GroupMemberObjectData getOutput() {
    return GroupMemberObjectHelper.fromMap(outputMap, "GroupMember");
  }
}
