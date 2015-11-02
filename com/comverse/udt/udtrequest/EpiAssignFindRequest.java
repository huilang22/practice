/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiAssignFindRequest.java
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
 * Class used to create a EpiAssignFindRequest Udt Request
 *
 */

public class EpiAssignFindRequest extends EpiAssignRequest {
/**
 *
 * Constructor to create a  EpiAssignFindRequest
 * @param id Unique request name
 * @param EASSFindIn EpiAssignObjectFilter for EpiAssignFindRequest
 *
 */
@JsonCreator
  public EpiAssignFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("EpiAssign")EpiAssignObjectFilter EASSFindIn) {
    super(id, "EpiAssignFind");
    if (EASSFindIn != null) {
      Integer index =  EASSFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EpiAssign", EpiAssignObjectHelper.toMap(EASSFindIn, new HashMap(), "EpiAssign").get("EpiAssign"));
    }
  }

/**
 *
 * Retrieves the EpiAssignObjectDataList that results from the EpiAssignFindRequest call
 * @return EpiAssignObjectDataList resulting from udt call
 *
 */

  public EpiAssignObjectDataList getOutput() {
    return EpiAssignObjectHelper.fromMapList(outputMap, "EpiAssignList");
  }
}
