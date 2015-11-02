/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusGetRequest.java
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
 * Class used to create a CmfStatusGetRequest Udt Request
 *
 */

public class CmfStatusGetRequest extends CmfStatusSubRequestParent {
/**
 *
 * Constructor to create a  CmfStatusGetRequest
 * @param id Unique request name
 * @param CSGetIn CmfStatusObjectKeyData for CmfStatusGetRequest
 *
 */
@JsonCreator
  public CmfStatusGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfStatus")CmfStatusObjectKeyData CSGetIn) {
    super(id, "CmfStatusGet");
    if (CSGetIn != null) {
      addInput("CmfStatus", CmfStatusObjectKeyHelper.toMap(CSGetIn, new HashMap(), "CmfStatusObjectKeyData").get("CmfStatusObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CmfStatusObjectData that results from the CmfStatusGetRequest call
 * @return CmfStatusObjectData resulting from udt call
 *
 */

  public CmfStatusObjectData getOutput() {
    return CmfStatusObjectHelper.fromMap(outputMap, "CmfStatus");
  }
}
