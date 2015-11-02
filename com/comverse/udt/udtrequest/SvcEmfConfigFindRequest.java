/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcEmfConfigFindRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a SvcEmfConfigFindRequest Udt Request
 *
 */

public class SvcEmfConfigFindRequest extends SvcEmfConfigRequest {
/**
 *
 * Constructor to create a  SvcEmfConfigFindRequest
 * @param id Unique request name
 * @param SvcEmfConfigObjectIn SvcEmfConfigObjectFilter for SvcEmfConfigFindRequest
 *
 */
@JsonCreator
  public SvcEmfConfigFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("SvcEmfConfig")SvcEmfConfigObjectFilter SvcEmfConfigObjectIn) {
    super(id, "SvcEmfConfigFind");
    if (SvcEmfConfigObjectIn != null) {
      Integer index =  SvcEmfConfigObjectIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SvcEmfConfig", SvcEmfConfigObjectHelper.toMap(SvcEmfConfigObjectIn, new HashMap(), "SvcEmfConfig").get("SvcEmfConfig"));
    }
  }

/**
 *
 * Retrieves the SvcEmfConfigObjectDataList that results from the SvcEmfConfigFindRequest call
 * @return SvcEmfConfigObjectDataList resulting from udt call
 *
 */

  public SvcEmfConfigObjectDataList getOutput() {
    return SvcEmfConfigObjectHelper.fromMapList(outputMap, "SvcEmfConfigList");
  }
}
