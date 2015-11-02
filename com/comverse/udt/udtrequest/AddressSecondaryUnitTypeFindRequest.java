/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressSecondaryUnitTypeFindRequest.java
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
 * Class used to create a AddressSecondaryUnitTypeFindRequest Udt Request
 *
 */

public class AddressSecondaryUnitTypeFindRequest extends AddressSecondaryUnitTypeRequest {
/**
 *
 * Constructor to create a  AddressSecondaryUnitTypeFindRequest
 * @param id Unique request name
 * @param ASUTFindIn AddressSecondaryUnitTypeObjectFilter for AddressSecondaryUnitTypeFindRequest
 *
 */
@JsonCreator
  public AddressSecondaryUnitTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressSecondaryUnitType")AddressSecondaryUnitTypeObjectFilter ASUTFindIn) {
    super(id, "AddressSecondaryUnitTypeFind");
    if (ASUTFindIn != null) {
      Integer index =  ASUTFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AddressSecondaryUnitType", AddressSecondaryUnitTypeObjectHelper.toMap(ASUTFindIn, new HashMap(), "AddressSecondaryUnitType").get("AddressSecondaryUnitType"));
    }
  }

/**
 *
 * Retrieves the AddressSecondaryUnitTypeObjectDataList that results from the AddressSecondaryUnitTypeFindRequest call
 * @return AddressSecondaryUnitTypeObjectDataList resulting from udt call
 *
 */

  public AddressSecondaryUnitTypeObjectDataList getOutput() {
    return AddressSecondaryUnitTypeObjectHelper.fromMapList(outputMap, "AddressSecondaryUnitTypeList");
  }
}
