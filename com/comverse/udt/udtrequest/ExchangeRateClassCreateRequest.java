/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExchangeRateClassCreateRequest.java
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
 * Class used to create a ExchangeRateClassCreateRequest Udt Request
 *
 */

public class ExchangeRateClassCreateRequest extends ExchangeRateClassSubRequestParent {
/**
 *
 * Constructor to create a  ExchangeRateClassCreateRequest
 * @param id Unique request name
 * @param EXRCCreateIn ExchangeRateClassObjectData for ExchangeRateClassCreateRequest
 *
 */
@JsonCreator
  public ExchangeRateClassCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExchangeRateClass")ExchangeRateClassObjectData EXRCCreateIn) {
    super(id, "ExchangeRateClassCreate");
    if (EXRCCreateIn != null) {
      addInput("ExchangeRateClass", ExchangeRateClassObjectHelper.toMap(EXRCCreateIn, new HashMap(), "ExchangeRateClass").get("ExchangeRateClass"));
    }
  }

/**
 *
 * Retrieves the ExchangeRateClassObjectData that results from the ExchangeRateClassCreateRequest call
 * @return ExchangeRateClassObjectData resulting from udt call
 *
 */

  public ExchangeRateClassObjectData getOutput() {
    return ExchangeRateClassObjectHelper.fromMap(outputMap, "ExchangeRateClass");
  }
}
