/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupMapGetRequest.java
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
 * Class used to create a BillMessageGroupMapGetRequest Udt Request
 *
 */

public class BillMessageGroupMapGetRequest extends BillMessageGroupMapSubRequestParent {
/**
 *
 * Constructor to create a  BillMessageGroupMapGetRequest
 * @param id Unique request name
 * @param BMGGetIn BillMessageGroupMapObjectKeyData for BillMessageGroupMapGetRequest
 *
 */
@JsonCreator
  public BillMessageGroupMapGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillMessageGroupMap")BillMessageGroupMapObjectKeyData BMGGetIn) {
    super(id, "BillMessageGroupMapGet");
    if (BMGGetIn != null) {
      addInput("BillMessageGroupMap", BillMessageGroupMapObjectKeyHelper.toMap(BMGGetIn, new HashMap(), "BillMessageGroupMapObjectKeyData").get("BillMessageGroupMapObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BillMessageGroupMapObjectData that results from the BillMessageGroupMapGetRequest call
 * @return BillMessageGroupMapObjectData resulting from udt call
 *
 */

  public BillMessageGroupMapObjectData getOutput() {
    return BillMessageGroupMapObjectHelper.fromMap(outputMap, "BillMessageGroupMap");
  }
}
