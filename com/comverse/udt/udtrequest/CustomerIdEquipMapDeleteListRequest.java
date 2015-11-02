/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerIdEquipMapDeleteListRequest.java
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
 * Class used to create a CustomerIdEquipMapDeleteListRequest Udt Request
 *
 */

public class CustomerIdEquipMapDeleteListRequest extends CustomerIdEquipMapRequest {
/**
 *
 * Constructor to create a  CustomerIdEquipMapDeleteListRequest
 * @param id Unique request name
 * @param CustomerIdEquipMapDeleteListIn CustomerIdEquipMapObjectFilter for CustomerIdEquipMapDeleteListRequest
 * @param InactiveDate Date for CustomerIdEquipMapDeleteListRequest
 *
 */
@JsonCreator
  public CustomerIdEquipMapDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerIdEquipMap")CustomerIdEquipMapObjectFilter CustomerIdEquipMapDeleteListIn, @JsonProperty("InactiveDate")Date InactiveDate) {
    super(id, "CustomerIdEquipMapDeleteList");
    if (CustomerIdEquipMapDeleteListIn != null) {
      Integer index =  CustomerIdEquipMapDeleteListIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(CustomerIdEquipMapDeleteListIn, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
    if (InactiveDate != null) {
      addInput("InactiveDate", InactiveDate);
    }
  }

/**
 *
 * Retrieves the CustomerIdEquipMapObjectDataList that results from the CustomerIdEquipMapDeleteListRequest call
 * @return CustomerIdEquipMapObjectDataList resulting from udt call
 *
 */

  public CustomerIdEquipMapObjectDataList getOutput() {
    return CustomerIdEquipMapObjectHelper.fromMapList(outputMap, "CustomerIdEquipMapList");
  }
}
