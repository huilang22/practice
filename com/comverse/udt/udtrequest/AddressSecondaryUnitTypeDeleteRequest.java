/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressSecondaryUnitTypeDeleteRequest.java
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
 * Class used to create a AddressSecondaryUnitTypeDeleteRequest Udt Request
 *
 */

public class AddressSecondaryUnitTypeDeleteRequest extends AddressSecondaryUnitTypeRequest {
/**
 *
 * Constructor to create a  AddressSecondaryUnitTypeDeleteRequest
 * @param id Unique request name
 * @param ASUTDeleteIn AddressSecondaryUnitTypeObjectData for AddressSecondaryUnitTypeDeleteRequest
 *
 */
@JsonCreator
  public AddressSecondaryUnitTypeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressSecondaryUnitType")AddressSecondaryUnitTypeObjectData ASUTDeleteIn) {
    super(id, "AddressSecondaryUnitTypeDelete");
    if (ASUTDeleteIn != null) {
      addInput("AddressSecondaryUnitType", AddressSecondaryUnitTypeObjectHelper.toMap(ASUTDeleteIn, new HashMap(), "Void").get("Void"));
    }
  }

}
