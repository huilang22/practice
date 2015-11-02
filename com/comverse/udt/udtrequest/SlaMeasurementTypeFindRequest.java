/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SlaMeasurementTypeFindRequest.java
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
 * Class used to create a SlaMeasurementTypeFindRequest Udt Request
 *
 */

public class SlaMeasurementTypeFindRequest extends SlaMeasurementTypeRequest {
/**
 *
 * Constructor to create a  SlaMeasurementTypeFindRequest
 * @param id Unique request name
 * @param SLAMTfind_In SlaMeasurementTypeObjectFilter for SlaMeasurementTypeFindRequest
 *
 */
@JsonCreator
  public SlaMeasurementTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("SlaMeasurementType")SlaMeasurementTypeObjectFilter SLAMTfind_In) {
    super(id, "SlaMeasurementTypeFind");
    if (SLAMTfind_In != null) {
      Integer index =  SLAMTfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SlaMeasurementType", SlaMeasurementTypeObjectHelper.toMap(SLAMTfind_In, new HashMap(), "SlaMeasurementType").get("SlaMeasurementType"));
    }
  }

/**
 *
 * Retrieves the SlaMeasurementTypeObjectDataList that results from the SlaMeasurementTypeFindRequest call
 * @return SlaMeasurementTypeObjectDataList resulting from udt call
 *
 */

  public SlaMeasurementTypeObjectDataList getOutput() {
    return SlaMeasurementTypeObjectHelper.fromMapList(outputMap, "SlaMeasurementTypeList");
  }
}
