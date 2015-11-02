/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetDirectionalGetRequest.java
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
 * Class used to create a AddressStreetDirectionalGetRequest Udt Request
 *
 */

public class AddressStreetDirectionalGetRequest extends AddressStreetDirectionalSubRequestParent {
/**
 *
 * Constructor to create a  AddressStreetDirectionalGetRequest
 * @param id Unique request name
 * @param ASDGetIn AddressStreetDirectionalObjectKeyData for AddressStreetDirectionalGetRequest
 *
 */
@JsonCreator
  public AddressStreetDirectionalGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressStreetDirectional")AddressStreetDirectionalObjectKeyData ASDGetIn) {
    super(id, "AddressStreetDirectionalGet");
    if (ASDGetIn != null) {
      addInput("AddressStreetDirectional", AddressStreetDirectionalObjectKeyHelper.toMap(ASDGetIn, new HashMap(), "AddressStreetDirectionalObjectKeyData").get("AddressStreetDirectionalObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AddressStreetDirectionalObjectData that results from the AddressStreetDirectionalGetRequest call
 * @return AddressStreetDirectionalObjectData resulting from udt call
 *
 */

  public AddressStreetDirectionalObjectData getOutput() {
    return AddressStreetDirectionalObjectHelper.fromMap(outputMap, "AddressStreetDirectional");
  }
}
