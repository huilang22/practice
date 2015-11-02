/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdrAddressUpdateNoOpRequest.java
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
 * NoOp class used to simulate a AdrAddressUpdateNoOpRequest Udt Request/Response
 *
 */
public class AdrAddressUpdateNoOpRequest extends AdrAddressSubRequestParent {
/**
 *
 * Constructor to create a   AdrAddressUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AdrAddressUpdateNoOpRequest(String id, LocalAddressObjectData noOpIn) {
    super(id, "AdrAddressUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("AdrAddress", LocalAddressObjectHelper.toMap(noOpIn, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }
/**
 *
 * Retrieves the LocalAddressObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public LocalAddressObjectData getOutput() {
    return LocalAddressObjectHelper.fromMap(outputMap, "AdrAddress");
  }
}
