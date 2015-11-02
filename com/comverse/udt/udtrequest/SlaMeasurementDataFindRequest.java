/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SlaMeasurementDataFindRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a SlaMeasurementDataFindRequest Udt Request
 *
 */

public class SlaMeasurementDataFindRequest extends SlaMeasurementDataRequest {
/**
 *
 * Constructor to create a  SlaMeasurementDataFindRequest
 * @param id Unique request name
 * @param SlaMeasurementDataFindIn SlaMeasurementDataObjectFilter for SlaMeasurementDataFindRequest
 *
 */
@JsonCreator
  public SlaMeasurementDataFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("SlaMeasurementData")SlaMeasurementDataObjectFilter SlaMeasurementDataFindIn) {
    super(id, "SlaMeasurementDataFind");
    if (SlaMeasurementDataFindIn != null) {
      Integer index =  SlaMeasurementDataFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SlaMeasurementData", SlaMeasurementDataObjectHelper.toMap(SlaMeasurementDataFindIn, new HashMap(), "SlaMeasurementData").get("SlaMeasurementData"));
    }
  }

/**
 *
 * Retrieves the SlaMeasurementDataObjectDataList that results from the SlaMeasurementDataFindRequest call
 * @return SlaMeasurementDataObjectDataList resulting from udt call
 *
 */

  public SlaMeasurementDataObjectDataList getOutput() {
    return SlaMeasurementDataObjectHelper.fromMapList(outputMap, "SlaMeasurementDataList");
  }
}
