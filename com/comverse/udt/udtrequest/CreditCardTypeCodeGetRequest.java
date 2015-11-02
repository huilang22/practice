/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CreditCardTypeCodeGetRequest.java
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
 * Class used to create a CreditCardTypeCodeGetRequest Udt Request
 *
 */

public class CreditCardTypeCodeGetRequest extends CreditCardTypeCodeSubRequestParent {
/**
 *
 * Constructor to create a  CreditCardTypeCodeGetRequest
 * @param id Unique request name
 * @param CreditCardTypeCodegetIn CreditCardTypeCodeObjectKeyData for CreditCardTypeCodeGetRequest
 *
 */
@JsonCreator
  public CreditCardTypeCodeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CreditCardTypeCode")CreditCardTypeCodeObjectKeyData CreditCardTypeCodegetIn) {
    super(id, "CreditCardTypeCodeGet");
    if (CreditCardTypeCodegetIn != null) {
      addInput("CreditCardTypeCode", CreditCardTypeCodeObjectKeyHelper.toMap(CreditCardTypeCodegetIn, new HashMap(), "CreditCardTypeCodeObjectKeyData").get("CreditCardTypeCodeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CreditCardTypeCodeObjectData that results from the CreditCardTypeCodeGetRequest call
 * @return CreditCardTypeCodeObjectData resulting from udt call
 *
 */

  public CreditCardTypeCodeObjectData getOutput() {
    return CreditCardTypeCodeObjectHelper.fromMap(outputMap, "CreditCardTypeCode");
  }
}
