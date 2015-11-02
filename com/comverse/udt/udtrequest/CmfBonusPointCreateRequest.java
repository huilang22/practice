/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfBonusPointCreateRequest.java
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
 * Class used to create a CmfBonusPointCreateRequest Udt Request
 *
 */

public class CmfBonusPointCreateRequest extends CmfBonusPointSubRequestParent {
/**
 *
 * Constructor to create a  CmfBonusPointCreateRequest
 * @param id Unique request name
 * @param CRBDCreateIn CmfBonusPointObjectData for CmfBonusPointCreateRequest
 *
 */
@JsonCreator
  public CmfBonusPointCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfBonusPoint")CmfBonusPointObjectData CRBDCreateIn) {
    super(id, "CmfBonusPointCreate");
    if (CRBDCreateIn != null) {
      addInput("CmfBonusPoint", CmfBonusPointObjectHelper.toMap(CRBDCreateIn, new HashMap(), "CmfBonusPoint").get("CmfBonusPoint"));
    }
  }

/**
 *
 * Retrieves the CmfBonusPointObjectData that results from the CmfBonusPointCreateRequest call
 * @return CmfBonusPointObjectData resulting from udt call
 *
 */

  public CmfBonusPointObjectData getOutput() {
    return CmfBonusPointObjectHelper.fromMap(outputMap, "CmfBonusPoint");
  }
}
