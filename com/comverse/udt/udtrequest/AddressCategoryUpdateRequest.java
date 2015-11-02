/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressCategoryUpdateRequest.java
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
 * Class used to create a AddressCategoryUpdateRequest Udt Request
 *
 */

public class AddressCategoryUpdateRequest extends AddressCategorySubRequestParent {
/**
 *
 * Constructor to create a  AddressCategoryUpdateRequest
 * @param id Unique request name
 * @param AddressCategoryUpdateIn AddressCategoryObjectData for AddressCategoryUpdateRequest
 *
 */
@JsonCreator
  public AddressCategoryUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressCategory")AddressCategoryObjectData AddressCategoryUpdateIn) {
    super(id, "AddressCategoryUpdate");
    if (AddressCategoryUpdateIn != null) {
      addInput("AddressCategory", AddressCategoryObjectHelper.toMap(AddressCategoryUpdateIn, new HashMap(), "AddressCategory").get("AddressCategory"));
    }
  }

/**
 *
 * Retrieves the AddressCategoryObjectData that results from the AddressCategoryUpdateRequest call
 * @return AddressCategoryObjectData resulting from udt call
 *
 */

  public AddressCategoryObjectData getOutput() {
    return AddressCategoryObjectHelper.fromMap(outputMap, "AddressCategory");
  }
}
