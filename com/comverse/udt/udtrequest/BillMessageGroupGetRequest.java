/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupGetRequest.java
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
 * Class used to create a BillMessageGroupGetRequest Udt Request
 *
 */

public class BillMessageGroupGetRequest extends BillMessageGroupSubRequestParent {
/**
 *
 * Constructor to create a  BillMessageGroupGetRequest
 * @param id Unique request name
 * @param MGIGetIn BillMessageGroupObjectKeyData for BillMessageGroupGetRequest
 *
 */
@JsonCreator
  public BillMessageGroupGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillMessageGroup")BillMessageGroupObjectKeyData MGIGetIn) {
    super(id, "BillMessageGroupGet");
    if (MGIGetIn != null) {
      addInput("BillMessageGroup", BillMessageGroupObjectKeyHelper.toMap(MGIGetIn, new HashMap(), "BillMessageGroupObjectKeyData").get("BillMessageGroupObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BillMessageGroupObjectData that results from the BillMessageGroupGetRequest call
 * @return BillMessageGroupObjectData resulting from udt call
 *
 */

  public BillMessageGroupObjectData getOutput() {
    return BillMessageGroupObjectHelper.fromMap(outputMap, "BillMessageGroup");
  }
}
