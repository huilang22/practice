/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGroupMemberGetRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a EntityTypeGroupMemberGetRequest Udt Request
 *
 */

public class EntityTypeGroupMemberGetRequest extends EntityTypeGroupMemberSubRequestParent {
/**
 *
 * Constructor to create a  EntityTypeGroupMemberGetRequest
 * @param id Unique request name
 * @param entTypeGrpGetIn EntityTypeGroupMemberObjectKeyData for EntityTypeGroupMemberGetRequest
 *
 */
@JsonCreator
  public EntityTypeGroupMemberGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("EntityTypeGroupMember")EntityTypeGroupMemberObjectKeyData entTypeGrpGetIn) {
    super(id, "EntityTypeGroupMemberGet");
    if (entTypeGrpGetIn != null) {
      addInput("EntityTypeGroupMember", EntityTypeGroupMemberObjectKeyHelper.toMap(entTypeGrpGetIn, new HashMap(), "EntityTypeGroupMemberObjectKeyData").get("EntityTypeGroupMemberObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the EntityTypeGroupMemberObjectData that results from the EntityTypeGroupMemberGetRequest call
 * @return EntityTypeGroupMemberObjectData resulting from udt call
 *
 */

  public EntityTypeGroupMemberObjectData getOutput() {
    return EntityTypeGroupMemberObjectHelper.fromMap(outputMap, "EntityTypeGroupMember");
  }
}
