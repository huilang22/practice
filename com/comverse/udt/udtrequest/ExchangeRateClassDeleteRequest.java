/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExchangeRateClassDeleteRequest.java
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
 * Class used to create a ExchangeRateClassDeleteRequest Udt Request
 *
 */

public class ExchangeRateClassDeleteRequest extends ExchangeRateClassSubRequestParent {
/**
 *
 * Constructor to create a  ExchangeRateClassDeleteRequest
 * @param id Unique request name
 * @param EXRCDeleteIn ExchangeRateClassObjectKeyData for ExchangeRateClassDeleteRequest
 *
 */
@JsonCreator
  public ExchangeRateClassDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExchangeRateClass")ExchangeRateClassObjectKeyData EXRCDeleteIn) {
    super(id, "ExchangeRateClassDelete");
    if (EXRCDeleteIn != null) {
      addInput("ExchangeRateClass", ExchangeRateClassObjectKeyHelper.toMap(EXRCDeleteIn, new HashMap(), "ExchangeRateClassObjectKeyData").get("ExchangeRateClassObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ExchangeRateClassObjectData that results from the ExchangeRateClassDeleteRequest call
 * @return ExchangeRateClassObjectData resulting from udt call
 *
 */

  public ExchangeRateClassObjectData getOutput() {
    return ExchangeRateClassObjectHelper.fromMap(outputMap, "ExchangeRateClass");
  }
}
