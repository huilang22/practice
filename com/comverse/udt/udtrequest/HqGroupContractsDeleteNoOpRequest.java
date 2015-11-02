/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupContractsDeleteNoOpRequest.java
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
 * NoOp class used to simulate a HqGroupContractsDeleteNoOpRequest Udt Request/Response
 *
 */
public class HqGroupContractsDeleteNoOpRequest extends HqGroupContractsSubRequestParent {
/**
 *
 * Constructor to create a   HqGroupContractsDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HqGroupContractsDeleteNoOpRequest(String id, HqGroupContractsObjectData noOpIn) {
    super(id, "HqGroupContractsDeleteNoOpRequest");
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
