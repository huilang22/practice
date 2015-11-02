/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGroupGetRequest.java
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
 * Class used to create a EntityTypeGroupGetRequest Udt Request
 *
 */

public class EntityTypeGroupGetRequest extends EntityTypeGroupSubRequestParent {
/**
 *
 * Constructor to create a  EntityTypeGroupGetRequest
 * @param id Unique request name
 * @param EntityTypeGRPGetIn EntityTypeGroupObjectKeyData for EntityTypeGroupGetRequest
 *
 */
@JsonCreator
  public EntityTypeGroupGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("EntityTypeGroup")EntityTypeGroupObjectKeyData EntityTypeGRPGetIn) {
    super(id, "EntityTypeGroupGet");
    if (EntityTypeGRPGetIn != null) {
      addInput("EntityTypeGroup", EntityTypeGroupObjectKeyHelper.toMap(EntityTypeGRPGetIn, new HashMap(), "EntityTypeGroupObjectKeyData").get("EntityTypeGroupObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the EntityTypeGroupObjectData that results from the EntityTypeGroupGetRequest call
 * @return EntityTypeGroupObjectData resulting from udt call
 *
 */

  public EntityTypeGroupObjectData getOutput() {
    return EntityTypeGroupObjectHelper.fromMap(outputMap, "EntityTypeGroup");
  }
}
