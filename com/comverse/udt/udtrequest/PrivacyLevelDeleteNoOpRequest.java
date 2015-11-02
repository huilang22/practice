/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrivacyLevelDeleteNoOpRequest.java
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
 * NoOp class used to simulate a PrivacyLevelDeleteNoOpRequest Udt Request/Response
 *
 */
public class PrivacyLevelDeleteNoOpRequest extends PrivacyLevelSubRequestParent {
/**
 *
 * Constructor to create a   PrivacyLevelDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PrivacyLevelDeleteNoOpRequest(String id, PrivacyLevelObjectData noOpIn) {
    super(id, "PrivacyLevelDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("PrivacyLevel", PrivacyLevelObjectHelper.toMap(noOpIn, new HashMap(), "PrivacyLevel").get("PrivacyLevel"));
    }
  }
/**
 *
 * Retrieves the PrivacyLevelObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PrivacyLevelObjectData getOutput() {
    return PrivacyLevelObjectHelper.fromMap(outputMap, "PrivacyLevel");
  }
}
