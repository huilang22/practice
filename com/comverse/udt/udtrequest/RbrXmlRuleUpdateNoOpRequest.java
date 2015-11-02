/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrXmlRuleUpdateNoOpRequest.java
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
 * NoOp class used to simulate a RbrXmlRuleUpdateNoOpRequest Udt Request/Response
 *
 */
public class RbrXmlRuleUpdateNoOpRequest extends RbrXmlRuleSubRequestParent {
/**
 *
 * Constructor to create a   RbrXmlRuleUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrXmlRuleUpdateNoOpRequest(String id, RbrXmlRuleObjectData noOpIn) {
    super(id, "RbrXmlRuleUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("RbrXmlRule", RbrXmlRuleObjectHelper.toMap(noOpIn, new HashMap(), "RbrXmlRule").get("RbrXmlRule"));
    }
  }
/**
 *
 * Retrieves the RbrXmlRuleObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RbrXmlRuleObjectData getOutput() {
    return RbrXmlRuleObjectHelper.fromMap(outputMap, "RbrXmlRule");
  }
}
