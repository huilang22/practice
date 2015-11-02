/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExchangeRateClassUpdateRequest.java
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
 * Class used to create a ExchangeRateClassUpdateRequest Udt Request
 *
 */

public class ExchangeRateClassUpdateRequest extends ExchangeRateClassSubRequestParent {
/**
 *
 * Constructor to create a  ExchangeRateClassUpdateRequest
 * @param id Unique request name
 * @param EXRCUpdateIn ExchangeRateClassObjectData for ExchangeRateClassUpdateRequest
 *
 */
@JsonCreator
  public ExchangeRateClassUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExchangeRateClass")ExchangeRateClassObjectData EXRCUpdateIn) {
    super(id, "ExchangeRateClassUpdate");
    if (EXRCUpdateIn != null) {
      addInput("ExchangeRateClass", ExchangeRateClassObjectHelper.toMap(EXRCUpdateIn, new HashMap(), "ExchangeRateClass").get("ExchangeRateClass"));
    }
  }

/**
 *
 * Retrieves the ExchangeRateClassObjectData that results from the ExchangeRateClassUpdateRequest call
 * @return ExchangeRateClassObjectData resulting from udt call
 *
 */

  public ExchangeRateClassObjectData getOutput() {
    return ExchangeRateClassObjectHelper.fromMap(outputMap, "ExchangeRateClass");
  }
}
