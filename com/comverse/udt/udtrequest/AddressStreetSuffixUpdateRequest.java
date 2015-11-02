/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetSuffixUpdateRequest.java
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
 * Class used to create a AddressStreetSuffixUpdateRequest Udt Request
 *
 */

public class AddressStreetSuffixUpdateRequest extends AddressStreetSuffixSubRequestParent {
/**
 *
 * Constructor to create a  AddressStreetSuffixUpdateRequest
 * @param id Unique request name
 * @param ASSUpdateIn AddressStreetSuffixObjectData for AddressStreetSuffixUpdateRequest
 *
 */
@JsonCreator
  public AddressStreetSuffixUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressStreetSuffix")AddressStreetSuffixObjectData ASSUpdateIn) {
    super(id, "AddressStreetSuffixUpdate");
    if (ASSUpdateIn != null) {
      addInput("AddressStreetSuffix", AddressStreetSuffixObjectHelper.toMap(ASSUpdateIn, new HashMap(), "AddressStreetSuffix").get("AddressStreetSuffix"));
    }
  }

/**
 *
 * Retrieves the AddressStreetSuffixObjectData that results from the AddressStreetSuffixUpdateRequest call
 * @return AddressStreetSuffixObjectData resulting from udt call
 *
 */

  public AddressStreetSuffixObjectData getOutput() {
    return AddressStreetSuffixObjectHelper.fromMap(outputMap, "AddressStreetSuffix");
  }
}
