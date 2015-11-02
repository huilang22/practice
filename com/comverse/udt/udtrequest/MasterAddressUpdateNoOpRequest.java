/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MasterAddressUpdateNoOpRequest.java
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
 * NoOp class used to simulate a MasterAddressUpdateNoOpRequest Udt Request/Response
 *
 */
public class MasterAddressUpdateNoOpRequest extends MasterAddressSubRequestParent {
/**
 *
 * Constructor to create a   MasterAddressUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public MasterAddressUpdateNoOpRequest(String id, MasterAddressObjectData noOpIn) {
    super(id, "MasterAddressUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("MasterAddress", MasterAddressObjectHelper.toMap(noOpIn, new HashMap(), "MasterAddress").get("MasterAddress"));
    }
  }
/**
 *
 * Retrieves the MasterAddressObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public MasterAddressObjectData getOutput() {
    return MasterAddressObjectHelper.fromMap(outputMap, "MasterAddress");
  }
}
