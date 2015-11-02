/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CreditCardCreateRequest.java
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
 * Class used to create a CreditCardCreateRequest Udt Request
 *
 */

public class CreditCardCreateRequest extends CreditCardSubRequestParent {
/**
 *
 * Constructor to create a  CreditCardCreateRequest
 * @param id Unique request name
 * @param createIn CreditCardObjectData for CreditCardCreateRequest
 *
 */
@JsonCreator
  public CreditCardCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CreditCard")CreditCardObjectData createIn) {
    super(id, "CreditCardCreate");
    if (createIn != null) {
      addInput("CreditCard", CreditCardObjectHelper.toMap(createIn, new HashMap(), "CreditCard").get("CreditCard"));
    }
  }

/**
 *
 * Retrieves the CreditCardObjectData that results from the CreditCardCreateRequest call
 * @return CreditCardObjectData resulting from udt call
 *
 */

  public CreditCardObjectData getOutput() {
    return CreditCardObjectHelper.fromMap(outputMap, "CreditCard");
  }
}
