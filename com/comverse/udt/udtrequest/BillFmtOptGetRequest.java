/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptGetRequest.java
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
 * Class used to create a BillFmtOptGetRequest Udt Request
 *
 */

public class BillFmtOptGetRequest extends BillFmtOptSubRequestParent {
/**
 *
 * Constructor to create a  BillFmtOptGetRequest
 * @param id Unique request name
 * @param BllFmtOptGetIn BllFmtOptObjectKeyData for BillFmtOptGetRequest
 *
 */
@JsonCreator
  public BillFmtOptGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillFmtOpt")BllFmtOptObjectKeyData BllFmtOptGetIn) {
    super(id, "BillFmtOptGet");
    if (BllFmtOptGetIn != null) {
      addInput("BillFmtOpt", BllFmtOptObjectKeyHelper.toMap(BllFmtOptGetIn, new HashMap(), "BllFmtOptObjectKeyData").get("BllFmtOptObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BllFmtOptObjectData that results from the BillFmtOptGetRequest call
 * @return BllFmtOptObjectData resulting from udt call
 *
 */

  public BllFmtOptObjectData getOutput() {
    return BllFmtOptObjectHelper.fromMap(outputMap, "BillFmtOpt");
  }
}
