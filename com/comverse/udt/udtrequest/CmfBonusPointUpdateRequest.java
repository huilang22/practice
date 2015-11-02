/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfBonusPointUpdateRequest.java
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
 * Class used to create a CmfBonusPointUpdateRequest Udt Request
 *
 */

public class CmfBonusPointUpdateRequest extends CmfBonusPointSubRequestParent {
/**
 *
 * Constructor to create a  CmfBonusPointUpdateRequest
 * @param id Unique request name
 * @param CRBDUpdateIn CmfBonusPointObjectData for CmfBonusPointUpdateRequest
 *
 */
@JsonCreator
  public CmfBonusPointUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfBonusPoint")CmfBonusPointObjectData CRBDUpdateIn) {
    super(id, "CmfBonusPointUpdate");
    if (CRBDUpdateIn != null) {
      addInput("CmfBonusPoint", CmfBonusPointObjectHelper.toMap(CRBDUpdateIn, new HashMap(), "CmfBonusPoint").get("CmfBonusPoint"));
    }
  }

/**
 *
 * Retrieves the CmfBonusPointObjectData that results from the CmfBonusPointUpdateRequest call
 * @return CmfBonusPointObjectData resulting from udt call
 *
 */

  public CmfBonusPointObjectData getOutput() {
    return CmfBonusPointObjectHelper.fromMap(outputMap, "CmfBonusPoint");
  }
}
