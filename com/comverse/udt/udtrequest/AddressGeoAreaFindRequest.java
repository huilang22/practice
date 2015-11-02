/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressGeoAreaFindRequest.java
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

import com.csgsystems.svbl.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a AddressGeoAreaFindRequest Udt Request
 *
 */

public class AddressGeoAreaFindRequest extends AddressGeoAreaRequest {
/**
 *
 * Constructor to create a  AddressGeoAreaFindRequest
 * @param id Unique request name
 * @param findIn AGAObjectFilter for AddressGeoAreaFindRequest
 *
 */
@JsonCreator
  public AddressGeoAreaFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressGeoArea")AGAObjectFilter findIn) {
    super(id, "AddressGeoAreaFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AddressGeoArea", AGAObjectHelper.toMap(findIn, new HashMap(), "AddressGeoArea").get("AddressGeoArea"));
    }
  }

/**
 *
 * Retrieves the AGAObjectDataList that results from the AddressGeoAreaFindRequest call
 * @return AGAObjectDataList resulting from udt call
 *
 */

  public AGAObjectDataList getOutput() {
    return AGAObjectHelper.fromMapList(outputMap, "AddressGeoAreaList");
  }
}
