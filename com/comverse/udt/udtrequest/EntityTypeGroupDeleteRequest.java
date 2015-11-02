/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGroupDeleteRequest.java
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
 * Class used to create a EntityTypeGroupDeleteRequest Udt Request
 *
 */

public class EntityTypeGroupDeleteRequest extends EntityTypeGroupSubRequestParent {
/**
 *
 * Constructor to create a  EntityTypeGroupDeleteRequest
 * @param id Unique request name
 * @param EntityTypeGRPDeleteIn EntityTypeGroupObjectKeyData for EntityTypeGroupDeleteRequest
 *
 */
@JsonCreator
  public EntityTypeGroupDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("EntityTypeGroup")EntityTypeGroupObjectKeyData EntityTypeGRPDeleteIn) {
    super(id, "EntityTypeGroupDelete");
    if (EntityTypeGRPDeleteIn != null) {
      addInput("EntityTypeGroup", EntityTypeGroupObjectKeyHelper.toMap(EntityTypeGRPDeleteIn, new HashMap(), "EntityTypeGroupObjectKeyData").get("EntityTypeGroupObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the EntityTypeGroupObjectData that results from the EntityTypeGroupDeleteRequest call
 * @return EntityTypeGroupObjectData resulting from udt call
 *
 */

  public EntityTypeGroupObjectData getOutput() {
    return EntityTypeGroupObjectHelper.fromMap(outputMap, "EntityTypeGroup");
  }
}
