/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JurisdictionGetNoOpRequest.java
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
 * NoOp class used to simulate a JurisdictionGetNoOpRequest Udt Request/Response
 *
 */
public class JurisdictionGetNoOpRequest extends JurisdictionSubRequestParent {
/**
 *
 * Constructor to create a   JurisdictionGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public JurisdictionGetNoOpRequest(String id, JurisdictionObjectData noOpIn) {
    super(id, "JurisdictionGetNoOpRequest");
    if (noOpIn != null) {
      addInput("Jurisdiction", JurisdictionObjectHelper.toMap(noOpIn, new HashMap(), "Jurisdiction").get("Jurisdiction"));
    }
  }
/**
 *
 * Retrieves the JurisdictionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public JurisdictionObjectData getOutput() {
    return JurisdictionObjectHelper.fromMap(outputMap, "Jurisdiction");
  }
}
