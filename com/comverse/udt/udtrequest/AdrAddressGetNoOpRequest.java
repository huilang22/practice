/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdrAddressGetNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a AdrAddressGetNoOpRequest Udt Request/Response
 *
 */
public class AdrAddressGetNoOpRequest extends AdrAddressSubRequestParent {
/**
 *
 * Constructor to create a   AdrAddressGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AdrAddressGetNoOpRequest(String id, AdrAddressObjectData noOpIn) {
    super(id, "AdrAddressGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AdrAddress", AdrAddressObjectHelper.toMap(noOpIn, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }
/**
 *
 * Retrieves the AdrAddressObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AdrAddressObjectData getOutput() {
    return AdrAddressObjectHelper.fromMap(outputMap, "AdrAddress");
  }
}
