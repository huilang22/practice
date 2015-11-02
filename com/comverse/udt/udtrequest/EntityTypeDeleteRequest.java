/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeDeleteRequest.java
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
 * Class used to create a EntityTypeDeleteRequest Udt Request
 *
 */

public class EntityTypeDeleteRequest extends EntityTypeSubRequestParent {
/**
 *
 * Constructor to create a  EntityTypeDeleteRequest
 * @param id Unique request name
 * @param EntityTypeDeleteIn EntityTypeObjectKeyData for EntityTypeDeleteRequest
 *
 */
@JsonCreator
  public EntityTypeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("EntityType")EntityTypeObjectKeyData EntityTypeDeleteIn) {
    super(id, "EntityTypeDelete");
    if (EntityTypeDeleteIn != null) {
      addInput("EntityType", EntityTypeObjectKeyHelper.toMap(EntityTypeDeleteIn, new HashMap(), "EntityTypeObjectKeyData").get("EntityTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the EntityTypeObjectData that results from the EntityTypeDeleteRequest call
 * @return EntityTypeObjectData resulting from udt call
 *
 */

  public EntityTypeObjectData getOutput() {
    return EntityTypeObjectHelper.fromMap(outputMap, "EntityType");
  }
}
