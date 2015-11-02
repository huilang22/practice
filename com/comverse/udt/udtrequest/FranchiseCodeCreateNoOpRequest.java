/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * FranchiseCodeCreateNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a FranchiseCodeCreateNoOpRequest Udt Request/Response
 *
 */
public class FranchiseCodeCreateNoOpRequest extends FranchiseCodeSubRequestParent {
/**
 *
 * Constructor to create a   FranchiseCodeCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public FranchiseCodeCreateNoOpRequest(String id, FranchiseCodeObjectData noOpIn) {
    super(id, "FranchiseCodeCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("FranchiseCode", FranchiseCodeObjectHelper.toMap(noOpIn, new HashMap(), "FranchiseCode").get("FranchiseCode"));
    }
  }
/**
 *
 * Retrieves the FranchiseCodeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public FranchiseCodeObjectData getOutput() {
    return FranchiseCodeObjectHelper.fromMap(outputMap, "FranchiseCode");
  }
}
