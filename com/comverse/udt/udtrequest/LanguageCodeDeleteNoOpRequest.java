/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LanguageCodeDeleteNoOpRequest.java
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
 * NoOp class used to simulate a LanguageCodeDeleteNoOpRequest Udt Request/Response
 *
 */
public class LanguageCodeDeleteNoOpRequest extends LanguageCodeSubRequestParent {
/**
 *
 * Constructor to create a   LanguageCodeDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LanguageCodeDeleteNoOpRequest(String id, LCObjectData noOpIn) {
    super(id, "LanguageCodeDeleteNoOpRequest");
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
