/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptDeleteRequest.java
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
 * Class used to create a BillFmtOptDeleteRequest Udt Request
 *
 */

public class BillFmtOptDeleteRequest extends BillFmtOptSubRequestParent {
/**
 *
 * Constructor to create a  BillFmtOptDeleteRequest
 * @param id Unique request name
 * @param BllFmtOptDeleteIn BllFmtOptObjectKeyData for BillFmtOptDeleteRequest
 *
 */
@JsonCreator
  public BillFmtOptDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillFmtOpt")BllFmtOptObjectKeyData BllFmtOptDeleteIn) {
    super(id, "BillFmtOptDelete");
    if (BllFmtOptDeleteIn != null) {
      addInput("BillFmtOpt", BllFmtOptObjectKeyHelper.toMap(BllFmtOptDeleteIn, new HashMap(), "BllFmtOptObjectKeyData").get("BllFmtOptObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BllFmtOptObjectData that results from the BillFmtOptDeleteRequest call
 * @return BllFmtOptObjectData resulting from udt call
 *
 */

  public BllFmtOptObjectData getOutput() {
    return BllFmtOptObjectHelper.fromMap(outputMap, "BillFmtOpt");
  }
}
