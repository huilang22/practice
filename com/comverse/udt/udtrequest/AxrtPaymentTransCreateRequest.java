/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentTransCreateRequest.java
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
 * Class used to create a AxrtPaymentTransCreateRequest Udt Request
 *
 */

public class AxrtPaymentTransCreateRequest extends AxrtPaymentTransSubRequestParent {
/**
 *
 * Constructor to create a  AxrtPaymentTransCreateRequest
 * @param id Unique request name
 * @param AxrtPaymentTransCreateIn AxrtPaymentTransObjectData for AxrtPaymentTransCreateRequest
 *
 */
@JsonCreator
  public AxrtPaymentTransCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AxrtPaymentTrans")AxrtPaymentTransObjectData AxrtPaymentTransCreateIn) {
    super(id, "AxrtPaymentTransCreate");
    if (AxrtPaymentTransCreateIn != null) {
      addInput("AxrtPaymentTrans", AxrtPaymentTransObjectHelper.toMap(AxrtPaymentTransCreateIn, new HashMap(), "AxrtPaymentTrans").get("AxrtPaymentTrans"));
    }
  }

/**
 *
 * Retrieves the AxrtPaymentTransObjectData that results from the AxrtPaymentTransCreateRequest call
 * @return AxrtPaymentTransObjectData resulting from udt call
 *
 */

  public AxrtPaymentTransObjectData getOutput() {
    return AxrtPaymentTransObjectHelper.fromMap(outputMap, "AxrtPaymentTrans");
  }
}
