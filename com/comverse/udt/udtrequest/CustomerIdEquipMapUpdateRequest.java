/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerIdEquipMapUpdateRequest.java
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
 * Class used to create a CustomerIdEquipMapUpdateRequest Udt Request
 *
 */

public class CustomerIdEquipMapUpdateRequest extends CustomerIdEquipMapSubRequestParent {
/**
 *
 * Constructor to create a  CustomerIdEquipMapUpdateRequest
 * @param id Unique request name
 * @param CustomerIdEquipMapUpdateIn CustomerIdEquipMapObjectData for CustomerIdEquipMapUpdateRequest
 *
 */
@JsonCreator
  public CustomerIdEquipMapUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerIdEquipMap")CustomerIdEquipMapObjectData CustomerIdEquipMapUpdateIn) {
    super(id, "CustomerIdEquipMapUpdate");
    if (CustomerIdEquipMapUpdateIn != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(CustomerIdEquipMapUpdateIn, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }

/**
 *
 * Retrieves the CustomerIdEquipMapObjectData that results from the CustomerIdEquipMapUpdateRequest call
 * @return CustomerIdEquipMapObjectData resulting from udt call
 *
 */

  public CustomerIdEquipMapObjectData getOutput() {
    return CustomerIdEquipMapObjectHelper.fromMap(outputMap, "CustomerIdEquipMap");
  }
}
