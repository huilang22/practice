/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetSuffixCreateRequest.java
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
 * Class used to create a AddressStreetSuffixCreateRequest Udt Request
 *
 */

public class AddressStreetSuffixCreateRequest extends AddressStreetSuffixSubRequestParent {
/**
 *
 * Constructor to create a  AddressStreetSuffixCreateRequest
 * @param id Unique request name
 * @param ASSCreateIn AddressStreetSuffixObjectData for AddressStreetSuffixCreateRequest
 *
 */
@JsonCreator
  public AddressStreetSuffixCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressStreetSuffix")AddressStreetSuffixObjectData ASSCreateIn) {
    super(id, "AddressStreetSuffixCreate");
    if (ASSCreateIn != null) {
      addInput("AddressStreetSuffix", AddressStreetSuffixObjectHelper.toMap(ASSCreateIn, new HashMap(), "AddressStreetSuffix").get("AddressStreetSuffix"));
    }
  }

/**
 *
 * Retrieves the AddressStreetSuffixObjectData that results from the AddressStreetSuffixCreateRequest call
 * @return AddressStreetSuffixObjectData resulting from udt call
 *
 */

  public AddressStreetSuffixObjectData getOutput() {
    return AddressStreetSuffixObjectHelper.fromMap(outputMap, "AddressStreetSuffix");
  }
}
