/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupCreateRequest.java
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
 * Class used to create a BillInsertGroupCreateRequest Udt Request
 *
 */

public class BillInsertGroupCreateRequest extends BillInsertGroupSubRequestParent {
/**
 *
 * Constructor to create a  BillInsertGroupCreateRequest
 * @param id Unique request name
 * @param IGICreateIn BillInsertGroupObjectData for BillInsertGroupCreateRequest
 *
 */
@JsonCreator
  public BillInsertGroupCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillInsertGroup")BillInsertGroupObjectData IGICreateIn) {
    super(id, "BillInsertGroupCreate");
    if (IGICreateIn != null) {
      addInput("BillInsertGroup", BillInsertGroupObjectHelper.toMap(IGICreateIn, new HashMap(), "BillInsertGroup").get("BillInsertGroup"));
    }
  }

/**
 *
 * Retrieves the BillInsertGroupObjectData that results from the BillInsertGroupCreateRequest call
 * @return BillInsertGroupObjectData resulting from udt call
 *
 */

  public BillInsertGroupObjectData getOutput() {
    return BillInsertGroupObjectHelper.fromMap(outputMap, "BillInsertGroup");
  }
}
