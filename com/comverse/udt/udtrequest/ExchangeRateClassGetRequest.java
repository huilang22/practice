/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExchangeRateClassGetRequest.java
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
 * Class used to create a ExchangeRateClassGetRequest Udt Request
 *
 */

public class ExchangeRateClassGetRequest extends ExchangeRateClassSubRequestParent {
/**
 *
 * Constructor to create a  ExchangeRateClassGetRequest
 * @param id Unique request name
 * @param EXRCGetIn ExchangeRateClassObjectKeyData for ExchangeRateClassGetRequest
 *
 */
@JsonCreator
  public ExchangeRateClassGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExchangeRateClass")ExchangeRateClassObjectKeyData EXRCGetIn) {
    super(id, "ExchangeRateClassGet");
    if (EXRCGetIn != null) {
      addInput("ExchangeRateClass", ExchangeRateClassObjectKeyHelper.toMap(EXRCGetIn, new HashMap(), "ExchangeRateClassObjectKeyData").get("ExchangeRateClassObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ExchangeRateClassObjectData that results from the ExchangeRateClassGetRequest call
 * @return ExchangeRateClassObjectData resulting from udt call
 *
 */

  public ExchangeRateClassObjectData getOutput() {
    return ExchangeRateClassObjectHelper.fromMap(outputMap, "ExchangeRateClass");
  }
}
