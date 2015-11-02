/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerIdEquipMapCreateRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CustomerIdEquipMapCreateRequest Udt Request
 *
 */

public class CustomerIdEquipMapCreateRequest extends CustomerIdEquipMapSubRequestParent {
/**
 *
 * Constructor to create a  CustomerIdEquipMapCreateRequest
 * @param id Unique request name
 * @param CustomerIdEquipMapCreateIn CustomerIdEquipMapObjectData for CustomerIdEquipMapCreateRequest
 *
 */
@JsonCreator
  public CustomerIdEquipMapCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerIdEquipMap")CustomerIdEquipMapObjectData CustomerIdEquipMapCreateIn) {
    super(id, "CustomerIdEquipMapCreate");
    if (CustomerIdEquipMapCreateIn != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(CustomerIdEquipMapCreateIn, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }

/**
 *
 * Retrieves the CustomerIdEquipMapObjectData that results from the CustomerIdEquipMapCreateRequest call
 * @return CustomerIdEquipMapObjectData resulting from udt call
 *
 */

  public CustomerIdEquipMapObjectData getOutput() {
    return CustomerIdEquipMapObjectHelper.fromMap(outputMap, "CustomerIdEquipMap");
  }
}
