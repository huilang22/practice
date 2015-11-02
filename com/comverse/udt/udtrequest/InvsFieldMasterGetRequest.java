/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsFieldMasterGetRequest.java
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
 * Class used to create a InvsFieldMasterGetRequest Udt Request
 *
 */

public class InvsFieldMasterGetRequest extends InvsFieldMasterSubRequestParent {
/**
 *
 * Constructor to create a  InvsFieldMasterGetRequest
 * @param id Unique request name
 * @param IFMGetIn InvsFieldMasterObjectKeyData for InvsFieldMasterGetRequest
 *
 */
@JsonCreator
  public InvsFieldMasterGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsFieldMaster")InvsFieldMasterObjectKeyData IFMGetIn) {
    super(id, "InvsFieldMasterGet");
    if (IFMGetIn != null) {
      addInput("InvsFieldMaster", InvsFieldMasterObjectKeyHelper.toMap(IFMGetIn, new HashMap(), "InvsFieldMasterObjectKeyData").get("InvsFieldMasterObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsFieldMasterObjectData that results from the InvsFieldMasterGetRequest call
 * @return InvsFieldMasterObjectData resulting from udt call
 *
 */

  public InvsFieldMasterObjectData getOutput() {
    return InvsFieldMasterObjectHelper.fromMap(outputMap, "InvsFieldMaster");
  }
}
