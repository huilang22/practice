/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillingFrequencyFindRequest.java
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
 * Class used to create a BillingFrequencyFindRequest Udt Request
 *
 */

public class BillingFrequencyFindRequest extends BillingFrequencyRequest {
/**
 *
 * Constructor to create a  BillingFrequencyFindRequest
 * @param id Unique request name
 * @param BFFindIn BFObjectFilter for BillingFrequencyFindRequest
 *
 */
@JsonCreator
  public BillingFrequencyFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillingFrequency")BFObjectFilter BFFindIn) {
    super(id, "BillingFrequencyFind");
    if (BFFindIn != null) {
      Integer index =  BFFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillingFrequency", BFObjectHelper.toMap(BFFindIn, new HashMap(), "BillingFrequency").get("BillingFrequency"));
    }
  }

/**
 *
 * Retrieves the BFObjectDataList that results from the BillingFrequencyFindRequest call
 * @return BFObjectDataList resulting from udt call
 *
 */

  public BFObjectDataList getOutput() {
    return BFObjectHelper.fromMapList(outputMap, "BillingFrequencyList");
  }
}
