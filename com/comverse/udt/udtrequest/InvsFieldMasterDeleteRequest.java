/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsFieldMasterDeleteRequest.java
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
 * Class used to create a InvsFieldMasterDeleteRequest Udt Request
 *
 */

public class InvsFieldMasterDeleteRequest extends InvsFieldMasterSubRequestParent {
/**
 *
 * Constructor to create a  InvsFieldMasterDeleteRequest
 * @param id Unique request name
 * @param IFMDeleteIn InvsFieldMasterObjectKeyData for InvsFieldMasterDeleteRequest
 *
 */
@JsonCreator
  public InvsFieldMasterDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsFieldMaster")InvsFieldMasterObjectKeyData IFMDeleteIn) {
    super(id, "InvsFieldMasterDelete");
    if (IFMDeleteIn != null) {
      addInput("InvsFieldMaster", InvsFieldMasterObjectKeyHelper.toMap(IFMDeleteIn, new HashMap(), "InvsFieldMasterObjectKeyData").get("InvsFieldMasterObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsFieldMasterObjectData that results from the InvsFieldMasterDeleteRequest call
 * @return InvsFieldMasterObjectData resulting from udt call
 *
 */

  public InvsFieldMasterObjectData getOutput() {
    return InvsFieldMasterObjectHelper.fromMap(outputMap, "InvsFieldMaster");
  }
}
