/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupMapGetRequest.java
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
 * Class used to create a BillInsertGroupMapGetRequest Udt Request
 *
 */

public class BillInsertGroupMapGetRequest extends BillInsertGroupMapSubRequestParent {
/**
 *
 * Constructor to create a  BillInsertGroupMapGetRequest
 * @param id Unique request name
 * @param BIGGetIn BillInsertGroupMapObjectKeyData for BillInsertGroupMapGetRequest
 *
 */
@JsonCreator
  public BillInsertGroupMapGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillInsertGroupMap")BillInsertGroupMapObjectKeyData BIGGetIn) {
    super(id, "BillInsertGroupMapGet");
    if (BIGGetIn != null) {
      addInput("BillInsertGroupMap", BillInsertGroupMapObjectKeyHelper.toMap(BIGGetIn, new HashMap(), "BillInsertGroupMapObjectKeyData").get("BillInsertGroupMapObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BillInsertGroupMapObjectData that results from the BillInsertGroupMapGetRequest call
 * @return BillInsertGroupMapObjectData resulting from udt call
 *
 */

  public BillInsertGroupMapObjectData getOutput() {
    return BillInsertGroupMapObjectHelper.fromMap(outputMap, "BillInsertGroupMap");
  }
}
