/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmEnumerationFindRequest.java
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
 * Class used to create a CtmEnumerationFindRequest Udt Request
 *
 */

public class CtmEnumerationFindRequest extends CtmEnumerationRequest {
/**
 *
 * Constructor to create a  CtmEnumerationFindRequest
 * @param id Unique request name
 * @param CtmEnumerationFindIn CtmEnumerationObjectFilter for CtmEnumerationFindRequest
 *
 */
@JsonCreator
  public CtmEnumerationFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtmEnumeration")CtmEnumerationObjectFilter CtmEnumerationFindIn) {
    super(id, "CtmEnumerationFind");
    if (CtmEnumerationFindIn != null) {
      Integer index =  CtmEnumerationFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtmEnumeration", CtmEnumerationObjectHelper.toMap(CtmEnumerationFindIn, new HashMap(), "CtmEnumeration").get("CtmEnumeration"));
    }
  }

/**
 *
 * Retrieves the CtmEnumerationObjectDataList that results from the CtmEnumerationFindRequest call
 * @return CtmEnumerationObjectDataList resulting from udt call
 *
 */

  public CtmEnumerationObjectDataList getOutput() {
    return CtmEnumerationObjectHelper.fromMapList(outputMap, "CtmEnumerationList");
  }
}
