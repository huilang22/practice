/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtCurrencyCodeMapGetRequest.java
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
 * Class used to create a AxrtCurrencyCodeMapGetRequest Udt Request
 *
 */

public class AxrtCurrencyCodeMapGetRequest extends AxrtCurrencyCodeMapSubRequestParent {
/**
 *
 * Constructor to create a  AxrtCurrencyCodeMapGetRequest
 * @param id Unique request name
 * @param AxrtIsoCurrCodeMapIn AxrtCurrencyCodeMapObjectKeyData for AxrtCurrencyCodeMapGetRequest
 *
 */
@JsonCreator
  public AxrtCurrencyCodeMapGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AxrtCurrencyCodeMap")AxrtCurrencyCodeMapObjectKeyData AxrtIsoCurrCodeMapIn) {
    super(id, "AxrtCurrencyCodeMapGet");
    if (AxrtIsoCurrCodeMapIn != null) {
      addInput("AxrtCurrencyCodeMap", AxrtCurrencyCodeMapObjectKeyHelper.toMap(AxrtIsoCurrCodeMapIn, new HashMap(), "AxrtCurrencyCodeMapObjectKeyData").get("AxrtCurrencyCodeMapObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AxrtCurrencyCodeMapObjectData that results from the AxrtCurrencyCodeMapGetRequest call
 * @return AxrtCurrencyCodeMapObjectData resulting from udt call
 *
 */

  public AxrtCurrencyCodeMapObjectData getOutput() {
    return AxrtCurrencyCodeMapObjectHelper.fromMap(outputMap, "AxrtCurrencyCodeMap");
  }
}
