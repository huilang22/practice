/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetDirectionalFindRequest.java
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
 * Class used to create a AddressStreetDirectionalFindRequest Udt Request
 *
 */

public class AddressStreetDirectionalFindRequest extends AddressStreetDirectionalRequest {
/**
 *
 * Constructor to create a  AddressStreetDirectionalFindRequest
 * @param id Unique request name
 * @param ASDFindIn AddressStreetDirectionalObjectFilter for AddressStreetDirectionalFindRequest
 *
 */
@JsonCreator
  public AddressStreetDirectionalFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressStreetDirectional")AddressStreetDirectionalObjectFilter ASDFindIn) {
    super(id, "AddressStreetDirectionalFind");
    if (ASDFindIn != null) {
      Integer index =  ASDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AddressStreetDirectional", AddressStreetDirectionalObjectHelper.toMap(ASDFindIn, new HashMap(), "AddressStreetDirectional").get("AddressStreetDirectional"));
    }
  }

/**
 *
 * Retrieves the AddressStreetDirectionalObjectDataList that results from the AddressStreetDirectionalFindRequest call
 * @return AddressStreetDirectionalObjectDataList resulting from udt call
 *
 */

  public AddressStreetDirectionalObjectDataList getOutput() {
    return AddressStreetDirectionalObjectHelper.fromMapList(outputMap, "AddressStreetDirectionalList");
  }
}
