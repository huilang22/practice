/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetSuffixFindRequest.java
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
 * Class used to create a AddressStreetSuffixFindRequest Udt Request
 *
 */

public class AddressStreetSuffixFindRequest extends AddressStreetSuffixRequest {
/**
 *
 * Constructor to create a  AddressStreetSuffixFindRequest
 * @param id Unique request name
 * @param ASSFindIn AddressStreetSuffixObjectFilter for AddressStreetSuffixFindRequest
 *
 */
@JsonCreator
  public AddressStreetSuffixFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressStreetSuffix")AddressStreetSuffixObjectFilter ASSFindIn) {
    super(id, "AddressStreetSuffixFind");
    if (ASSFindIn != null) {
      Integer index =  ASSFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AddressStreetSuffix", AddressStreetSuffixObjectHelper.toMap(ASSFindIn, new HashMap(), "AddressStreetSuffix").get("AddressStreetSuffix"));
    }
  }

/**
 *
 * Retrieves the AddressStreetSuffixObjectDataList that results from the AddressStreetSuffixFindRequest call
 * @return AddressStreetSuffixObjectDataList resulting from udt call
 *
 */

  public AddressStreetSuffixObjectDataList getOutput() {
    return AddressStreetSuffixObjectHelper.fromMapList(outputMap, "AddressStreetSuffixList");
  }
}
