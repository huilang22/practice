/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressCategoryFindRequest.java
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
 * Class used to create a AddressCategoryFindRequest Udt Request
 *
 */

public class AddressCategoryFindRequest extends AddressCategoryRequest {
/**
 *
 * Constructor to create a  AddressCategoryFindRequest
 * @param id Unique request name
 * @param AddressCategoryFindIn AddressCategoryObjectFilter for AddressCategoryFindRequest
 *
 */
@JsonCreator
  public AddressCategoryFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressCategory")AddressCategoryObjectFilter AddressCategoryFindIn) {
    super(id, "AddressCategoryFind");
    if (AddressCategoryFindIn != null) {
      Integer index =  AddressCategoryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AddressCategory", AddressCategoryObjectHelper.toMap(AddressCategoryFindIn, new HashMap(), "AddressCategory").get("AddressCategory"));
    }
  }

/**
 *
 * Retrieves the AddressCategoryObjectDataList that results from the AddressCategoryFindRequest call
 * @return AddressCategoryObjectDataList resulting from udt call
 *
 */

  public AddressCategoryObjectDataList getOutput() {
    return AddressCategoryObjectHelper.fromMapList(outputMap, "AddressCategoryList");
  }
}
