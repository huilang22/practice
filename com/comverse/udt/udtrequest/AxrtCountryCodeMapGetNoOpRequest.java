/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtCountryCodeMapGetNoOpRequest.java
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
 * NoOp class used to simulate a AxrtCountryCodeMapGetNoOpRequest Udt Request/Response
 *
 */
public class AxrtCountryCodeMapGetNoOpRequest extends AxrtCountryCodeMapSubRequestParent {
/**
 *
 * Constructor to create a   AxrtCountryCodeMapGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AxrtCountryCodeMapGetNoOpRequest(String id, AxrtCountryCodeMapObjectData noOpIn) {
    super(id, "AxrtCountryCodeMapGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AxrtCountryCodeMap", AxrtCountryCodeMapObjectHelper.toMap(noOpIn, new HashMap(), "AxrtCountryCodeMap").get("AxrtCountryCodeMap"));
    }
  }
/**
 *
 * Retrieves the AxrtCountryCodeMapObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AxrtCountryCodeMapObjectData getOutput() {
    return AxrtCountryCodeMapObjectHelper.fromMap(outputMap, "AxrtCountryCodeMap");
  }
}
