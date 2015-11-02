/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusDeleteRequest.java
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
 * Class used to create a CmfStatusDeleteRequest Udt Request
 *
 */

public class CmfStatusDeleteRequest extends CmfStatusSubRequestParent {
/**
 *
 * Constructor to create a  CmfStatusDeleteRequest
 * @param id Unique request name
 * @param CSDeleteIn CmfStatusObjectKeyData for CmfStatusDeleteRequest
 *
 */
@JsonCreator
  public CmfStatusDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfStatus")CmfStatusObjectKeyData CSDeleteIn) {
    super(id, "CmfStatusDelete");
    if (CSDeleteIn != null) {
      addInput("CmfStatus", CmfStatusObjectKeyHelper.toMap(CSDeleteIn, new HashMap(), "CmfStatusObjectKeyData").get("CmfStatusObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CmfStatusObjectData that results from the CmfStatusDeleteRequest call
 * @return CmfStatusObjectData resulting from udt call
 *
 */

  public CmfStatusObjectData getOutput() {
    return CmfStatusObjectHelper.fromMap(outputMap, "CmfStatus");
  }
}
