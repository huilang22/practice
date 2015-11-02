/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrepaymentGetRequest.java
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
 * Class used to create a PrepaymentGetRequest Udt Request
 *
 */

public class PrepaymentGetRequest extends PrepaymentSubRequestParent {
/**
 *
 * Constructor to create a  PrepaymentGetRequest
 * @param id Unique request name
 * @param getIn PrepaymentObjectKeyData for PrepaymentGetRequest
 *
 */
@JsonCreator
  public PrepaymentGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Prepayment")PrepaymentObjectKeyData getIn) {
    super(id, "PrepaymentGet");
    if (getIn != null) {
      addInput("Prepayment", PrepaymentObjectKeyHelper.toMap(getIn, new HashMap(), "PrepaymentObjectKeyData").get("PrepaymentObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PrepaymentObjectData that results from the PrepaymentGetRequest call
 * @return PrepaymentObjectData resulting from udt call
 *
 */

  public PrepaymentObjectData getOutput() {
    return PrepaymentObjectHelper.fromMap(outputMap, "Prepayment");
  }
}
