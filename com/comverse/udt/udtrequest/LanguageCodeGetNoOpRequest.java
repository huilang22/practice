/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LanguageCodeGetNoOpRequest.java
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
 * NoOp class used to simulate a LanguageCodeGetNoOpRequest Udt Request/Response
 *
 */
public class LanguageCodeGetNoOpRequest extends LanguageCodeSubRequestParent {
/**
 *
 * Constructor to create a   LanguageCodeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LanguageCodeGetNoOpRequest(String id, LCObjectData noOpIn) {
    super(id, "LanguageCodeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("LanguageCode", LCObjectHelper.toMap(noOpIn, new HashMap(), "LanguageCode").get("LanguageCode"));
    }
  }
/**
 *
 * Retrieves the LCObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public LCObjectData getOutput() {
    return LCObjectHelper.fromMap(outputMap, "LanguageCode");
  }
}
