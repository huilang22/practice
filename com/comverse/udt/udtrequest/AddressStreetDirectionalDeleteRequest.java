/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetDirectionalDeleteRequest.java
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
 * Class used to create a AddressStreetDirectionalDeleteRequest Udt Request
 *
 */

public class AddressStreetDirectionalDeleteRequest extends AddressStreetDirectionalRequest {
/**
 *
 * Constructor to create a  AddressStreetDirectionalDeleteRequest
 * @param id Unique request name
 * @param ASDDeleteIn AddressStreetDirectionalObjectData for AddressStreetDirectionalDeleteRequest
 *
 */
@JsonCreator
  public AddressStreetDirectionalDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressStreetDirectional")AddressStreetDirectionalObjectData ASDDeleteIn) {
    super(id, "AddressStreetDirectionalDelete");
    if (ASDDeleteIn != null) {
      addInput("AddressStreetDirectional", AddressStreetDirectionalObjectHelper.toMap(ASDDeleteIn, new HashMap(), "Void").get("Void"));
    }
  }

}
