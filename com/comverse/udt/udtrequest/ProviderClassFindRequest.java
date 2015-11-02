/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProviderClassFindRequest.java
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
 * Class used to create a ProviderClassFindRequest Udt Request
 *
 */

public class ProviderClassFindRequest extends ProviderClassRequest {
/**
 *
 * Constructor to create a  ProviderClassFindRequest
 * @param id Unique request name
 * @param ProvClsFindIn ProvClsObjectFilter for ProviderClassFindRequest
 *
 */
@JsonCreator
  public ProviderClassFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProviderClass")ProvClsObjectFilter ProvClsFindIn) {
    super(id, "ProviderClassFind");
    if (ProvClsFindIn != null) {
      Integer index =  ProvClsFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProviderClass", ProvClsObjectHelper.toMap(ProvClsFindIn, new HashMap(), "ProviderClass").get("ProviderClass"));
    }
  }

/**
 *
 * Retrieves the ProvClsObjectDataList that results from the ProviderClassFindRequest call
 * @return ProvClsObjectDataList resulting from udt call
 *
 */

  public ProvClsObjectDataList getOutput() {
    return ProvClsObjectHelper.fromMapList(outputMap, "ProviderClassList");
  }
}
