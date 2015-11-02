/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupMemberFindRequest.java
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
 * Class used to create a GroupMemberFindRequest Udt Request
 *
 */

public class GroupMemberFindRequest extends GroupMemberRequest {
/**
 *
 * Constructor to create a  GroupMemberFindRequest
 * @param id Unique request name
 * @param GMfindIn GroupMemberObjectFilter for GroupMemberFindRequest
 *
 */
@JsonCreator
  public GroupMemberFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("GroupMember")GroupMemberObjectFilter GMfindIn) {
    super(id, "GroupMemberFind");
    if (GMfindIn != null) {
      Integer index =  GMfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GroupMember", GroupMemberObjectHelper.toMap(GMfindIn, new HashMap(), "GroupMember").get("GroupMember"));
    }
  }

/**
 *
 * Retrieves the GroupMemberObjectDataList that results from the GroupMemberFindRequest call
 * @return GroupMemberObjectDataList resulting from udt call
 *
 */

  public GroupMemberObjectDataList getOutput() {
    return GroupMemberObjectHelper.fromMapList(outputMap, "GroupMemberList");
  }
}
