/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerExtendedDataFindRequest.java
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
 * Class used to create a InvContainerExtendedDataFindRequest Udt Request
 *
 */

public class InvContainerExtendedDataFindRequest extends InvContainerRequest {
/**
 *
 * Constructor to create a  InvContainerExtendedDataFindRequest
 * @param id Unique request name
 * @param InvContEdIn InvContainerObjectKeyData for InvContainerExtendedDataFindRequest
 *
 */
@JsonCreator
  public InvContainerExtendedDataFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvContainer")InvContainerObjectKeyData InvContEdIn) {
    super(id, "InvContainerExtendedDataFind");
    if (InvContEdIn != null) {
      addInput("InvContainer", InvContainerObjectKeyHelper.toMap(InvContEdIn, new HashMap(), "InvContainerObjectKeyData").get("InvContainerObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvContainerEDObjectDataList that results from the InvContainerExtendedDataFindRequest call
 * @return InvContainerEDObjectDataList resulting from udt call
 *
 */

  public InvContainerEDObjectDataList getOutput() {
    return InvContainerEDObjectHelper.fromMapList(outputMap, "InvContainerExtendedDataList");
  }
}
