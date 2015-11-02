/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetSuffixGetNoOpRequest.java
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
 * NoOp class used to simulate a AddressStreetSuffixGetNoOpRequest Udt Request/Response
 *
 */
public class AddressStreetSuffixGetNoOpRequest extends AddressStreetSuffixSubRequestParent {
/**
 *
 * Constructor to create a   AddressStreetSuffixGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AddressStreetSuffixGetNoOpRequest(String id, AddressStreetSuffixObjectData noOpIn) {
    super(id, "AddressStreetSuffixGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AddressStreetSuffix", AddressStreetSuffixObjectHelper.toMap(noOpIn, new HashMap(), "AddressStreetSuffix").get("AddressStreetSuffix"));
    }
  }
/**
 *
 * Retrieves the AddressStreetSuffixObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AddressStreetSuffixObjectData getOutput() {
    return AddressStreetSuffixObjectHelper.fromMap(outputMap, "AddressStreetSuffix");
  }
}
