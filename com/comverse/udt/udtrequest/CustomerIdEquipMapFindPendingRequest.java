/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerIdEquipMapFindPendingRequest.java
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
 * Class used to create a CustomerIdEquipMapFindPendingRequest Udt Request
 *
 */

public class CustomerIdEquipMapFindPendingRequest extends CustomerIdEquipMapRequest {
/**
 *
 * Constructor to create a  CustomerIdEquipMapFindPendingRequest
 * @param id Unique request name
 * @param CustomerIdEquipMapFindByServiceOrderIn CustomerIdEquipMapObjectFilter for CustomerIdEquipMapFindPendingRequest
 * @param ServiceOrderId String for CustomerIdEquipMapFindPendingRequest
 *
 */
@JsonCreator
  public CustomerIdEquipMapFindPendingRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerIdEquipMap")CustomerIdEquipMapObjectFilter CustomerIdEquipMapFindByServiceOrderIn, @JsonProperty("ServiceOrderId")String ServiceOrderId) {
    super(id, "CustomerIdEquipMapFindPending");
    if (CustomerIdEquipMapFindByServiceOrderIn != null) {
      Integer index =  CustomerIdEquipMapFindByServiceOrderIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(CustomerIdEquipMapFindByServiceOrderIn, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
    if (ServiceOrderId != null) {
      addInput("ServiceOrderId", ServiceOrderId);
    }
  }

/**
 *
 * Retrieves the CustomerIdEquipMapObjectDataList that results from the CustomerIdEquipMapFindPendingRequest call
 * @return CustomerIdEquipMapObjectDataList resulting from udt call
 *
 */

  public CustomerIdEquipMapObjectDataList getOutput() {
    return CustomerIdEquipMapObjectHelper.fromMapList(outputMap, "CustomerIdEquipMapList");
  }
}
