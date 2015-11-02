/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CreditCardGetRequest.java
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
 * Class used to create a CreditCardGetRequest Udt Request
 *
 */

public class CreditCardGetRequest extends CreditCardSubRequestParent {
/**
 *
 * Constructor to create a  CreditCardGetRequest
 * @param id Unique request name
 * @param getIn CreditCardObjectKeyData for CreditCardGetRequest
 *
 */
@JsonCreator
  public CreditCardGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CreditCard")CreditCardObjectKeyData getIn) {
    super(id, "CreditCardGet");
    if (getIn != null) {
      addInput("CreditCard", CreditCardObjectKeyHelper.toMap(getIn, new HashMap(), "CreditCardObjectKeyData").get("CreditCardObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CreditCardObjectData that results from the CreditCardGetRequest call
 * @return CreditCardObjectData resulting from udt call
 *
 */

  public CreditCardObjectData getOutput() {
    return CreditCardObjectHelper.fromMap(outputMap, "CreditCard");
  }
}
