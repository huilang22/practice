/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressTypeFindRequest.java
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
 * Class used to create a AddressTypeFindRequest Udt Request
 *
 */

public class AddressTypeFindRequest extends AddressTypeRequest {
/**
 *
 * Constructor to create a  AddressTypeFindRequest
 * @param id Unique request name
 * @param AddressTypeFindIn AddressTypeObjectFilter for AddressTypeFindRequest
 *
 */
@JsonCreator
  public AddressTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressType")AddressTypeObjectFilter AddressTypeFindIn) {
    super(id, "AddressTypeFind");
    if (AddressTypeFindIn != null) {
      Integer index =  AddressTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AddressType", AddressTypeObjectHelper.toMap(AddressTypeFindIn, new HashMap(), "AddressType").get("AddressType"));
    }
  }

/**
 *
 * Retrieves the AddressTypeObjectDataList that results from the AddressTypeFindRequest call
 * @return AddressTypeObjectDataList resulting from udt call
 *
 */

  public AddressTypeObjectDataList getOutput() {
    return AddressTypeObjectHelper.fromMapList(outputMap, "AddressTypeList");
  }
}
