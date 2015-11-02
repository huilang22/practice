/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGroupMemberFindRequest.java
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
 * Class used to create a EntityTypeGroupMemberFindRequest Udt Request
 *
 */

public class EntityTypeGroupMemberFindRequest extends EntityTypeGroupMemberRequest {
/**
 *
 * Constructor to create a  EntityTypeGroupMemberFindRequest
 * @param id Unique request name
 * @param entTypeGrpFindIn EntityTypeGroupMemberObjectFilter for EntityTypeGroupMemberFindRequest
 *
 */
@JsonCreator
  public EntityTypeGroupMemberFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("EntityTypeGroupMember")EntityTypeGroupMemberObjectFilter entTypeGrpFindIn) {
    super(id, "EntityTypeGroupMemberFind");
    if (entTypeGrpFindIn != null) {
      Integer index =  entTypeGrpFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EntityTypeGroupMember", EntityTypeGroupMemberObjectHelper.toMap(entTypeGrpFindIn, new HashMap(), "EntityTypeGroupMember").get("EntityTypeGroupMember"));
    }
  }

/**
 *
 * Retrieves the EntityTypeGroupMemberObjectDataList that results from the EntityTypeGroupMemberFindRequest call
 * @return EntityTypeGroupMemberObjectDataList resulting from udt call
 *
 */

  public EntityTypeGroupMemberObjectDataList getOutput() {
    return EntityTypeGroupMemberObjectHelper.fromMapList(outputMap, "EntityTypeGroupMemberList");
  }
}
