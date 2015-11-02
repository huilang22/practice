/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CreditCardValidateRequest.java
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
 * Class used to create a CreditCardValidateRequest Udt Request
 *
 */

public class CreditCardValidateRequest extends CreditCardRequest {
/**
 *
 * Constructor to create a  CreditCardValidateRequest
 * @param id Unique request name
 * @param validateIn CreditCardObjectData for CreditCardValidateRequest
 *
 */
@JsonCreator
  public CreditCardValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CreditCard")CreditCardObjectData validateIn) {
    super(id, "CreditCardValidate");
    if (validateIn != null) {
      addInput("CreditCard", CreditCardObjectHelper.toMap(validateIn, new HashMap(), "Void").get("Void"));
    }
  }

}
