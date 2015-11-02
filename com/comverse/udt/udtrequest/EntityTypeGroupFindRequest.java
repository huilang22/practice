/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGroupFindRequest.java
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
 * Class used to create a EntityTypeGroupFindRequest Udt Request
 *
 */

public class EntityTypeGroupFindRequest extends EntityTypeGroupRequest {
/**
 *
 * Constructor to create a  EntityTypeGroupFindRequest
 * @param id Unique request name
 * @param EntityTypeGRPFindIn EntityTypeGroupObjectFilter for EntityTypeGroupFindRequest
 *
 */
@JsonCreator
  public EntityTypeGroupFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("EntityTypeGroup")EntityTypeGroupObjectFilter EntityTypeGRPFindIn) {
    super(id, "EntityTypeGroupFind");
    if (EntityTypeGRPFindIn != null) {
      Integer index =  EntityTypeGRPFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EntityTypeGroup", EntityTypeGroupObjectHelper.toMap(EntityTypeGRPFindIn, new HashMap(), "EntityTypeGroup").get("EntityTypeGroup"));
    }
  }

/**
 *
 * Retrieves the EntityTypeGroupObjectDataList that results from the EntityTypeGroupFindRequest call
 * @return EntityTypeGroupObjectDataList resulting from udt call
 *
 */

  public EntityTypeGroupObjectDataList getOutput() {
    return EntityTypeGroupObjectHelper.fromMapList(outputMap, "EntityTypeGroupList");
  }
}
