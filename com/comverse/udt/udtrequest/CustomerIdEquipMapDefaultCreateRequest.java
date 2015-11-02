/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerIdEquipMapDefaultCreateRequest.java
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
 * Class used to create a CustomerIdEquipMapDefaultCreateRequest Udt Request
 *
 */

public class CustomerIdEquipMapDefaultCreateRequest extends CustomerIdEquipMapSubRequestParent {
/**
 *
 * Constructor to create a  CustomerIdEquipMapDefaultCreateRequest
 * @param id Unique request name
 * @param CustomerIdEquipMapDefaultCreateIn CustomerIdEquipMapObjectData for CustomerIdEquipMapDefaultCreateRequest
 *
 */
@JsonCreator
  public CustomerIdEquipMapDefaultCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerIdEquipMap")CustomerIdEquipMapObjectData CustomerIdEquipMapDefaultCreateIn) {
    super(id, "CustomerIdEquipMapDefaultCreate");
    if (CustomerIdEquipMapDefaultCreateIn != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(CustomerIdEquipMapDefaultCreateIn, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }

/**
 *
 * Retrieves the CustomerIdEquipMapObjectData that results from the CustomerIdEquipMapDefaultCreateRequest call
 * @return CustomerIdEquipMapObjectData resulting from udt call
 *
 */

  public CustomerIdEquipMapObjectData getOutput() {
    return CustomerIdEquipMapObjectHelper.fromMap(outputMap, "CustomerIdEquipMap");
  }
}
