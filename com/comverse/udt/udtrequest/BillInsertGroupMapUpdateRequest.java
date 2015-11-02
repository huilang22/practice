/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupMapUpdateRequest.java
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
 * Class used to create a BillInsertGroupMapUpdateRequest Udt Request
 *
 */

public class BillInsertGroupMapUpdateRequest extends BillInsertGroupMapSubRequestParent {
/**
 *
 * Constructor to create a  BillInsertGroupMapUpdateRequest
 * @param id Unique request name
 * @param BIGUpdateIn BillInsertGroupMapObjectData for BillInsertGroupMapUpdateRequest
 *
 */
@JsonCreator
  public BillInsertGroupMapUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillInsertGroupMap")BillInsertGroupMapObjectData BIGUpdateIn) {
    super(id, "BillInsertGroupMapUpdate");
    if (BIGUpdateIn != null) {
      addInput("BillInsertGroupMap", BillInsertGroupMapObjectHelper.toMap(BIGUpdateIn, new HashMap(), "BillInsertGroupMap").get("BillInsertGroupMap"));
    }
  }

/**
 *
 * Retrieves the BillInsertGroupMapObjectData that results from the BillInsertGroupMapUpdateRequest call
 * @return BillInsertGroupMapObjectData resulting from udt call
 *
 */

  public BillInsertGroupMapObjectData getOutput() {
    return BillInsertGroupMapObjectHelper.fromMap(outputMap, "BillInsertGroupMap");
  }
}
