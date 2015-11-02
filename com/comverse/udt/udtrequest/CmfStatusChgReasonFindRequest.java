/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusChgReasonFindRequest.java
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
 * Class used to create a CmfStatusChgReasonFindRequest Udt Request
 *
 */

public class CmfStatusChgReasonFindRequest extends CmfStatusChgReasonRequest {
/**
 *
 * Constructor to create a  CmfStatusChgReasonFindRequest
 * @param id Unique request name
 * @param CSCRFindIn CmfStatusChgReasonObjectFilter for CmfStatusChgReasonFindRequest
 *
 */
@JsonCreator
  public CmfStatusChgReasonFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfStatusChgReason")CmfStatusChgReasonObjectFilter CSCRFindIn) {
    super(id, "CmfStatusChgReasonFind");
    if (CSCRFindIn != null) {
      Integer index =  CSCRFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CmfStatusChgReason", CmfStatusChgReasonObjectHelper.toMap(CSCRFindIn, new HashMap(), "CmfStatusChgReason").get("CmfStatusChgReason"));
    }
  }

/**
 *
 * Retrieves the CmfStatusChgReasonObjectDataList that results from the CmfStatusChgReasonFindRequest call
 * @return CmfStatusChgReasonObjectDataList resulting from udt call
 *
 */

  public CmfStatusChgReasonObjectDataList getOutput() {
    return CmfStatusChgReasonObjectHelper.fromMapList(outputMap, "CmfStatusChgReasonList");
  }
}
