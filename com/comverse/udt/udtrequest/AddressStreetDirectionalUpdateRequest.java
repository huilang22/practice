/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetDirectionalUpdateRequest.java
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
 * Class used to create a AddressStreetDirectionalUpdateRequest Udt Request
 *
 */

public class AddressStreetDirectionalUpdateRequest extends AddressStreetDirectionalSubRequestParent {
/**
 *
 * Constructor to create a  AddressStreetDirectionalUpdateRequest
 * @param id Unique request name
 * @param ASDUpdateIn AddressStreetDirectionalObjectData for AddressStreetDirectionalUpdateRequest
 *
 */
@JsonCreator
  public AddressStreetDirectionalUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressStreetDirectional")AddressStreetDirectionalObjectData ASDUpdateIn) {
    super(id, "AddressStreetDirectionalUpdate");
    if (ASDUpdateIn != null) {
      addInput("AddressStreetDirectional", AddressStreetDirectionalObjectHelper.toMap(ASDUpdateIn, new HashMap(), "AddressStreetDirectional").get("AddressStreetDirectional"));
    }
  }

/**
 *
 * Retrieves the AddressStreetDirectionalObjectData that results from the AddressStreetDirectionalUpdateRequest call
 * @return AddressStreetDirectionalObjectData resulting from udt call
 *
 */

  public AddressStreetDirectionalObjectData getOutput() {
    return AddressStreetDirectionalObjectHelper.fromMap(outputMap, "AddressStreetDirectional");
  }
}
