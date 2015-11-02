/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobsubstateFindRequest.java
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
 * Class used to create a InvsJobsubstateFindRequest Udt Request
 *
 */

public class InvsJobsubstateFindRequest extends InvsJobsubstateRequest {
/**
 *
 * Constructor to create a  InvsJobsubstateFindRequest
 * @param id Unique request name
 * @param InvsJobsubstateFindIn InvsJobsubstateObjectFilter for InvsJobsubstateFindRequest
 *
 */
@JsonCreator
  public InvsJobsubstateFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsJobsubstate")InvsJobsubstateObjectFilter InvsJobsubstateFindIn) {
    super(id, "InvsJobsubstateFind");
    if (InvsJobsubstateFindIn != null) {
      Integer index =  InvsJobsubstateFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsJobsubstate", InvsJobsubstateObjectHelper.toMap(InvsJobsubstateFindIn, new HashMap(), "InvsJobsubstate").get("InvsJobsubstate"));
    }
  }

/**
 *
 * Retrieves the InvsJobsubstateObjectDataList that results from the InvsJobsubstateFindRequest call
 * @return InvsJobsubstateObjectDataList resulting from udt call
 *
 */

  public InvsJobsubstateObjectDataList getOutput() {
    return InvsJobsubstateObjectHelper.fromMapList(outputMap, "InvsJobsubstateList");
  }
}
