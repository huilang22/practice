/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetDirectionalCreateRequest.java
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
 * Class used to create a AddressStreetDirectionalCreateRequest Udt Request
 *
 */

public class AddressStreetDirectionalCreateRequest extends AddressStreetDirectionalSubRequestParent {
/**
 *
 * Constructor to create a  AddressStreetDirectionalCreateRequest
 * @param id Unique request name
 * @param ASDCreateIn AddressStreetDirectionalObjectData for AddressStreetDirectionalCreateRequest
 *
 */
@JsonCreator
  public AddressStreetDirectionalCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressStreetDirectional")AddressStreetDirectionalObjectData ASDCreateIn) {
    super(id, "AddressStreetDirectionalCreate");
    if (ASDCreateIn != null) {
      addInput("AddressStreetDirectional", AddressStreetDirectionalObjectHelper.toMap(ASDCreateIn, new HashMap(), "AddressStreetDirectional").get("AddressStreetDirectional"));
    }
  }

/**
 *
 * Retrieves the AddressStreetDirectionalObjectData that results from the AddressStreetDirectionalCreateRequest call
 * @return AddressStreetDirectionalObjectData resulting from udt call
 *
 */

  public AddressStreetDirectionalObjectData getOutput() {
    return AddressStreetDirectionalObjectHelper.fromMap(outputMap, "AddressStreetDirectional");
  }
}
