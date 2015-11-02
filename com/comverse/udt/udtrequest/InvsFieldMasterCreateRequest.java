/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsFieldMasterCreateRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsFieldMasterCreateRequest Udt Request
 *
 */

public class InvsFieldMasterCreateRequest extends InvsFieldMasterSubRequestParent {
/**
 *
 * Constructor to create a  InvsFieldMasterCreateRequest
 * @param id Unique request name
 * @param IFMCreateIn InvsFieldMasterObjectData for InvsFieldMasterCreateRequest
 *
 */
@JsonCreator
  public InvsFieldMasterCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsFieldMaster")InvsFieldMasterObjectData IFMCreateIn) {
    super(id, "InvsFieldMasterCreate");
    if (IFMCreateIn != null) {
      addInput("InvsFieldMaster", InvsFieldMasterObjectHelper.toMap(IFMCreateIn, new HashMap(), "InvsFieldMaster").get("InvsFieldMaster"));
    }
  }

/**
 *
 * Retrieves the InvsFieldMasterObjectData that results from the InvsFieldMasterCreateRequest call
 * @return InvsFieldMasterObjectData resulting from udt call
 *
 */

  public InvsFieldMasterObjectData getOutput() {
    return InvsFieldMasterObjectHelper.fromMap(outputMap, "InvsFieldMaster");
  }
}
