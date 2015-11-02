/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsInterfaceFindRequest.java
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
 * Class used to create a InvsInterfaceFindRequest Udt Request
 *
 */

public class InvsInterfaceFindRequest extends InvsInterfaceRequest {
/**
 *
 * Constructor to create a  InvsInterfaceFindRequest
 * @param id Unique request name
 * @param InvsInterfaceFindIn InvsInterfaceObjectFilter for InvsInterfaceFindRequest
 *
 */
@JsonCreator
  public InvsInterfaceFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsInterface")InvsInterfaceObjectFilter InvsInterfaceFindIn) {
    super(id, "InvsInterfaceFind");
    if (InvsInterfaceFindIn != null) {
      Integer index =  InvsInterfaceFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsInterface", InvsInterfaceObjectHelper.toMap(InvsInterfaceFindIn, new HashMap(), "InvsInterface").get("InvsInterface"));
    }
  }

/**
 *
 * Retrieves the InvsInterfaceObjectDataList that results from the InvsInterfaceFindRequest call
 * @return InvsInterfaceObjectDataList resulting from udt call
 *
 */

  public InvsInterfaceObjectDataList getOutput() {
    return InvsInterfaceObjectHelper.fromMapList(outputMap, "InvsInterfaceList");
  }
}
