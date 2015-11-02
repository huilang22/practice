/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfBonusPointUpdateNoOpRequest.java
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
 * NoOp class used to simulate a CmfBonusPointUpdateNoOpRequest Udt Request/Response
 *
 */
public class CmfBonusPointUpdateNoOpRequest extends CmfBonusPointSubRequestParent {
/**
 *
 * Constructor to create a   CmfBonusPointUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CmfBonusPointUpdateNoOpRequest(String id, CmfBonusPointObjectData noOpIn) {
    super(id, "CmfBonusPointUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("CmfBonusPoint", CmfBonusPointObjectHelper.toMap(noOpIn, new HashMap(), "CmfBonusPoint").get("CmfBonusPoint"));
    }
  }
/**
 *
 * Retrieves the CmfBonusPointObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CmfBonusPointObjectData getOutput() {
    return CmfBonusPointObjectHelper.fromMap(outputMap, "CmfBonusPoint");
  }
}
