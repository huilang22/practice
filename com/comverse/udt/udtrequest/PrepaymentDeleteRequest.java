/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrepaymentDeleteRequest.java
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
 * Class used to create a PrepaymentDeleteRequest Udt Request
 *
 */

public class PrepaymentDeleteRequest extends PrepaymentRequest {
/**
 *
 * Constructor to create a  PrepaymentDeleteRequest
 * @param id Unique request name
 * @param prepaymentDeleteIn PrepaymentObjectKeyData for PrepaymentDeleteRequest
 *
 */
@JsonCreator
  public PrepaymentDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("Prepayment")PrepaymentObjectKeyData prepaymentDeleteIn) {
    super(id, "PrepaymentDelete");
    if (prepaymentDeleteIn != null) {
      addInput("Prepayment", PrepaymentObjectKeyHelper.toMap(prepaymentDeleteIn, new HashMap(), "PrepaymentObjectKeyData").get("PrepaymentObjectKeyData"));
    }
  }

}
