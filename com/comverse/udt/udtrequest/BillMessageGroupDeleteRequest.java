/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupDeleteRequest.java
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
 * Class used to create a BillMessageGroupDeleteRequest Udt Request
 *
 */

public class BillMessageGroupDeleteRequest extends BillMessageGroupSubRequestParent {
/**
 *
 * Constructor to create a  BillMessageGroupDeleteRequest
 * @param id Unique request name
 * @param MGIDeleteIn BillMessageGroupObjectKeyData for BillMessageGroupDeleteRequest
 *
 */
@JsonCreator
  public BillMessageGroupDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillMessageGroup")BillMessageGroupObjectKeyData MGIDeleteIn) {
    super(id, "BillMessageGroupDelete");
    if (MGIDeleteIn != null) {
      addInput("BillMessageGroup", BillMessageGroupObjectKeyHelper.toMap(MGIDeleteIn, new HashMap(), "BillMessageGroupObjectKeyData").get("BillMessageGroupObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BillMessageGroupObjectData that results from the BillMessageGroupDeleteRequest call
 * @return BillMessageGroupObjectData resulting from udt call
 *
 */

  public BillMessageGroupObjectData getOutput() {
    return BillMessageGroupObjectHelper.fromMap(outputMap, "BillMessageGroup");
  }
}
