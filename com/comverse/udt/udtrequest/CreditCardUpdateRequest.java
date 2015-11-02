/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CreditCardUpdateRequest.java
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
 * Class used to create a CreditCardUpdateRequest Udt Request
 *
 */

public class CreditCardUpdateRequest extends CreditCardSubRequestParent {
/**
 *
 * Constructor to create a  CreditCardUpdateRequest
 * @param id Unique request name
 * @param updateIn CreditCardObjectData for CreditCardUpdateRequest
 *
 */
@JsonCreator
  public CreditCardUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CreditCard")CreditCardObjectData updateIn) {
    super(id, "CreditCardUpdate");
    if (updateIn != null) {
      addInput("CreditCard", CreditCardObjectHelper.toMap(updateIn, new HashMap(), "CreditCard").get("CreditCard"));
    }
  }

/**
 *
 * Retrieves the CreditCardObjectData that results from the CreditCardUpdateRequest call
 * @return CreditCardObjectData resulting from udt call
 *
 */

  public CreditCardObjectData getOutput() {
    return CreditCardObjectHelper.fromMap(outputMap, "CreditCard");
  }
}
