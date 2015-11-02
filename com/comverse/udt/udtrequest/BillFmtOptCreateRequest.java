/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptCreateRequest.java
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
 * Class used to create a BillFmtOptCreateRequest Udt Request
 *
 */

public class BillFmtOptCreateRequest extends BillFmtOptSubRequestParent {
/**
 *
 * Constructor to create a  BillFmtOptCreateRequest
 * @param id Unique request name
 * @param BllFmtOptCreateIn BllFmtOptObjectData for BillFmtOptCreateRequest
 *
 */
@JsonCreator
  public BillFmtOptCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillFmtOpt")BllFmtOptObjectData BllFmtOptCreateIn) {
    super(id, "BillFmtOptCreate");
    if (BllFmtOptCreateIn != null) {
      addInput("BillFmtOpt", BllFmtOptObjectHelper.toMap(BllFmtOptCreateIn, new HashMap(), "BillFmtOpt").get("BillFmtOpt"));
    }
  }

/**
 *
 * Retrieves the BllFmtOptObjectData that results from the BillFmtOptCreateRequest call
 * @return BllFmtOptObjectData resulting from udt call
 *
 */

  public BllFmtOptObjectData getOutput() {
    return BllFmtOptObjectHelper.fromMap(outputMap, "BillFmtOpt");
  }
}
