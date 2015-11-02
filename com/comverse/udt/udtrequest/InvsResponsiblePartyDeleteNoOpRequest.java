/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsResponsiblePartyDeleteNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsResponsiblePartyDeleteNoOpRequest Udt Request/Response
 *
 */
public class InvsResponsiblePartyDeleteNoOpRequest extends InvsResponsiblePartySubRequestParent {
/**
 *
 * Constructor to create a   InvsResponsiblePartyDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsResponsiblePartyDeleteNoOpRequest(String id, InvsResponsiblePartyObjectData noOpIn) {
    super(id, "InvsResponsiblePartyDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsResponsibleParty", InvsResponsiblePartyObjectHelper.toMap(noOpIn, new HashMap(), "InvsResponsibleParty").get("InvsResponsibleParty"));
    }
  }
/**
 *
 * Retrieves the InvsResponsiblePartyObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsResponsiblePartyObjectData getOutput() {
    return InvsResponsiblePartyObjectHelper.fromMap(outputMap, "InvsResponsibleParty");
  }
}
