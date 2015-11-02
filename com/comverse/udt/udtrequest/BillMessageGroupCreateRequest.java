/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupCreateRequest.java
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
 * Class used to create a BillMessageGroupCreateRequest Udt Request
 *
 */

public class BillMessageGroupCreateRequest extends BillMessageGroupSubRequestParent {
/**
 *
 * Constructor to create a  BillMessageGroupCreateRequest
 * @param id Unique request name
 * @param MGICreateIn BillMessageGroupObjectData for BillMessageGroupCreateRequest
 *
 */
@JsonCreator
  public BillMessageGroupCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillMessageGroup")BillMessageGroupObjectData MGICreateIn) {
    super(id, "BillMessageGroupCreate");
    if (MGICreateIn != null) {
      addInput("BillMessageGroup", BillMessageGroupObjectHelper.toMap(MGICreateIn, new HashMap(), "BillMessageGroup").get("BillMessageGroup"));
    }
  }

/**
 *
 * Retrieves the BillMessageGroupObjectData that results from the BillMessageGroupCreateRequest call
 * @return BillMessageGroupObjectData resulting from udt call
 *
 */

  public BillMessageGroupObjectData getOutput() {
    return BillMessageGroupObjectHelper.fromMap(outputMap, "BillMessageGroup");
  }
}
