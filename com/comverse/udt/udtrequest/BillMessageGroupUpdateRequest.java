/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupUpdateRequest.java
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
 * Class used to create a BillMessageGroupUpdateRequest Udt Request
 *
 */

public class BillMessageGroupUpdateRequest extends BillMessageGroupSubRequestParent {
/**
 *
 * Constructor to create a  BillMessageGroupUpdateRequest
 * @param id Unique request name
 * @param MGIUpdateIn BillMessageGroupObjectData for BillMessageGroupUpdateRequest
 *
 */
@JsonCreator
  public BillMessageGroupUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillMessageGroup")BillMessageGroupObjectData MGIUpdateIn) {
    super(id, "BillMessageGroupUpdate");
    if (MGIUpdateIn != null) {
      addInput("BillMessageGroup", BillMessageGroupObjectHelper.toMap(MGIUpdateIn, new HashMap(), "BillMessageGroup").get("BillMessageGroup"));
    }
  }

/**
 *
 * Retrieves the BillMessageGroupObjectData that results from the BillMessageGroupUpdateRequest call
 * @return BillMessageGroupObjectData resulting from udt call
 *
 */

  public BillMessageGroupObjectData getOutput() {
    return BillMessageGroupObjectHelper.fromMap(outputMap, "BillMessageGroup");
  }
}
