/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusFindRequest.java
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
 * Class used to create a CmfStatusFindRequest Udt Request
 *
 */

public class CmfStatusFindRequest extends CmfStatusRequest {
/**
 *
 * Constructor to create a  CmfStatusFindRequest
 * @param id Unique request name
 * @param CSFindIn CmfStatusObjectFilter for CmfStatusFindRequest
 *
 */
@JsonCreator
  public CmfStatusFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfStatus")CmfStatusObjectFilter CSFindIn) {
    super(id, "CmfStatusFind");
    if (CSFindIn != null) {
      Integer index =  CSFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CmfStatus", CmfStatusObjectHelper.toMap(CSFindIn, new HashMap(), "CmfStatus").get("CmfStatus"));
    }
  }

/**
 *
 * Retrieves the CmfStatusObjectDataList that results from the CmfStatusFindRequest call
 * @return CmfStatusObjectDataList resulting from udt call
 *
 */

  public CmfStatusObjectDataList getOutput() {
    return CmfStatusObjectHelper.fromMapList(outputMap, "CmfStatusList");
  }
}
