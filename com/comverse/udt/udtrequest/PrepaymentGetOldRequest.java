/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrepaymentGetOldRequest.java
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
 * Class used to create a PrepaymentGetOldRequest Udt Request
 *
 */

public class PrepaymentGetOldRequest extends PrepaymentSubRequestParent {
/**
 *
 * Constructor to create a  PrepaymentGetOldRequest
 * @param id Unique request name
 * @param getOldIn PrepaymentObjectKeyData for PrepaymentGetOldRequest
 *
 */
@JsonCreator
  public PrepaymentGetOldRequest(@JsonProperty("RequestId") String id, @JsonProperty("Prepayment")PrepaymentObjectKeyData getOldIn) {
    super(id, "PrepaymentGetOld");
    if (getOldIn != null) {
      addInput("Prepayment", PrepaymentObjectKeyHelper.toMap(getOldIn, new HashMap(), "PrepaymentObjectKeyData").get("PrepaymentObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PrepaymentObjectData that results from the PrepaymentGetOldRequest call
 * @return PrepaymentObjectData resulting from udt call
 *
 */

  public PrepaymentObjectData getOutput() {
    return PrepaymentObjectHelper.fromMap(outputMap, "Prepayment");
  }
}
