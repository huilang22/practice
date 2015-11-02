/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsaRestrictionsGetNoOpRequest.java
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
 * NoOp class used to simulate a UsaRestrictionsGetNoOpRequest Udt Request/Response
 *
 */
public class UsaRestrictionsGetNoOpRequest extends UsaRestrictionsSubRequestParent {
/**
 *
 * Constructor to create a   UsaRestrictionsGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsaRestrictionsGetNoOpRequest(String id, UsaRestrictionsObjectData noOpIn) {
    super(id, "UsaRestrictionsGetNoOpRequest");
    if (noOpIn != null) {
      addInput("UsaRestrictions", UsaRestrictionsObjectHelper.toMap(noOpIn, new HashMap(), "UsaRestrictions").get("UsaRestrictions"));
    }
  }
/**
 *
 * Retrieves the UsaRestrictionsObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public UsaRestrictionsObjectData getOutput() {
    return UsaRestrictionsObjectHelper.fromMap(outputMap, "UsaRestrictions");
  }
}
