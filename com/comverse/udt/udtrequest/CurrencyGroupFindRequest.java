/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CurrencyGroupFindRequest.java
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
 * Class used to create a CurrencyGroupFindRequest Udt Request
 *
 */

public class CurrencyGroupFindRequest extends CurrencyGroupRequest {
/**
 *
 * Constructor to create a  CurrencyGroupFindRequest
 * @param id Unique request name
 * @param RCGFindIn CurrencyGroupObjectFilter for CurrencyGroupFindRequest
 *
 */
@JsonCreator
  public CurrencyGroupFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CurrencyGroup")CurrencyGroupObjectFilter RCGFindIn) {
    super(id, "CurrencyGroupFind");
    if (RCGFindIn != null) {
      Integer index =  RCGFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CurrencyGroup", CurrencyGroupObjectHelper.toMap(RCGFindIn, new HashMap(), "CurrencyGroup").get("CurrencyGroup"));
    }
  }

/**
 *
 * Retrieves the CurrencyGroupObjectDataList that results from the CurrencyGroupFindRequest call
 * @return CurrencyGroupObjectDataList resulting from udt call
 *
 */

  public CurrencyGroupObjectDataList getOutput() {
    return CurrencyGroupObjectHelper.fromMapList(outputMap, "CurrencyGroupList");
  }
}
