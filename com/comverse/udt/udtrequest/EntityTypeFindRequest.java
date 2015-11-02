/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeFindRequest.java
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
 * Class used to create a EntityTypeFindRequest Udt Request
 *
 */

public class EntityTypeFindRequest extends EntityTypeRequest {
/**
 *
 * Constructor to create a  EntityTypeFindRequest
 * @param id Unique request name
 * @param EntityTypeFindIn EntityTypeObjectFilter for EntityTypeFindRequest
 *
 */
@JsonCreator
  public EntityTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("EntityType")EntityTypeObjectFilter EntityTypeFindIn) {
    super(id, "EntityTypeFind");
    if (EntityTypeFindIn != null) {
      Integer index =  EntityTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EntityType", EntityTypeObjectHelper.toMap(EntityTypeFindIn, new HashMap(), "EntityType").get("EntityType"));
    }
  }

/**
 *
 * Retrieves the EntityTypeObjectDataList that results from the EntityTypeFindRequest call
 * @return EntityTypeObjectDataList resulting from udt call
 *
 */

  public EntityTypeObjectDataList getOutput() {
    return EntityTypeObjectHelper.fromMapList(outputMap, "EntityTypeList");
  }
}
