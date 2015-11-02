/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfBonusPointGetRequest.java
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
 * Class used to create a CmfBonusPointGetRequest Udt Request
 *
 */

public class CmfBonusPointGetRequest extends CmfBonusPointSubRequestParent {
/**
 *
 * Constructor to create a  CmfBonusPointGetRequest
 * @param id Unique request name
 * @param CRBDGetIn CmfBonusPointObjectKeyData for CmfBonusPointGetRequest
 *
 */
@JsonCreator
  public CmfBonusPointGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfBonusPoint")CmfBonusPointObjectKeyData CRBDGetIn) {
    super(id, "CmfBonusPointGet");
    if (CRBDGetIn != null) {
      addInput("CmfBonusPoint", CmfBonusPointObjectKeyHelper.toMap(CRBDGetIn, new HashMap(), "CmfBonusPointObjectKeyData").get("CmfBonusPointObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CmfBonusPointObjectData that results from the CmfBonusPointGetRequest call
 * @return CmfBonusPointObjectData resulting from udt call
 *
 */

  public CmfBonusPointObjectData getOutput() {
    return CmfBonusPointObjectHelper.fromMap(outputMap, "CmfBonusPoint");
  }
}
