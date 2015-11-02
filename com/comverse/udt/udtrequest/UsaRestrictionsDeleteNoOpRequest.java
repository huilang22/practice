/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsaRestrictionsDeleteNoOpRequest.java
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
 * NoOp class used to simulate a UsaRestrictionsDeleteNoOpRequest Udt Request/Response
 *
 */
public class UsaRestrictionsDeleteNoOpRequest extends UsaRestrictionsSubRequestParent {
/**
 *
 * Constructor to create a   UsaRestrictionsDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsaRestrictionsDeleteNoOpRequest(String id, UsaRestrictionsObjectData noOpIn) {
    super(id, "UsaRestrictionsDeleteNoOpRequest");
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
