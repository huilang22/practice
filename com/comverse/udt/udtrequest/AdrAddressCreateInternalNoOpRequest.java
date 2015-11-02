/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdrAddressCreateInternalNoOpRequest.java
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
 * NoOp class used to simulate a AdrAddressCreateInternalNoOpRequest Udt Request/Response
 *
 */
public class AdrAddressCreateInternalNoOpRequest extends AdrAddressSubRequestParent {
/**
 *
 * Constructor to create a   AdrAddressCreateInternalNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AdrAddressCreateInternalNoOpRequest(String id, LocalAddressObjectData noOpIn) {
    super(id, "AdrAddressCreateInternalNoOpRequest");
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
