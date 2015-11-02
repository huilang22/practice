/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfRewardBalanceDetailGetNoOpRequest.java
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
 * NoOp class used to simulate a CmfRewardBalanceDetailGetNoOpRequest Udt Request/Response
 *
 */
public class CmfRewardBalanceDetailGetNoOpRequest extends CmfRewardBalanceDetailSubRequestParent {
/**
 *
 * Constructor to create a   CmfRewardBalanceDetailGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CmfRewardBalanceDetailGetNoOpRequest(String id, CmfRewardBalanceDetailObjectData noOpIn) {
    super(id, "CmfRewardBalanceDetailGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CmfRewardBalanceDetail", CmfRewardBalanceDetailObjectHelper.toMap(noOpIn, new HashMap(), "CmfRewardBalanceDetail").get("CmfRewardBalanceDetail"));
    }
  }
/**
 *
 * Retrieves the CmfRewardBalanceDetailObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CmfRewardBalanceDetailObjectData getOutput() {
    return CmfRewardBalanceDetailObjectHelper.fromMap(outputMap, "CmfRewardBalanceDetail");
  }
}
