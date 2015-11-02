/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LanguageCodeCreateNoOpRequest.java
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
 * NoOp class used to simulate a LanguageCodeCreateNoOpRequest Udt Request/Response
 *
 */
public class LanguageCodeCreateNoOpRequest extends LanguageCodeSubRequestParent {
/**
 *
 * Constructor to create a   LanguageCodeCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LanguageCodeCreateNoOpRequest(String id, LCObjectData noOpIn) {
    super(id, "LanguageCodeCreateNoOpRequest");
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
