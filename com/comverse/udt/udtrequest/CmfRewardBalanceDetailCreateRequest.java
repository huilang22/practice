/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfRewardBalanceDetailCreateRequest.java
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
 * Class used to create a CmfRewardBalanceDetailCreateRequest Udt Request
 *
 */

public class CmfRewardBalanceDetailCreateRequest extends CmfRewardBalanceDetailSubRequestParent {
/**
 *
 * Constructor to create a  CmfRewardBalanceDetailCreateRequest
 * @param id Unique request name
 * @param CRBDCreateIn CmfRewardBalanceDetailObjectData for CmfRewardBalanceDetailCreateRequest
 *
 */
@JsonCreator
  public CmfRewardBalanceDetailCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfRewardBalanceDetail")CmfRewardBalanceDetailObjectData CRBDCreateIn) {
    super(id, "CmfRewardBalanceDetailCreate");
    if (CRBDCreateIn != null) {
      addInput("CmfRewardBalanceDetail", CmfRewardBalanceDetailObjectHelper.toMap(CRBDCreateIn, new HashMap(), "CmfRewardBalanceDetail").get("CmfRewardBalanceDetail"));
    }
  }

/**
 *
 * Retrieves the CmfRewardBalanceDetailObjectData that results from the CmfRewardBalanceDetailCreateRequest call
 * @return CmfRewardBalanceDetailObjectData resulting from udt call
 *
 */

  public CmfRewardBalanceDetailObjectData getOutput() {
    return CmfRewardBalanceDetailObjectHelper.fromMap(outputMap, "CmfRewardBalanceDetail");
  }
}
