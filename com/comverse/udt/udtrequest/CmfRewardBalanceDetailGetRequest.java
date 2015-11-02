/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfRewardBalanceDetailGetRequest.java
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
 * Class used to create a CmfRewardBalanceDetailGetRequest Udt Request
 *
 */

public class CmfRewardBalanceDetailGetRequest extends CmfRewardBalanceDetailSubRequestParent {
/**
 *
 * Constructor to create a  CmfRewardBalanceDetailGetRequest
 * @param id Unique request name
 * @param CRBDGetIn CmfRewardBalanceDetailObjectKeyData for CmfRewardBalanceDetailGetRequest
 *
 */
@JsonCreator
  public CmfRewardBalanceDetailGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfRewardBalanceDetail")CmfRewardBalanceDetailObjectKeyData CRBDGetIn) {
    super(id, "CmfRewardBalanceDetailGet");
    if (CRBDGetIn != null) {
      addInput("CmfRewardBalanceDetail", CmfRewardBalanceDetailObjectKeyHelper.toMap(CRBDGetIn, new HashMap(), "CmfRewardBalanceDetailObjectKeyData").get("CmfRewardBalanceDetailObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CmfRewardBalanceDetailObjectData that results from the CmfRewardBalanceDetailGetRequest call
 * @return CmfRewardBalanceDetailObjectData resulting from udt call
 *
 */

  public CmfRewardBalanceDetailObjectData getOutput() {
    return CmfRewardBalanceDetailObjectHelper.fromMap(outputMap, "CmfRewardBalanceDetail");
  }
}
