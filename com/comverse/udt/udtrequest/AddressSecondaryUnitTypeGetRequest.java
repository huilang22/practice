/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressSecondaryUnitTypeGetRequest.java
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
 * Class used to create a AddressSecondaryUnitTypeGetRequest Udt Request
 *
 */

public class AddressSecondaryUnitTypeGetRequest extends AddressSecondaryUnitTypeSubRequestParent {
/**
 *
 * Constructor to create a  AddressSecondaryUnitTypeGetRequest
 * @param id Unique request name
 * @param ASUTGetIn AddressSecondaryUnitTypeObjectKeyData for AddressSecondaryUnitTypeGetRequest
 *
 */
@JsonCreator
  public AddressSecondaryUnitTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressSecondaryUnitType")AddressSecondaryUnitTypeObjectKeyData ASUTGetIn) {
    super(id, "AddressSecondaryUnitTypeGet");
    if (ASUTGetIn != null) {
      addInput("AddressSecondaryUnitType", AddressSecondaryUnitTypeObjectKeyHelper.toMap(ASUTGetIn, new HashMap(), "AddressSecondaryUnitTypeObjectKeyData").get("AddressSecondaryUnitTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AddressSecondaryUnitTypeObjectData that results from the AddressSecondaryUnitTypeGetRequest call
 * @return AddressSecondaryUnitTypeObjectData resulting from udt call
 *
 */

  public AddressSecondaryUnitTypeObjectData getOutput() {
    return AddressSecondaryUnitTypeObjectHelper.fromMap(outputMap, "AddressSecondaryUnitType");
  }
}
