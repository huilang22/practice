/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LbxPaymentTypeGetRequest.java
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
 * Class used to create a LbxPaymentTypeGetRequest Udt Request
 *
 */

public class LbxPaymentTypeGetRequest extends LbxPaymentTypeSubRequestParent {
/**
 *
 * Constructor to create a  LbxPaymentTypeGetRequest
 * @param id Unique request name
 * @param LSGetIn LbxPaymentTypeObjectKeyData for LbxPaymentTypeGetRequest
 *
 */
@JsonCreator
  public LbxPaymentTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("LbxPaymentType")LbxPaymentTypeObjectKeyData LSGetIn) {
    super(id, "LbxPaymentTypeGet");
    if (LSGetIn != null) {
      addInput("LbxPaymentType", LbxPaymentTypeObjectKeyHelper.toMap(LSGetIn, new HashMap(), "LbxPaymentTypeObjectKeyData").get("LbxPaymentTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the LbxPaymentTypeObjectData that results from the LbxPaymentTypeGetRequest call
 * @return LbxPaymentTypeObjectData resulting from udt call
 *
 */

  public LbxPaymentTypeObjectData getOutput() {
    return LbxPaymentTypeObjectHelper.fromMap(outputMap, "LbxPaymentType");
  }
}
