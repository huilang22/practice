/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupMapDeleteRequest.java
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
 * Class used to create a BillInsertGroupMapDeleteRequest Udt Request
 *
 */

public class BillInsertGroupMapDeleteRequest extends BillInsertGroupMapSubRequestParent {
/**
 *
 * Constructor to create a  BillInsertGroupMapDeleteRequest
 * @param id Unique request name
 * @param BIGDeleteIn BillInsertGroupMapObjectKeyData for BillInsertGroupMapDeleteRequest
 *
 */
@JsonCreator
  public BillInsertGroupMapDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillInsertGroupMap")BillInsertGroupMapObjectKeyData BIGDeleteIn) {
    super(id, "BillInsertGroupMapDelete");
    if (BIGDeleteIn != null) {
      addInput("BillInsertGroupMap", BillInsertGroupMapObjectKeyHelper.toMap(BIGDeleteIn, new HashMap(), "BillInsertGroupMapObjectKeyData").get("BillInsertGroupMapObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BillInsertGroupMapObjectData that results from the BillInsertGroupMapDeleteRequest call
 * @return BillInsertGroupMapObjectData resulting from udt call
 *
 */

  public BillInsertGroupMapObjectData getOutput() {
    return BillInsertGroupMapObjectHelper.fromMap(outputMap, "BillInsertGroupMap");
  }
}
