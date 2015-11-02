/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusChgReasonCreateRequest.java
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
 * Class used to create a CmfStatusChgReasonCreateRequest Udt Request
 *
 */

public class CmfStatusChgReasonCreateRequest extends CmfStatusChgReasonSubRequestParent {
/**
 *
 * Constructor to create a  CmfStatusChgReasonCreateRequest
 * @param id Unique request name
 * @param CSCRCreateIn CmfStatusChgReasonObjectData for CmfStatusChgReasonCreateRequest
 *
 */
@JsonCreator
  public CmfStatusChgReasonCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfStatusChgReason")CmfStatusChgReasonObjectData CSCRCreateIn) {
    super(id, "CmfStatusChgReasonCreate");
    if (CSCRCreateIn != null) {
      addInput("CmfStatusChgReason", CmfStatusChgReasonObjectHelper.toMap(CSCRCreateIn, new HashMap(), "CmfStatusChgReason").get("CmfStatusChgReason"));
    }
  }

/**
 *
 * Retrieves the CmfStatusChgReasonObjectData that results from the CmfStatusChgReasonCreateRequest call
 * @return CmfStatusChgReasonObjectData resulting from udt call
 *
 */

  public CmfStatusChgReasonObjectData getOutput() {
    return CmfStatusChgReasonObjectHelper.fromMap(outputMap, "CmfStatusChgReason");
  }
}
