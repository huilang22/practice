/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfRewardBalanceDetailDeleteRequest.java
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
 * Class used to create a CmfRewardBalanceDetailDeleteRequest Udt Request
 *
 */

public class CmfRewardBalanceDetailDeleteRequest extends CmfRewardBalanceDetailSubRequestParent {
/**
 *
 * Constructor to create a  CmfRewardBalanceDetailDeleteRequest
 * @param id Unique request name
 * @param CRBDDeleteIn CmfRewardBalanceDetailObjectKeyData for CmfRewardBalanceDetailDeleteRequest
 *
 */
@JsonCreator
  public CmfRewardBalanceDetailDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfRewardBalanceDetail")CmfRewardBalanceDetailObjectKeyData CRBDDeleteIn) {
    super(id, "CmfRewardBalanceDetailDelete");
    if (CRBDDeleteIn != null) {
      addInput("CmfRewardBalanceDetail", CmfRewardBalanceDetailObjectKeyHelper.toMap(CRBDDeleteIn, new HashMap(), "CmfRewardBalanceDetailObjectKeyData").get("CmfRewardBalanceDetailObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CmfRewardBalanceDetailObjectData that results from the CmfRewardBalanceDetailDeleteRequest call
 * @return CmfRewardBalanceDetailObjectData resulting from udt call
 *
 */

  public CmfRewardBalanceDetailObjectData getOutput() {
    return CmfRewardBalanceDetailObjectHelper.fromMap(outputMap, "CmfRewardBalanceDetail");
  }
}
