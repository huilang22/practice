/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetSuffixCreateNoOpRequest.java
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
 * NoOp class used to simulate a AddressStreetSuffixCreateNoOpRequest Udt Request/Response
 *
 */
public class AddressStreetSuffixCreateNoOpRequest extends AddressStreetSuffixSubRequestParent {
/**
 *
 * Constructor to create a   AddressStreetSuffixCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AddressStreetSuffixCreateNoOpRequest(String id, AddressStreetSuffixObjectData noOpIn) {
    super(id, "AddressStreetSuffixCreateNoOpRequest");
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
