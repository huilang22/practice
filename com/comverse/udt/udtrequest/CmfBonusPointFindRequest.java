/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfBonusPointFindRequest.java
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
 * Class used to create a CmfBonusPointFindRequest Udt Request
 *
 */

public class CmfBonusPointFindRequest extends CmfBonusPointRequest {
/**
 *
 * Constructor to create a  CmfBonusPointFindRequest
 * @param id Unique request name
 * @param CRBDFindIn CmfBonusPointObjectFilter for CmfBonusPointFindRequest
 *
 */
@JsonCreator
  public CmfBonusPointFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfBonusPoint")CmfBonusPointObjectFilter CRBDFindIn) {
    super(id, "CmfBonusPointFind");
    if (CRBDFindIn != null) {
      Integer index =  CRBDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CmfBonusPoint", CmfBonusPointObjectHelper.toMap(CRBDFindIn, new HashMap(), "CmfBonusPoint").get("CmfBonusPoint"));
    }
  }

/**
 *
 * Retrieves the CmfBonusPointObjectDataList that results from the CmfBonusPointFindRequest call
 * @return CmfBonusPointObjectDataList resulting from udt call
 *
 */

  public CmfBonusPointObjectDataList getOutput() {
    return CmfBonusPointObjectHelper.fromMapList(outputMap, "CmfBonusPointList");
  }
}
