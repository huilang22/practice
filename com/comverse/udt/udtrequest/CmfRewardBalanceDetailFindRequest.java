/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfRewardBalanceDetailFindRequest.java
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
 * Class used to create a CmfRewardBalanceDetailFindRequest Udt Request
 *
 */

public class CmfRewardBalanceDetailFindRequest extends CmfRewardBalanceDetailRequest {
/**
 *
 * Constructor to create a  CmfRewardBalanceDetailFindRequest
 * @param id Unique request name
 * @param CRBDFindIn CmfRewardBalanceDetailObjectFilter for CmfRewardBalanceDetailFindRequest
 *
 */
@JsonCreator
  public CmfRewardBalanceDetailFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfRewardBalanceDetail")CmfRewardBalanceDetailObjectFilter CRBDFindIn) {
    super(id, "CmfRewardBalanceDetailFind");
    if (CRBDFindIn != null) {
      Integer index =  CRBDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CmfRewardBalanceDetail", CmfRewardBalanceDetailObjectHelper.toMap(CRBDFindIn, new HashMap(), "CmfRewardBalanceDetail").get("CmfRewardBalanceDetail"));
    }
  }

/**
 *
 * Retrieves the CmfRewardBalanceDetailObjectDataList that results from the CmfRewardBalanceDetailFindRequest call
 * @return CmfRewardBalanceDetailObjectDataList resulting from udt call
 *
 */

  public CmfRewardBalanceDetailObjectDataList getOutput() {
    return CmfRewardBalanceDetailObjectHelper.fromMapList(outputMap, "CmfRewardBalanceDetailList");
  }
}
