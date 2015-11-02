/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsCountryCodeFindRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsCountryCodeFindRequest Udt Request
 *
 */

public class InvsCountryCodeFindRequest extends InvsCountryCodeRequest {
/**
 *
 * Constructor to create a  InvsCountryCodeFindRequest
 * @param id Unique request name
 * @param InvsCountryCodeFindIn InvsCountryCodeObjectFilter for InvsCountryCodeFindRequest
 *
 */
@JsonCreator
  public InvsCountryCodeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsCountryCode")InvsCountryCodeObjectFilter InvsCountryCodeFindIn) {
    super(id, "InvsCountryCodeFind");
    if (InvsCountryCodeFindIn != null) {
      Integer index =  InvsCountryCodeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsCountryCode", InvsCountryCodeObjectHelper.toMap(InvsCountryCodeFindIn, new HashMap(), "InvsCountryCode").get("InvsCountryCode"));
    }
  }

/**
 *
 * Retrieves the InvsCountryCodeObjectDataList that results from the InvsCountryCodeFindRequest call
 * @return InvsCountryCodeObjectDataList resulting from udt call
 *
 */

  public InvsCountryCodeObjectDataList getOutput() {
    return InvsCountryCodeObjectHelper.fromMapList(outputMap, "InvsCountryCodeList");
  }
}
