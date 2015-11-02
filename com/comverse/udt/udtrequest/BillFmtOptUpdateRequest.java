/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptUpdateRequest.java
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
 * Class used to create a BillFmtOptUpdateRequest Udt Request
 *
 */

public class BillFmtOptUpdateRequest extends BillFmtOptSubRequestParent {
/**
 *
 * Constructor to create a  BillFmtOptUpdateRequest
 * @param id Unique request name
 * @param BllFmtOptUpdateIn BllFmtOptObjectData for BillFmtOptUpdateRequest
 *
 */
@JsonCreator
  public BillFmtOptUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillFmtOpt")BllFmtOptObjectData BllFmtOptUpdateIn) {
    super(id, "BillFmtOptUpdate");
    if (BllFmtOptUpdateIn != null) {
      addInput("BillFmtOpt", BllFmtOptObjectHelper.toMap(BllFmtOptUpdateIn, new HashMap(), "BillFmtOpt").get("BillFmtOpt"));
    }
  }

/**
 *
 * Retrieves the BllFmtOptObjectData that results from the BillFmtOptUpdateRequest call
 * @return BllFmtOptObjectData resulting from udt call
 *
 */

  public BllFmtOptObjectData getOutput() {
    return BllFmtOptObjectHelper.fromMap(outputMap, "BillFmtOpt");
  }
}
