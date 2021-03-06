/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressCategoryCreateNoOpRequest.java
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
 * NoOp class used to simulate a AddressCategoryCreateNoOpRequest Udt Request/Response
 *
 */
public class AddressCategoryCreateNoOpRequest extends AddressCategorySubRequestParent {
/**
 *
 * Constructor to create a   AddressCategoryCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AddressCategoryCreateNoOpRequest(String id, AddressCategoryObjectData noOpIn) {
    super(id, "AddressCategoryCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("AddressCategory", AddressCategoryObjectHelper.toMap(noOpIn, new HashMap(), "AddressCategory").get("AddressCategory"));
    }
  }
/**
 *
 * Retrieves the AddressCategoryObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AddressCategoryObjectData getOutput() {
    return AddressCategoryObjectHelper.fromMap(outputMap, "AddressCategory");
  }
}
