/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvTransitionSPRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvTransitionSPRequest Udt Request
 *
 */

public class InvTransitionSPRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvTransitionSPRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public InvTransitionSPRequest(@JsonProperty("RequestId") String id) {
    super(id, "InvTransitionSP");
  }

/**
 *
 * Retrieves the Integer that results from the InvTransitionSPRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("VCount");
  }
}
