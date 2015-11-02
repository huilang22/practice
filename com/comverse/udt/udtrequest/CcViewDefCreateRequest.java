/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcViewDefCreateRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CcViewDefCreateRequest Udt Request
 *
 */

public class CcViewDefCreateRequest extends CcViewDefSubRequestParent {
/**
 *
 * Constructor to create a  CcViewDefCreateRequest
 * @param id Unique request name
 * @param CVDcreate_In CcViewDefObjectData for CcViewDefCreateRequest
 *
 */
@JsonCreator
  public CcViewDefCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CcViewDef")CcViewDefObjectData CVDcreate_In) {
    super(id, "CcViewDefCreate");
    if (CVDcreate_In != null) {
      addInput("CcViewDef", CcViewDefObjectHelper.toMap(CVDcreate_In, new HashMap(), "CcViewDef").get("CcViewDef"));
    }
  }

/**
 *
 * Retrieves the CcViewDefObjectData that results from the CcViewDefCreateRequest call
 * @return CcViewDefObjectData resulting from udt call
 *
 */

  public CcViewDefObjectData getOutput() {
    return CcViewDefObjectHelper.fromMap(outputMap, "CcViewDef");
  }
}
