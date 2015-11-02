/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AppNameFindRequest.java
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
 * Class used to create a AppNameFindRequest Udt Request
 *
 */

public class AppNameFindRequest extends AppNameRequest {
/**
 *
 * Constructor to create a  AppNameFindRequest
 * @param id Unique request name
 * @param AppNameFindIn AppNameObjectFilter for AppNameFindRequest
 *
 */
@JsonCreator
  public AppNameFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AppName")AppNameObjectFilter AppNameFindIn) {
    super(id, "AppNameFind");
    if (AppNameFindIn != null) {
      Integer index =  AppNameFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AppName", AppNameObjectHelper.toMap(AppNameFindIn, new HashMap(), "AppName").get("AppName"));
    }
  }

/**
 *
 * Retrieves the AppNameObjectDataList that results from the AppNameFindRequest call
 * @return AppNameObjectDataList resulting from udt call
 *
 */

  public AppNameObjectDataList getOutput() {
    return AppNameObjectHelper.fromMapList(outputMap, "AppNameList");
  }
}
