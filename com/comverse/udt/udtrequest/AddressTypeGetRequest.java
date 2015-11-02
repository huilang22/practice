/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressTypeGetRequest.java
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
 * Class used to create a AddressTypeGetRequest Udt Request
 *
 */

public class AddressTypeGetRequest extends AddressTypeSubRequestParent {
/**
 *
 * Constructor to create a  AddressTypeGetRequest
 * @param id Unique request name
 * @param AddressTypeGetIn AddressTypeObjectKeyData for AddressTypeGetRequest
 *
 */
@JsonCreator
  public AddressTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressType")AddressTypeObjectKeyData AddressTypeGetIn) {
    super(id, "AddressTypeGet");
    if (AddressTypeGetIn != null) {
      addInput("AddressType", AddressTypeObjectKeyHelper.toMap(AddressTypeGetIn, new HashMap(), "AddressTypeObjectKeyData").get("AddressTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AddressTypeObjectData that results from the AddressTypeGetRequest call
 * @return AddressTypeObjectData resulting from udt call
 *
 */

  public AddressTypeObjectData getOutput() {
    return AddressTypeObjectHelper.fromMap(outputMap, "AddressType");
  }
}
