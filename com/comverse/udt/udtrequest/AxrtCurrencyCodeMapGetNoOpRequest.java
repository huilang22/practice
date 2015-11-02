/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtCurrencyCodeMapGetNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a AxrtCurrencyCodeMapGetNoOpRequest Udt Request/Response
 *
 */
public class AxrtCurrencyCodeMapGetNoOpRequest extends AxrtCurrencyCodeMapSubRequestParent {
/**
 *
 * Constructor to create a   AxrtCurrencyCodeMapGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AxrtCurrencyCodeMapGetNoOpRequest(String id, AxrtCurrencyCodeMapObjectData noOpIn) {
    super(id, "AxrtCurrencyCodeMapGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AxrtCurrencyCodeMap", AxrtCurrencyCodeMapObjectHelper.toMap(noOpIn, new HashMap(), "AxrtCurrencyCodeMap").get("AxrtCurrencyCodeMap"));
    }
  }
/**
 *
 * Retrieves the AxrtCurrencyCodeMapObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AxrtCurrencyCodeMapObjectData getOutput() {
    return AxrtCurrencyCodeMapObjectHelper.fromMap(outputMap, "AxrtCurrencyCodeMap");
  }
}
