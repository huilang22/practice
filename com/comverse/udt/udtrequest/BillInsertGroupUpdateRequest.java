/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupUpdateRequest.java
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
 * Class used to create a BillInsertGroupUpdateRequest Udt Request
 *
 */

public class BillInsertGroupUpdateRequest extends BillInsertGroupSubRequestParent {
/**
 *
 * Constructor to create a  BillInsertGroupUpdateRequest
 * @param id Unique request name
 * @param IGIUpdateIn BillInsertGroupObjectData for BillInsertGroupUpdateRequest
 *
 */
@JsonCreator
  public BillInsertGroupUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillInsertGroup")BillInsertGroupObjectData IGIUpdateIn) {
    super(id, "BillInsertGroupUpdate");
    if (IGIUpdateIn != null) {
      addInput("BillInsertGroup", BillInsertGroupObjectHelper.toMap(IGIUpdateIn, new HashMap(), "BillInsertGroup").get("BillInsertGroup"));
    }
  }

/**
 *
 * Retrieves the BillInsertGroupObjectData that results from the BillInsertGroupUpdateRequest call
 * @return BillInsertGroupObjectData resulting from udt call
 *
 */

  public BillInsertGroupObjectData getOutput() {
    return BillInsertGroupObjectHelper.fromMap(outputMap, "BillInsertGroup");
  }
}
