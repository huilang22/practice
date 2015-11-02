/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressTypeCreateRequest.java
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
 * Class used to create a AddressTypeCreateRequest Udt Request
 *
 */

public class AddressTypeCreateRequest extends AddressTypeSubRequestParent {
/**
 *
 * Constructor to create a  AddressTypeCreateRequest
 * @param id Unique request name
 * @param AddressTypeCreateIn AddressTypeObjectData for AddressTypeCreateRequest
 *
 */
@JsonCreator
  public AddressTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressType")AddressTypeObjectData AddressTypeCreateIn) {
    super(id, "AddressTypeCreate");
    if (AddressTypeCreateIn != null) {
      addInput("AddressType", AddressTypeObjectHelper.toMap(AddressTypeCreateIn, new HashMap(), "AddressType").get("AddressType"));
    }
  }

/**
 *
 * Retrieves the AddressTypeObjectData that results from the AddressTypeCreateRequest call
 * @return AddressTypeObjectData resulting from udt call
 *
 */

  public AddressTypeObjectData getOutput() {
    return AddressTypeObjectHelper.fromMap(outputMap, "AddressType");
  }
}
