/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CountryCodeFindRequest.java
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
 * Class used to create a CountryCodeFindRequest Udt Request
 *
 */

public class CountryCodeFindRequest extends CountryCodeRequest {
/**
 *
 * Constructor to create a  CountryCodeFindRequest
 * @param id Unique request name
 * @param CCFindIn CountryCodeObjectFilter for CountryCodeFindRequest
 *
 */
@JsonCreator
  public CountryCodeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CountryCode")CountryCodeObjectFilter CCFindIn) {
    super(id, "CountryCodeFind");
    if (CCFindIn != null) {
      Integer index =  CCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CountryCode", CountryCodeObjectHelper.toMap(CCFindIn, new HashMap(), "CountryCode").get("CountryCode"));
    }
  }

/**
 *
 * Retrieves the CountryCodeObjectDataList that results from the CountryCodeFindRequest call
 * @return CountryCodeObjectDataList resulting from udt call
 *
 */

  public CountryCodeObjectDataList getOutput() {
    return CountryCodeObjectHelper.fromMapList(outputMap, "CountryCodeList");
  }
}
