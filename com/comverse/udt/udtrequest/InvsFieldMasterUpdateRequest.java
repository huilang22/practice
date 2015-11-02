/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsFieldMasterUpdateRequest.java
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
 * Class used to create a InvsFieldMasterUpdateRequest Udt Request
 *
 */

public class InvsFieldMasterUpdateRequest extends InvsFieldMasterSubRequestParent {
/**
 *
 * Constructor to create a  InvsFieldMasterUpdateRequest
 * @param id Unique request name
 * @param IFMUpdateIn InvsFieldMasterObjectData for InvsFieldMasterUpdateRequest
 *
 */
@JsonCreator
  public InvsFieldMasterUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsFieldMaster")InvsFieldMasterObjectData IFMUpdateIn) {
    super(id, "InvsFieldMasterUpdate");
    if (IFMUpdateIn != null) {
      addInput("InvsFieldMaster", InvsFieldMasterObjectHelper.toMap(IFMUpdateIn, new HashMap(), "InvsFieldMaster").get("InvsFieldMaster"));
    }
  }

/**
 *
 * Retrieves the InvsFieldMasterObjectData that results from the InvsFieldMasterUpdateRequest call
 * @return InvsFieldMasterObjectData resulting from udt call
 *
 */

  public InvsFieldMasterObjectData getOutput() {
    return InvsFieldMasterObjectHelper.fromMap(outputMap, "InvsFieldMaster");
  }
}
