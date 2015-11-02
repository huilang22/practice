/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetSuffixDeleteRequest.java
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
 * Class used to create a AddressStreetSuffixDeleteRequest Udt Request
 *
 */

public class AddressStreetSuffixDeleteRequest extends AddressStreetSuffixRequest {
/**
 *
 * Constructor to create a  AddressStreetSuffixDeleteRequest
 * @param id Unique request name
 * @param ASSDeleteIn AddressStreetSuffixObjectData for AddressStreetSuffixDeleteRequest
 *
 */
@JsonCreator
  public AddressStreetSuffixDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressStreetSuffix")AddressStreetSuffixObjectData ASSDeleteIn) {
    super(id, "AddressStreetSuffixDelete");
    if (ASSDeleteIn != null) {
      addInput("AddressStreetSuffix", AddressStreetSuffixObjectHelper.toMap(ASSDeleteIn, new HashMap(), "Void").get("Void"));
    }
  }

}
