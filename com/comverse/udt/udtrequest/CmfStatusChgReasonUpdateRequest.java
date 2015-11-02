/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusChgReasonUpdateRequest.java
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
 * Class used to create a CmfStatusChgReasonUpdateRequest Udt Request
 *
 */

public class CmfStatusChgReasonUpdateRequest extends CmfStatusChgReasonSubRequestParent {
/**
 *
 * Constructor to create a  CmfStatusChgReasonUpdateRequest
 * @param id Unique request name
 * @param CSCRUpdateIn CmfStatusChgReasonObjectData for CmfStatusChgReasonUpdateRequest
 *
 */
@JsonCreator
  public CmfStatusChgReasonUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfStatusChgReason")CmfStatusChgReasonObjectData CSCRUpdateIn) {
    super(id, "CmfStatusChgReasonUpdate");
    if (CSCRUpdateIn != null) {
      addInput("CmfStatusChgReason", CmfStatusChgReasonObjectHelper.toMap(CSCRUpdateIn, new HashMap(), "CmfStatusChgReason").get("CmfStatusChgReason"));
    }
  }

/**
 *
 * Retrieves the CmfStatusChgReasonObjectData that results from the CmfStatusChgReasonUpdateRequest call
 * @return CmfStatusChgReasonObjectData resulting from udt call
 *
 */

  public CmfStatusChgReasonObjectData getOutput() {
    return CmfStatusChgReasonObjectHelper.fromMap(outputMap, "CmfStatusChgReason");
  }
}
