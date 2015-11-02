/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressTypeUpdateRequest.java
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
 * Class used to create a AddressTypeUpdateRequest Udt Request
 *
 */

public class AddressTypeUpdateRequest extends AddressTypeSubRequestParent {
/**
 *
 * Constructor to create a  AddressTypeUpdateRequest
 * @param id Unique request name
 * @param AddressTypeUpdateIn AddressTypeObjectData for AddressTypeUpdateRequest
 *
 */
@JsonCreator
  public AddressTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressType")AddressTypeObjectData AddressTypeUpdateIn) {
    super(id, "AddressTypeUpdate");
    if (AddressTypeUpdateIn != null) {
      addInput("AddressType", AddressTypeObjectHelper.toMap(AddressTypeUpdateIn, new HashMap(), "AddressType").get("AddressType"));
    }
  }

/**
 *
 * Retrieves the AddressTypeObjectData that results from the AddressTypeUpdateRequest call
 * @return AddressTypeObjectData resulting from udt call
 *
 */

  public AddressTypeObjectData getOutput() {
    return AddressTypeObjectHelper.fromMap(outputMap, "AddressType");
  }
}
