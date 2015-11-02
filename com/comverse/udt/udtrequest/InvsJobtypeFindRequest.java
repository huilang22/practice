/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobtypeFindRequest.java
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
 * Class used to create a InvsJobtypeFindRequest Udt Request
 *
 */

public class InvsJobtypeFindRequest extends InvsJobtypeRequest {
/**
 *
 * Constructor to create a  InvsJobtypeFindRequest
 * @param id Unique request name
 * @param InvsJobtypeFindIn InvsJobtypeObjectFilter for InvsJobtypeFindRequest
 *
 */
@JsonCreator
  public InvsJobtypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsJobtype")InvsJobtypeObjectFilter InvsJobtypeFindIn) {
    super(id, "InvsJobtypeFind");
    if (InvsJobtypeFindIn != null) {
      Integer index =  InvsJobtypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsJobtype", InvsJobtypeObjectHelper.toMap(InvsJobtypeFindIn, new HashMap(), "InvsJobtype").get("InvsJobtype"));
    }
  }

/**
 *
 * Retrieves the InvsJobtypeObjectDataList that results from the InvsJobtypeFindRequest call
 * @return InvsJobtypeObjectDataList resulting from udt call
 *
 */

  public InvsJobtypeObjectDataList getOutput() {
    return InvsJobtypeObjectHelper.fromMapList(outputMap, "InvsJobtypeList");
  }
}
