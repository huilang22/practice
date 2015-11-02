/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressCategoryGetRequest.java
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
 * Class used to create a AddressCategoryGetRequest Udt Request
 *
 */

public class AddressCategoryGetRequest extends AddressCategorySubRequestParent {
/**
 *
 * Constructor to create a  AddressCategoryGetRequest
 * @param id Unique request name
 * @param AddressCategoryGetIn AddressCategoryObjectKeyData for AddressCategoryGetRequest
 *
 */
@JsonCreator
  public AddressCategoryGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressCategory")AddressCategoryObjectKeyData AddressCategoryGetIn) {
    super(id, "AddressCategoryGet");
    if (AddressCategoryGetIn != null) {
      addInput("AddressCategory", AddressCategoryObjectKeyHelper.toMap(AddressCategoryGetIn, new HashMap(), "AddressCategoryObjectKeyData").get("AddressCategoryObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AddressCategoryObjectData that results from the AddressCategoryGetRequest call
 * @return AddressCategoryObjectData resulting from udt call
 *
 */

  public AddressCategoryObjectData getOutput() {
    return AddressCategoryObjectHelper.fromMap(outputMap, "AddressCategory");
  }
}
