/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupGetRequest.java
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
 * Class used to create a BillInsertGroupGetRequest Udt Request
 *
 */

public class BillInsertGroupGetRequest extends BillInsertGroupSubRequestParent {
/**
 *
 * Constructor to create a  BillInsertGroupGetRequest
 * @param id Unique request name
 * @param IGIGetIn BillInsertGroupObjectKeyData for BillInsertGroupGetRequest
 *
 */
@JsonCreator
  public BillInsertGroupGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillInsertGroup")BillInsertGroupObjectKeyData IGIGetIn) {
    super(id, "BillInsertGroupGet");
    if (IGIGetIn != null) {
      addInput("BillInsertGroup", BillInsertGroupObjectKeyHelper.toMap(IGIGetIn, new HashMap(), "BillInsertGroupObjectKeyData").get("BillInsertGroupObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BillInsertGroupObjectData that results from the BillInsertGroupGetRequest call
 * @return BillInsertGroupObjectData resulting from udt call
 *
 */

  public BillInsertGroupObjectData getOutput() {
    return BillInsertGroupObjectHelper.fromMap(outputMap, "BillInsertGroup");
  }
}
