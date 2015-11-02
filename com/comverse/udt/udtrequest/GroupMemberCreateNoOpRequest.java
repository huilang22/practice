/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupMemberCreateNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a GroupMemberCreateNoOpRequest Udt Request/Response
 *
 */
public class GroupMemberCreateNoOpRequest extends GroupMemberSubRequestParent {
/**
 *
 * Constructor to create a   GroupMemberCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GroupMemberCreateNoOpRequest(String id, GroupMemberObjectData noOpIn) {
    super(id, "GroupMemberCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("GroupMember", GroupMemberObjectHelper.toMap(noOpIn, new HashMap(), "GroupMember").get("GroupMember"));
    }
  }
/**
 *
 * Retrieves the GroupMemberObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public GroupMemberObjectData getOutput() {
    return GroupMemberObjectHelper.fromMap(outputMap, "GroupMember");
  }
}
