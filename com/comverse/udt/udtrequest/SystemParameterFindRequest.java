/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SystemParameterFindRequest.java
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
 * Class used to create a SystemParameterFindRequest Udt Request
 *
 */

public class SystemParameterFindRequest extends SystemParameterRequest {
/**
 *
 * Constructor to create a  SystemParameterFindRequest
 * @param id Unique request name
 * @param SPFindIn SPObjectFilter for SystemParameterFindRequest
 *
 */
@JsonCreator
  public SystemParameterFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("SystemParameter")SPObjectFilter SPFindIn) {
    super(id, "SystemParameterFind");
    if (SPFindIn != null) {
      Integer index =  SPFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SystemParameter", SPObjectHelper.toMap(SPFindIn, new HashMap(), "SystemParameter").get("SystemParameter"));
    }
  }

/**
 *
 * Retrieves the SPObjectDataList that results from the SystemParameterFindRequest call
 * @return SPObjectDataList resulting from udt call
 *
 */

  public SPObjectDataList getOutput() {
    return SPObjectHelper.fromMapList(outputMap, "SystemParameterList");
  }
}
