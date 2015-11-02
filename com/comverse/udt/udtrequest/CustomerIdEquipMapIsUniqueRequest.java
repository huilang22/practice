/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerIdEquipMapIsUniqueRequest.java
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
 * Class used to create a CustomerIdEquipMapIsUniqueRequest Udt Request
 *
 */

public class CustomerIdEquipMapIsUniqueRequest extends CustomerIdEquipMapRequest {
/**
 *
 * Constructor to create a  CustomerIdEquipMapIsUniqueRequest
 * @param id Unique request name
 * @param CustomerIdEquipMapUnqIn CustomerIdEquipMapObjectData for CustomerIdEquipMapIsUniqueRequest
 *
 */
@JsonCreator
  public CustomerIdEquipMapIsUniqueRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerIdEquipMap")CustomerIdEquipMapObjectData CustomerIdEquipMapUnqIn) {
    super(id, "CustomerIdEquipMapIsUnique");
    if (CustomerIdEquipMapUnqIn != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(CustomerIdEquipMapUnqIn, new HashMap(), "IsUnique").get("IsUnique"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the CustomerIdEquipMapIsUniqueRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("IsUnique");
  }
}
