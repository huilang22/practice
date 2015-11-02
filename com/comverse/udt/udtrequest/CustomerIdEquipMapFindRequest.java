/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerIdEquipMapFindRequest.java
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
 * Class used to create a CustomerIdEquipMapFindRequest Udt Request
 *
 */

public class CustomerIdEquipMapFindRequest extends CustomerIdEquipMapRequest {
/**
 *
 * Constructor to create a  CustomerIdEquipMapFindRequest
 * @param id Unique request name
 * @param CustomerIdEquipMapFindIn CustomerIdEquipMapObjectFilter for CustomerIdEquipMapFindRequest
 *
 */
@JsonCreator
  public CustomerIdEquipMapFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerIdEquipMap")CustomerIdEquipMapObjectFilter CustomerIdEquipMapFindIn) {
    super(id, "CustomerIdEquipMapFind");
    if (CustomerIdEquipMapFindIn != null) {
      Integer index =  CustomerIdEquipMapFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(CustomerIdEquipMapFindIn, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }

/**
 *
 * Retrieves the CustomerIdEquipMapObjectDataList that results from the CustomerIdEquipMapFindRequest call
 * @return CustomerIdEquipMapObjectDataList resulting from udt call
 *
 */

  public CustomerIdEquipMapObjectDataList getOutput() {
    return CustomerIdEquipMapObjectHelper.fromMapList(outputMap, "CustomerIdEquipMapList");
  }
}
