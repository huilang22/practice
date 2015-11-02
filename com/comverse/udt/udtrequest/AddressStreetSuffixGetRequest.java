/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetSuffixGetRequest.java
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
 * Class used to create a AddressStreetSuffixGetRequest Udt Request
 *
 */

public class AddressStreetSuffixGetRequest extends AddressStreetSuffixSubRequestParent {
/**
 *
 * Constructor to create a  AddressStreetSuffixGetRequest
 * @param id Unique request name
 * @param ASSGetIn AddressStreetSuffixObjectKeyData for AddressStreetSuffixGetRequest
 *
 */
@JsonCreator
  public AddressStreetSuffixGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressStreetSuffix")AddressStreetSuffixObjectKeyData ASSGetIn) {
    super(id, "AddressStreetSuffixGet");
    if (ASSGetIn != null) {
      addInput("AddressStreetSuffix", AddressStreetSuffixObjectKeyHelper.toMap(ASSGetIn, new HashMap(), "AddressStreetSuffixObjectKeyData").get("AddressStreetSuffixObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AddressStreetSuffixObjectData that results from the AddressStreetSuffixGetRequest call
 * @return AddressStreetSuffixObjectData resulting from udt call
 *
 */

  public AddressStreetSuffixObjectData getOutput() {
    return AddressStreetSuffixObjectHelper.fromMap(outputMap, "AddressStreetSuffix");
  }
}
