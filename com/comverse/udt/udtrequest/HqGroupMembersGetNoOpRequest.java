/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupMembersGetNoOpRequest.java
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
 * NoOp class used to simulate a HqGroupMembersGetNoOpRequest Udt Request/Response
 *
 */
public class HqGroupMembersGetNoOpRequest extends HqGroupMembersSubRequestParent {
/**
 *
 * Constructor to create a   HqGroupMembersGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HqGroupMembersGetNoOpRequest(String id, HqGroupMembersObjectData noOpIn) {
    super(id, "HqGroupMembersGetNoOpRequest");
    if (noOpIn != null) {
      addInput("HqGroupMembers", HqGroupMembersObjectHelper.toMap(noOpIn, new HashMap(), "HqGroupMembers").get("HqGroupMembers"));
    }
  }
/**
 *
 * Retrieves the HqGroupMembersObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupMembersObjectData getOutput() {
    return HqGroupMembersObjectHelper.fromMap(outputMap, "HqGroupMembers");
  }
}
