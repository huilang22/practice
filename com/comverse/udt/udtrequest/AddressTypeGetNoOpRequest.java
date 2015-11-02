/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressTypeGetNoOpRequest.java
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
 * NoOp class used to simulate a AddressTypeGetNoOpRequest Udt Request/Response
 *
 */
public class AddressTypeGetNoOpRequest extends AddressTypeSubRequestParent {
/**
 *
 * Constructor to create a   AddressTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AddressTypeGetNoOpRequest(String id, AddressTypeObjectData noOpIn) {
    super(id, "AddressTypeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AddressType", AddressTypeObjectHelper.toMap(noOpIn, new HashMap(), "AddressType").get("AddressType"));
    }
  }
/**
 *
 * Retrieves the AddressTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AddressTypeObjectData getOutput() {
    return AddressTypeObjectHelper.fromMap(outputMap, "AddressType");
  }
}
