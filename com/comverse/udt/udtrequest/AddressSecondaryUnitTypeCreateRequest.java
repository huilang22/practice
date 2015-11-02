/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressSecondaryUnitTypeCreateRequest.java
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
 * Class used to create a AddressSecondaryUnitTypeCreateRequest Udt Request
 *
 */

public class AddressSecondaryUnitTypeCreateRequest extends AddressSecondaryUnitTypeSubRequestParent {
/**
 *
 * Constructor to create a  AddressSecondaryUnitTypeCreateRequest
 * @param id Unique request name
 * @param ASUTCreateIn AddressSecondaryUnitTypeObjectData for AddressSecondaryUnitTypeCreateRequest
 *
 */
@JsonCreator
  public AddressSecondaryUnitTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressSecondaryUnitType")AddressSecondaryUnitTypeObjectData ASUTCreateIn) {
    super(id, "AddressSecondaryUnitTypeCreate");
    if (ASUTCreateIn != null) {
      addInput("AddressSecondaryUnitType", AddressSecondaryUnitTypeObjectHelper.toMap(ASUTCreateIn, new HashMap(), "AddressSecondaryUnitType").get("AddressSecondaryUnitType"));
    }
  }

/**
 *
 * Retrieves the AddressSecondaryUnitTypeObjectData that results from the AddressSecondaryUnitTypeCreateRequest call
 * @return AddressSecondaryUnitTypeObjectData resulting from udt call
 *
 */

  public AddressSecondaryUnitTypeObjectData getOutput() {
    return AddressSecondaryUnitTypeObjectHelper.fromMap(outputMap, "AddressSecondaryUnitType");
  }
}
