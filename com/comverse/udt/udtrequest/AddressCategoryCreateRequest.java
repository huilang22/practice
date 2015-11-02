/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressCategoryCreateRequest.java
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
 * Class used to create a AddressCategoryCreateRequest Udt Request
 *
 */

public class AddressCategoryCreateRequest extends AddressCategorySubRequestParent {
/**
 *
 * Constructor to create a  AddressCategoryCreateRequest
 * @param id Unique request name
 * @param AddressCategoryCreateIn AddressCategoryObjectData for AddressCategoryCreateRequest
 *
 */
@JsonCreator
  public AddressCategoryCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressCategory")AddressCategoryObjectData AddressCategoryCreateIn) {
    super(id, "AddressCategoryCreate");
    if (AddressCategoryCreateIn != null) {
      addInput("AddressCategory", AddressCategoryObjectHelper.toMap(AddressCategoryCreateIn, new HashMap(), "AddressCategory").get("AddressCategory"));
    }
  }

/**
 *
 * Retrieves the AddressCategoryObjectData that results from the AddressCategoryCreateRequest call
 * @return AddressCategoryObjectData resulting from udt call
 *
 */

  public AddressCategoryObjectData getOutput() {
    return AddressCategoryObjectHelper.fromMap(outputMap, "AddressCategory");
  }
}
