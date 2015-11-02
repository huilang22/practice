/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TechnicianFindRequest.java
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

import com.csgsystems.we.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a TechnicianFindRequest Udt Request
 *
 */

public class TechnicianFindRequest extends TechnicianRequest {
/**
 *
 * Constructor to create a  TechnicianFindRequest
 * @param id Unique request name
 * @param TechnicianFindIn TechnicianObjectFilter for TechnicianFindRequest
 *
 */
@JsonCreator
  public TechnicianFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Technician")TechnicianObjectFilter TechnicianFindIn) {
    super(id, "TechnicianFind");
    if (TechnicianFindIn != null) {
      Integer index =  TechnicianFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Technician", TechnicianObjectHelper.toMap(TechnicianFindIn, new HashMap(), "Technician").get("Technician"));
    }
  }

/**
 *
 * Retrieves the TechnicianObjectDataList that results from the TechnicianFindRequest call
 * @return TechnicianObjectDataList resulting from udt call
 *
 */

  public TechnicianObjectDataList getOutput() {
    return TechnicianObjectHelper.fromMapList(outputMap, "TechnicianList");
  }
}
