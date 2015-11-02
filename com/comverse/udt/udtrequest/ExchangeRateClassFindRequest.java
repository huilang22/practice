/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExchangeRateClassFindRequest.java
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
 * Class used to create a ExchangeRateClassFindRequest Udt Request
 *
 */

public class ExchangeRateClassFindRequest extends ExchangeRateClassRequest {
/**
 *
 * Constructor to create a  ExchangeRateClassFindRequest
 * @param id Unique request name
 * @param EXRCFindIn ExchangeRateClassObjectFilter for ExchangeRateClassFindRequest
 *
 */
@JsonCreator
  public ExchangeRateClassFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExchangeRateClass")ExchangeRateClassObjectFilter EXRCFindIn) {
    super(id, "ExchangeRateClassFind");
    if (EXRCFindIn != null) {
      Integer index =  EXRCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExchangeRateClass", ExchangeRateClassObjectHelper.toMap(EXRCFindIn, new HashMap(), "ExchangeRateClass").get("ExchangeRateClass"));
    }
  }

/**
 *
 * Retrieves the ExchangeRateClassObjectDataList that results from the ExchangeRateClassFindRequest call
 * @return ExchangeRateClassObjectDataList resulting from udt call
 *
 */

  public ExchangeRateClassObjectDataList getOutput() {
    return ExchangeRateClassObjectHelper.fromMapList(outputMap, "ExchangeRateClassList");
  }
}
