/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillImageGetRequest.java
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
 * Class used to create a BillImageGetRequest Udt Request
 *
 */

public class BillImageGetRequest extends BillImageSubRequestParent {
/**
 *
 * Constructor to create a  BillImageGetRequest
 * @param id Unique request name
 * @param bill_imageGetIn BillImageObjectKeyData for BillImageGetRequest
 *
 */
@JsonCreator
  public BillImageGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillImage")BillImageObjectKeyData bill_imageGetIn) {
    super(id, "BillImageGet");
    if (bill_imageGetIn != null) {
      addInput("BillImage", BillImageObjectKeyHelper.toMap(bill_imageGetIn, new HashMap(), "BillImageObjectKeyData").get("BillImageObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BillImageObjectData that results from the BillImageGetRequest call
 * @return BillImageObjectData resulting from udt call
 *
 */

  public BillImageObjectData getOutput() {
    return BillImageObjectHelper.fromMap(outputMap, "BillImage");
  }
}
