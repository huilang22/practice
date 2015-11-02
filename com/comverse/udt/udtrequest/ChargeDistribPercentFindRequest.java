/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ChargeDistribPercentFindRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ChargeDistribPercentFindRequest Udt Request
 *
 */

public class ChargeDistribPercentFindRequest extends ChargeDistribPercentRequest {
/**
 *
 * Constructor to create a  ChargeDistribPercentFindRequest
 * @param id Unique request name
 * @param CDPfind_In ChargeDistribPercentObjectFilter for ChargeDistribPercentFindRequest
 *
 */
@JsonCreator
  public ChargeDistribPercentFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ChargeDistribPercent")ChargeDistribPercentObjectFilter CDPfind_In) {
    super(id, "ChargeDistribPercentFind");
    if (CDPfind_In != null) {
      Integer index =  CDPfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ChargeDistribPercent", ChargeDistribPercentObjectHelper.toMap(CDPfind_In, new HashMap(), "ChargeDistribPercent").get("ChargeDistribPercent"));
    }
  }

/**
 *
 * Retrieves the ChargeDistribPercentObjectDataList that results from the ChargeDistribPercentFindRequest call
 * @return ChargeDistribPercentObjectDataList resulting from udt call
 *
 */

  public ChargeDistribPercentObjectDataList getOutput() {
    return ChargeDistribPercentObjectHelper.fromMapList(outputMap, "ChargeDistribPercentList");
  }
}
