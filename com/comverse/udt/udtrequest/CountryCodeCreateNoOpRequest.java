/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CountryCodeCreateNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a CountryCodeCreateNoOpRequest Udt Request/Response
 *
 */
public class CountryCodeCreateNoOpRequest extends CountryCodeSubRequestParent {
/**
 *
 * Constructor to create a   CountryCodeCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CountryCodeCreateNoOpRequest(String id, CountryCodeObjectData noOpIn) {
    super(id, "CountryCodeCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CountryCode", CountryCodeObjectHelper.toMap(noOpIn, new HashMap(), "CountryCode").get("CountryCode"));
    }
  }
/**
 *
 * Retrieves the CountryCodeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CountryCodeObjectData getOutput() {
    return CountryCodeObjectHelper.fromMap(outputMap, "CountryCode");
  }
}
