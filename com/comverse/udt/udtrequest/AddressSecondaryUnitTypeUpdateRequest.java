/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressSecondaryUnitTypeUpdateRequest.java
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
 * Class used to create a AddressSecondaryUnitTypeUpdateRequest Udt Request
 *
 */

public class AddressSecondaryUnitTypeUpdateRequest extends AddressSecondaryUnitTypeSubRequestParent {
/**
 *
 * Constructor to create a  AddressSecondaryUnitTypeUpdateRequest
 * @param id Unique request name
 * @param ASUTUpdateIn AddressSecondaryUnitTypeObjectData for AddressSecondaryUnitTypeUpdateRequest
 *
 */
@JsonCreator
  public AddressSecondaryUnitTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressSecondaryUnitType")AddressSecondaryUnitTypeObjectData ASUTUpdateIn) {
    super(id, "AddressSecondaryUnitTypeUpdate");
    if (ASUTUpdateIn != null) {
      addInput("AddressSecondaryUnitType", AddressSecondaryUnitTypeObjectHelper.toMap(ASUTUpdateIn, new HashMap(), "AddressSecondaryUnitType").get("AddressSecondaryUnitType"));
    }
  }

/**
 *
 * Retrieves the AddressSecondaryUnitTypeObjectData that results from the AddressSecondaryUnitTypeUpdateRequest call
 * @return AddressSecondaryUnitTypeObjectData resulting from udt call
 *
 */

  public AddressSecondaryUnitTypeObjectData getOutput() {
    return AddressSecondaryUnitTypeObjectHelper.fromMap(outputMap, "AddressSecondaryUnitType");
  }
}
