/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupDeleteRequest.java
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
 * Class used to create a BillInsertGroupDeleteRequest Udt Request
 *
 */

public class BillInsertGroupDeleteRequest extends BillInsertGroupSubRequestParent {
/**
 *
 * Constructor to create a  BillInsertGroupDeleteRequest
 * @param id Unique request name
 * @param IGIDeleteIn BillInsertGroupObjectKeyData for BillInsertGroupDeleteRequest
 *
 */
@JsonCreator
  public BillInsertGroupDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillInsertGroup")BillInsertGroupObjectKeyData IGIDeleteIn) {
    super(id, "BillInsertGroupDelete");
    if (IGIDeleteIn != null) {
      addInput("BillInsertGroup", BillInsertGroupObjectKeyHelper.toMap(IGIDeleteIn, new HashMap(), "BillInsertGroupObjectKeyData").get("BillInsertGroupObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BillInsertGroupObjectData that results from the BillInsertGroupDeleteRequest call
 * @return BillInsertGroupObjectData resulting from udt call
 *
 */

  public BillInsertGroupObjectData getOutput() {
    return BillInsertGroupObjectHelper.fromMap(outputMap, "BillInsertGroup");
  }
}
