/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupContractsCreateNoOpRequest.java
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
 * NoOp class used to simulate a HqGroupContractsCreateNoOpRequest Udt Request/Response
 *
 */
public class HqGroupContractsCreateNoOpRequest extends HqGroupContractsSubRequestParent {
/**
 *
 * Constructor to create a   HqGroupContractsCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HqGroupContractsCreateNoOpRequest(String id, HqGroupContractsObjectData noOpIn) {
    super(id, "HqGroupContractsCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("HqGroupContracts", HqGroupContractsObjectHelper.toMap(noOpIn, new HashMap(), "HqGroupContracts").get("HqGroupContracts"));
    }
  }
/**
 *
 * Retrieves the HqGroupContractsObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupContractsObjectData getOutput() {
    return HqGroupContractsObjectHelper.fromMap(outputMap, "HqGroupContracts");
  }
}
