/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptFindRequest.java
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
 * Class used to create a BillFmtOptFindRequest Udt Request
 *
 */

public class BillFmtOptFindRequest extends BillFmtOptRequest {
/**
 *
 * Constructor to create a  BillFmtOptFindRequest
 * @param id Unique request name
 * @param BllFmtOptFindIn BllFmtOptObjectFilter for BillFmtOptFindRequest
 *
 */
@JsonCreator
  public BillFmtOptFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillFmtOpt")BllFmtOptObjectFilter BllFmtOptFindIn) {
    super(id, "BillFmtOptFind");
    if (BllFmtOptFindIn != null) {
      Integer index =  BllFmtOptFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillFmtOpt", BllFmtOptObjectHelper.toMap(BllFmtOptFindIn, new HashMap(), "BillFmtOpt").get("BillFmtOpt"));
    }
  }

/**
 *
 * Retrieves the BllFmtOptObjectDataList that results from the BillFmtOptFindRequest call
 * @return BllFmtOptObjectDataList resulting from udt call
 *
 */

  public BllFmtOptObjectDataList getOutput() {
    return BllFmtOptObjectHelper.fromMapList(outputMap, "BillFmtOptList");
  }
}
