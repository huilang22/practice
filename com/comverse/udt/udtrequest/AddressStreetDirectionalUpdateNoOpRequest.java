/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetDirectionalUpdateNoOpRequest.java
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
 * NoOp class used to simulate a AddressStreetDirectionalUpdateNoOpRequest Udt Request/Response
 *
 */
public class AddressStreetDirectionalUpdateNoOpRequest extends AddressStreetDirectionalSubRequestParent {
/**
 *
 * Constructor to create a   AddressStreetDirectionalUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AddressStreetDirectionalUpdateNoOpRequest(String id, AddressStreetDirectionalObjectData noOpIn) {
    super(id, "AddressStreetDirectionalUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("AddressStreetDirectional", AddressStreetDirectionalObjectHelper.toMap(noOpIn, new HashMap(), "AddressStreetDirectional").get("AddressStreetDirectional"));
    }
  }
/**
 *
 * Retrieves the AddressStreetDirectionalObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AddressStreetDirectionalObjectData getOutput() {
    return AddressStreetDirectionalObjectHelper.fromMap(outputMap, "AddressStreetDirectional");
  }
}
