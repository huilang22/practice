/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfRewardBalanceDetailUpdateRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CmfRewardBalanceDetailUpdateRequest Udt Request
 *
 */

public class CmfRewardBalanceDetailUpdateRequest extends CmfRewardBalanceDetailSubRequestParent {
/**
 *
 * Constructor to create a  CmfRewardBalanceDetailUpdateRequest
 * @param id Unique request name
 * @param CRBDUpdateIn CmfRewardBalanceDetailObjectData for CmfRewardBalanceDetailUpdateRequest
 *
 */
@JsonCreator
  public CmfRewardBalanceDetailUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfRewardBalanceDetail")CmfRewardBalanceDetailObjectData CRBDUpdateIn) {
    super(id, "CmfRewardBalanceDetailUpdate");
    if (CRBDUpdateIn != null) {
      addInput("CmfRewardBalanceDetail", CmfRewardBalanceDetailObjectHelper.toMap(CRBDUpdateIn, new HashMap(), "CmfRewardBalanceDetail").get("CmfRewardBalanceDetail"));
    }
  }

/**
 *
 * Retrieves the CmfRewardBalanceDetailObjectData that results from the CmfRewardBalanceDetailUpdateRequest call
 * @return CmfRewardBalanceDetailObjectData resulting from udt call
 *
 */

  public CmfRewardBalanceDetailObjectData getOutput() {
    return CmfRewardBalanceDetailObjectHelper.fromMap(outputMap, "CmfRewardBalanceDetail");
  }
}
