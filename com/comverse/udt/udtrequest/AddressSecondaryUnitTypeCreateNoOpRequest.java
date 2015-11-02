/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressSecondaryUnitTypeCreateNoOpRequest.java
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
 * NoOp class used to simulate a AddressSecondaryUnitTypeCreateNoOpRequest Udt Request/Response
 *
 */
public class AddressSecondaryUnitTypeCreateNoOpRequest extends AddressSecondaryUnitTypeSubRequestParent {
/**
 *
 * Constructor to create a   AddressSecondaryUnitTypeCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AddressSecondaryUnitTypeCreateNoOpRequest(String id, AddressSecondaryUnitTypeObjectData noOpIn) {
    super(id, "AddressSecondaryUnitTypeCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("AddressSecondaryUnitType", AddressSecondaryUnitTypeObjectHelper.toMap(noOpIn, new HashMap(), "AddressSecondaryUnitType").get("AddressSecondaryUnitType"));
    }
  }
/**
 *
 * Retrieves the AddressSecondaryUnitTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AddressSecondaryUnitTypeObjectData getOutput() {
    return AddressSecondaryUnitTypeObjectHelper.fromMap(outputMap, "AddressSecondaryUnitType");
  }
}
