/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGroupMemberGetNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a EntityTypeGroupMemberGetNoOpRequest Udt Request/Response
 *
 */
public class EntityTypeGroupMemberGetNoOpRequest extends EntityTypeGroupMemberSubRequestParent {
/**
 *
 * Constructor to create a   EntityTypeGroupMemberGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EntityTypeGroupMemberGetNoOpRequest(String id, EntityTypeGroupMemberObjectData noOpIn) {
    super(id, "EntityTypeGroupMemberGetNoOpRequest");
    if (noOpIn != null) {
      addInput("EntityTypeGroupMember", EntityTypeGroupMemberObjectHelper.toMap(noOpIn, new HashMap(), "EntityTypeGroupMember").get("EntityTypeGroupMember"));
    }
  }
/**
 *
 * Retrieves the EntityTypeGroupMemberObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public EntityTypeGroupMemberObjectData getOutput() {
    return EntityTypeGroupMemberObjectHelper.fromMap(outputMap, "EntityTypeGroupMember");
  }
}
