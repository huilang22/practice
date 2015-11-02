/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerIdEquipMapGetRequest.java
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
 * Class used to create a CustomerIdEquipMapGetRequest Udt Request
 *
 */

public class CustomerIdEquipMapGetRequest extends CustomerIdEquipMapSubRequestParent {
/**
 *
 * Constructor to create a  CustomerIdEquipMapGetRequest
 * @param id Unique request name
 * @param CustomerIdEquipMapGetIn CustomerIdEquipMapObjectKeyData for CustomerIdEquipMapGetRequest
 *
 */
@JsonCreator
  public CustomerIdEquipMapGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerIdEquipMap")CustomerIdEquipMapObjectKeyData CustomerIdEquipMapGetIn) {
    super(id, "CustomerIdEquipMapGet");
    if (CustomerIdEquipMapGetIn != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectKeyHelper.toMap(CustomerIdEquipMapGetIn, new HashMap(), "CustomerIdEquipMapObjectKeyData").get("CustomerIdEquipMapObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CustomerIdEquipMapObjectData that results from the CustomerIdEquipMapGetRequest call
 * @return CustomerIdEquipMapObjectData resulting from udt call
 *
 */

  public CustomerIdEquipMapObjectData getOutput() {
    return CustomerIdEquipMapObjectHelper.fromMap(outputMap, "CustomerIdEquipMap");
  }
}
